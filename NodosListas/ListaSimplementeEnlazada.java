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
                // sout("[" + aux.dato + "] --> " + aux.siguiente);
                aux = aux.siguiente;
            }
        }
        System.out.println("------------------");
    }

    public void insertarAlPrincipio(int _dato) {
        // Crear un nuevo nodo, que se construye con el nuevo dato
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public void insertarAlFinal(int _dato) {
        if (estaVacia()) {
            insertarAlPrincipio(_dato);
        } else {
            // Crear un nuevo nodo, que se construye con el nuevo dato
            NodoEnteros nuevo = new NodoEnteros(_dato);
            // Recorrer
            NodoEnteros aux = this.head;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            // Ahora estamos en el último
            aux.siguiente = nuevo;
        }
    }

    public void insertarDespuesDe(int _dato, int _buscado) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        NodoEnteros aux = this.head;
        while (aux != null) {
            if (aux.dato == _buscado) {
                // que el nuevo apunte al mismo que apunta el buscado
                nuevo.siguiente = aux.siguiente;
                // el buscado ahora apunta al nuevo
                aux.siguiente = nuevo;
                // ya se hizo el cambio
                break;
            }
            aux = aux.siguiente;
        }
    }

    public boolean quitar(int _buscado) {
        // Si esta vacía la lista, entonces no se puede quitar
        if (estaVacia()) {
            return false;
        }

        if (this.head.dato == _buscado) {
            this.head = this.head.siguiente;
            return true;
        }

        NodoEnteros aux = this.head;

        while (aux.siguiente != null) {
            if (aux.siguiente.dato == _buscado) {
                aux.siguiente = aux.siguiente.siguiente;
                return true;
            }
            aux = aux.siguiente;
        }
        // No fue encontrado :( 404
        return false;
    }

}
