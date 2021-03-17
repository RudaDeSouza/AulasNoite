
package Atividade;
import java.util.Scanner;
import java.util.ArrayList;
public class Vetor {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args ) 
    {
        int soma=0;
        int num=0;
        Scanner ler = new Scanner(System.in);
        
        ArrayList <Integer> vetor = new ArrayList<>();
        
        
         System.out.println("Digite a quantidade de números desejados "
         + "e para parar o programa, basta digitar um número negativo");
        do
        {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            //adiciona o elemento no ArrayList
            vetor.add(num);
        } while(num>0);
      
        int ultimo = vetor.size();
        vetor.remove(ultimo -1);   
        System.out.println("Numeros da lista: "+vetor);
        
        System.out.println("Digite um número qualquer: ");
        num = ler.nextInt();
       
        System.out.println("==========================");
        System.out.println("Fazendo a soma dos valores"+"\n");
        
        for (int i=0; i<vetor.size(); i++) 
        {
        soma = soma + vetor.get(i);
        }
        
        int quantidade=0;
        for (int i=0; i<vetor.size(); i++){
            if (vetor.get(i).equals(num)){
                quantidade++;
            }
        }
        System.out.println("O vetor possui armazenado o último número digitado?" + vetor.contains(num)); 
              
        soma = soma + num;
        System.out.println("A soma do vetor mais o último número digitado é: "+soma);
        System.out.println("O número "+num+" se repete "+ quantidade +" vezes dentro do ArrayList");
       
    }
    
}
