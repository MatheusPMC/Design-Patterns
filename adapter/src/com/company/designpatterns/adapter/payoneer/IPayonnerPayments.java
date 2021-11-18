package com.company.designpatterns.adapter.payoneer;

import com.company.designpatterns.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
