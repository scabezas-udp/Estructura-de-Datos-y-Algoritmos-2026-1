package NodosListas;

public class ListaCircularmenteEnlazada {

    private NodoEnteros first; // Puntero al primero nodo

    public ListaCircularmenteEnlazada() {
        this.first = null;
    }

    public boolean estaVacia() {
        return this.first == null;
    }

    // Insertar al inicio: O(1)
    public void insertarAlPrincipio(int dato) {
        NodoEnteros nuevo = new NodoEnteros(dato);
        if (estaVacia()) {
            nuevo.siguiente = nuevo;
            this.first = nuevo;
        } else {
            nuevo.siguiente = this.first.siguiente;
            this.first.siguiente = nuevo;
        }
    }

    // Insertar al final: O(1)
    public void insertarAlFinal(int dato) {
        insertarAlPrincipio(dato);
        this.first = this.first.siguiente; // Movemos el puntero tail al nuevo último
    }

    // Eliminar un nodo específico
    public boolean eliminar(int dato) {

        if (estaVacia()) {
            System.out.println("No se puede eliminar, la lista esta vacia");
            return false;
        }

        NodoEnteros actual = this.first.siguiente;
        NodoEnteros anterior = this.first;
        boolean encontrado = false;

        // Recorrer la lista buscando el dato
        do {
            if (actual.dato == dato) {
                if (actual == this.first && actual.siguiente == this.first) {
                    // Caso: Un solo nodo
                    this.first = null;
                } else {
                    anterior.siguiente = actual.siguiente;
                    if (actual == this.first) {
                        this.first = anterior;
                    }
                }
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != this.first.siguiente);

        return encontrado;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("--- Lista Circular Vacía ---");
            return;
        }

        NodoEnteros aux = this.first.siguiente; // Empezamos por el primero
        System.out.print("Circular: ");
        do {
            System.out.print("[" + aux.dato + "] -> ");
            aux = aux.siguiente;
        } while (aux != this.first.siguiente);
        System.out.println("(vuelve al inicio)");
    }
}