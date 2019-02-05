package Zadanie_1;

public class Car extends Vehicle {
    private boolean airCondition;
    static final double CAR_FUEL_COMBUSION_DIFF = 0.8;


    public Car(String name, double averageFuelConsumption, int tankCapacity, boolean airCondition) {
        super(name, averageFuelConsumption, tankCapacity);
        this.airCondition = airCondition;
        if (airCondition){
            setAverageFuelConsumption(getAverageFuelConsumption()+CAR_FUEL_COMBUSION_DIFF);
        }
    }

    public boolean getAirConition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition, Vehicle vehicle) {
        double fuelCombustionDifference= 0.8;

        if (vehicle instanceof Car) {
            fuelCombustionDifference = CAR_FUEL_COMBUSION_DIFF;
        }
        if (vehicle instanceof Truck) {
            fuelCombustionDifference = CAR_FUEL_COMBUSION_DIFF+Truck.TRUCK_FUEL_COMBUSION_DIFF;
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