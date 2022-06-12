//crea un elemento li en 
var elemento = document.createElement("li"),
//crea un elemento texto dentro de la etiqueta li
contenido = document.createTextNode("Nuevo Texto");
//añade el texto al elemtno li
elemento.appendChild(contenido);

//con var padre estamos accediendo a todos los elementos li, y luego
//nos esta trayendo el primer li
//parennode nos devuelve el elemnto padre en este caso el ol
var padre = document.getElementsByTagName("li")[0].parentNode,
// var padre =document.getElementById("lista"); hace lo mismo que la linea de arriba.
//se esta accediendo al primer elmento de la lista 
primerElemento = document.getElementsByTagName("li")[0];
//se esta accediendo al segundo elemnto de la lista, o sea al segundo li
hijo = document.getElementsByTagName("li")[1];
//con  este comando puedo elegir donde insertar el elemnto creado,
// en este caso se esta añadiendo antes del segundo li
padre.insertBefore(elemento,hijo);