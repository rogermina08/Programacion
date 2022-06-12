//ingresa o selecciona el id encabezado que es un h1
var encabezado = document.getElementById("encabezado");
//cambia la propiedade del id, en este cado el fondo 
//encabezado.style.background = "navy";
//cambia el color de la letra del h1
//encabezado.style.color = "#fff";
encabezado.className = encabezado.className.replace("titulo","");

document.write(encabezado.className);

