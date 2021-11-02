package io.obadiah.taxman.monzo;

import org.jetbrains.annotations.NotNull;

import java.time.Instant;

public class MonzoAccount {

    private final String id;
    private final boolean closed;
    private final Instant created;
    private final String description;

    private final String type;
    private final String currency;
    private final String countryCode;

    private final MonzoAccountOwner[] owners;
    private final int accountNumber;
    private final int sortCode;

    public MonzoAccount(@NotNull String id, boolean closed, @NotNull Instant created, @NotNull String description,
                        @NotNull String type, @NotNull String currency, @NotNull String countryCode,
                        @NotNull MonzoAccountOwner @NotNull[] owners, int accountNumber, int sortCode) {
        this.id = id;
        this.closed = closed;
        this.created = created;
        this.description = description;
        this.type = type;
        this.currency = currency;
        this.countryCode = countryCode;
        this.owners = owners;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public @NotNull String getId() {
        return this.id;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public @NotNull Instant getCreated() {
        return this.created;
    }

    public @NotNull String getDescription() {
        return this.description;
    }

    public @NotNull String getType() {
        return this.type;
    }

    public @NotNull String getCurrency() {
        return this.currency;
    }

    public @NotNull String getCountryCode() {
        return this.countryCode;
    }

    public @NotNull MonzoAccountOwner @NotNull [] getOwners() {
        return this.owners;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }
}
