package Atividade;
import java.util.Scanner;
public class Vetor2 {
    public static void main(String[] args) {
        int npar=0;
        int nimpar=0;
        Scanner ler = new Scanner(System.in);
        int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        System.out.println("========================");
        System.out.println("Números pares e ímpares");
        System.out.println("========================");
        
        System.out.println("O conjunto dos números são: ");
        //coloquei um for porque deu problema no netbeans e não consegui
        //simplificar o código 
        for (int i=0; i<20; i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println("========================");
        System.out.println("Separando os números");
        
        for (int i = 0; i<20; i++) {
            if (numeros[i]%2==0) {
              npar++;
            }
            nimpar = 20 - npar;
        }
            System.out.println("Total de números pares: "+npar);
            System.out.println("Total de números Ímpares: "+nimpar);
        }
        
    }
