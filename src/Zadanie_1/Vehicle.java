package Zadanie_1;

public class Vehicle {
    private String name;
    private double averageFuelConsumption;
    private int tankCapacity;

    public Vehicle(String name, double averageFuelConsumption, int tankCapacity) {
        this.name = name;
        this.averageFuelConsumption = averageFuelConsumption;

        this.tankCapacity = tankCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", averageFuelConsumption=" + averageFuelConsumption +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}