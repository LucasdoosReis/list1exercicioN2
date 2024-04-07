/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02.emplyoee.aplication;

import ex02.emplyoee.Emplyoee; // importando classe Emplyoee
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Reis <lucaslladder@gmail.com>
 * @date 06/04/24
 * @brief class Aplication
 */
public class Aplication {

 

    public static void main(String[] args) { /// main 
        Scanner sc = new Scanner(System.in); // scanner de leitura

        ArrayList<Emplyoee> funcionarios = new ArrayList<>(); //  criando um arraylist de funcionarios do tipo Emplyoee

        System.out.println("inform the number of employees");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) { //  laço para percorrer quantidade de funcionarios informado pelo usuario vaçidando ate que a condição seja verdadeira
            System.out.println("Enter the id" + (i + 1) + ":");
            int id = sc.nextInt();
            System.out.println("Enter the name ");//
            String nome = sc.next();
            System.out.println("Enter the salary");
            double salario = sc.nextDouble();
            funcionarios.add(new Emplyoee(id, nome, salario)); //  instanciando novos funcionarios 

        }// verifica se não tem id iguais se sim sair do do program
        System.out.println("Enter the id Emplyoee that will have salary increase");
        boolean idencontado = false; // 
        int idopc = sc.nextInt();
        for (Emplyoee funcionario : funcionarios) {
            if (funcionario.getId() == idopc) { 
                System.out.println("tell us how many percent of the increase"); // informe quantos porcento de almento
                double porcenteincrease = sc.nextDouble();
                funcionario.increaseSalary(porcenteincrease);
                System.out.println("List the Emplyoee");// se idopc for = id informado pelos usuario escreve lista de funcionarios se não sai do programa 
                idencontado = true;
                break;

            }

        }
        if (!idencontado) {
            System.out.println("Usuário não encontrado.");
               System.exit(0); // Sair do programa
        }
        // lista funcionarois  com salario atualizado
        for(Emplyoee listEmplyoee: funcionarios){
            System.out.println("ID: "+ listEmplyoee.getId()+ " Name: " + listEmplyoee.getName()+" Salary: " + listEmplyoee.getSalary() );
        }

    }
}
