package io.obadiah.taxman.tax.rate;

public sealed interface TaxRate permits EnglandWalesTaxRate, ScotlandTaxRate {

    int getIncomeStart();

    int getIncomeEnd();

    double getTaxablePercentage();
}
