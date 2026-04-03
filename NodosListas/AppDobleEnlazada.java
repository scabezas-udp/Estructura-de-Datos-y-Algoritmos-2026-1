package NodosListas;

public class AppDobleEnlazada {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();

        lde.mostrar(1);

        lde.insertarAlPrincipio(9);
        lde.mostrar(1);
        lde.insertarAlPrincipio(5);
        lde.mostrar(1);
        lde.insertarAlPrincipio(1);
        lde.mostrar(2);

        lde.insertarAlFinal(4);
        lde.insertarAlFinal(2);
        lde.mostrar(1);
    }
}
