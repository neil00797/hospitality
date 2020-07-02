package factory;

import entity.Payment;

public class PaymentFactory {
    public static Payment createPayment(String paymentMethod, double roomCost, double serviceCost, double totalStayCost){
        Payment payment = new Payment.Builder()
                .setPaymentMethod(paymentMethod)
                .setRoomCost(roomCost)
                .setServiceCost(serviceCost)
                .setTotalStayCost(totalStayCost)
                .build();
        return payment;
    }
}
