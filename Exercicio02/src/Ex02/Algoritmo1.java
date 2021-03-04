//Numero negativo e positivo
package Ex02;
import java.util.Scanner;
public class Algoritmo1 {
int x;
static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
    
    System.out.println("Digite um número inteiro: ");
    int x = in.nextInt();
    if (x>=0){
        System.out.println(x+" é um número positivo!");
    } else {
        System.out.println(x+" é um número negativo!");
}
}
}
