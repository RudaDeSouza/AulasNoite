package Ex01;
import java.util.Scanner;
public class Calculo {
static Scanner ler = new Scanner(System.in);
double A;
public static void main(String[] args) {
    System.out.println("Diigite o valor de A: ");
       double A = ler.nextDouble();
    System.out.println("O dobro de A é: "+(A*2));
    System.out.println("O triplo de A é: "+(A*3));
    System.out.println("A metade do triplo do dobro de A é: "+((A*2)*3/2));
    System.out.println("O quadrado de A é: "+(A*A));
    System.out.println("A quinta parte do dobro de A é: "+(A*2)/5);
}
}