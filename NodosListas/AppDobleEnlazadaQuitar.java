package NodosListas;

public class AppDobleEnlazadaQuitar {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        NodoEnteros elementoQuitado;

        // Se forza a eliminar algo que no existe, para recuperar la Exception
        int datoAeliminar;
        try {
            datoAeliminar = 0;
            elementoQuitado = lde.quitar(datoAeliminar);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        lde.insertarAlFinal(9);
        lde.insertarAlFinal(5);
        lde.insertarAlFinal(1);
        lde.insertarAlFinal(4);
        lde.insertarAlFinal(2);
        lde.mostrar(1);

        try {
            datoAeliminar = 9;
            System.out.println("Intentando Quitar [" + datoAeliminar + "]");
            elementoQuitado = lde.quitar(datoAeliminar);
            lde.mostrar(1);
            datoAeliminar = 2;
            System.out.println("Intentando Quitar [" + datoAeliminar + "]");
            elementoQuitado = lde.quitar(datoAeliminar);
            lde.mostrar(1);
            datoAeliminar = 1;
            System.out.println("Intentando Quitar [" + datoAeliminar + "]");
            elementoQuitado = lde.quitar(datoAeliminar);
            lde.mostrar(1);
            lde.mostrar(2);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }
}
