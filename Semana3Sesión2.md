# Análisis de Complejidad (Teórico y Empírico)

El análisis de algoritmos busca medir la eficiencia independientemente del hardware.

- **Análisis Empírico**: Medir el tiempo real de ejecución (reloj) usando System.nanoTime(). 
- **Problema**: Depende de la CPU y la carga del sistema.
- - **Análisis Teórico**: Contar el número de operaciones primitivas en función del tamaño de la entrada ($n$).

Regla de Luis Joyanes: Nos interesa el comportamiento asintótico (cuando $n$ tiende a infinito).

---

## Notaciones Asintóticas (O, $\Omega$, $\Theta$)

Definimos los límites de crecimiento de la función de tiempo $T(n)$:

- **Cota Superior ($O$ - Big O)**: Es el "peor caso". Garantiza que el algoritmo no tardará más que $f(n)$.

  Ejemplo: Búsqueda lineal es $O(n)$.
  
- **Cota Inferior ($\Omega$ - Omega)**: El "mejor caso". El algoritmo tarda al menos $f(n)$.

  Ejemplo: Encontrar el mayor en un arreglo siempre es $\Omega(n)$.

- **Cota Ajustada ($\Theta$ - Theta)**: Cuando el peor y mejor caso crecen al mismo ritmo. Es la descripción más precisa.

---

## Ejemplo Práctico de Conteo de Operaciones

Analicemos el ejercicio de la semana pasada (frecuencia de números):

```java
for (int i = 0; i < n; i++) {         // n veces
    int contador = 0;                 // 1 op.
    for (int j = 0; j < n; j++) {     // n * n veces
        if (arreglo[i] == arreglo[j]) // 1 op.
            contador++;               // 1 op.
    }
    if (contador > 1) { ... }         // 1 op.
}
```

- **Complejidad**: $T(n) = n \times (n \times constantes) \approx n^2$
- **Resultado**: El algoritmo es $O(n^2)$ (Cuadrático). Si duplicas los datos, el tiempo se cuadruplica.

---

# Algoritmos Recursivos sobre Sucesiones

## La Naturaleza de la Recursividad
La recursividad es una técnica de programación donde un método se define en términos de sí mismo.

- **Caso Base**: La condición de parada (evita el `StackOverflowError`).
- **Caso General**: La reducción del problema original en una versión más pequeña.
- **Sucesiones**: Ideales para recursión porque su definición matemática ya es recursiva (Ej. Factorial: $n! = n \times (n-1)!$).

---

## Sucesión de Fibonacci - El Problema

La implementación directa de la fórmula matemática: $F(n) = F(n-1) + F(n-2)$.

```java
public static long fibo(int n) {
    if (n <= 1) return n; // Casos base: 0 y 1
    return fibo(n - 1) + fibo(n - 2);
}
```

- **Análisis de Eficiencia**: Genera un árbol de llamadas redundantes.
- **Complejidad**: $O(2^n)$ (Exponencial).
- **Para $n=40$**, el árbol tiene millones de nodos.

---

## Recursividad con Memorización (Memoization)

## ¿Qué es la Memorización?

Es una técnica de Optimización que consiste en almacenar los resultados de subproblemas ya resueltos para no volver a calcularlos.

- Se basa en el principio de "**Espacio por Tiempo**": Usamos un poco más de memoria (un arreglo o tabla) para ganar muchísima velocidad.

- Es el primer paso hacia la **Programación Dinámica**.

---

## Implementación de Fibonacci con Memoria

En Java, usamos un arreglo estático o una estructura de datos para persistir los valores.

```java
public class ClaseRecursion {
    static long[] tabla = new long[100]; // Almacén de resultados

    public static long fiboMemo(int n) {
        if (n <= 1) return n;
        
        // 1. Consultar si ya existe en memoria
        if (tabla[n] != 0) return tabla[n];

        // 2. Si no existe, calcular y GUARDAR
        tabla[n] = fiboMemo(n - 1) + fiboMemo(n - 2);
        
        return tabla[n];
    }
}
```

## Comparativa Final de Rendimiento

Mostramos el impacto del análisis de algoritmos aplicado:

| **Algoritmo**      | **Tiempo para $n=45$** | **Complejidad** |
|--------------------|------------------------|-----------------|
| Fibonacci Simple   | ~15 a 20 segundos      | $O(2^n)$        |
| Fibonacci con Memo | < 1 milisegundo        | $O(n)$          |

---

### La diferencia entre un buen programador y uno excelente es entender que la elegancia de la recursividad debe ir acompañada de un análisis de complejidad riguroso.

---

# Ejercicio en clases: El Desafío de Lucas ($L_n$)

**Objetivo**: Implementar y comparar la eficiencia de la recursividad simple frente a la recursividad con memorización.

## 1. Contexto Matemático

La sucesión de Lucas se define de la siguiente manera:

- $L_0 = 2$
- $L_1 = 1$
- $L_n = L_{n-1} + L_{n-2}$ (para $n > 1$)

## 2. Instrucciones del Ejercicio

### Fase A: El Enfoque Ineficiente

Crea un método llamado ```public static long lucasRecursivo(int n)```.

- Implementa la fórmula matemática tal cual, usando recursión pura.
- En el main, intenta calcular $L_{50}$.
- **Responda a esta pregunta de reflexión**: ¿Por qué la computadora parece "congelarse"? ¿Cuál es la complejidad $O$ de este método?

### Fase B: El Enfoque Profesional

Crea un método llamado ```public static long lucasMemo(int n, long[] memoria)```.

- Usa un arreglo de tipo ```long``` para almacenar los resultados ya calculados.
- Antes de hacer una suma recursiva, verifica si ```memoria[n]``` ya tiene un valor distinto de cero.
- Calcula $L_{50}$ y $L_{60}$ nuevamente.
  
### Fase C: Análisis de Resultados

Llena la siguiente tabla en tu cuaderno/editor:

| **N** | * *Tiempo Recursivo Simple ** | **Tiempo con Memorización** |
|-------|-------------------------------|-----------------------------|
| 10    |                               |                             |
| 40    |                               |                             |
| 50    |                               |                             |

---

# Extra visto en clases: Factorial

## Clase y ejecución

1. se crea la clase **Factorial**

```java
public class Factorial {}
```

2. se agrega el metodo main ```psvm```

3. hacemos la llamada a una función que vamos a crear, esta llamada la hacemos desde el **main**

```java
  System.out.println("Calcular el Factorial");
  int numero = 5;
  System.out.println("Factorial de " + numero + ": " + getFactorial(numero));
```

4. la funcion **getFactorial** recibe como argumento un número

- Hacemos que nos muestre si en verdad ira desde el 1 hasta el mismo numero ingresado
- Mejoramos el ciclo dwsde 2 hasta el mismo número 
- Visualizamos y luego comentamos 

```java
    public static int getFactorial(int _num){
        int retorno = 1;
        for (int i = 2; i <= _num; i++) {
            // System.out.println("[" + i +"]");
            retorno *= i; // retorno = retorno * i
            // retorno = 1 * 1
        }
        return retorno;
    }
```

5. Aplicamos Recursividad

- Indicamos el caso base
- Indicamos la llamada q la misma función indicandi el nuevo valor de n

```java
    public static int getFactorialRecursivo(int _num){
        // System.out.println("Num!: " + _num);
        // caso base
        if (_num <= 1){
            return 1;
        }
        // llamar de forma recursiva
        return _num * getFactorialRecursivo(_num - 1);
    }
```

6. Aplicamos Memorización 

- Para optimizar el cálculo del factorial mediante memorización (memoization), el objetivo es evitar cálculos redundantes almacenando los resultados ya obtenidos en una estructura de datos, como un HashMap o un arreglo, antes de realizar una nueva llamada recursiva.
- Creamos una nueva clase para comparar: FactorialMemorizacion

```java
public class FactorialMemomorizacion {
    
    // Definimos el tamaño máximo (long soporta hasta factorial de 20)
    private static final int MAX = 21;
    private static long[] memoria = new long[MAX];

    public static void main(String[] args) {
        // Inicializar memoria con -1 para saber qué valores no han sido calculados
        for (int i = 0; i < MAX; i++) {
            memoria[i] = -1;
        }

        int numero = 20;
        System.out.println("Factorial de " + numero + " es: " + calcularFactorial(numero));
        
        // Segunda llamada para demostrar que ya está en memoria
        System.out.println("Factorial de " + (numero - 1) + " (recuperado): " + calcularFactorial(numero - 1));
    }

    public static long calcularFactorial(int n) {
        // Caso base
        if (n <= 1) {
            return 1;
        }

        // 1. Verificar si el índice n es válido para nuestro arreglo
        if (n >= MAX) {
            // Si el número es mayor a 20, long desbordará (overflow)
            throw new IllegalArgumentException("Número demasiado grande para el tipo long.");
        }

        // 2. Verificar si el resultado ya está en el arreglo
        if (memoria[n] != -1) {
            System.out.println("-> Usando valor almacenado en indice [" + n + "]");
            return memoria[n];
        }

        // 3. Calcular, almacenar en el arreglo y retornar
        memoria[n] = (long) n * calcularFactorial(n - 1);
        return memoria[n];
    }
}
```

Notas:
1. El valor "centinela": Es importante el por qué inicializamos el arreglo con -1. Como un arreglo de long se inicializa por defecto en 0, y el factorial de un número nunca es negativo, -1 nos sirve para identificar qué celdas están "vacías" o pendientes de cálculo.
2. Complejidad: Al igual que con el HashMap, reducimos la complejidad a O(n), pero con una constante de tiempo menor, ya que no hay cálculo de hash ni manejo de colisiones; es acceso directo a memoria.
3. Limitación de Tipo: Desbordamiento. Si intentan calcular el factorial de 21, el valor superará el máximo de un long (2^{63}-1) y dará un número negativo o erróneo.