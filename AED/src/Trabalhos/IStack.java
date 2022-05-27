package Trabalhos;

// 1. Criar interface para especificar os metodos por implementar
public interface IStack {
    // Introduz um elemento no topo da pilha
    public void push(int valor);

    // Remove o elemento do topo da pilha
    public int pop();

    // Retorna (sem remover) o valor do elemento no topo da pilha
    public int peek();

    // Verifica se a pilha esta ou nao vazia
    public boolean isEmpty();

    // Retorna o numero de elementos na pilha
    public int count();

    // Lista todos elementos da pilha
    public void listAll();
}
