# Estructura de Datos y Algoritmos

Clase ``ÙsoRandom```

```java
public class UsoRandom {

    private static getAleatorioEntre(int _x, int _y){
        return (int) (Math.random() * (_y - _x + 1) + _x);
        )
    }

    private static void mostrarArreglo (int [] _arr, String _titulo){
        System.out.println(_titulo);
        for (int i=0; i<_arr.length; i++){
            System.out.print(_arr[i] + " ");
        }
        System.out.println();
    }

  public static void main(String[] args){
    // Quiero un aleatorio
    int miAleatorio = getAleatorioEntre(1, 500);
    System.out.println("Mi aleatorio es: " + miAleatorio);
    // voy a llenar un arreglo de 10 numeros aleatorios
    int [] arreglo = new int[10];
    for (int i=0; i < arreglo.length; i++){
        arreglo[i] = getAleatorioEntre(1, 500);
    }
    mostrarArreglo(arreglo, "Aleatorios");
  }
}
```
