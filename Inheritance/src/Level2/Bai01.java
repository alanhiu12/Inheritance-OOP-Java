/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level2;

/**
 *
 * @author halo4
 */
class Furniture {
    String name;
    Furniture(String name) {
        this.name = name;
    }
}

class Table extends Furniture {
    Table(String name) {
        super(name); 
    }

    void display() {
        System.out.println("Tên nội thất: " + name);
    }
}
public class Bai01 {
    public static void main(String[] args) {
        Table myTable = new Table("Bàn làm việc gỗ");
        myTable.display();
    }
}
