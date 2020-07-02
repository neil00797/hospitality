package entity;

public class Allergy {
    private String allergyID,allergyDescription;
    private Allergy(Builder builder){
        this.allergyID = builder.allergyID;
        this.allergyDescription = builder.allergyDescription;
    }

    public String getAllergyID() {
        return allergyID;
    }

    public String getAllergyDescription() {
        return allergyDescription;
    }

    @Override
    public String toString() {
        return "Allergy{" +
                "allergyID='" + allergyID + '\'' +
                ", allergyDescription='" + allergyDescription + '\'' +
                '}';
    }

    public static class Builder{
      private   String allergyID,allergyDescription;
      public Builder setAllergyID (String allergyID){
          this.allergyID =allergyID;
          return this;
      }
      public Builder setAllergyDescription(String allergyDescription){
          this.allergyDescription=allergyDescription;
          return this;
      }
      public Builder copy(Allergy allergy){
          this.allergyID=allergy.allergyID;
          this.allergyDescription=allergy.allergyDescription;
          return this;
      }
      public Allergy build(){return new Allergy(this);}
    }
}
