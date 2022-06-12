class Calculadora {
    constructor(){
    }

 sumar (num1,num2){
    return parseInt (num1) + parseInt(num2);
}
 restar (num1,num2){
    return parseInt (num1) - parseInt(num2);
}
 multiplicar (num1,num2){
    return parseInt (num1) * parseInt(num2);
}
 dividir  (num1,num2){
    return parseInt (num1) /  parseInt(num2);
 }
} 

const calculadora = new Calculadora();

alert("¿que operacion deseas realizar?");
let operacion = prompt("1: suma, 2: resta, 3: multiplicacion, 4: division");

if (operacion==1){
    let numero1 = prompt("ingrese el primer numero");
    let numero2 = prompt("ingrese el segundo numero");
    resultado = calculadora.sumar(numero1,numero2);
    alert("el resultado es :" + resultado);
}

if (operacion==2){
    let numero1 = prompt("ingrese el primer numero");
    let numero2 = prompt("ingrese el segundo numero");
    resultado = calculadora.restar(numero1,numero2);
    alert("el resultado es :" + resultado);
}

if (operacion==3){
    let numero1 = prompt("ingrese el primer numero");
    let numero2 = prompt("ingrese el segundo numero");
    resultado = calculadora.multiplicar(numero1,numero2);
    alert("el resultado es :" + resultado);
}

if (operacion==4){
    let numero1 = prompt("ingrese el primer numero");
    let numero2 = prompt("ingrese el segundo numero");
    resultado = calculadora.dividir(numero1,numero2);
    alert("el resultado es :" + resultado);
}