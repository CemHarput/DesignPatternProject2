package com.company.Command;

import com.company.Factory.Burger;

public class RefundProduct implements Command {
    Burger burger;//burger is class receiver

    public RefundProduct(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void execute() {
          burger.Refund();
    }
}
