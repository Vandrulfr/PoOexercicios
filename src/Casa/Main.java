import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Branca");
        Porta porta1 = new Porta("preto", 3, 1);
        Porta porta2 = new Porta("preto", 3, 1);
        Porta porta3 = new Porta("preto", 3, 1);
        casa.addPorta(porta1);
        casa.addPorta(porta2);
        casa.addPorta(porta3);

        porta1.abre();
        porta2.fecha();
        porta3.abre();

        casa.pinta("infravermelho");

        System.out.println("Há " + casa.quantasPortasEstaoAbertas() + " portas abertas na casa");
    }
    
}

class Casa{
    public Set<Porta> portas;
    String cor;

    public Casa(String corInicial){
        portas = new HashSet<Porta>();
        cor = corInicial;
    }

    public void addPorta(Porta novaPorta){
        portas.add(novaPorta);
    }

    public void pinta(String novaCor){
        cor = novaCor;
        System.out.println("A casa agora é " + cor);
    }

    public int quantasPortasEstaoAbertas(){
        int total = 0;
        for(Porta porta : portas){
            if (porta.aberta()){
                total++;
            }
        }
        return total;
    }

}

class Porta {
    String cor;
    boolean estado = false;
    Integer[] dimensoes = {0,0};

    public Porta(String corInicial, int x, int y){
        cor = corInicial;
        dimensoes[0] = x;
        dimensoes[1] = y;
    }

    public void abre(){
        estado = true;
        System.out.println("A porta está aberta");
    }

    public void fecha(){
        estado = false;
        System.out.println("A porta está fechada");
    }

    public void pinta(String novaCor){
        cor = novaCor;
        System.out.println("A porta agora é " + cor);
    }

    public void redimensiona(int x, int y){
        dimensoes[0] = x;
        dimensoes[1] = y;
        System.out.println("A porta agora tem as dimensoes " + dimensoes[0] + " por " + dimensoes[1]);
    }

    public boolean aberta(){
        return estado;
    }


}
