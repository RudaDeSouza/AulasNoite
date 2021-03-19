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
public class Papagaio {
    private String nome;
    private String corPena;
    private String especie;

    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public String toString(){
        return "A cor da pena do papagaio é: " + this.corPena + "\n"
                + "O nome do papagaio é: " + this.nome + "\n"
                + "A espécie do papagaio é: " + this.especie;
    }
}
