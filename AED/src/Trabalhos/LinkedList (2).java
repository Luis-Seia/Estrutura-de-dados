public class LinkedList {
    public class Node {
        public int data;
        public Node next;

        public Node(int value, Node nextNode) {
            this.data = value;
            this.next = nextNode;
        }
    }

    public Node head;
    public int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;

    }

    public void addLast(int data) {
        Node newNode = new Node(data, null);

        if (this.size == 0) {
            this.head = newNode;
        } else {
            Node currentNode = this.head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        this.size++;
    }

    public void listAll() {
        if (this.size == 0) {
            System.out.println("Lista vazia");
        } else if (this.size == 1) {
            System.out.println("[head] " + this.head.data);
        } else {
            System.out.print("[head] " + this.head.data + " -> ");

            Node currentNode = this.head.next;
            while (currentNode.next != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
        }
    }

    public int count() {
        return this.size;
    }

    public int get(int index) {
        int position = 0;
        Node currentNode = this.head;

        while (currentNode != null) {
            if (position == index) {
                break;
            }
            currentNode = currentNode.next;
            position++;
        }

        return currentNode.data;
    }

    // Adiciona um no na posicao determinada
    public void addAt(int index, int data) {
        if (index < 0 || index > this.size) {
            System.out.println("Nao podemos adicionar o elemento desejado");
        } else {
            Node newNode = new Node(data, null);

            int position = 0;
            Node currentNode = this.head;
            while (currentNode.next != null) {
                if (position == index - 1) {
                    break;
                }
                position++;
                currentNode = currentNode.next;
            }
            Node nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode.next = nextNode;

            this.size++;
        }
    }

    /* Grupo A */
    public int getFirst() {
        if (size == 0)
            return -1;
        return head.data;
    }

    public int getLast() {
        Node currentNode = head;
        for (int i = 0; i < size - 1; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

  
    public void setNode(int index, int value) {
        if (index <= this.size - 1 && index >= 0) {
            int position = 0;
            Node currentNode = this.head;
            while (currentNode != null) {
                if (position == index) {
                    currentNode.data = value;
                    break;
                }
                currentNode = currentNode.next;
                position++;
            }
        } else {
            System.out.println("Posicao invalida");
        }

    }
    /* End Grupo B */

    /* Grupo C */
    public void removeFirst() {
        Node current = this.head;
        this.head = head.next;
        current = null;
        this.size--;
    }
    /* End Grupo C */

    /* Grupo D */
    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        // /.newNode.data=data;
        if (size == 0) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    /* End Grupo D */

    /* Grupo E */
    public void removeLast() {
        Node currentNode = this.head;
        int position = 0;
        while (position < this.size - 2) {
            currentNode = currentNode.next;
            position++;
        }

        currentNode.next = null;
        this.size--;

    }
    /* End Grupo E */

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.listAll();

        // Adicionando elementos
        System.out.println("Adicionando elementos");
        LL.addFirst(1);
        LL.addLast(2);
        LL.addAt(1, 3);
        LL.addLast(4);
        LL.listAll();
        System.out.println("Total de elementos: " + LL.count());

        // Listando elementos em posicoes determinadas
        System.out.println("\n\nListando o primeiro e ultimo elemento");
        System.out.println(LL.getFirst());
        System.out.println(LL.getLast());

        // Atualizando o valor de um elemento
        System.out.println("\n\nAtualizando o valor do elemento na posicao 2");
        System.out.println(LL.get(2));
        LL.setNode(2, 6);
        LL.listAll();

        System.out.println("\n\nRemovendo o primeiro e ultimo elementos");
        LL.removeFirst();
        LL.removeLast();
        LL.listAll();
    }
}
