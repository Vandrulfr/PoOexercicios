import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class Agenda{
    
    public Set<Contato> contatos;
    
    public Agenda(){
        contatos = new HashSet<Contato>();
    }

    public void adiciona_contato(Contato contato) {
        contatos.add(contato);
    }

    public void exibe_contatos(){
        for(Contato contato : contatos){
            System.out.println(contato.nome);
        }
    }

}

class Contato {
    
    public String nome;
    public String numero;

    public Contato(String nnome, String nnumero){
        nome = nnome;
        numero = nnumero;
    }
}

public class Main{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\n1 para adicionar contatos, 2 para exibir contatos, 0 para sair.");
            String option = scan.next();
            if(option.equals("0")){
                scan.close();
                break;
            }
            if(option.equals("1")){
                System.out.println("Nome do contato:\n");
                String nome = scan.next();
                System.out.println("Telefone do contato:\n");
                String telefone = scan.next();
                agenda.adiciona_contato(new Contato(nome, telefone));
                System.out.println("Contato criado!");
            }
            if(option.equals("2")){
                agenda.contatos.forEach(contato -> {
                    System.out.println("");
                    System.out.println(contato.nome);
                    System.out.println(contato.numero);
                });
            }
        }
    }
}