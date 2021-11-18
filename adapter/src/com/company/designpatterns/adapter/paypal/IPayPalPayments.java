package com.company.designpatterns.adapter.paypal;

import com.company.designpatterns.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
