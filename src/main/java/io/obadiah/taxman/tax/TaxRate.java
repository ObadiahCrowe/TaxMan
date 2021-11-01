package io.obadiah.taxman.tax;

public enum TaxRate {

    PERSONAL(0, 12570, 0.0D),
    STARTER(12571, 14667, 19.0D),
    BASIC(14668, 25296, 20.0D),
    INTERMEDIATE(25297, 43662, 21.0D),
    HIGHER(43663, 150_000, 41.0D),
    TOP(150_001, 100_000_000, 46.0D);

    private final int incomeStart;
    private final int incomeEnd;
    private final double taxablePercentage;

    TaxRate(int incomeStart, int incomeEnd, double taxablePercentage) {
        this.incomeStart = incomeStart;
        this.incomeEnd = incomeEnd;
        this.taxablePercentage = taxablePercentage;
    }

    public int getIncomeStart() {
        return this.incomeStart;
    }

    public int getIncomeEnd() {
        return this.incomeEnd;
    }

    public double getTaxablePercentage() {
        return this.taxablePercentage;
    }

    public static TaxRate getCurrentTaxRate(double income) {
        for (TaxRate rate : TaxRate.values()) {
            if (rate.getIncomeStart() <= income && rate.getIncomeEnd() >= income) {
                return rate;
            }
        }

        return TaxRate.TOP;
    }

    public static double getTaxableIncome(double income) {
        double totalTax = 0.0D;

        for (int i = 0; i < getCurrentTaxRate(income).ordinal() + 1; i++) {
            TaxRate rate = TaxRate.values()[i];

            double taxableAmount = Math.abs(Math.min(rate.getIncomeEnd(), income) - rate.getIncomeStart());
            double taxDue = taxableAmount * (rate.getTaxablePercentage() / 100.0D);

            totalTax += taxDue;
        }

        return totalTax;
    }
}
