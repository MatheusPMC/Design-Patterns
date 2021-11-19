package com.company.designpatterns.adapter.mercadopago;

import com.company.designpatterns.adapter.payoneer.IPayonnerPayments;
import com.company.designpatterns.adapter.utils.Token;

public class MercadoPago implements IMecadoPagoPayments {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Mercado Pago");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Mercado Pago");
    }
}
