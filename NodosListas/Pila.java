package NodosListas;

public class Pila {
    
    private NodoEnteros cima; // Tope => Arriba

    public Pila() {
        this.cima = null;
    }
    
    public boolean isEmpty() {
        return this.cima == null;
    }

    public boolean push(int _dato) {
        try {
            NodoEnteros nuevo = new NodoEnteros(_dato);
            if (this.isEmpty()) {
                this.cima = nuevo;
            } else {
                nuevo.siguiente = this.cima;
                this.cima = nuevo;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public NodoEnteros pop() throws Exception{

        if (isEmpty()) {
            throw new Exception("Pila Vacia");
        }
        NodoEnteros aux = this.cima;
        this.cima = this.cima.siguiente;

        return aux;   
    }


}
