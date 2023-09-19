package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, int capacity) {
        super(name, capacity, "DVD");
    }

    // Implement methods from the OpticalDisc interface
    @Override
    public void spinDisc(int speed) {
        super.spinDisc(speed); // Call the common spinDisc method from the base class
        // DVD-specific code for spinning a DVD
    }

    @Override
    public void storeData(String data) {
        // Implement DVD-specific code for storing data
    }

    @Override
    public String readData() {
        // Implement DVD-specific code for reading data
        return null;
    }
}
