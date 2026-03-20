import java.util.Random;

public class ordenaVetor {
    private int vetor[];
    private Random aleat = new Random();//objeto para gerar variável aleatoria

    public long gerarEOrdenar(int tamanho) {

        long inicio = System.nanoTime();

        inicializaVetorAleatorio(tamanho);
        bogoSortShuffle();
        // selectionSort();

        long fim = System.nanoTime();

        return fim - inicio; // tempo em nanossegundos
    }

    public void inicializaVetorAleatorio(int n){
        this.vetor = new int[n];
        for(int i=0; i<vetor.length; i++){
            vetor[i] = aleat.nextInt(89)+10;
        }
    }

    public void ordenaMeuVetor(){

    }

    public void bubbleDummySort(){
        int i,j,aux;
        for(i=0;i<vetor.length-1;i++){
            for(j=i+1;j<vetor.length;j++){
                if(vetor[i]<vetor[j]){
                    aux  = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public void imprimeMeuVetor(){
        for(int i=0; i< vetor.length; i++)
            System.out.print(vetor[i]+" ");    
    }

    public int somaVetor(){
        int soma = 0;
        for(int i=0; i<vetor.length; i++){
            soma = soma + vetor[i];
        }
        return soma;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int v[]) {
        this.vetor = v;
    }

    public void selectionSort() {
        int i, j;
        for (i = 0; i < vetor.length; i++) {
            int min = i;
            for (j = i + 1; j < vetor.length; i++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int aux = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = aux;
            }
        }
    }

    public boolean isOrder() {
        for (int i = 0; i < vetor.length - 1; i++) if (vetor[i] > vetor[i + 1]) return false;
        return true;
    }

    public void bogoSortShuffle() {
        int numOfSortsTry = 0;
        while (!isOrder()) {
            for (int i = 0; i < vetor.length; i++) {
                int j = aleat.nextInt(vetor.length);
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
            numOfSortsTry++;
        }
        System.out.println("Número de tentativas de ordenar: "+numOfSortsTry);
    }
}