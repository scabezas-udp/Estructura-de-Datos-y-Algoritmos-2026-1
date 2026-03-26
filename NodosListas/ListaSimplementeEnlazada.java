package NodosListas;

public class ListaSimplementeEnlazada {
    // primero de la lista
    NodoEnteros head;
    // constructor por defecto (), construye una lista vacia
    public ListaSimplementeEnlazada(){
        this.head = null;
    }
    
    public boolean estaVacia(){
        return this.head == null;
    }

}
