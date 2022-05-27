package Trabalhos;

public class Multiplicacao {
    public static int multiplicaNormal(int numeroA, int numeroB) {
        return numeroA * numeroB;
    }

    public static int multiplicaComoSoma(int numeroA, int numeroB) {
        int soma = 0;
        for (int i=1; i <= numeroA; i++){
            soma += numeroB; 
        }
        return soma;
    }

    public static int multiplicaRecursivo(int m, int n) {
        if (m == 0) {
            return 0;
        }
        
        return n + multiplicaRecursivo(m - 1, n);
    }

    public static void main(String[] args) {
        // int resultado = multiplicaNormal(2, 5);

        System.out.println("O resultado da multiplicacao é: " + multiplicaNormal(2,5));
    }
}
