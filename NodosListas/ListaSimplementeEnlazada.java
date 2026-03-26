package NodosListas;

public class ListaSimplementeEnlazada {
    // primero de la lista
    NodoEnteros head;

    // constructor por defecto (), construye una lista vacia
    public ListaSimplementeEnlazada() {
        this.head = null;
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("--- Está Vacía ---");
        } else {
            // recorrido -> aux
            NodoEnteros aux = this.head;
            while (aux != null) {
                System.out.println("[" + aux.dato + "] --> " + aux.siguiente);
                //sout("[" + aux.dato + "] --> " + aux.siguiente);
                aux = aux.siguiente;
            }
        }
        System.out.println("------------------");
    }

}
