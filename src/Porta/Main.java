public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta("preto", 2, 1);

        porta.abre();
        porta.fecha();
        porta.pinta("vermelho");
        porta.pinta("azul");
        porta.redimensiona(40, 1);
        porta.pinta("ultravioleta");
        if (porta.aberta()){
            System.out.println("A porta abriu sozinha");
        }
        else{
            System.out.println("A porta continua fechada");
        }
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
