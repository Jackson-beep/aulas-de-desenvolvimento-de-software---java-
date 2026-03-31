import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculadora cl = new Calculadora();
        System.out.println("Ola bem vindo");
        System.out.println("digite o primeiro valor:");
        cl.setNum1(sc.nextDouble());
         System.out.println("digite o segundo valor:");
        cl.setNum2(sc.nextDouble());

        System.out.println(cl.soma() + "\t" + cl.sub() + "\t" + cl.mult() + "\t" + cl.div());





        sc.close();
    }
}
