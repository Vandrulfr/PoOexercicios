import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome da pessoa?");
        String nnome = scan.next();
        scan.nextLine();
        System.out.println("Qual a idade inicial da pessoa?");
        int idadeInicial = scan.nextInt();
        Pessoa pessoa = new Pessoa(nnome, idadeInicial);
        System.out.println(pessoa.nome + " tem " + pessoa.idade + " anos.");
        System.out.println("Quantos aniversários " + pessoa.nome + " vai fazer?");
        int tempo = scan.nextInt();
        scan.close();
        if (tempo == 0){
            System.out.println("A idade de " + pessoa.nome + " não mudou.");
        }
        else{
            pessoa.aniversario(tempo);
            System.out.println("Se passaram " + tempo + " anos, e agora " + 
            pessoa.nome + " tem " + pessoa.idade + " anos ");
        }
    }
    
}

class Pessoa{
    int idade;
    String nome;

    public Pessoa(String nnome, int idadeInicial){
        nome = nnome;
        idade = idadeInicial;
    }

    public void aniversario(int tempo){
        idade += tempo;
    }
}
