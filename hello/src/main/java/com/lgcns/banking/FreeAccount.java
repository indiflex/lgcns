package com.lgcns.banking;

import java.math.BigDecimal;

public class FreeAccount extends Account {
    @Override
    public void transfer(Account target, BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
        super.transfer(target, amount);
    }
}
