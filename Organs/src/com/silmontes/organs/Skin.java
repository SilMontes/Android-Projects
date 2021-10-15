package com.silmontes.organs;

public class Skin extends Organ{
    private String skinColor;
    private int softness;

    public Skin(String name, String medicalCondition, String skinColor, int softness) {
        super(name, medicalCondition);
        this.skinColor = skinColor;
        this.softness = softness;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color "+this.getSkinColor());
    }
}
