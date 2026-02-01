/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level1;

/**
 *
 * @author halo4
 */
class Animal {
    void makeSound() {
        System.out.println("Động vật đang phát ra tiếng kêu...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Con chó sủa: Gâu gâu!");
    }
}
public class Bai02 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); 
        myDog.bark();
    }
}
