package Lession10;

public class FourWheeler1 extends Vehicle {
    private boolean powerSteer;

    public FourWheeler1(String vId, String vName, int numWheels, boolean pSteer) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }

    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);

        if (powerSteer == true) {
            System.out.println("Power Steering:Yes");}
       else
            System.out.println("Power Steering:No");
        }
        @Override
        public void accelerate(int speed){
            System.out.println("Maximum acceleration:" + speed + "kmph");
        }


    public static class TestVehicle {

        public static void main(String[] args) {
            FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }
}
