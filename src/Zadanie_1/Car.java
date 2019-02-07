package Zadanie_1;

public class Car extends Vehicle {
    private boolean airCondition;
    static final double CAR_FUEL_COMBUSION_DIFF = 0.8;


    public Car(String name, double averageFuelConsumption, int tankCapacity, boolean airCondition) {
        super(name, averageFuelConsumption, tankCapacity);
        this.airCondition = airCondition;
        if (airCondition) {
            setAverageFuelConsumption(getAverageFuelConsumption() + CAR_FUEL_COMBUSION_DIFF);
        }
    }

    public boolean getAirConition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        boolean temp = getAirConition();
        if (airCondition && !temp) {
            setAverageFuelConsumption(getAverageFuelConsumption() + CAR_FUEL_COMBUSION_DIFF);
        } else if (!airCondition && temp) {
            setAverageFuelConsumption(getAverageFuelConsumption() - CAR_FUEL_COMBUSION_DIFF);
        }
        this.airCondition = airCondition;
    }




    @Override
    public String toString() {
        return super.toString() + " Klima " + airCondition;
    }

}