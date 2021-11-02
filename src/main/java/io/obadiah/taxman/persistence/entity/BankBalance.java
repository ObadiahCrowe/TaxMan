package io.obadiah.taxman.persistence.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "balances")
public class BankBalance {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "sort_code")
    private int sortCode;

    @OneToMany
    @JoinColumn(name = "balance_id")
    private List<BankIncomingTransaction> transactions;

    protected BankBalance() {}

    public BankBalance(@NotNull Long id, int accountNumber, int sortCode, @NotNull List<@NotNull BankIncomingTransaction> transactions) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.transactions = transactions;
    }

    public @NotNull Long getId() {
        return id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public @NotNull List<@NotNull BankIncomingTransaction> getTransactions() {
        return transactions;
    }
}
