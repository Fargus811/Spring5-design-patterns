package com.spring5.design.patterns.structural.adapter.pattern;

import com.spring5.design.patterns.structural.adapter.pattern.impl.AdvancedPaymentGatewayAdapter;
import com.spring5.design.patterns.structural.adapter.pattern.impl.PaymentGatewayImpl;

public class AdapterPatternMain {

    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGatewayImpl();
        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
        String mobile1 = null;
        String mobile2 = null;
        advancedPayGateway.makePayment(mobile1, mobile2);
    }
}
