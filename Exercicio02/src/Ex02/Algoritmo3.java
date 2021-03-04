//Valor par ou impar
package Ex02;
import java.util.Scanner;
public class Algoritmo3 {
static Scanner in = new Scanner(System.in);
int valor;
public static void main(String[] args) {
    System.out.println("Digite um valor inteiro: ");
    int valor = in.nextInt();
    if (valor % 2 == 0 ) {
        System.out.println("O número é par");
    } else {
        System.out.println("O número é ímpar");
    }
}
}
