/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N1Ex11;

/**
 *
 * @author rudas
 */
public class Cachorro {
     private String corPelo;
     private String dono;
     private int idade;

     
     
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
     

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString(){
        return "A cor do pelo do cachorro é: " + this.corPelo + "\n"
               +  "O(a) dono(a) do cachorro se chama: " + this.dono + "\n"
               + "O cachorro tem " +this.idade + " anos";
       
    }
}
