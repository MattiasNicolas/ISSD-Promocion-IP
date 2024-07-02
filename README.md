# Adivina el Número

## Descripción del Proyecto

"Adivina el Número" es un juego de consola desarrollado en Java donde el usuario intenta adivinar un número aleatorio generado por el programa. 
El objetivo es proporcionar una experiencia interactiva y entretenida, permitiendo al usuario recibir pistas sobre si su intento es demasiado alto o demasiado bajo, y lograr adivinar el número correcto dentro de un número limitado de intentos.

## Funcionalidades

- **Generación de Número Aleatorio:** El programa genera un número aleatorio dentro de un rango específico (1 a 50).
- **Intentos Limitados:** El usuario tiene un número limitado de intentos (5) para adivinar el número.
- **Pistas de Adivinanza:** Después de cada intento, el programa informa si el intento es demasiado alto, demasiado bajo o correcto.
- **Interfaz de Menú:** El usuario puede elegir entre iniciar el juego o salir mediante un menú de opciones.
- **Validación de Entrada:** El programa maneja y valida entradas incorrectas, asegurando que el usuario ingrese solo números.
- **Mensajes de Victoria o Derrota:** Al finalizar el juego, el usuario recibe un mensaje indicando si ha ganado o perdido, mostrando el número correcto si no se ha adivinado.

## Alcance

- **Generación de números aleatorios**: Utilizando la clase `Random` de Java.
- **Interacción de Usuario**: A través de la consola utilizando la clase `Scanner`.
- **Validación y Manejo de Errores**: Uso de excepciones para manejar entradas no válidas.
- **Lógica de Juego**: Implementación de la lógica para el juego de adivinanza, incluyendo el manejo de intentos y pistas al usuario.
- **Interfaz de Menú**: Sistema de menú para iniciar el juego o salir.

## Limitaciones

- **Interfaz de Usuario**: La interacción se realiza exclusivamente a través de la consola, lo que puede no ser tan intuitivo o atractivo como una interfaz gráfica.
- **Rango de Números Fijo**: El número aleatorio se genera en un rango fijo (1 a 50) sin opción para cambiarlo.
- **Número Fijo de Intentos**: El número de intentos está limitado a 5 y no es configurable por el usuario.
- **Persistencia de Datos**: No se guarda el estado del juego o las puntuaciones.

