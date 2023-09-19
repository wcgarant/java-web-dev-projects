package org.launchcode;

public class Main {
    public static void main(String[] args) {
        // Create a CD and a DVD
        CD myCd = new CD("My Music CD", 700); // Name and capacity
        DVD myDvd = new DVD("My Movie DVD", 4700); // Name and capacity

        // Demonstrate CD behaviors
        myCd.spinDisc(200); // Spin the CD at 200 RPM
        myCd.storeData("Some music data"); // Store data on the CD
        String cdData = myCd.readData(); // Read data from the CD (implementation-specific)

        // Demonstrate DVD behaviors
        myDvd.spinDisc(1000); // Spin the DVD at 1000 RPM
        myDvd.storeData("Some movie data"); // Store data on the DVD
        String dvdData = myDvd.readData(); // Read data from the DVD (implementation-specific)

        // Print information about the CD and DVD
        System.out.println("\nCD Information:\n" + myCd.reportInformation());
        System.out.println("\nDVD Information:\n" + myDvd.reportInformation());
    }
}
