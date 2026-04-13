# Array.sort() y BinarySearch()

## Ordenación y búsqueda nativa

Java orfrece la clase utilitaria java.util.Arrays para operar sobre arreglos y java.util.Collections para listas

- Array.sort(): Utiliza una variante del algortimo Dual-Pivot Quicksort (para tipos de datos primietivos) o TimSort (para tipos de datos abstractos [objetos]). Su complejidad promedio es O(n log n).
- Arrays.binarySearch(): Implementa la búsqueda binaria. Divide el conjunto de datos en mitades sucesivamente. Su complejidad es O(log n).

## La Regla de Oro de la Búsqueda Binaria

Requisito Crítico: Para que binarySearch() funcione, el arreglo DEBE estar ordenado previamente.

Resultado:

- Si el elemento existe: Retorna el índice (0, 1, 2)
- Si el elemento NO existe: Retorna un número negativo (punto de inserción).

## Aplicación en el Mundo Real

- E-commerce: Ordenar miles de productos por precio de menor a mayor en milisegundos.

- Sistemas de Archivos: Buscar un archivo por nombre en una carpeta con millones de registros.

- Bases de Datos: Los índices de las bases de datos funcionan bajo el principio de mantener los datos ordenados para búsquedas binarias ultrarrápidas.

## Código
```
import java.util.Arrays;

public class EjemploBasico {
    public static void main(String[] args) {
        int[] numeros = {50, 10, 35, 80, 5};

        // 1. Ordenar es obligatorio
        Arrays.sort(numeros); 
        System.out.println("Ordenado: " + Arrays.toString(numeros));

        // 2. Buscar
        int pos = Arrays.binarySearch(numeros, 35);
        System.out.println("El 35 está en el índice: " + pos);
    }
}
```

