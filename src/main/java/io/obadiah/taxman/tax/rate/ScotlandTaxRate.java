package io.obadiah.taxman.tax.rate;

/**
 * Represents the Scottish Income Tax brackets.
 *
 * Input data pulled from: https://www.gov.uk/scottish-income-tax
 */
public enum ScotlandTaxRate implements TaxRate {

    PERSONAL(0, 12570, 0.0D),
    STARTER(12571, 14667, 19.0D),
    BASIC(14668, 25296, 20.0D),
    INTERMEDIATE(25297, 43662, 21.0D),
    HIGHER(43663, 150_000, 41.0D),
    TOP(150_001, 100_000_000, 46.0D);

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
    ScotlandTaxRate(int incomeStart, int incomeEnd, double taxablePercentage) {
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
