package io.obadiah.taxman.tax.rate;

/**
 * Represents a tax bracket that will be used to calculate how much Income Tax is owed based on your region in the UK.
 */
public sealed interface TaxRate permits EnglandWalesTaxRate, ScotlandTaxRate {

    /**
     * @return The amount of money that must be earned in order to enter this bracket.
     */
    int getIncomeStart();

    /**
     * @return The cutoff threshold before an individual is moved into the next tax bracket, if any.
     */
    int getIncomeEnd();

    /**
     * @return The percentage that the income within this bracket is taxed by.
     */
    double getTaxablePercentage();
}
