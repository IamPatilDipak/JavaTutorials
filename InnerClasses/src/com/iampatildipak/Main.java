package com.iampatildipak;

public class Main {

    public static void main(String[] args) {

        GearBox gearBox = new GearBox();
        GearBox.Gear gear = gearBox.new Gear();
        gearBox.print();
        gear.print();
    }
}
