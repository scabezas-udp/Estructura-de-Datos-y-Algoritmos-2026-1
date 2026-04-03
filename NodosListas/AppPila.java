package NodosListas;

public class AppPila {

    public static void main(String[] args) {
        Pila p1 = new Pila();
        int nuevoDato;
        System.out.println("Pila  vacia?: " + p1.isEmpty());
        nuevoDato = 9;
        System.out.println("Se inserto el [" + nuevoDato + "]?: " + p1.push(nuevoDato));
        System.out.println("Pila vacia?: " + p1.isEmpty());
        nuevoDato = 5;
        System.out.println("Se inserto el [" + nuevoDato + "]?: " + p1.push(nuevoDato));
        nuevoDato = 1;
        System.out.println("Se inserto el [" + nuevoDato + "]?: " + p1.push(nuevoDato));

        // quitar
        NodoEnteros elementoQuitado;
        try {
            elementoQuitado = p1.pop();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
            elementoQuitado = p1.pop();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
            elementoQuitado = p1.pop();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
            elementoQuitado = p1.pop();
            System.out.println("Se quito el [" + elementoQuitado.dato + "]");
        } catch (Exception e) {
            System.out.println("Error al quitar: " + e.toString());
        }

        System.out.println("--- Fin Pilas ---");
    }
}