- **Carácter**: Individual
- **Formato de Entrega**: código java incrustado
---
# Contexto

​El Departamento de Registro Académico de la Universidad necesita un pequeño sistema para analizar el desempeño de un grupo de estudiantes en un examen de lógica de programación. Debido a que se está realizando una auditoría de la plataforma, se requiere simular los datos de 10 estudiantes de forma aleatoria.

​Las calificaciones en esta escala especial son números enteros que van desde el 3 hasta el 9. Para garantizar la eficiencia y el orden del código, el sistema debe estar completamente modularizado, es decir, cada cálculo debe ser realizado por una función específica que reciba el arreglo como parámetro.

# Instrucciones

Desarrolle un programa en Java que realice las siguientes tareas:

​**1. Generación de Datos**: 
* Declare un arreglo de números enteros con una capacidad para 10 elementos.
* ​Llene el arreglo utilizando una función de números aleatorios (usando Math.random()) con valores en el rango de [3, 9].
  
​**2. Análisis de Extremos**:
* Diseñe una función llamada obtenerMinimo que recorra el arreglo y retorne el valor más bajo encontrado.
* ​Diseñe una función llamada obtenerMaximo que recorra el arreglo y retorne el valor más alto encontrado.

**3. Cálculo de Tendencia**:
* Diseñe una función llamada calcularPromedio que sume todos los elementos y retorne el promedio. **Importante**: El resultado debe ser de tipo decimal (double).

​**4. Frecuencia de Datos (Búsqueda)**:
* Diseñe una función llamada analizarRepetidos que determine qué números aparecen más de una vez en el arreglo y cuántas veces se repite cada uno.

**Pista pedagógica**: Puede usar un arreglo auxiliar o un ciclo anidado para comparar cada número del rango (3 al 9) contra el contenido del arreglo original.
​
# Salida de Datos:
​
Desde el método main, invoque todas las funciones y muestre los resultados en consola de forma clara y ordenada.
​
## Ejemplo de cómo se vería la salida esperada:
```java
Calificaciones generadas: [5, 3, 9, 5, 8, 3, 7, 5, 4, 6]
--------------------------------------------------
Valor mínimo: 3
Valor máximo: 9
Promedio del grupo: 5.5
--------------------------------------------------
Análisis de repeticiones:
El número 5 se repite 3 veces.
El número 3 se repite 2 veces.
```
