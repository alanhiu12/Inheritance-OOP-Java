/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level1;

/**
 *
 * @author halo4
 */
class Mover {
    void move() {
        System.out.println("Vật thể đang di chuyển...");
    }
}

class Runner extends Mover {
    void run() {
        System.out.println("Người chạy: Đang chạy với tốc độ cao!");
    }
}
public class Bai05 {
    public static void main(String[] args) {
        Runner flash = new Runner();
        flash.move(); 
        flash.run(); 
    }
}
