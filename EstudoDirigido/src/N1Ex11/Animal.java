/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N1Ex11;

import java.util.Scanner;
/**
 *
 * @author rudas
 */
public class Animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String especie;
        Cachorro c1 = new Cachorro();
        Papagaio p1 = new Papagaio();
        Mosca m1 = new Mosca();
        
        
        // Entrada dos dados    
        System.out.println("==========================");
        System.out.println("** Cadastro do cachorro **");
        System.out.println("==========================");
        
        System.out.println("Digite a cor do cachorro: ");
        c1.setCorPelo(ler.next());
        System.out.println("Digite o nome do dono(a) do cachorro: ");
        c1.setDono(ler.next());
        System.out.println("Digite a idade do cachorro: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("==========================");
        System.out.println("** Cadastro do papagaio **");
        System.out.println("==========================");
        
        System.out.println("Digite o nome do papagaio: ");
        p1.setNome(ler.next());
        System.out.println("Digite a especie do papagaio: ");
        p1.setEspecie(ler.next());
        System.out.println("Digite a cor da pena do papagaio: ");
        p1.setCorPena(ler.next());
        
        
        System.out.println("==========================");
        System.out.println("** Cadastro da mosca **");
        System.out.println("==========================");
        
        System.out.println("Digite quantas patas tem a mosca: ");
        m1.setQtdPatas(ler.nextInt());
        System.out.println("Digite a espécie da mosca: ");
        m1.setEspecie(ler.next());
        System.out.println("Digite a cor da mosca: ");
        m1.setCor(ler.next());
        
        System.out.println("==========================");
        System.out.println("Informações dos animais");
        System.out.println(c1);
        System.out.println(p1);
        System.out.println(m1);
        
    }
}
