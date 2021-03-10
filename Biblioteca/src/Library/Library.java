package Library;
import java.util.Scanner;
public class Library {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Book b1 = new Book();
        Client c1 = new Client();
        
        System.out.println("Digite o nome do cliente: ");
        c1.name = ler.nextLine();
        System.out.println("Digite o cpf do: ");
        c1.setCpf(ler.nextLine());
        System.out.println("Digite a idade do cliente: ");
        c1.setAge(ler.nextInt());
        System.out.println("Digite o sexo do cliente: [F/M]");
        c1.setGenre(ler.next());
        
        
        System.out.println("Digite o nome do livro: ");
        b1.name = ler.next();
        System.out.println("Digite o autor do livro: ");
        b1.author = ler.next();
        System.out.println("Digite o gênero do livro: ");
        b1.genre = ler.next();
        System.out.println("Digite a editora do livro: ");
        b1.setPublishingCompany(ler.next());
        System.out.println("Digite o preço do livro: ");
        b1.price = ler.nextDouble();
        
        System.out.println(c1);
        System.out.println(b1);
        
    }
    
}
