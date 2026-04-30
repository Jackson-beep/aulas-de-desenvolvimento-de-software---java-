import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        Scanner sc = new Scanner(System.in);
        // Animal animais[] = new Animal[10];
        // Animal doguinho = new Animal("Doguinho", 3, 5.5, 0); // Instanciando 1 obj da
        // classe Aniaml
        ArrayList<Animal> animaisList = new ArrayList<>();
        String menu = "1 - Cadastrar animais \n" +
                "2 - Listar animais \n" +
                "3 - Mover Animal \n" +
                "4 - Editar Animal \n" +
                "0 - Sair";

        int option = 0;
        do {
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Cadastro de Animal");
                    System.out.println("Escolha qual animal deseja cadastrar : \n" +
                            "1 - Animal generico \n" +
                            "2 - Peixe \n" +
                            "3 - Ave \n");
                    int tipoAnimal = sc.nextInt();
                    System.out.println("Digite o nome do animal");
                    String nome = sc.next();
                    System.out.println("Digite a quantidade de patas do animal");
                    int patas = sc.nextInt();
                    System.out.println("Digite a velocidade do animal");
                    double velocidade = sc.nextDouble();
                    System.out.println("Digite um valor inteiro de localização");
                    int localização = sc.nextInt();
                    switch (tipoAnimal) {
                        case 1:
                            Animal a = new Animal(nome, patas, velocidade, localização);
                            animaisList.add(a);
                            System.out.println("Temos " + animaisList.size() + " animais cadastrados!");
                            break;
                        case 2:
                            System.out.println("digite a agua");
                            int agua = sc.nextInt();
                            Animal p = new Peixe(nome, patas, velocidade, localização, agua);
                            animaisList.add(p);
                            break;
                        case 3:
                            Ave ave = new Ave(nome, patas, velocidade, localização);
                            animaisList.add(ave);
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Listar Animais");
                    for (Animal animalItem : animaisList) {
                        System.out.println(animalItem.toString());
                    }
                    break;
                case 3:
                    
                    System.out.println("Mover Animal");
                    int cont = 1;  

                    for (Animal a : animaisList) {
                        System.out.println(cont+" - "+ a.getNome());
                        cont++;
                    }
                    System.out.println("Qual animal voce deseja mover?\nDigite o numero: ");
                    int codAnimal = sc.nextInt();
                    animaisList.get(codAnimal-1).mover();


                    break;
                case 4:

                    cont = 1;
                    for (Animal a : animaisList) {
                        System.out.println(cont+" - "+ a.getNome());
                        cont++;
                    }
                    codAnimal= 0;
                    System.out.println("Qual animal voce deseja editar?\nDigite o numero: ");
                    codAnimal = sc.nextInt();  
                    
                    Animal tempAnimal = animaisList.get(-1);  

                    System.out.println("Nome atual: " + tempAnimal.getNome()+"\n Digite o novo nome do animal, ou tecle ENTER para manter");
                    nome = sc.next();
                    System.out.println("Quantia de patas atual : "+ tempAnimal.getPatas()+"\nDigite a quantidade de patas do animal, ou tecle ENTER para manter");
                    patas = sc.nextInt();
                    System.out.println("Velocidade atual : "+ tempAnimal.getVelocidade() +"\nDigite a velocidade do animal, ou tecle ENTER para manter");
                    velocidade = sc.nextDouble();
                    System.out.println("A localização atual: " + tempAnimal.getLocalizacao()+ "Digite o novo local (valor inteiro) de localização, ou digite 0 para manter");
                    localização = sc.nextInt();
                    
                     if (tempAnimal instanceof Peixe) {
                        System.out.println("Otipo de agua atual é" + ((Peixe)tempAnimal).getAgua()+"\n Digite o novo tipo de agua, ou -1 para manter");
                        int agua = sc.nextInt();
                        ((Peixe)tempAnimal).setAgua(agua != -1? agua: ((Peixe)tempAnimal).getAgua());
                     }
                     tempAnimal.setNome(nome.length()<=1? tempAnimal.getNome():nome);
                     tempAnimal.setPatas(patas != 0 ? patas: tempAnimal.getPatas());
                     tempAnimal.setVelocidade(velocidade != 0? velocidade: tempAnimal.getVelocidade());
                     tempAnimal.setLocalizacao(localização !=0? localização: tempAnimal.getLocalizacao());
                    break;
                case 0:
                     System.out.println("Encerrando...");
                    break;
                default:
                    break;
            }
        } while (option != 0);

        
        sc.close();
    }
}