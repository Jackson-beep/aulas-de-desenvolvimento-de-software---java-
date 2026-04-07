public class Livros extends Produto{
    private String autor;

    public Livros(){}

    public Livros(String nome, double preco, double codigoBarra, String autor){
        super(nome, preco, codigoBarra);
        this.autor = autor;
    }

    
    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

  

    public String toString(){
        return "Livro: [Nome: " + getNome() 
                    + "\t Preco: "+ getPreco()
                    + "codigo de barras" + getCodigoBarra() + " \t Autor "+ this.autor +"]";
    }
}