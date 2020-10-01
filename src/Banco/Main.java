import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("fulano", "12345678", "123");
        
        //Adiciona Saldo
        conta.deposito(5.5);

        //Remove Saldo
        conta.saque(1.2);

        //calcula Rendimento
        System.out.println("O saldo no próximo mes será R$ " + conta.rendimento());
    }
    
}

class Conta{
    String nome;
    String numero;
    String agencia;
    double saldo;
    LocalDate dataDeAbertura;

    public Conta(String nnome, String nnumero, String aagencia){
        nome = nnome;
        numero = nnumero;
        agencia = aagencia;
        saldo = 0;
        dataDeAbertura = LocalDate.now();
        System.out.println("Conta criada:");
        System.out.println();
        System.out.println(nome);
        System.out.println(numero);
        System.out.println(agencia);
        System.out.println("R$ " + saldo);
        System.out.println();
        System.out.println("Aberta em " + dataDeAbertura);
    }

    public void saque(Double saque){
        saldo -= saque;
        System.out.println("Saque realizado no valor de " + saque);
        System.out.println("Novo saldo: R$ " + saldo);
    }

    public void deposito(Double deposito){
        saldo += deposito;
        System.out.println("Deposito realizado no valor de " + deposito);
        System.out.println("Novo saldo: R$ " + saldo);
    }

    public double rendimento(){
        return saldo *= 1.1;
    }
}
