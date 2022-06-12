class App {
    constructor (descargas,puntuacion,peso){
        this.descargas = descargas;
        this.puntos = puntuacion;
        this.peso = peso;
        this.iniciada = false;
        this.instalada = false;
    }
    abrir(){
        if(this.iniciada == false && this.instalada == true){
            this.iniciada = true;
            alert("aplicacion iniciada");
        }
    }
    cerrar(){
        if (this.iniciada == true && this.instalada == true){
            this.iniciada = false;
            alert("aplicacion cerrada");
        }
    }

    instalar(){
    if(this.instalada == false){
        this.instalada = true;
        alert("aplicacion instalada");

         }
    } 
    desinstalar(){
        if(this.instalada == true){
            this.instalada = false;
            alert("aplicacion desinstalada");
    
             }
        } 

}

app = new App ("1","10","250g");

app.instalar()
app.abrir();
app.cerrar();
app.desinstalar();

