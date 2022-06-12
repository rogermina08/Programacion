class Animal {
    constructor(especie,edad,color){
        this.especie = especie;
        this.edad = edad;
        this.color = color
        this.info = `soy ${this.especie}, tengo ${this.edad} años
        y soy de color ${this.color}`;
    }
    verInfo(){
        document.write(this.info + "<br>")
    }
}

class Perro extends Animal {
    constructor (especie,edad,color,raza){
        super(especie,edad,color);
        this.raza = raza;
    }
    ladrar(){
        alert("wow, wow");
    }
}

let perro = new Perro("perro",10,"blanco","doberman");
let gato = new Animal("gato",2,"negro");
let pajaro = new Animal("loro",1,"verde");

//document.write(perro.informacion +"<br>" + gato.informacion + "<br>" + pajaro.informacion);

perro.ladrar();
perro.verInfo();
gato.verInfo();
pajaro.verInfo();
