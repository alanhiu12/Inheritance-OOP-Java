/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level2;

/**
 *
 * @author halo4
 */
class Electronic {
    String power = "220V";
}

class Computer extends Electronic {
    String os = "Windows 11";
}

class Laptop extends Computer {
    int battery = 200000; 

    void showSpecs() {
        System.out.println("Nguồn: " + power);
        System.out.println("Hệ điều hành: " + os);
        System.out.println("Dung lượng Pin: " + battery + " mAh");
    }
}
public class Bai04 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.showSpecs();
    }
}
