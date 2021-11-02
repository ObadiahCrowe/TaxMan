package io.obadiah.taxman.persistence.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transactions")
public class BankIncomingTransaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "balance_id")
    private Long balanceId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "date")
    private Instant date;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "description")
    private String description;

    protected BankIncomingTransaction() {}

    public BankIncomingTransaction(@NotNull Long id, @NotNull Long balanceId, double amount, @NotNull Instant date,
                                   @NotNull String merchantName, @NotNull String description) {
        this.id = id;
        this.balanceId = balanceId;
        this.amount = amount;
        this.date = date;
        this.merchantName = merchantName;
        this.description = description;
    }

    public @NotNull Long getId() {
        return this.id;
    }

    public @NotNull Long getBalanceId() {
        return this.balanceId;
    }

    public double getAmount() {
        return this.amount;
    }

    public @NotNull Instant getDate() {
        return this.date;
    }

    public @NotNull String getMerchantName() {
        return this.merchantName;
    }

    public @NotNull String getDescription() {
        return this.description;
    }
}
