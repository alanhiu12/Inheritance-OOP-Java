/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level2;

/**
 *
 * @author halo4
 */
class Bank {
    protected double interestRate = 0.05; // Lãi suất 5%
}

class SavingsBank extends Bank {
    void calculateInterest(double balance) {
        double interest = balance * interestRate; // Truy cập trực tiếp biến protected
        System.out.println("Tiền lãi của bạn là: " + interest);
    }
}
public class Bai03 {
    public static void main(String[] args) {
        System.out.println("--- Bài 3: Truy cập Protected ---");
        SavingsBank myAccount = new SavingsBank();
        myAccount.calculateInterest(1000000);
    }
}
