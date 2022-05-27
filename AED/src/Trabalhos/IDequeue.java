package Trabalhos;

public interface IDequeue {
    // Introduz um elemento no inicio da fila
    public void addFirst(int valor);

    // Introduz um elemento no final da fila
    public void addLast(int valor);

    // Remove o elemento no inicio da fila
    public int removeFirst();

    // Remove o elemento no final da fila
    public int removeLast();

    // Retorna (sem remover) o valor do elemento no inicio da fila
    public int peekFirst();

    // Retorna (sem remover) o valor do elemento no final da fila
    public int peekLast();

    // Verifica se a fila esta ou nao vazia
    public boolean isEmpty();

    // Retorna o numero de elementos na fila
    public int count();

    // Lista todos elementos da fila
    public void listAll();
}
