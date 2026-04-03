package NodosListas;

public class ListaDoblementeEnlazada {

    private NodoEnteros first;
    private NodoEnteros last;

    public ListaDoblementeEnlazada() {
        this.first = this.last = null;
    }

    public boolean estaVacia() {
        return this.first == null;
    }

    public void insertarAlPrincipio(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.estaVacia()) {
            this.first = this.last = nuevo;
        } else {
            nuevo.siguiente = this.first;
            this.first.anterior = nuevo;
            this.first = nuevo;
        }
    }

    public void insertarAlFinal(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.estaVacia()) {
            this.first = this.last = nuevo;
        } else {
            nuevo.anterior = this.last;
            this.last.siguiente = nuevo;
            this.last = nuevo;
        }
    }

    public NodoEnteros quitar(int _buscado) throws Exception {
        // caso 1: esta vacia
        if (this.estaVacia())
            throw new Exception("Lista Doble Vacia");

        // caso 2: es el primero
        if (this.first.dato == _buscado){
            System.out.println("Primero");
            NodoEnteros aux = this.first;
            this.first = aux.siguiente;
            this.first.anterior = null;
            return aux;
        }

        // caso 3: es el ultimo
        if (this.last.dato == _buscado){
            System.out.println("Ultimo");
            NodoEnteros aux = this.last;
            this.last = aux.anterior;
            this.last.siguiente = null;
            return aux;
        }

        // caso 4: buscamos del nodo, comenzando por el primero
        NodoEnteros aux = this.first;
        while (aux != null && aux.dato != _buscado) {
            aux = aux.siguiente;
        }
        // caso 5: si no se encontro el dato
        if (aux == null){
            System.out.println("Error 404: No encontrado");
            throw new Exception("No Encontrado");
        }

        // caso 6: se encontró el dato
        aux.anterior.siguiente = aux.siguiente;
        aux.siguiente.anterior = aux.anterior;
        // se limpian los punteros
        aux.siguiente = aux.anterior = null;
        return aux;
    }

    public void mostrar(int _comoVer) {
        if (this.estaVacia()) {
            System.out.println("--- Lista Doble Vacia ---");
        } else {
            // System.out.println("tiene elementos");
            if (_comoVer == 1) {
                System.out.println("F -> L"); // de adelante para atras
                NodoEnteros aux = this.first;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.siguiente;
                }
            } else if (_comoVer == 2) {
                System.out.println("L -> F"); // de atras para adelante
                NodoEnteros aux = this.last;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.anterior;
                }
            } else {
                System.out.println("Sin Seleccion para mostrar");
            }
        }
        System.out.println("--- Fin Mostrar ---");
    }
}
