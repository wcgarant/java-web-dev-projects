package org.launchcode;

public interface OpticalDisc {
    void spinDisc(int speed);
    void storeData(String data);
    String readData();
    String reportInformation();
}
