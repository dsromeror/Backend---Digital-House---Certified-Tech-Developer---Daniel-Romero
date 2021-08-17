# Ejercicio
Ahora nuestra aplicación de streaming va a incorporar la emisión de series. En este
caso, necesitamos desarrollar una funcionalidad en particular: como cliente,
queremos que la aplicación nos permita hacer un pedido con el nombre de la serie
y nos envíe el link de reproducción. El único límite impuesto a nuestra petición es
que la cantidad de series no pueden ser más de 5 por semana. Para poder saber
cuántas ya fueron vistas se llevará un contador. Se propone crear una estructuras
de clases similar al ejercicio anterior, con las siguientes clases:
- Una Interface ISerie que define un método getPelicula que recibe el
  nombre, devolviendo un String.
- Una clase Serie que implementa la interface ISerie y devuelve un String que
  representa el link y simplemente es el prefijo “www.” seguido por el nombre
  de la serie.
- Una Clase SerieProxy con un atributo cantVistas que cuenta las veces que
  fue pedida una serie y le pide a Serie un link con getPelicula y verifica las
  veces que se reprodujo alguna serie y si se supera el valor máximo, lanza
  una excepción del tipo SerieNoHabilitadaException, creada a tal fin.  

En el método main hacer pedidos de series con el nombre. Mostrar el link de la
serie, si está habilitada, sino un cartel de “Excede la cantidad de reproducciones
permitidas”.

# UML