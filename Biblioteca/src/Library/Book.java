package Library;

public class Book {
    public String name, author, genre;
    private String publishingCompany;
    public double price, finalPrice;
    
    //construtor sem parametro
    public Book() {
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }
    
    public double verifyPrice() {
        if(this.price > 120) {
          finalPrice = (this.price - (this.price * 0.3));
        } else{
          finalPrice = price;
        }
        return finalPrice;
    }
    
    @Override
    public String toString() {
        return "===Informações do livro===" + "\n"
                + "O título do livro: " + this.name + "\n"
                + "A editora do livro: " + this.publishingCompany + "\n"
                + "O gênero do livro: " +this.genre + "\n"
                + "O autor do livro: " + this.author + "\n"
                + "O preço do livro é: " + this.price + "\n"
                + "O valor final da compra é: "+ verifyPrice();
                }
}
