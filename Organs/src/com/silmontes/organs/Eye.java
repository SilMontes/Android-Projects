package com.silmontes.organs;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color "+getColor());
    }
    public void closeEye(){
        this.setOpen(false);
        System.out.println(this.getName()+" Closed");
    }
    public void openEye(){
        this.setOpen(true);
        System.out.println(this.getName()+" Opened");
    }
}
