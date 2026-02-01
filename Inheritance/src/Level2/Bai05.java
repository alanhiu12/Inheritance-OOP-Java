/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level2;

/**
 *
 * @author halo4
 */
class Employee {
    double salary = 5000;
    
    void printInfo() {
        System.out.print("Lương: " + salary);
    }
}

class Manager extends Employee {
    String department = "Kinh doanh";

    @Override
    void printInfo() {
        super.printInfo(); 
        System.out.println(", Phòng ban: " + department);
    }
}
public class Bai05 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.printInfo();
    }
}
