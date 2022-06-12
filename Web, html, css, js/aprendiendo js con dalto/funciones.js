let free = false;

const validarCliente = (time)=>{
    let edad = prompt("¿Cuál es tu edad?");

    if (edad>18){
        if(time>=2 && time<7 && free==false){
            alert("Puedes pasar gratis");
            free= true;
        } else {
            alert("Puedes pasar pero debes pagar la entrada");
        }

    } else {
        alert ("Hola, lamneto decirte que no puedes entrar");
    }

}