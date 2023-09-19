package org.launchcode;

// CD.java
public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int capacity) {
        super(name, capacity, "CD");
    }

    // Implement methods from the OpticalDisc interface
    @Override
    public void spinDisc(int speed) {
        super.spinDisc(speed); // Call the common spinDisc method from the base class
        // CD-specific code for spinning a CD
    }

    @Override
    public void storeData(String data) {
        // Implement CD-specific code for storing data
    }

    @Override
    public String readData() {
        // Implement CD-specific code for reading data
        return null;
    }
}


