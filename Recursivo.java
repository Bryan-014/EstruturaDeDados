public class Recursivo {
    public void imprimeDobro(int v, int stop) {
        if (v < stop) {
            System.out.print(v+" ");
            imprimeDobro(v*2, stop);
        }
    }
}
