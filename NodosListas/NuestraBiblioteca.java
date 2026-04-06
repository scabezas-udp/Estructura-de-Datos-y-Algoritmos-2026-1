package NodosListas;

public class NuestraBiblioteca {
    
    public  int getAleatorioEntre(int _x, int _y){
        return (int) (Math.random() * (_y - _x + 1) + _x);
    }
}
