package com.company.designpatterns.adapter;

import com.company.designpatterns.adapter.adapters.MercadoPagoAdapter;
import com.company.designpatterns.adapter.adapters.PayoneerAdapter;
import com.company.designpatterns.adapter.mercadopago.MercadoPago;
import com.company.designpatterns.adapter.payoneer.Payoneer;
import com.company.designpatterns.adapter.paypal.IPayPalPayments;
import com.company.designpatterns.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {


        IPayPalPayments payments = new PayPal();
        IPayPalPayments payments2 = new PayoneerAdapter(new Payoneer());
        IPayPalPayments payments3 = new MercadoPagoAdapter(new MercadoPago());
        payments.paypalPayment();
        payments.paypalReceive();

        payments2.paypalPayment();
        payments2.paypalReceive();

        payments3.paypalPayment();
        payments3.paypalReceive();
    }
}
