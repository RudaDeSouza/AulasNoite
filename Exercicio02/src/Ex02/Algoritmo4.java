//Qual dos números é maior
package Ex02;
import java.util.Scanner;
public class Algoritmo4 {
static Scanner in = new Scanner(System.in);
double valor1, valor2;
public static void main(String[] args) {
    System.out.println("Digite o valor 1: ");
    double valor1 = in.nextDouble();
    
    System.out.println("Digite o valor 2: ");
    double valor2 = in.nextDouble();
    
    if (valor1>valor2) {
        System.out.println(valor1+" é maior que "+valor2);
    } else {
        System.out.println(valor2+" é maior que "+valor1);
    }
}
}
         
    
