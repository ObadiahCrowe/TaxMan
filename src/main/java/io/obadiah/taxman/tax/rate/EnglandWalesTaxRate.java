package io.obadiah.taxman.tax.rate;

/**
 * Represents the English and Welsh Income Tax brackets.
 *
 * Input data pulled from: https://www.gov.uk/income-tax-rates
 */
public enum EnglandWalesTaxRate implements TaxRate {

    PERSONAL(0, 12570, 0.0D),
    BASIC(12571, 50270, 20.0D),
    HIGHER(50271, 150_000, 40.0D),
    ADDITIONAL(150_001, 100_000_000, 45.0D);

    private final int incomeStart;
    private final int incomeEnd;
    private final double taxablePercentage;

    /**
     * Represents a tax bracket that an individuals' income can fall in to.
     *
     * @param incomeStart The amount of money that must be earned in order to enter this bracket.
     * @param incomeEnd The cutoff threshold before an individual is moved into the next tax bracket, if any.
     * @param taxablePercentage The percentage that the income within this bracket is taxed by.
     */
    EnglandWalesTaxRate(int incomeStart, int incomeEnd, double taxablePercentage) {
        this.incomeStart = incomeStart;
        this.incomeEnd = incomeEnd;
        this.taxablePercentage = taxablePercentage;
    }


    /**
     * @return The amount of money that must be earned in order to enter this bracket.
     */
    @Override
    public int getIncomeStart() {
        return this.incomeStart;
    }

    /**
     * @return The cutoff threshold before an individual is moved into the next tax bracket, if any.
     */
    @Override
    public int getIncomeEnd() {
        return this.incomeEnd;
    }

    /**
     * @return The percentage that the income within this bracket is taxed by.
     */
    @Override
    public double getTaxablePercentage() {
        return this.taxablePercentage;
    }
}
