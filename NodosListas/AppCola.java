package NodosListas;

public class AppCola {
    public static void main(String[] args) {
        Cola c1 = new Cola();
        int nuevoDato;
        System.out.println("Cola vacia?: " + c1.isEmpty());
        nuevoDato = 9;
        System.out.println("Se inserto el [" + nuevoDato + "]?: " + c1.add(nuevoDato));
        System.out.println("Cola vacia?: " + c1.isEmpty());
        nuevoDato = 5;
        System.out.println("Se inserto el [" + nuevoDato + "]?: " + c1.add(nuevoDato));
        nuevoDato = 1;
        System.out.println("Se inserto el [" + nuevoDato + "]?: " + c1.add(nuevoDato));

        // quitar
        NodoEnteros elementoQuitado;
        try {
            elementoQuitado = c1.remove();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
            elementoQuitado = c1.remove();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
            elementoQuitado = c1.remove();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
            elementoQuitado = c1.remove();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
        } catch (Exception e) {
            System.out.println("Error al quitar: " + e.toString());
        }

        System.out.println("--- Fin Colas ---");
    }
}