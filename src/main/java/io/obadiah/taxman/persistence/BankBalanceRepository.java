package io.obadiah.taxman.persistence;

import io.obadiah.taxman.persistence.entity.BankBalance;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.repository.CrudRepository;

public interface BankBalanceRepository extends CrudRepository<BankBalance, Long> {

    @Nullable
    BankBalance findBankBalanceByAccountNumberAndSortCode(int accountNumber, int sortCode);
}
