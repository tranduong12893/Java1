package Lession10;

public class FourWheeler extends Vehicle {
    private boolean powerSteer;

    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {

        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }

    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);

        if (powerSteer == true)

            System.out.println("Power Steering:Yes");
        else
            System.out.println("Power Steering:No");
    }


    public static class TestVehicle {
        public static void main(String[] args) {
            // Create an object of child class and specify the values
            FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
            objFour.showDetails();  // Invoke the child class method
            objFour.accelerate(200);  // Invoke the inherited method
        }
    }
}
