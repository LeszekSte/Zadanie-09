package Zadanie_1;

public class Car extends Vehicle {
    private boolean airCondition;

    public Car(String name, double averageFuelConsumption, int tankCapacity, boolean airCondition) {

        super(name, averageFuelConsumption, tankCapacity);
        this.airCondition = airCondition;
        if (airCondition){
            setAverageFuelConsumption(getAverageFuelConsumption()+0.8);
        }

    }



    public Car(String name, double averageFuelConsumption, int tankCapacity) {
        super(name, averageFuelConsumption, tankCapacity);
    }

    public boolean getAirConition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition, Vehicle vehicle) {
        double fuelCombustionDifference= 0;

        if (vehicle instanceof Car) {
            fuelCombustionDifference = 0.8;
        }
        if (vehicle instanceof Truck) {
            fuelCombustionDifference = 1.6;
        }

        boolean temp = getAirConition();
        if (airCondition == true && temp == false) {
            setAverageFuelConsumption(getAverageFuelConsumption() + fuelCombustionDifference);
        } else if (airCondition == false && temp == true) {
            setAverageFuelConsumption(getAverageFuelConsumption() - fuelCombustionDifference);
        }
        this.airCondition = airCondition;
    }

    @Override
    public String toString() {
        return super.toString() + " Klima " + airCondition;
    }


}