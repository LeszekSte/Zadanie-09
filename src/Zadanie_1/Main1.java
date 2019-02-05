package Zadanie_1;

import javax.sound.midi.Track;
import javax.swing.table.TableRowSorter;

public class Main1 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford",10,50, true);
        vehicles[1] = new Truck("Scania",20, 100,false,5000);


        System.out.println(vehicles[0].toString());
        ((Car)vehicles[0]).setAirCondition(true, vehicles[0]);
        System.out.println(vehicles[0].toString());

        System.out.println(vehicles[1].toString());
        ((Car)vehicles[1]).setAirCondition(true, vehicles[1]);
        ((Car)vehicles[1]).setAirCondition(true, vehicles[1]);
        ((Car)vehicles[1]).setAirCondition(true, vehicles[1]);
//
        System.out.println(vehicles[1].toString());



    }


}