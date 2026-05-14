import java.util.Scanner;

public class Bicicleta implements Veiculo {
    private String modelo;

public Bicicleta(String modelo){
    this.modelo = modelo;
}

     @Override
     public void acelerar() {
        System.out.println("Quantas pedaladas por minuto quer aumentar?");
        Scanner sc = new Scanner(System.in);
        int pedaladas = sc.nextInt();
        System.out.println("aumentando quantidades de pedaladas para"+ pedaladas+" por minuto...");
        sc.close();
        
     }

     @Override
     public void frear() {
        System.out.println("Qual dos Freios deseja acionar\n1 - Dianteiro\n2 - Traseiro\n3 - Ambos");
        Scanner sc = new Scanner(System.in);
        int freio = sc.nextInt();

        switch (freio) {
            case 1:
                System.out.println("\nFreio dianteiro acionado");
                break;
        
            case 2:
                System.out.println("\nFreio traseiro acionado");
                break;
            case 3:
                System.out.println("\nAmbos os freio acionados");
                break;    
            default:
                System.out.println("\nnão identificado acionando freio traseiro (por segurança)");
                break;
        }
        sc.close();
     }

     @Override
     public String obterTipo() {
    
        return "Bicicleta";
     }

     //get and set

     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }


     
}
