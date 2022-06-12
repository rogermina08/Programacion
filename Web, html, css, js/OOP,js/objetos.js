 class celulares {
    constructor(color, peso, tamaño, rdc, ram) {
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
        this.resolucionDeCamara = rdc;
        this.memoriaRam = ram;
        this.encendido = false;

    }
    presionarBotonDeEncendido() {
        if (this.encendido == false) {
            alert("celular encendido mi rey");
            this.encendido = true;
        } else {
            alert("celular apagado mi rey");

        }
    }
    reiniciar() {
        if (this.encendido == true) {
            alert("reiniciando el phone mi rey");
        } else{
            alert("el celular esta apagado, no se pueede reiniciar mi rey");
        }
    }
    tomarFotos(){
        alert(`foto tomada con resolucion de ${this.resolucionDeCamara}`)
    }
    grabarVideo(){
        alert(`grabando el video en ${this.resolucionDeCamara}`)
    }
    mobileInfo (){
        return `
        Color: <b>${this.color}</b></br>
        Peso:  <b>${this.peso}</b></br>
        Tamaño: <b>${this.tamaño}</b></br>
        Memoria Ram: <b>${this.memoriaRam}</b></br>
        Resolucion de video: <b>${this.resolucionDeCamara}</b></br>
        `;
    }

}

class CelularAltaGama extends celulares {
    constructor (color,peso,tamaño,ram,rdc,rdce){
    super(color,peso,tamaño,rdc,ram);
    this.resolucionDeCamaraExtra = rdce;
    }
    grabarLento (){
        alert("esta grabando en camara lenta mi rey");

    }
    reconocimientoFacial(){
        alert("se esta iniciando un reconocimietno facial");
    }
    infoAltaGama (){
        return this.mobileInfo() + `Resolucion de cama extra : <b>${this.resolucionDeCamaraExtra}</b>`;
        //
    }
}



//var celular1 = new celulares("rojo","300 g","5","full hd","2GB");
//var celular2 = new celulares("negro","150 g","5.4","full hd","2GB");
//var celular3 = new celulares("blanco","1234 g","5.9","full hd","2GB");

const celular1 = new CelularAltaGama ("rojo","123g","5.2","4GB","full xd","ultra hd");
const celular2 = new CelularAltaGama ("negro","1423g","6","6GB"," hd","400mp");

document.write (`
     ${celular1.infoAltaGama()} <br>
     <br>${celular2.infoAltaGama()} <br>
`);


//document.write(`
//${celular1.mobileInfo()}<br>
//${celular2.mobileInfo()}<br>
//${celular3.mobileInfo()}<br>
//`);




//celular1.presionarBotonDeEncendido();
//celular1.tomarFotos();
//celular1.grabarVideo();
//celular1.reiniciar();
//celular1.presionarBotonDeEncendido();
