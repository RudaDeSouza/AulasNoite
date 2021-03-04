//Valores reais iguais ou diferentes
package Ex02;
import java.util.Scanner;
public class Algoritmo2 {
int A,B;
static Scanner in = new Scanner(System.in); 
public static void main(String[] args){
    System.out.println("Digite o valor A: ");
    int A = in.nextInt();
    System.out.println("Digite o valor B: ");
    int B = in.nextInt();
    if (A==B) {
        System.out.println("Os números são iguais");
    } else {
        System.out.println("Os números são diferentes");
    }
  }
}

