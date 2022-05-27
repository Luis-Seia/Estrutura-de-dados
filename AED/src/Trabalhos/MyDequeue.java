package Trabalhos;

public class MyDequeue implements IDequeue{ // criar a classe e implementar a interface IDequeue
	
	DoubleLinkedList myDequeue; //criar uma DoubleLinkedList 
	public MyDequeue() {
		myDequeue = new DoubleLinkedList(); // instanciar a DoubleLinkedList para fazer dos metodos da classe
	}
	
	 // Introduz um elemento no inicio da fila
	@Override
	public void addFirst(int valor) {
		myDequeue.addFirst(valor);
	}
	
	// Introduz um elemento no final da fila
	@Override
	public void addLast(int valor) {
		myDequeue.addLast(valor);
	}
	
	 // Remove o elemento no inicio da fila
	@Override
	public int removeFirst() {
		int remove =  myDequeue.getFirst();
		myDequeue.removeFirst();
		return remove;
	}
	
	// Remove o elemento no final da fila
	@Override
	public int removeLast() {
		int retornar = myDequeue.getLast();
		myDequeue.removeLast();
		return retornar;
	}
	
	// Retorna (sem remover) o valor do elemento no inicio da fila
	@Override
	public int peekFirst() {
		int retorno =  myDequeue.getFirst();
		return retorno;
	}
	
	// Retorna (sem remover) o valor do elemento no final da fila
	@Override
	public int peekLast() {
		int retorno =  myDequeue.getLast();
		return retorno;
	}
	
	// Verifica se a fila esta ou nao vazia
	@Override
	public boolean isEmpty() {
		boolean resultado;
		 if ( myDequeue.size == 0) { // se estiver vazia retora true
	            resultado = true;
	        } else {
	           resultado = false; // caso contrario retorna false
	
	        }
		return  resultado;
	}
	
	// Retorna o numero de elementos na fila
	@Override
	public int count() {
		return myDequeue.size;
	}
	
	// Lista todos elementos da fila
	@Override
	public void listAll() {
		System.out.println("Elementos da lista");
		myDequeue.listAll();
		System.out.println("FIm");
	}
	
	 public static void main(String[] args) {
		 MyDequeue myDequeue1 = new MyDequeue();
		 System.out.println(myDequeue1.isEmpty());
		 myDequeue1.addFirst(0);
		 myDequeue1.addFirst(2);
		 myDequeue1.addLast(3);
		 myDequeue1.addLast(5);
		 myDequeue1.addLast(63);
		 myDequeue1.addLast(34);
		 myDequeue1.listAll();
		 myDequeue1.removeFirst();
		 myDequeue1.removeLast();
		 System.out.println(myDequeue1.peekFirst());
		 System.out.println(myDequeue1.peekLast());
		 System.out.println();
		 System.out.println(myDequeue1.isEmpty());
		 System.out.println(myDequeue1.count());
		 myDequeue1.listAll();
	 }
	
	
}
