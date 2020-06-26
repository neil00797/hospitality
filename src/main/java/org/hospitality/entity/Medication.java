package org.hospitality.entity;

public class Medication {
    private String medicationId,medicationDescription;
    private Medication(Builder builder){
        this.medicationId=builder.medicationId;
        this.medicationDescription=builder.medicationDescription;

    }

    public String getMedicationId() {
        return medicationId;
    }

    public String getMedicationDescription() {
        return medicationDescription;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medicationId='" + medicationId + '\'' +
                ", medicationDescription='" + medicationDescription + '\'' +
                '}';
    }

    public static class Builder{
        private String medicationId,medicationDescription;

        public Builder setMedicationId(String medicationId){
            this.medicationId=medicationId;
            return this;
        }
        public Builder setMedicationDescription(String medicationDescription){
            this.medicationDescription=medicationDescription;
            return this;
        }
        public Builder copy (Medication medication){
            this.medicationId=medication.medicationId;
            this.medicationDescription=medication.medicationDescription;
            return this;
        }

        public Medication build(){return new Medication(this);}


    }
}
