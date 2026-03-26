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
        lse.insertarAlFinal(4);
        lse.mostrar();
        lse.insertarDespuesDe(2, 5);
        lse.mostrar();
        int numQuitar = 8;
        System.out.println("¿Se pudo quitar el [" + numQuitar+"]?: " + lse.quitar(numQuitar));
        numQuitar = 5;
        System.out.println("¿Se pudo quitar el [" + numQuitar+"]?: " + lse.quitar(numQuitar));
        lse.mostrar();

    }
}
