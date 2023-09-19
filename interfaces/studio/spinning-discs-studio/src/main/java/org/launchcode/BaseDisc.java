package org.launchcode;

public abstract class BaseDisc {
    // Fields shared by CD and DVD
    private String name;
    private int capacity;
    private String contents;
    private String discType;
    private int spinSpeed;

    // Constructors
    public BaseDisc(String name, int capacity, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.contents = "";
        this.spinSpeed = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    // Common methods for spinning and reporting information
    public void spinDisc(int speed) {
        this.spinSpeed = speed;
        System.out.println(discType + " is spinning at " + speed + " RPM.");
    }

    public String reportInformation() {
        return "Name: " + name + "\nCapacity: " + capacity + " MB\nContents: " + contents + "\nDisc Type: " + discType;
    }
}


