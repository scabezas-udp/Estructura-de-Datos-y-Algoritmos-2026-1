# Instrucciones

Para cada ejercicio, debe entregar:
1. Modelo de Memoria (60%): Dibujo detallado de los nodos, punteros (sig, ant, cabecera, fin) y cómo cambian durante la operación.
2. Implementación (40%): Código en Java que resuelva el problema, manejando excepciones.

## Ejercicio 1) El Buffer de Video Streaming

**Contexto**: Un reproductor de video usa un arreglo de tamaño fijo (10) para precargar "frames". Cuando el usuario adelanta el video, el sistema debe insertar un nuevo frame en la posición k desplazando los demás, pero si el arreglo está lleno, debe descartar el último.

1. Papel: Dibuje el arreglo antes y después de insertar un frame en la posición 4, mostrando el desplazamiento de los elementos restantes.
2. Código: Cree el método ```insertarFrame(int[] _buffer, int _nuevoFrame, int _posicion)```.

---

## Ejercicio 2) Sistema de Tickets de Soporte

**Contexto**: Una empresa de IT recibe tickets. Los tickets con prioridad "VIP" deben moverse al inicio de la lista simple, mientras que los normales van al final.

1. Papel: Dada una lista A -> B -> C, dibuje el proceso de "reconexión de punteros" para mover el nodo C al inicio de la lista.
2. Código: Implemente ```moverAlInicio(String _idTicket)``` que busque un nodo y lo reubique como head.

---

## Ejercicio 3) El "Undo" de un Editor de Código

**Contexto**: Un editor de texto guarda cada línea en una Lista Doblemente Enlazada. Al presionar "Control+Z", la última línea editada se extrae de la lista y se guarda en una Pila de acciones desechadas.

1. Papel: Dibuje cómo se desconecta un nodo de una lista doble (punteros sig y ant) y cómo ese mismo objeto entra en una Pila (top).
2. Código: Implemente la función deshacerAccion() que realice el traspaso de la Lista Doble a la Pila.

---

## Balanceador de Carga (Round Robin)

**Contexto**: Un servidor distribuye peticiones entre 3 bases de datos de forma cíclica.

1. Papel: Dibuje una Lista Circular de 3 nodos. Muestre cómo el puntero actual se desplaza del nodo 3 de regreso al nodo 1 sin encontrar un null.
2. Código: Implemente obtenerSiguienteServidor() que retorne el dato del nodo actual y avance el puntero de forma infinita.

## Impresora de Red Compartida

**Contexto**: Un servidor de impresión gestiona documentos. Si la cola está llena (máximo 5 documentos), debe lanzar una excepción personalizada QueueFullException. Si se intenta imprimir y no hay nada, lanza QueueEmptyException.

1. Papel: Dibuje el estado de los punteros frente y fin cuando la cola tiene un solo elemento y este es eliminado.
2. Código: Implemente imprimirDocumento() manejando ambos errores con throw.

# Rúbrica

| Criterio | Excelente (100%) | Deficiente (50%) | Insuficiente (0%) |
|---|---|---|---|
| Modelo de Memoria (50%) | Dibuja todos los nodos y punteros correctamente. Representa claramente el cambio de estados. | El dibujo es confuso o faltan punteros críticos (como el ant en listas dobles). | No hay dibujo o no representa la lógica de punteros. |
| Manejo de Memoria (10%) | Demuestra entender el rol de las referencias y el Garbage Collector (no deja nodos huérfanos). | Se pierden referencias de nodos intermedios (causando pérdida de datos). | No utiliza referencias; intenta usar lógica de arreglos en listas. |
| Lógica Algorítmica (20%) | El código resuelve el problema de forma eficiente y maneja casos de borde (lista vacía). | El código resuelve el problema pero falla en casos de borde o tiene errores de sintaxis menores. | El código no compila o la lógica no corresponde a la estructura solicitada. |
| Gestión de Errores (20%) | Utiliza try-catch y throw de forma profesional para robustez. | Muestra mensajes por consola pero no usa el sistema de excepciones de Java. | No valida estados vacíos o nulos, el programa se cae. | 
