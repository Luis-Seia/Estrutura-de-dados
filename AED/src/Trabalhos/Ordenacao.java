package Trabalhos;

public class Ordenacao {
	public static void ordem(int[] array) {
		int  k=1;//Criar una variavel para percorrer todo array
		String mensagem = null; // criar uma variavel String para retornar o resultado
		if(array.length>1) { // verificar se o array tem mais que um elemento
			
			int arr[] = array.clone(); // copiar o conteudo do array
			int vet[] = array.clone(); // copiar o conteudo do array
			
			// ordenar o primeiro arrayclone em ordem crescente. "ordenacao do tipo bubble sorte: O(n*n)"
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			/// ordenar o segundo array clone em ordem decrescente.  "ordenacao do tipo bubble sorte: O(n*n)"
			for (int i = 1; i < arr.length; i++) {
			    for (int j = 0; j < i; j++) {
			        if (vet[i] > vet[j]) {
			            int temp = vet[i];
			            vet[i] = vet[j];
			            vet[j] = temp;
			        }
			    }
			}
			for (int i = 1; i < array.length; i++) {
				//Verificar se os valores das posicoes do array em ordem crescente sao os mesmos com o array original
				if(array[i]==arr[i]) { 
					k++;
				mensagem="O Array esta em ordem crescente";
				//Verificar se os valores das posicoes do array em ordem decrescente sao os mesmos com o array original
				}else if(array[i]==vet[i]){
					k++;
					mensagem="O Array esta em ordem decrescente";
					//Verificar se os valores das posicoes dos clones ordenados sao os mesmos com o array original
				}else if ((array[i]!=arr[i]) || (array[i]!=vet[i])){
					k++;
					mensagem="O array nao esta ordenado";
				}
			}
			if(k==array.length) { // imprimir o resultado depois de pesquisar todo array
			System.out.println(mensagem);// imprimir  a mensagem
			}
		}
		
	
	}
	//R: o algoritmo tem complexidade O(n^2) 
	
	
	//Apenas para testar
	public static void main (String args[]) {
		int a[]= {1,2,3,5,23,70};//crescente
		int b[]= {4,2,3,1,	};//decrescente
		int c[]= {4,3,2,32,5,};//nao ordenado
		ordem(a);
		ordem(b);
		ordem(c);
		
	}
}
