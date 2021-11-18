package com.company.designpatterns.adapter.payoneer;

import com.company.designpatterns.adapter.utils.Token;

public class Payoneer implements IPayonnerPayments {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payonner");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payonner");
    }
}
