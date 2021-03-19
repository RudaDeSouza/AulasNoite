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
public class Mosca {
     private int qtdPatas;
     private String cor;
     private String especie;

     
     
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
     
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
  
    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
    
    @Override
    public String toString(){
        return "A mosca possui: " + this.qtdPatas + " patas\n"
               + "A mosca tem a cor: " + this.cor + "\n"
               + "A mosca se chama: " + this.especie; 
    }
}
