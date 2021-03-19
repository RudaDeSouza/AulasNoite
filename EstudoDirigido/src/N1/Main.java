/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N1;

import java.util.Scanner;
/**
 *
 * @author rudas
 */
public class Main {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto prod =  new Produto();
        
        System.out.println("=========================");
        System.out.println("Digite o nome do produto: ");
        prod.setNome(ler.nextLine());
        
        System.out.println("=========================");
        System.out.println("Digite o valor do produto: ");
        prod.setValor(ler.nextDouble());
        
        System.out.println("Produto: " + prod.getNome());
        System.out.println("valor: " + prod.getValor());
        System.out.println("Desconto: " + prod.calcularDesconto());
    }
    
}

