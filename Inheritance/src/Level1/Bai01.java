/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level1;

/**
 *
 * @author halo4
 */
class Parent {
    public void display() {
        System.out.println("Xin chào! Đây là phương thức display() được định nghĩa trong lớp Parent.");
    }
}

class Child extends Parent {
    
}

public class Bai01 {
    public static void main(String[] args) {
        Child myChild = new Child();
        
        System.out.println("=== Bắt đầu gọi hàm ===");
        myChild.display(); 
        System.out.println("=== Kết thúc ===");
    }
}