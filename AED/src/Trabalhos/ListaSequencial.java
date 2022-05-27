// public class ListaSequencial {
//     private int[] lista;

//     public ListaSequencial(int tamanho) {
//         this.lista = new int[tamanho];

//         for (int i = 0; i < this.lista.length; i++) {
//             this.lista[i] = 9999999;
//         }
//     }

//     public boolean insertOne(int element) {
//         for (int i = 0; i < lista.length; i++) {
//             if (insertAt(element, i)) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     public boolean insertAt(int element, int index) {
//         if (this.lista[index] == 9999999) {
//             this.lista[index] = element;
//             return true;
//         }
//         return false;
//     }

//     public int count() {
//         int contador = 0;
//         for (int i = 0; i < this.lista.length; i++) {
//             if (this.lista[i] != 9999999) {
//                 contador++;
//             }
//         }
//         return contador;
//     }

//     // Pesquisa
//     public int search(int element){
//         for(int i=0; i<lista.length; i++) {
//             if(element == lista[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public void listAll() {
//         for (int i = 0; i < this.lista.length; i++) {
//             if (this.lista[i] != 9999999) {
//                 System.out.print(this.lista[i] + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         ListaSequencial ls = new ListaSequencial(5);

//         ls.listAll();
//         if (ls.insertOne(0)) {
//             ls.listAll();
//         }

//         if (ls.insertOne(0)) {
//             ls.listAll();
//         }

//         System.out.println(ls.count());
//         System.out.println(ls.search(0));
//     }
// }