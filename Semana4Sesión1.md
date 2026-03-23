# Estructuras de Datos y Algoritmos

## Listas Enlazadas

### 1. El Concepto: Rompiendo la Barrera del Arreglo

- Un arreglo es como un edificio de departamentos: las unidades están una al lado de la otra y el tamaño del edificio es fijo.
- Una Lista Enlazada es como una "Búsqueda del Tesoro": cada pista (nodo) te dice dónde está la siguiente, y pueden estar repartidas por cualquier lugar de la memoria.

**Definición**: Es una colección lineal de elementos llamados Nodos, donde el orden no está dado por su posición física en memoria, sino por enlaces (referencias).

### 2. La Anatomía del Nodo

Un nodo es un objeto que tiene dos partes fundamentales:

1. **Dato**: La información que queremos guardar (int, String, un objeto, etc.).
2. **Enlace** (Siguiente): Una referencia de tipo objeto que "apunta" a la dirección de memoria del próximo nodo.

```java
public class Nodo {
    int dato;           // Información
    Nodo siguiente;     // Puntero al siguiente nodo (autorreferencia)

    // Constructor
    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null; // Al crear un nodo, aún no apunta a nadie
    }
}
```

### 3. La Estructura de la Lista

Para gestionar los nodos, necesitamos una clase "Controladora" que siempre sepa dónde empieza la lista.

- **Cabeza (Head)**: Un puntero que apunta al primer nodo. Si ```cabeza == null```, la lista está vacía.
- **Nodo Final***: Se reconoce porque su enlace siguiente apunta a ```null```.

### 4. Operaciones Fundamentales

#### A. Inserción al Inicio

Es la más eficiente O(1).

1. Se crea el nuevo nodo.
2. El siguiente del nuevo nodo apunta a donde apunta la cabeza actual.
3. La cabeza se actualiza para que sea el nuevo nodo.

#### B. Recorrido (Traverse)

Para mostrar la lista o buscar un elemento, usamos un puntero auxiliar (típicamente llamado ```actual``` o ```temp```) para no perder la referencia de la cabeza.

```java
Nodo actual = cabeza;
while (actual != null) {
    System.out.print(actual.dato + " -> ");
    actual = actual.siguiente;
}
```

#### C. Inserción al Final

Requiere recorrer toda la lista hasta encontrar el nodo cuyo siguiente sea ```null``` (O(n)). Una vez encontrado, se cambia ese ```null``` por el nuevo nodo.

### 5. Ventajas y Desventajas

- Ventajas:
  - Dinamicidad: Crece y se reduce en tiempo de ejecución. No hay desperdicio de memoria.
  - Inserciones/Eliminaciones: Son muy rápidas si ya se tiene la posición, pues no hay que "desplazar" todos los elementos como en un arreglo.
- Desventajas:
  - Acceso secuencial: No puedes ir directo al elemento 50. Tienes que pasar por los 49 anteriores.
  - Gasto extra de memoria: Cada dato requiere una referencia adicional (el puntero).

### 6. Ejemplo

```java
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void mostrar() {
        Nodo temp = cabeza;
        while(temp != null) {
            System.out.print("[" + temp.dato + "] -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
```
