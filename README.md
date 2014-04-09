Practica 1 - Patrones de Diseño
-------------------------------

En el marco de un proyecto de prototipado rápido de paginas web se requiere el desarrollo de una librería de abstracción Html en java.  El proyecto se encuentra desarrollado en su primera iteración, con un soporte limitado para algunos tags html. En esta etapa se hace claro la necesidad de reorganizar el código de la librería utilizando patrones de diseño.  Se adjunta el diseño UML inicial y diccionario de las clases existentes. Realice los siguientes ejercicios:

1) Si bien la librería tiene soporte para interfaces Html y Jquery, se pretende dejar la posibilidad de realizar exenciones otros tipos de interface.  A fin de abstraer al usuario de la librería de la implementación concreta de las interfaces, reorganice el código utilizando el patrón creacional que le parezca adecuado.

2) Con el fin de permitir debugging y logging de las aplicaciones que utilicen la librería, se requiere dar la posibilidad de realizar diferentes acciones previo a la ejecución del método render de cada tag. Modifique la librería aplicando el patrón que sea necesario.

3) Para una segunda iteración en el desarrollo de la librería se requiere agregar la posibilidad de incluir atributos en la definición de los tags html. Un atributo actuá como decorador de un tag y se encuentra en el tag de inicio, por ejemplo el tag button acepta los atributos disabled, autofocus y type de la forma:<br>
```  <button disabled autofocus type=”button”>boton1</button>```<br>
Implemente el soporte de atributos utilizando el patrón que considere apropiado. Realice la implementación utilizando el ejemplo del boton con los 3 atributos descriptos, el diseño debe ser lo suficientemente flexible para extender a otros tags y atributos.

UML
---

![alt text](https://raw.githubusercontent.com/matiasgel/LabProgLeng2014-tp1/master/uml.png "")

