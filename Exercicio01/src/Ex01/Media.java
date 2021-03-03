// Aqui faremos o cálculo da média aritmética de um aluno
package Ex01;
import java.util.Scanner; 
public class Media {
static Scanner ler = new Scanner(System.in);
String nome;
double n1, n2, n3;
public static void main(String[] args) {
   System.out.println("Digite o nome do aluno: ");
   String nome = ler.next();
   System.out.println("Digite a nota da primeira prova: ");
   double n1 = ler.nextDouble();
   System.out.println("Digite a nota da segunda prova: ");
   double n2 = ler.nextDouble();
   System.out.println("Digite a nota da terceira prova: ");
   double n3 = ler.nextDouble();
   double media=(n1+n2+n3)/3;
   System.out.println("A média aritmética do aluno "+nome+" é: "+media);
}
}
