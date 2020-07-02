package Utility;

import java.util.UUID;

public class Helper {
    public static String generateDeliveryNumber(){

        return UUID.randomUUID().toString();
    }
}
