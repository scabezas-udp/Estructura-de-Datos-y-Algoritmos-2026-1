package NodosListas;

public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
        lse.mostrar();
        lse.insertarAlPrincipio(9);
        lse.mostrar();
        lse.insertarAlPrincipio(5);
        lse.mostrar();
        lse.insertarAlPrincipio(1);
        lse.mostrar();

    }
}
