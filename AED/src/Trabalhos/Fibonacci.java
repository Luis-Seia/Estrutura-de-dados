package Trabalhos;

public class Fibonacci {
    public static int calculaFibonacciNormal(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        }

        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado += (i - 1) + (i - 2);
        }
        return resultado;
    }

    public static int calculaFibonacciRecursivo(int numero) {
    	if ((numero==0) || (numero==1))
    		return numero;
    		else
    		return calculaFibonacciRecursivo(numero-1) +  calculaFibonacciRecursivo(numero-2); 
    		}
    

    public static void main(String[] args) {
        int numero = 5;
      //  int resultado = calculaFibonacciNormal(numero);
       int resultado = calculaFibonacciRecursivo(numero);

        System.out.println("O resultado de fib(" + numero + ") é: " + resultado);
    }
    
    }
