package factory;

import utility.Helper;
import entity.Delivery;

public class DeliveryFactory {
    public static Delivery createDelivery(String roomNumber, String serviceType){
        String deliveryNumber = Helper.generateDeliveryNumber();
        Delivery delivery = new Delivery.Builder()
                .setDeliveryNumber(deliveryNumber)
                .setRoomNumber(roomNumber)
                .setServiceType(serviceType)
                .build();
        return delivery;
    }
}
