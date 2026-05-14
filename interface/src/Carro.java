import java.util.Scanner;

public class Carro implements Veiculo{
    private String modelo;

public Carro(String modelo){
    this.modelo = modelo;
}
    

    @Override
    public void acelerar() {
        System.out.println("Qual a intensidade de aceleração?");
        Scanner sc = new Scanner(System.in);
        int intencidade = sc.nextInt();
        System.out.println("Acelerando carro na intencidade"+ intencidade+"...");
        sc.close();        
    }

    @Override
    public void frear() {
        System.out.println("Freio do carro ativado");
    }

    @Override
    public String obterTipo() {
        return "Carro";
    }

// get and set



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
