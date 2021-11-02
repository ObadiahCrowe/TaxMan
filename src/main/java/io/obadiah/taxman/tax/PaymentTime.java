package io.obadiah.taxman.tax;

public enum PaymentTime {

    START_OF_MONTH(1, 3, 5),
    MID_MONTH(13, 15, 17),
    END_OF_MONTH(27, 28, 30, 31);

    private final int[] attemptDays;

    PaymentTime(int... attemptDays) {
        this.attemptDays = attemptDays;
    }

    public int[] getAttemptDays() {
        return this.attemptDays;
    }
}
