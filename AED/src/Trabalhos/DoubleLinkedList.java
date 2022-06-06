package Trabalhos;
public class DoubleLinkedList {
    public class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int value, Node prevNode, Node nextNode) {
            this.data = value;
            this.prev = prevNode;
            this.next = nextNode;
        }
    }

    // Propriedades e metodos da DoubleLinkedList
    public Node first;
    public Node last;
    public int size;

    public DoubleLinkedList() {
        // Inicializa os marcadores first e last como Nós de dados nulos
        // Iremos usa-los para estabelecer uma relação inicial entre o inicio e o fim da lista
        // Nestes nós não guardamos valores
        this.first = new Node(0, null, null);
        this.last = new Node(0, first, null);

        // Ligar o início ao fim da lista
        this.first.next = this.last;
        this.size = 0;
    }

    public int count() {
        return this.size;
    }

    public void addBetween(int valor, Node prevNode, Node nextNode) {
        // Começamos por criar um novo nó com as referências do anterior e seguinte dados como parâmetros
        Node newNode = new Node(valor, prevNode, nextNode);

        // Fazemos com que o nó anterior esteja agora ligado ao novo nó
        prevNode.next = newNode;

        // Fazemos com que o nó seguinte esteja também ligado ao novo nó
        nextNode.prev = newNode;

        // Incrementamos o tamanho da lista
        this.size++;
    }

    public void addFirst(int valor) {
        // Para adicionar um nó no início da lista, introduzimos um novo nó 
        // entre o primeiro (this.first) e a sua referência para o seguinte (this.first.next)
        addBetween(valor, first, first.next);
    }

    public void addLast(int valor) {
        // Para adicionar um nó no final da lista, introduzimos um novo nó
        // entre o último (this.last) e a sua referência para o anterior (this.last.prev)
        addBetween(valor, last.prev, last);
    }

    public void listAll() {
        Node current = first.next;

        if (this.size == 0) {
            System.out.println("Lista vazia");
        } else {
            while (current.next != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void addAt(int valor, int posicao){
        if (posicao > size) {
            System.out.println("lista vazia ou posicao invalida");
        } else {
            Node currentNode = this.first.next;
            int indice=0;
            while(currentNode.next != null) {
                if (indice == posicao - 1) {
                    break;
                }

                currentNode = currentNode.next;
                indice++;    
            }
            addBetween(valor, currentNode, currentNode.next);
        }
    }
    public int get(int posicao) {
        Node currentNode;
        if (size == 0 || posicao < 0 || posicao >= size) {
            return -1; // lista vazia ou posicao invalida
        }

        if (posicao <= size / 2) {
            currentNode = first.next;
            for (int i = 0; i < posicao; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }

        currentNode = last.prev;
        for (int i = size - 1; i > posicao; i--) {
            currentNode = currentNode.prev;
        }
        return currentNode.data;
    }
    // End Grupo B

    public int getFirst() {
        if (this.size > 0) {
            return this.first.next.data;
        } else {
            System.out.println("Lista vazia");
            return -1;
        }
        
    }

    // Grupo D 
    public int getLast() {
        if (this.size > 0) {
            Node currentNode = this.last.prev;
            return currentNode.data;
        } else {
            System.out.println("Lista vazia");
            return -1;
        }
        
    }
    // End Grupo D

    public void removeFirst() {
        if (this.size > 0) {
            Node firstNode = this.first.next;
            this.first.next = firstNode.next;
            firstNode.next.prev = this.first;
            
            this.size--;

        } else {
            System.out.println("Lista vazia");
        }
    }

    public void removeLast() {
        Node lastNode = this.last.prev;
        this.last.prev = lastNode.prev;
        lastNode.prev.next = this.last;
    }

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();

        DLL.listAll();

        DLL.addFirst(1);
        DLL.listAll();
        // DLL.addFirst(2);
        // DLL.listAll();
        // DLL.addLast(3);
        // DLL.listAll();
        // DLL.addFirst(0);
        // DLL.listAll();

        DLL.addAt(2, 0);
        DLL.listAll();
    }
}
