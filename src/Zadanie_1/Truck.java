package Zadanie_1;

public class Truck extends Car {
    private int capacity;

    public Truck(String name, double averageFuelConsumption, int tankCapacity, int capacity) {
        super(name, averageFuelConsumption, tankCapacity);
        this.capacity = capacity;
    }

    public Truck(String name, double averageFuelConsumption, int tankCapacity) {
        super(name, averageFuelConsumption, tankCapacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Ładowność - " +capacity;
    }
}

© 2019 GitHub, Inc.