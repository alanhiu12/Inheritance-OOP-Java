/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level1;

/**
 *
 * @author halo4
 */
class Vehicle {
    String brand;
}

class Bike extends Vehicle {
    
}

public class Bai04 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.brand = "Giant"; 
        System.out.println("Thương hiệu xe đạp là: " + myBike.brand);
    }
}
