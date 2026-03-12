# Estructura de Datos y Algoritmos
## Docente: Sebastián Cabezas Ríos
---
## 1. Un poco de historia: El nacimiento de Java

Java no nació para la web, curiosamente. Fue creado a principios de los años 90 por James Gosling y su equipo en Sun Microsystems. Originalmente se llamó Oak, y su objetivo era programar dispositivos electrónicos domésticos.

Sin embargo, con el auge de Internet, se dieron cuenta de que su filosofía de "Escribir una vez, ejecutar en cualquier lugar" (WORA - Write Once, Run Anywhere) era perfecta para la red, ya que no dependía de un sistema operativo específico gracias a la Java Virtual Machine (JVM).

### El Ecosistema de Java: JDK, JRE y JVM

Podemos verlo como capas de una cebolla, donde una contiene a la otra:

#### 1. JVM (Java Virtual Machine)

Es el corazón de todo. La Máquina Virtual de Java es un software "imaginario" que reside en la memoria de tu computadora.

Su función: Leer el código que tú escribes (ya convertido en bytecode) y traducirlo a lenguaje que el procesador de tu computadora entienda.

El secreto: Gracias a la JVM, Java es multiplataforma. No importa si estás en Windows, Mac o Linux; si tienes la JVM instalada, el programa correrá igual.

#### 2. JRE (Java Runtime Environment)

Es el Entorno de Ejecución. Si solo quieres correr un programa de Java (como un juego o una aplicación bancaria), solo necesitas el JRE.

¿Qué contiene? Contiene la JVM + las Librerías de clase (archivos necesarios para que el programa sepa cómo dibujar una ventana, cómo conectarse a internet, etc.).

Analogía: Es como el reproductor de música que necesitas para escuchar un disco.

#### 3. JDK (Java Development Kit)

Es el Kit de Desarrollo. Es lo que nosotros, como programadores, instalamos en nuestras máquinas.

¿Qué contiene? Contiene el JRE + Herramientas de desarrollo.

Herramientas clave:
- javac: El compilador que transforma tu código .java en .class (bytecode).
- jdb: El depurador para encontrar errores.
- Javadoc: Para generar documentación automática.

#### Tipos de datos Primitivos

Categoría,Tipo,Tamaño,Rango / Valor
Enteros,byte,8 bits,-128 a 127
,short,16 bits,"-32,768 a 32,767"
,int,32 bits,"-2,147,483,648 a 2,147,483,647"
,long,64 bits,Números extremadamente grandes
Flotantes,float,32 bits,Decimales de precisión simple
,double,64 bits,Decimales de precisión doble
Carácter,char,16 bits,Un solo carácter Unicode (ej: 'A')
Lógico,boolean,1 bit,true o false

---


## 2. Nuestro primer paso: Hola Mundo

En Java, todo debe vivir dentro de una clase. Aquí tienes la estructura básica:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
    }
}
```

### Explicación del Hola Mundo

#### Modificadores de Acceso (Lo esencial)

En el libro de Joyanes, se enfatiza mucho el encapsulamiento. Los modificadores definen quién puede ver o usar tus datos:
- **public**: Es el nivel más abierto. El miembro es accesible desde cualquier otra clase.
- **private**: Es el más restrictivo. Solo se puede acceder desde dentro de la misma clase. Es fundamental para proteger la integridad de nuestros datos.
- **protected**: Un término medio. Permite el acceso a clases del mismo paquete y a las subclases (herencia).

#### Convención de Nombres: CamelCase
Para mantener un código profesional y legible, usamos CamelCase (llamado así porque las mayúsculas parecen las jorobas de un camello):

- UpperCamelCase: Se usa para Clases. Ejemplo: GestionDeUsuarios, ArregloEnteros.
- lowerCamelCase: Se usa para variables y métodos. Ejemplo: nombreUsuario, calcularSuma().

#### Ejecutable

Esta es la "puerta de entrada" (entry point) de cualquier aplicación Java. Sin esta línea, el programa simplemente no sabe por dónde empezar a ejecutar.

- **public**: De nuevo, el modificador de acceso. La JVM debe poder acceder a este método desde "afuera" para iniciar el programa.
- **static**: (Significa "estático"). Un método estático pertenece a la clase y no a un objeto específico. Gracias a esto, la JVM puede llamar al método main sin tener que crear primero un objeto de la clase HolaMundo.
- **void**: Es el tipo de retorno. Indica que este método realiza una acción pero no devuelve ningún valor (como un número o un texto) al finalizar.
- **main**: Es el nombre reservado del método. Es el estándar mundial en programación; el buscador de la JVM busca exactamente este nombre.

Los argumentos que son recibidos en ```(String [] args)```:

Aquí entramos en el terreno de las estructuras de datos básicas:

- **String[]**: Indica un arreglo (array) de cadenas de texto.
- **args**: Es el nombre de la variable (abreviatura de arguments).
- **¿Para qué sirve?**: Permite que el programa reciba información desde la consola antes de iniciar. Por ejemplo, si ejecutas tu programa como java HolaMundo Pedro, ese "Pedro" se guarda automáticamente dentro de este arreglo.

- **System**: Es una clase predefinida de Java que nos da acceso a recursos del sistema (teclado, pantalla, reloj, etc.).
- **out**: Es un objeto dentro de System que representa la salida estándar (usualmente la consola o terminal).
- **println**: Es el método (función) que ordena "imprimir una línea" (print line). Escribe el texto y luego hace un salto de línea automático.

### Estructura básica de un programa en JAVA:

Estructura típica de un programa en Java:

```
ModificadorAcceso + class + NombreClase {
     ModificadorAcceso + Estado + Retorno + NombreMetodo ( Argumentos ) {
         // Tu código aquí
     }
}
```

---

## Atajos de Teclado

- Copiar una linea: posa el cursor en una línea, presiona ALT + SHIFT + Flecha Arriba o Abajo
- psvm + tab: escribe ```public static void main(String[] args)``` de manera automática, incluyendo las llaves
- sout + tab: escribe ```System.out.println("");```de manera automática, incluyendo el punto y coma del final de línea
- fori + tab: escribe un for haciendo referencia al último arreglo trabajado.

## Ejercicio Práctico en Clases

Haremos un arreglo de números enteros, los números inicialmente serán 1, 2 y 3. Más adelante agregaremos 4, 2 y 1.

Código visto en clases:
```java
public class ArregloEnteros {
  public static void main(String[] args) {
    //int otroNumerosVarios[] = {1, 2, 3};
    // acceso a la información almacenada
    System.out.println(otroNumerosVarios[0]);
    System.out.println(otroNumerosVarios[1]);
    System.out.println(otroNumerosVarios[2]);
    System.out.println("---");
    System.out.println("Largo del arreglo: " + otroNumerosVarios.length);
    System.out.println("--java primero---");
    System.out.println(otroNumerosVarios[0] + otroNumerosVarios[1]);
    System.out.println("--java primero---");
    // Recorrido del arreglo
    for (int i = 0; i < otroNumerosVarios.length; i++) {
      System.out.println(otroNumerosVarios[i]);
    }
  }
}
```

1. ¿Qué pasa si agregamos los elementos: 4, 2 y 1?
2. ¿El arreglo lo tenemos limitado?
3. ¿Qué otras formas existen para declarar arreglos?

```java
int[] miArreglo;          // 1. Declaración (Aún no reserva memoria)
miArreglo = new int[5];   // 2. Creación (Reserva espacio para 5 enteros)
```

```java
int[] notas = new int[10]; // Crea un arreglo de 10 posiciones (índices 0-9)
```

```java
int[] temperaturas = {18, 22, 25, 30}; // Tamaño automático de 4
```
