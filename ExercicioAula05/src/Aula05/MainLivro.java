package Aula05;
import java.util.Scanner;
public class MainLivro {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Livro li = new Livro();
        
        System.out.println("Digite o título do livro: ");
        String titulo = ler.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = ler.nextLine();
        System.out.println("Digite o gênero do livro: ");
        li.setGenero(ler.nextLine());
        System.out.println("Digite o ano do livro: ");
        li.setAno(ler.nextInt());
        System.out.println("Digite o preço do livro: ");
        li.setPreco(ler.nextDouble());
        
        System.out.println("O nome do livro é:"+titulo);
        System.out.println("O livro foi escrito por:"+autor);
        System.out.println("O gênero do livro é:"+li.getGenero());
        System.out.println("O ano do livro é:"+li.getAno());
        System.out.println("O preço do livro é:"+li.getPreco());
        
        System.out.println("Obs: "+li.verificarPreco());
        System.out.println("Desconto: "+li.verificarDesconto());
    }
}