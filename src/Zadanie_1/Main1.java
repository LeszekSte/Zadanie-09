package Zadanie_1;


public class Main1 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford", 10, 60, airConditionOFF());
        vehicles[1] = new Truck("Scania", 20, 200, airConditionOFF(), 5000);

        printInfo(vehicles);

        ((Car) vehicles[0]).setAirCondition(airConditionON());
        ((Truck) vehicles[1]).setAirCondition(airConditionON());

        printInfo(vehicles);
        System.out.printf("Zasięg samochodu %d km\n", vehicles[0].zasiegPojazdu());

        additionalCombustion(400, vehicles[1]);
        System.out.printf("Zasięg ciężarówki %d km\n", vehicles[1].zasiegPojazdu());
    }

    static boolean airConditionON() {
        return true;
    }

    static boolean airConditionOFF() {
        return false;
    }

    static void additionalCombustion(double overload, Vehicle vehicle) {
        final double increasedCombustion = 0.5;
        final int kilograms = 100;

        if (vehicle instanceof Truck) {
            double additionalCombustion = increasedCombustion * (int) overload / kilograms;
            vehicle.setAverageFuelConsumption(vehicle.getAverageFuelConsumption() + additionalCombustion);
        }
    }

    static void printInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}