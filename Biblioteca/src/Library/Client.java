package Library;

public class Client { 
    public String name;
    private String cpf, genre;
    private int age;
    
    //construtor sem parametro
    public Client() {
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String verifyGenre() {
        String r;
        if (this.genre.equalsIgnoreCase("f")) {
        r = "Feliz dia da mulher! você tem desconto de 30% em livros a cima de R$100,00";
        } else {
        r = "Você não possui desconto";
        }
        return r;
    }
        
    @Override
     public String toString() {
        return "===Informações do cliente===" + "\n" 
                + "Nome do cliente: " + name + "\n" 
                + "CPF do cliente: " + this.cpf + "\n" 
                + "Sexo do cliente: " + this.genre + "\n"
                + "Idade do cliente: " + this.age + "\n"
                + verifyGenre();
    }
   }

