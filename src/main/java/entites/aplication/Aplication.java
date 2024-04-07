/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites.aplication;

import entites.Entites;
import java.util.Scanner;

/**
 *
 * @author Lucas Reis <lucaslladder@gmail.com>
 * @date 06/04/24
 * @brief class Aplication
 */
public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Entites[] quartos = new Entites[10]; // vetor quarto do tipo Entites com 10 posições

        System.out.println("Informe o numeros de alunos que deseja Ospedar");
        int numEstudantes = sc.nextInt();
        System.out.println("Bem vindo!");
        if (numEstudantes > 0 && numEstudantes < 10) { // limita a quantidade de quartos em 10
            for (int i = 0; i < numEstudantes; i++) { // laço para cadastrar alunos 
          
                System.out.println("Informe o nome do aluno" + (i + 1) + ":");//
                String nome = sc.next();
                System.out.println("Informe o E-mail do aluno" + (i + 1) + ":");//
                String email = sc.next();
                System.out.println("Informe qual quarto você deseja ficar "
                        + " quartos disponivel do 1 ate o 10");
                int quarto = sc.nextInt();

                /// verificando os quartos que estão vazios
                if (quarto >= 1 && quarto <= 10) {
                    if (quartos[quarto - 1] == null) {
                        quartos[quarto - 1] = new Entites(nome, email, quarto);

                    }
                    System.out.println("Estudantes registrado no quarto" + quarto + ":");
                } else {
                    System.out.println("A sala " + quarto + " já está ocupada. Escolha outra sala.");
                    i--; // Volta uma iteração para permitir que o usuário escolha outra sala
                }
            }
        }

        System.out.println("numeros de quartos ");
        for (Entites listquarto : quartos) { // lista os quatos ocupados 
            if (listquarto != null) {
                System.out.println("Quarto: " + listquarto.getQuarto()
                        + " Nome: " + listquarto.getName() + " E-mail: "
                        + listquarto.getEmail());

            }else{
                System.out.println("Quarto Vazio"); // lista os quartos vazio
            }
            

        }

    }

}
