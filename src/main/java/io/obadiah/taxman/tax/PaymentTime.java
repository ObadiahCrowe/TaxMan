package io.obadiah.taxman.tax;

/**
 * Represents the days of the month to attempt to automatically pay an individual's income tax.
 */
public enum PaymentTime {

    START_OF_MONTH(1, 3, 5),
    MID_MONTH(13, 15, 17),
    END_OF_MONTH(27, 28, 30, 31);

    private final int[] attemptDays;

    /**
     * Represents a period within a month to attempt to automatically pay and individual's income tax.
     *
     * @param attemptDays The days to attempt per month.
     */
    PaymentTime(int... attemptDays) {
        this.attemptDays = attemptDays;
    }

    /**
     * @return The days to attempt per month.
     */
    public int[] getAttemptDays() {
        return this.attemptDays;
    }
}
