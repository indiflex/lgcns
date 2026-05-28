package com.lgcns.banking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    protected BigDecimal balance;

    public static void main(String[] args) {
        Account free = new FreeAccount();
        MonthAccount month = new MonthAccount();
        Account fund = new FundAccount();
        Account[] accounts = {free, month, fund};

        free.deposit(BigDecimal.valueOf(10000));
        free.transfer(month, BigDecimal.valueOf(2000));
        free.transfer(fund, BigDecimal.valueOf(1000));

        for (Account acc : accounts) {
            if (acc instanceof Withdrawable withAccount) {
                withAccount.withdraw(((Account) withAccount).getBalance().divide(BigDecimal.valueOf(2), RoundingMode.HALF_EVEN));
            }

            System.out.println(acc.getBalance());
        }

        month.mature(free);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void transfer(Account target, BigDecimal amount) {
        target.deposit(amount);
    }
}
