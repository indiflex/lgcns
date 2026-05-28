package com.lgcns.banking;

import java.math.BigDecimal;

public class FundAccount extends Account implements Withdrawable {
    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }
}
