package Trabalhos;

public interface IQueue {
    // Introduz um elemento no final da fila 
    public void enqueue(int valor);

    // Remove o elemento no inicio da fila
    public int dequeue();

    // Retorna (sem remover) o valor do elemento no inicio da fila
    public int peek();

    // Verifica se a fila esta ou nao vazia
    public boolean isEmpty();

    // Retorna o numero de elementos na fila
    public int count();

    // Lista todos elementos da fila
    public void listAll();

}
