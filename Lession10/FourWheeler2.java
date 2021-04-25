package Lession10;

public class FourWheeler2 extends Vehicle1 {
    private boolean powerSteer;

    public FourWheeler2(String vId, String vName, int numWheels, boolean pSteer) {
        super(vId, vName, numWheels);
        powerSteer = pSteer;
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
            System.out.println("Maximum acceleration:" + speed + "kmph");
    }

    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);
        if (powerSteer == true) {
            System.out.println("Power Steering:Yes");
        }  else{
            System.out.println("Power Stearing:No");
        }


    }

    public static class TestVehicle {
        public static void main(String[] args) {
            FourWheeler objFour = new FourWheeler("LA - 09CS - 1406", "Volkswagen", 4, true);
            objFour.showDetails();
            objFour.accelerate(200);

        }
    }
}
