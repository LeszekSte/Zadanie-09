package Zadanie_1;

public class Truck extends Car {
    private int capacity;
    static final double TRUCK_FUEL_COMBUSION_DIFF = 0.8;

    public Truck(String name, double averageFuelConsumption, int tankCapacity, boolean airCondition, int capacity) {
        super(name, averageFuelConsumption, tankCapacity, airCondition);
        if (airCondition) {
            setAverageFuelConsumption(getAverageFuelConsumption() + TRUCK_FUEL_COMBUSION_DIFF);
        }
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setAirCondition(boolean airCondition) {
        boolean temp = getAirConition();
        super.setAirCondition(airCondition);

        if (airCondition && !temp) {
            setAverageFuelConsumption(getAverageFuelConsumption() + TRUCK_FUEL_COMBUSION_DIFF);
        } else if (!airCondition && temp) {
            setAverageFuelConsumption(getAverageFuelConsumption() - TRUCK_FUEL_COMBUSION_DIFF);
        }
    }



    @Override
    public String toString() {
        return super.toString() + ", Ładowność - " + capacity;
    }


}
