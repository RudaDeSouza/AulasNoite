//Aqui faremos o cálculo do diâmetro e de 1 quadrante de uma circunferencia
package Ex01;
import java.util.Scanner;
public class Circunferencia {
static Scanner ler = new Scanner(System.in);
double raio, quadrante, diametro;
public static void main(String[] args) {   
    System.out.println("Digite o valor do raio de uma circunferencia: ");
        double raio = ler.nextDouble();
    double diametro = raio*2; 
    double quadrante = raio/4;
    System.out.println("O diametro da circunferencia é: "+diametro);
    System.out.println("O valor de 1 quadrante dessa circunferencia é: "+quadrante);        
    }    
}
