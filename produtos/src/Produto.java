public class Produto {
    private String nome;
    private double preco;
    private double codigoBarra;

    

    public Produto(String nome, double preco, double codigoBarra){
        this.nome = nome;
        this.preco = preco;
        this.codigoBarra = codigoBarra;
    }

    public Double getCodigoBarra(){return this.codigoBarra;}
    public void setCodigoBarra(Double codigoBarra){this.codigoBarra = codigoBarra;}

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}

    public String toString(){
        return "[Nome: " + this.nome + "\t Preco: "+ this.preco+"\t codigo de barras" + this.codigoBarra + "]";
    }
}