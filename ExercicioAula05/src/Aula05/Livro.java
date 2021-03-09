package Aula05;
public class Livro {
    public String titulo, autor;
    private String genero;
    private int ano;
    private double preco;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String verificarPreco() {
        String valor;
        if(this.preco >= 130) {
            valor = "Esse livro ta caro né";
        }else {
            valor = "O livro está na média dos preços";
        }
       return valor;
    }
    public String verificarDesconto(){
        String valor;
        if(this.preco > 80){
            valor = "Leva que esse tem desconto hein";
        } else {
            valor = "quer desconto espera a BlackFriday";
        }
       return valor;
    }

}
