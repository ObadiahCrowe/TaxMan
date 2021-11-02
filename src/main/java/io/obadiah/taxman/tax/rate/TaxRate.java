package io.obadiah.taxman.tax.rate;

public interface TaxRate {

    int getIncomeStart();

    int getIncomeEnd();

    double getTaxablePercentage();
}
