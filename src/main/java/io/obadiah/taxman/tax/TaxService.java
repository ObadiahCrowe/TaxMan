package io.obadiah.taxman.tax;

import io.obadiah.taxman.tax.rate.EnglandWalesTaxRate;
import io.obadiah.taxman.tax.rate.ScotlandTaxRate;
import io.obadiah.taxman.tax.rate.TaxRate;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    private final TaxRate[] values;

    @Autowired
    public TaxService() {
        this.values = (System.getenv("TAX_RATE").equalsIgnoreCase("scotland") ? ScotlandTaxRate.class : EnglandWalesTaxRate.class).getEnumConstants();
    }

    /**
     * Gets the current income tax rate based on an individual's region.
     *
     * @param income The total income to calculate a tax rate from.
     *
     * @return The corresponding {@link TaxRate}.
     */
    public @NotNull TaxRate getCurrentTaxRate(double income) {
        for (TaxRate rate : this.values) {
            if (rate.getIncomeStart() <= income && rate.getIncomeEnd() >= income) {
                return rate;
            }
        }

        return this.values[this.values.length - 1];
    }

    /**
     * Gets the total amount of income tax owed.
     *
     * @param income The total income to calculate the owing tax from.
     *
     * @return The amount of tax owed.
     */
    public double getTaxableIncome(double income) {
        double totalTax = 0.0D;

        for (int i = 0; i < ((Enum<?>) getCurrentTaxRate(income)).ordinal() + 1; i++) {
            TaxRate rate = this.values[i];

            double taxableAmount = Math.abs(Math.min(rate.getIncomeEnd(), income) - rate.getIncomeStart());
            double taxDue = taxableAmount * (rate.getTaxablePercentage() / 100.0D);

            totalTax += taxDue;
        }

        return totalTax;
    }
}
