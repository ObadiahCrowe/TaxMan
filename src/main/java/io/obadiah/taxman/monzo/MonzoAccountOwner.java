package io.obadiah.taxman.monzo;

import org.jetbrains.annotations.NotNull;

public class MonzoAccountOwner {

    private final String userId;
    private final String preferredName;
    private final String preferredFirstName;

    public MonzoAccountOwner(@NotNull String userId, @NotNull String preferredName, @NotNull String preferredFirstName) {
        this.userId = userId;
        this.preferredName = preferredName;
        this.preferredFirstName = preferredFirstName;
    }

    public @NotNull String getUserId() {
        return this.userId;
    }

    public @NotNull String getPreferredName() {
        return this.preferredName;
    }

    public @NotNull String getPreferredFirstName() {
        return this.preferredFirstName;
    }
}
