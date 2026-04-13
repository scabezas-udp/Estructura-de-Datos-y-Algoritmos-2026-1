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
        int[] numeros = { 50, 10, 35, 80, 5 };

        // 1. Ordenar es obligatorio
        Arrays.sort(numeros);
        System.out.println("Ordenado: " + Arrays.toString(numeros));

        // 2. Buscar
        int buscado = 50;
        int pos = Arrays.binarySearch(numeros, buscado);
        if (pos >= 0) {
            System.out.println("El " + buscado + " está en el índice: " + pos);
        }else{
            System.out.println("El numero " + buscado + " no fue encontrado.");
        }
    }
}
```

# La Interfaz Comparable

## Orden Natural

- Problema: Java sabe ordenar números y letras, pero ¿cómo ordena un objeto Astronauta? ¿Por nombre? ¿Por edad? ¿Por rango?

- Solución: La interfaz Comparable define el "orden natural" de un objeto.

- Método clave: compareTo(Objeto o).

## El contrato de compareTo

Este método devuelve un entero:

- Negativo: Si this es menor que o.

- Cero: Si son iguales.

- Positivo: Si this es mayor que o.

## Ejemplo de Implementación

```
public class Estudiante implements Comparable<Estudiante> {
    int id;
    String nombre;

    @Override
    public int compareTo(Estudiante otro) {
        // Ordenar por ID (ascendente)
        return this.id - otro.id;
    }
}
```

# La Interfaz Comparator

## Orden Personalizado (Flexible)

- Concepto: ¿Qué pasa si quiero ordenar a los mismos estudiantes por nombre en una pantalla y por ID en otra?

- Solución: Comparator permite crear clases externas que definen criterios de ordenación distintos al natural.

- Método clave: compare(T o1, T o2).

## Casos de Uso Actuales

- Apps de Delivery: Ordenar restaurantes por "Tiempo de entrega" O por "Calificación" O por "Costo de envío". Cada uno es un Comparator diferente.

- Fintech: Ordenar transacciones por fecha o por monto de mayor a menor.

## Ejemplo de Código (Comparator)

```
import java.util.*;

class CompararPorNombre implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante e1, Estudiante e2) {
        return e1.nombre.compareTo(e2.nombre);
    }
}

// En el main se usa así:
Arrays.sort(misEstudiantes, new CompararPorNombre()); 
```

# Integración Total

## Uniendo todo en un Sistema

Este código muestra cómo buscar un objeto dentro de un arreglo usando un criterio de comparación específico.

```
import java.util.*;

public class SistemaGestion {
    public static void main(String[] args) {
        Estudiante[] lista = {
            new Estudiante(3, "Carlos"),
            new Estudiante(1, "Ana"),
            new Estudiante(2, "Zulema")
        };

        // Ordenamos por nombre (usando Comparator)
        Arrays.sort(lista, new CompararPorNombre());

        // Para buscar con binarySearch y un Comparator:
        Estudiante buscado = new Estudiante(0, "Ana");
        int idx = Arrays.binarySearch(lista, buscado, new CompararPorNombre());

        System.out.println("Ana encontrada en posición: " + idx);
    }
}
```
