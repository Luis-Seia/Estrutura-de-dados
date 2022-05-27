package Trabalhos;

public class MyQueue implements IQueue {  // criar a classe e implementar a interface IQueue
	
	DoubleLinkedList myQueue; //criar uma DoubleLinkedList 
	public MyQueue() {
		 myQueue = new DoubleLinkedList(); // instanciar a DoubleLinkedList para fazer dos metodos da classe
	}
	
	 // Introduz um elemento no final da fila 
	@Override
	public void enqueue(int valor) {
		 myQueue.addLast(valor);
	}
	
	// Remove e retorna o elemento no inicio da fila
	@Override
	public int dequeue() {// Remove e retorna o elemento no inicio da fila
		int remove =   myQueue.getFirst();
		 myQueue.removeFirst();
		return remove;
	}
	
	// Retorna (sem remover) o valor do elemento no inicio da fila
	@Override
	public int peek() { 
		int retorno =   myQueue.getFirst();
		return retorno;
	}
	
	 // Verifica se a fila esta ou nao vazia
	@Override
	public boolean isEmpty() {
		boolean resultado;
		 if ( myQueue.size == 0) { // se estiver vazia retorn true
	            resultado = true;
	        } else {
	           resultado = false; // caso contrario retorna false
	
	        }
		return  resultado;
	}
	 // Retorna o numero de elementos na fila
	@Override
	public int count() {
		return  myQueue.size;
	}
	
	// Lista todos elementos da fila
	@Override
	public void listAll() {
		System.out.println("Elementos da lista");
		 myQueue.listAll();
		System.out.println("FIm");
	}
	
	
	 public static void main(String[] args) {
		 MyQueue  myQueue1 = new MyQueue();
		 myQueue1.enqueue(3);
		 myQueue1.enqueue(2);
		 myQueue1.enqueue(2);
		 System.out.println( myQueue1.dequeue());
		 System.out.println( myQueue1.isEmpty());
		 System.out.println( myQueue1.count());
		 myQueue1.listAll();
	 }
	
	
}
