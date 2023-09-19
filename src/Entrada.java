public class Entrada {
    private int N;
    private int A;
    private int B;

    public Entrada (int N, int A, int B){
        this.N = N; // Minutos que Restam
        this.A = A; // Minutos para o primeiro presente
        this.B = B; // Minutos para o segundo presente
    }

    public String resultado(){
        if ((A + B) <= N)  {
            return "Farei Hoje";
        } else {
            return "Deixa pra amanhã";
        }
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
}
