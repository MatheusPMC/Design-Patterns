package com.company.designpatterns.adapter.adapters;

import com.company.designpatterns.adapter.mercadopago.MercadoPago;
import com.company.designpatterns.adapter.payoneer.Payoneer;
import com.company.designpatterns.adapter.paypal.IPayPalPayments;
import com.company.designpatterns.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizandos os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePayment();
    }
}
