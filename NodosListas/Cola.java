package NodosListas;

public class Cola {

    private NodoEnteros frente; // Es el primer elemento

    public Cola() {
        this.frente = null;
    }

    // Cola Vacia
    public boolean isEmpty() {
        return this.frente == null;
    }

    // Insertar al Final -> Enqueue -> Add
    public boolean add(int _dato) {
        try {
            NodoEnteros nuevo = new NodoEnteros(_dato);
            if (isEmpty()) {
                this.frente = nuevo;
                return true;
            } else {
                NodoEnteros aux = this.frente;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    // Quitar el Primero -> Remove -> Dequeue
    public NodoEnteros remove() throws Exception {

        if (isEmpty()) {
            throw new Exception("Cola Vacia");
        }
        NodoEnteros aux = this.frente;
        this.frente = this.frente.siguiente;

        return aux;
    }

}
