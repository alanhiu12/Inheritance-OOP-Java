/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level1;

/**
 *
 * @author halo4
 */
class Person {
    String name;
}

class Student extends Person {
    String studentId;

    void showInfo() {
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Mã số sinh viên: " + studentId);
    }
}
public class Bai03 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Trịnh Minh Hiếu"; 
        st.studentId = "HE210812";  
        st.showInfo();
    }
}
