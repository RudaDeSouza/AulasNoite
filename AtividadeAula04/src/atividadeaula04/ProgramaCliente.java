

//INTERFACE, é onde o user do sistema irá interagir
package atividadeaula04;
import java.util.Scanner;
public class ProgramaCliente {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Cliente cli = new Cliente();
        
        //invocação dos métodos acessores
        System.out.println("Nome do cliente: ");
        cli.setNome(ler.nextLine());
        
        System.out.println("Digite a idade: ");
        cli.setIdade(ler.nextInt());
        
        System.out.println("Digite a renda: ");
        cli.setRenda(ler.nextDouble());
        
        /*Visualização dos dados digitados
        invocação dos métodos acessores get
        */
        System.out.println("****************");
        System.out.println("Visualizando  os dados do Cliente");
        System.out.println("****************");
        
        //invocando os getters
        System.out.println("O nome do cliente é: " + cli.getNome());
        System.out.println("A idade do cliente é: " + cli.getIdade());
        System.out.println("O salário do cliente é: " + cli.getRenda());
        
        //Chamar os métodos criados
        System.out.println(cli.classificarIdade());
        System.out.println(cli.classificarRenda());
       
    }
    
}
