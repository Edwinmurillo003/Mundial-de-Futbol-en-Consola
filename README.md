⚽ Mundial de Fútbol 2026 - Proyecto en Java

 Descripción

Este proyecto consiste en un programa desarrollado en Java relacionado con el Mundial de Fútbol 2026.

El programa permite consultar información de los partidos del torneo, visualizar partidos por grupo, consultar un partido específico, mostrar todos los partidos y manejar una tabla de posiciones con las estadísticas de las selecciones.

Además, el proyecto incluye una representación gráfica de diferentes banderas mediante colores en la consola, utilizando matrices y códigos de colores.

⸻

 Objetivo

El objetivo principal del proyecto es aplicar conceptos fundamentales de programación en Java mediante la creación de un programa relacionado con el Mundial de Fútbol 2026.

En el proyecto se utilizan conceptos como:

* Arreglos y matrices.
* Ciclos for y do-while.
* Condicionales if.
* Estructuras switch.
* Métodos.
* Clases.
* Manejo de datos mediante arreglos.
* Entrada de datos por consola.
* Tablas de información.
* Representación de gráficos mediante colores en la consola.

⸻

 Mundial de Fútbol 2026

El proyecto contiene información correspondiente a las selecciones participantes y al calendario del Mundial de Fútbol 2026.

El calendario contiene 104 partidos, desde la fase de grupos hasta la final.

Las fases contempladas son:

* Fase de grupos
* Dieciseisavos de final
* Octavos de final
* Cuartos de final
* Semifinales
* Tercer puesto
* Final

Los partidos incluyen información como:

* Número del partido.
* Fecha.
* Hora.
* Grupo o fase.
* Primer equipo.
* Segundo equipo.
* Estadio o ciudad donde se disputa.

⸻

 Partidos.java

La clase Partidos contiene la información del calendario del Mundial.

Los partidos se almacenan mediante una matriz de datos, donde cada partido contiene información sobre su fecha, hora, fase, equipos y estadio.

Funciones principales

mostrarPorGrupo()

Permite consultar todos los partidos pertenecientes a un grupo determinado.

El usuario puede ingresar un grupo entre:

A, B, C, D, E, F, G, H, I, J, K o L

El programa busca los partidos correspondientes y los muestra en la consola.

mostrarPartido()

Permite consultar un partido específico utilizando su número.

El programa muestra:

Fecha
Hora
Fase
Equipo 1
Equipo 2
Estadio

Si el número ingresado no corresponde a un partido válido, el programa muestra un mensaje indicando que el número no es válido.

⸻

 Menú principal

La clase Partidos cuenta con un menú interactivo:

==============================================
          MUNDIAL DE FUTBOL 2026
              FIXTURE
==============================================
1. Ver partidos de un grupo
2. Ver un partido especifico
3. Ver todos los partidos
4. Salir

El usuario puede seleccionar la opción que desea utilizando la entrada por consola.

El menú utiliza un ciclo do-while, por lo que continúa funcionando hasta que el usuario selecciona la opción 4. Salir.

⸻

 TablaPosiciones.java

La clase TablaPosiciones se encarga de almacenar y mostrar la información estadística de las selecciones.

La tabla contiene 48 equipos y 10 estadísticas por equipo.

Las estadísticas son:

Abreviatura	Significado
PJ	Partidos jugados
PG	Partidos ganados
PE	Partidos empatados
PP	Partidos perdidos
GF	Goles a favor
GC	Goles en contra
DG	Diferencia de goles
TA	Tarjetas amarillas
TR	Tarjetas rojas
Pts	Puntos

⸻

 Cálculo de diferencia de goles

La diferencia de goles se calcula mediante:

DG = GF - GC

Este cálculo se realiza dentro del método actualizarEquipo().

⸻

 Actualización de equipos

El método:

actualizarEquipo()

permite actualizar las estadísticas de una selección.

Entre los datos que puede recibir se encuentran:

* Partidos jugados.
* Partidos ganados.
* Partidos empatados.
* Partidos perdidos.
* Goles a favor.
* Goles en contra.
* Tarjetas amarillas.
* Tarjetas rojas.
* Puntos.

⸻

 Mostrar tabla

El método:

mostrarTabla()

muestra en la consola una tabla con todos los equipos y sus respectivas estadísticas.

La información se organiza mediante columnas para facilitar su lectura.

⸻

 Representación de banderas

El proyecto también incluye una representación de banderas mediante una matriz de caracteres.

Cada número representa un color diferente.

La matriz es recorrida utilizando ciclos for.

Por ejemplo:

for (fila = (81) - 1; fila < 90; fila++) {
    for (int columna = 0; columna < matriz[fila].length; columna++) {

De esta manera, el programa selecciona las filas correspondientes a cada bandera y las recorre columna por columna.

⸻

 Código de colores

Los caracteres almacenados en la matriz representan diferentes colores:

Valor	Color
1	Amarillo
2	Naranja
3	Rojo
4	Morado
5	Azul
6	Verde
7	Blanco
8	Negro
9	Marrón

Estos valores son convertidos en colores utilizando la clase:

ConsoleColors

Por ejemplo:

if (matriz[fila][columna] == '1') {
    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
}

Después de imprimir cada bloque de color se utiliza:

ConsoleColors.RESET

para restablecer el color de la consola.

⸻

 Selecciones representadas

En esta parte del proyecto se encuentran representadas las banderas de diferentes selecciones.

Entre ellas:

* 🇺🇸 Estados Unidos
* 🇦🇷 Argentina
* 🇧🇷 Brasil
* 🇨🇦 Canadá
* 🇨🇮 Costa de Marfil
* 🇯🇴 Jordania

Cada bandera utiliza una sección determinada de la matriz.

Por ejemplo:

Case 9  → Estados Unidos
Case 10 → Argentina
Case 11 → Brasil
Case 12 → Canadá
Case 13 → Costa de Marfil
Case 14 → Jordania

⸻

Estructura del proyecto

Los archivos principales utilizados en este proyecto son:

Proyecto-Mundial-2026/
│
├── Partidos.java
├── TablaPosiciones.java
├── ConsoleColors.java
├── ConsoleInput.java
└── README.md

Partidos.java

Contiene el calendario y las funciones relacionadas con los partidos del Mundial.

TablaPosiciones.java

Contiene la información y las funciones relacionadas con la tabla de posiciones.

ConsoleColors.java

Permite utilizar colores en la consola para representar las banderas y mejorar la presentación visual.

ConsoleInput.java

Permite recibir datos introducidos por el usuario desde la consola.

README.md

Contiene la documentación del proyecto.

⸻

 Tecnologías utilizadas

* Java
* Programación orientada a objetos.
* Consola de comandos.
* Arreglos.
* Matrices.
* Ciclos.
* Condicionales.
* Métodos.
* Estructuras switch.
* Códigos de colores ANSI.

⸻

 Cómo ejecutar el proyecto

1. Descargar o clonar este repositorio.
2. Abrir el proyecto en un entorno de desarrollo compatible con Java.
3. Verificar que todos los archivos .java estén dentro del mismo proyecto.
4. Compilar los archivos.
5. Ejecutar la clase principal del programa.
6. Utilizar las opciones que aparecen en el menú de la consola.

⸻

 Funcionamiento general

El programa funciona mediante interacción con el usuario.

Primero se presenta un menú con diferentes opciones. Dependiendo de la opción seleccionada, el usuario puede consultar información específica del Mundial.

El programa permite:

Consultar partidos por grupo
        ↓
Consultar un partido específico
        ↓
Consultar todos los partidos
        ↓
Consultar información de las selecciones
        ↓
Visualizar banderas mediante colores
        ↓
Consultar estadísticas de la tabla de posiciones

⸻

Conceptos de programación aplicados

Durante el desarrollo del proyecto se aplicaron diferentes conceptos de programación en Java:

* Variables.
* Tipos de datos.
* Arreglos unidimensionales.
* Arreglos bidimensionales.
* Matrices.
* Ciclo for.
* Ciclo do-while.
* Condicionales if.
* Estructura switch.
* Métodos.
* Clases.
* Encapsulamiento mediante atributos privados.
* Entrada de datos.
* Salida de información.
* Recorrido de matrices.
* Manipulación de cadenas de texto.

⸻

 Proyecto académico

Este proyecto fue desarrollado con fines académicos, con el propósito de aplicar los conocimientos de programación en Java mediante una temática relacionada con el fútbol y el Mundial 2026.

⸻

 Conclusión

El proyecto integra diferentes conceptos de programación para crear una aplicación de consola relacionada con el Mundial de Fútbol 2026.

A través de sus diferentes clases y métodos, el usuario puede consultar el calendario de partidos, buscar encuentros específicos, visualizar todos los partidos, consultar estadísticas de las selecciones y representar banderas utilizando matrices y colores en la consola.

⸻

 Autores:

 Juan Pablo Morales 
 Edwin Murillo

Proyecto desarrollado como trabajo académico de programación en Java.

Mundial de Fútbol 2026 ⚽🇨🇴
