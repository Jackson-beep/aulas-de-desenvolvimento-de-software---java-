
public class Conta {

    // Atributos da classe

    double saldo;

    private String nome;

    int numero;

    double limite;

    public void setNome(String nome){
        this.nome = nome;
    }
    // getters e setters
    // public void setNome(String nome) {
    //     if (nome != null && nome.length() > 1) {
    //         this.nome = nome;
    //     }
    // }

    // public void saque(double valor){

    // if(saldo>= valor && valor > 0){

    // //this.saldo = this.saldo - valor;

    // this.saldo -= valor;

    // System.out.println("Saque efetuado com sucesso!");

    // }else{

    // System.out.println("Saldo insuficiente ou valor inválido");

    // }

    // System.out.println("Seu saldo atual é: " + this.saldo);

    // }

    boolean sacarVerifica(double quantidade) {

        if (quantidade > this.saldo) {

            return false;

        } else {

            double novoSaldo = this.saldo - quantidade;

            this.saldo = novoSaldo;

            return true;

        }

    }

    public String toString() {

        return "Nome: " + this.nome + "| Num.: " + this.numero + " | Saldo: " + this.saldo + "| Limite: " + this.limite;

    }

    boolean depositarVerifica(double deposito) {

        if (deposito <= 0) {

            return false;

        } else {

            this.saldo += deposito;

            return true;

        }

    }

}