/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entites;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 06/04/24
 * @brief class Entites
 */
public class Entites {

   private String name;
    private String email;
    private int quarto;

    

    public Entites() {

    }

    public Entites(String name, String email, int quarto) {

        this.name = name;
        this.email = email;
        this.quarto = quarto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
    

   

}