/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02.emplyoee;

/**
 *
 * @author Lucas Reis <lucaslladder@gmail.com>
 * @date 06/04/24
 * @brief class Emplyoee
 */
public class Emplyoee {

    private int id;
    private String name;
    private double salary;
  

    public Emplyoee() {

    }
public Emplyoee(int id, String name, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
}
public void increaseSalary(double percentage){
    double salaryAtual = salary * (percentage /100);
    salary += salaryAtual;
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   

}
