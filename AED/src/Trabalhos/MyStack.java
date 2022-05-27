package Trabalhos;

public class MyStack implements IStack { // criar a classe e implementar a interface IStack
	
	DoubleLinkedList myStack; // criar uma DoubleLinkedList myStack
	
	public MyStack() {
		myStack = new DoubleLinkedList();// instanciar a DoubleLinkedList para fazer dos metodos da classe
	}
	
	// Introduz um elemento no topo da pilha
	@Override
	public void push(int valor) {
		myStack.addFirst(valor);
	}

	// Remove o elemento do topo da pilha
	@Override
	public int pop() {
		int retornar = myStack.getFirst();
		myStack.removeFirst();
		return retornar;
	}

	// Retorna (sem remover) o valor do elemento no topo da pilha
	@Override
	public int peek() {
		int retornar = myStack.getFirst();
		return retornar;
	}

	// Verifica se a pilha esta ou nao vazia
	@Override
	public boolean isEmpty() {
		boolean resultado;
		 if ( myStack.size == 0) { // se estiver vazia retorn true
	            resultado = true;
	        } else {
	           resultado = false; // caso contrario retorna false
	
	        }
		return  resultado;
	}

	// Retorna o numero de elementos na pilha
	@Override
	public int count() {
		return myStack.size;
	}

	
	// Lista todos elementos da pilha
	@Override
	public void listAll() {
		System.out.println("Elementos da lista");
		myStack.listAll();
		System.out.println("FIm");
	}
	
	 public static void main(String[] args) {
		 MyStack myStack = new MyStack();
		 myStack.push(2);
		 myStack.push(1);
		 myStack.push(3);
		 System.out.println(myStack.isEmpty());
		 System.out.println(myStack.count());
		 System.out.println(myStack.pop());
		 System.out.println(myStack.peek());
		 myStack.listAll();
	 }
		
}
