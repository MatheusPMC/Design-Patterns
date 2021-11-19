package com.company.designpatterns.adapter.mercadopago;

import com.company.designpatterns.adapter.utils.Token;

public interface IMecadoPagoPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
