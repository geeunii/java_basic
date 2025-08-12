package java_advanced_01.day14_0812.interfaceEx;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();

        System.out.println("===== 강제 타입변환 =====");

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

        List<Vehicle> vehicleList = new ArrayList<>(); // 운송수단 관리 개념.
        vehicleList.add(bus);
        vehicleList.add(bus);
        vehicleList.add(bus);
        vehicleList.add(bus);

    }
}
