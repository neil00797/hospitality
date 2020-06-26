package org.hospitality.entity;

public class OccupantMedicalDetails {
private Allergy allergy;
private Medication medication;

private OccupantMedicalDetails(Builder builder){
    this.allergy=builder.allergy;
    this.medication=builder.medication;
}

    public Allergy getAllergy() {
        return allergy;
    }

    public Medication getMedication() {
        return medication;
    }

    @Override
    public String toString() {
        return "OccupantMedicalDetails{" +
                "allergy=" + allergy +
                ", medication=" + medication +
                '}';
    }

    public static class Builder{
    private Allergy allergy;
    private Medication medication;
    public Builder setAllergy(Allergy allergy){
        this.allergy = allergy;
        return this;
    }
    public Builder setMedication(Medication medication){
        this.medication=medication;
        return this;
    }
    public Builder copy (OccupantMedicalDetails occupantMedicalDetails){
        this.allergy=occupantMedicalDetails.allergy;
        this.medication=occupantMedicalDetails.medication;
        return this;
    }

    public OccupantMedicalDetails build(){
        return new OccupantMedicalDetails(this);
    }
}

}
