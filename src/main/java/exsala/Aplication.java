/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exsala;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 06/04/24
 * @brief class Aplication
 */
public class Aplication {
    public static void main(String[] args) {
        
          List<String> list = new ArrayList<>(); // criando um array list do tipo String
          // adicionado na list 
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");
        System.out.println(list.size()); // imprimindo o tamanho da lista
        for(String x: list){
            System.out.println(list);
        }
        System.out.println("------------");
        list.removeIf(x-> x.charAt(0)=='M'); // removendo nomes com letra M
        for(String x:list){
            System.out.println(x);
        }
        System.out.println("-------------");
        System.out.println("Index of bob: "+ list.indexOf("Bob")); // imprimindo os index de bob
         System.out.println("Index of Marcos: "+ list.indexOf("Marcos")); // imprimindo o index de marcos
         System.out.println("------------");
         List<String> resul = list.stream().filter(x-> x.charAt(0)=='A').collect(Collectors.toList());
         for(String x: resul){ // imprimindo em x o que foi passado em resul
             System.out.println(x);
         }
         System.out.println("--------------");
         String name = list.stream().filter(x-> x.charAt(0)=='j').findFirst().orElse(null);//Este método de filtro é aplicado ao fluxo. Ele recebe um predicado que verifica se o primeiro caractere de cada elemento é igual a 'j
         System.out.println(name); // imprimi o que foi passado em nome
        
        
    }
}

