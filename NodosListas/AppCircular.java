package NodosListas;

public class AppCircular {

    public static void main(String[] args) {
        ListaCircularmenteEnlazada lce = new ListaCircularmenteEnlazada();

        lce.mostrar();

        int aEliminar = 5;
        boolean elimnado = lce.eliminar(aEliminar);
        if (elimnado) {
            System.out.println("Eliminado con éxito [" + aEliminar + "]");
        } else {
            System.out.println("Error al intentar eliminar el [" + aEliminar + "]");
        }

        // se agregan datos
        lce.insertarAlPrincipio(9);
        lce.insertarAlPrincipio(5);
        lce.insertarAlPrincipio(1);
        lce.insertarAlFinal(4);
        lce.insertarAlFinal(2);
        lce.mostrar();
    }
}
