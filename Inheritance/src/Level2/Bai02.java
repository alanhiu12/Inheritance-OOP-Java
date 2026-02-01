/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level2;

/**
 *
 * @author halo4
 */
class Shape {
    void draw() {
        System.out.println("Đang vẽ hình...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Vẽ hình tròn");
    }
}
public class Bai02 {
    public static void main(String[] args) {
        System.out.println("=== Kiểm tra tính Ghi đè (Override) ===");

        Shape genericShape = new Shape();
        System.out.print("Đối tượng Shape: ");
        genericShape.draw();

        Circle myCircle = new Circle();
        System.out.print("Đối tượng Circle: ");
        myCircle.draw(); 

        System.out.println("========================================");
    }
}
