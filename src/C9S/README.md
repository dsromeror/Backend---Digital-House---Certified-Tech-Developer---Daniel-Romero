# Ejercicio
Tenemos que administrar un creador de figuras Triángulo, el cual podemos diferenciarlos
por color.
Los atributos son:
* Color (String)
* Tamaño (integer)

Les pedimos que utilicen el patrón Flyweight para crear una fábrica que administre la
cantidad de triángulos que se van a crear, diferenciándose uno de otro mediante el color.
Por ejemplo: triángulo rojo de tamaño 2 y triángulo rojo de tamaño 1 deberían generar
solo 1 objeto en el caché

Luego, debemos generar un test que me certifique que el color y tamaño agregado al
objeto están seteados. Por ejemplo: triángulo verde tamaño 4,debería obtener verde en
color y 4 en tamaño para las 2 aserciones.