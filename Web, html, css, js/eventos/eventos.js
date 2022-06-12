(function(){
    var saludo = function(){
        document.write("funciono mi rey");
    };

    var boton = document.getElementById(`boton`); 
    boton.addEventListener("click", saludo);
        

}())