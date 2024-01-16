/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
 
/**
 *
 * @author himelmaj
 */
public class Student extends Person {
    private int age;
    private int approvalStatus;
    private float matriculationFee;


    public Student(String name, String username, String id, String email, LocalDate date, int age, int approvalStatus, float matriculationFee) {
        super(name, username, id, email, date);
        this.age = age;
        this.approvalStatus = approvalStatus;
        this.matriculationFee = matriculationFee;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(int approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public float getMatriculationFee() {
        return matriculationFee;
    }

    public void setMatriculationFee(float matriculationFee) {
        this.matriculationFee = matriculationFee;
    }


    @Override
    public String toString() {
        return "Student{" + "{" + super.toString() + "}" +
                "age=" + age +
                ", approvalStatus=" + approvalStatus +
                ", matriculationFee=" + matriculationFee +
                '}';
    }

    public void evaluateStudent(int approved){
        switch (approved){
            case 1:
                System.out.println("Approved Theoretical");
                break;
            case 2:
                System.out.println("Approved Practical");
                break;
            default:
        }
    }
}
