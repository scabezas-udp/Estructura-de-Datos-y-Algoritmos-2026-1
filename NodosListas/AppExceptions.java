package NodosListas;

public class AppExceptions {

    public static void main(String[] args) {
        
        int [] arreglo = new int[3];
        NuestraBiblioteca nb = new NuestraBiblioteca();

        try {
            for (int i = 0; i <= arreglo.length; i++) {
                arreglo[i] = nb.getAleatorioEntre(3, 30);
                System.out.println("[ "+arreglo[i]+" ]");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error :( " + e.getMessage());
        }

        System.out.println("Sigue / Termina el programa");




    }
    
}