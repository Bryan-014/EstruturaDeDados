import java.util.Scanner;

public class App {
    public static ordenaVetor meuVetor;
    public static Recursivo recursivo ;
    public static Scanner input;

    public static void main(String[] args) throws Exception {
        input = new Scanner(System.in);
        meuVetor = new ordenaVetor();
        recursivo = new Recursivo();
        boolean cont = true;

        while (cont) {
            System.out.println("Qual ação vc quer executar?");
            System.out.println("1 = Script de Ordenação");
            System.out.println("2 = Script de Recursividade");
            System.out.println("3 = Sair do script");
            int action = input.nextInt();
            
            switch (action) {
                case 1:
                    ordenacao();
                    break;
                case 2:
                    recurividade();
                    break;
                case 3:
                    cont = false;
                    break;
            
                default:
                    break;
            }
        }
    }
    
    public static void recurividade() {
        System.out.println("Qual número vc quer dobrar?");
        int dNum = input.nextInt();
        System.out.println("Em qual número vc quer que pare?");
        recursivo.imprimeDobro(dNum, input.nextInt());        
        System.out.println("");
    }
    
    public static void ordenacao() {
        System.out.println("Hello, DEV!");
        long tempo;
        // int v[] = {32,21,13,44,19,85};
        
        System.out.println("Quantos elementos vc quer no vetor?");
        
        tempo = meuVetor.gerarEOrdenar(input.nextInt());
                
        System.out.println("Tempo em nanoSeg:"+tempo);
        System.out.println("Tempo em miliSeg:"+tempo/1_000_000.00);        
    }
}
