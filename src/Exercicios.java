import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicios {
    public static void main(String[] args) {
        if (args.length == 1){
            switch (args[0]){
                case "1": exer1(); break;
                case "2": exer2(); break;
                case "3": exer3(); break;
                case "4": exer4(); break;
                case "5": exer5(); break;
                case "6": exer6(); break;
                default: System.out.println("Exercicio inválido"); break;
            }
        }
        else {System.out.println("Execute com o numero do exercicio como argumento");}
    }
        
    private static void exer1() {
        int n = 0;
        while(n<=1000){
            System.out.println(n++);
        }
    }
    private static void exer2(){
        int n = 3;
        while(n<100){
            System.out.println(n);
            n+=3;
        }
    }
    private static void exer3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira número desejado");
        int n = scan.nextInt();
        scan.close();
        int result = n;
        while(n>1){
            n--;
            result*= n;
        }
        System.out.println(result);
    }
    private static void exer4(){
        int foo = 0;
        int bar = 1;
        int baz = foo+bar;
        System.out.println(foo);
        System.out.println(bar);
        while (baz<100){
            System.out.println(baz);
            foo = bar;
            bar = baz;
            baz = foo+bar;
        }
    }
    private static void exer5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira número desejado");
        int n = scan.nextInt();
        scan.close();
        while(n>1){
            if (n%2==0){
                n = n/2;
                System.out.println(n);
            }
            else{
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
    }
    private static void exer6(){
       Integer[] foo = new Integer[50];
       Integer[] bar = new Integer[50];
       Integer[] foobar = new Integer[100];
       for(int i=0; i<50; i++){
           foo[i]=ThreadLocalRandom.current().nextInt(0, 1000 + 1);
           bar[i]=ThreadLocalRandom.current().nextInt(0, 1000 + 1);
       }
       Arrays.sort(foo);
       Arrays.sort(bar);
       System.out.println("Vetor 1:");
       System.out.println(Arrays.toString(foo));
       System.out.println("Vetor 2:");
       System.out.println(Arrays.toString(bar));
       int fnord1 = 0;
       int fnord2 = 0;
       for(int i=0; i<100; i++){
           if(fnord1<50){
               if (fnord2<50){
                if(foo[fnord1] < bar[fnord2]){foobar[i]=foo[fnord1];fnord1++;}
                else{foobar[i]=bar[fnord2];fnord2++;}
               }
               else{foobar[i]=foo[fnord1];fnord1++;}
            }
            else if(fnord2<50){foobar[i]=bar[fnord2];fnord2++;}
           }
        System.out.println("Vetor final:");
        System.out.println(Arrays.toString(foobar));
    }
}

