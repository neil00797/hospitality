package entity;

public class StayInfo
{
     private String occupantNumber, occupantId, stayDuration, deliveries;

    private StayInfo(StayInfo.Builder builder){
        this.occupantNumber = builder.occupantNumber;
        this.occupantId = builder.occupantId;
        this.stayDuration = builder.stayDuration;
        this.deliveries = builder.deliveries;
    }

    public String getOccupantNumber() {
        return occupantNumber;
    }

    public String getOccupantId() {
        return occupantId;
    }

    public String getStayDuration() {
        return stayDuration;
    }

    public String getDeliveries() {
        return deliveries;
    }

    @Override
    public String toString() {
        return "stayInfo{" +
                "occupantNumber='" + occupantNumber + '\'' +
                ", occupantId='" + occupantId + '\'' +
                ", stayDuration='" + stayDuration + '\'' +
                ", deliveries='" + deliveries + '\'' +
                '}';
    }



    public static class Builder
    {
        private String occupantNumber, occupantId , stayDuration, deliveries ;

        public StayInfo.Builder setOccupantNumber(String occupantNumber)
        {
            this.occupantNumber = occupantNumber;
            return this;
        }

        public StayInfo.Builder setOccupantId(String occupantId)
        {
            this.occupantId = occupantId;
            return this;
        }

        public StayInfo.Builder setStayDuration(String stayDuration)
        {
            this.stayDuration = stayDuration;
            return this;
        }

        public StayInfo.Builder setDeliveries(String deliveries)
        {
            this.deliveries = deliveries;
            return this;
        }

        public StayInfo build(){
            return new StayInfo(this);
        }

    }

}
