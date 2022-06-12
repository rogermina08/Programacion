const ObtenerInformacion = (materia) => {
    materias = {
        fisica: ["perez","pedro", "juan", "roger", "maria", "vane"],
        programacion: ["dalto","pedro", "juan", "roger", "camilo", "vane"],
        logica: ["hernandez","pedro", "juan", "julian", "maria", "vane"],
        quimica: ["rodriguez","pedro", "ricardo", "roger", "victor", "vane"]
    }
    if (materias[materia] !== undefined) {
        return [materias[materia], materia,materias];
    } else {
        return materias;
    }
}
const mostrarInformacion = (materia) => {
    let informacion = ObtenerInformacion(materia);

    if (informacion !== false) {
        let profesor = informacion[0][0];
        alumnos = informacion[0];
        alumnos.shift();
        document.write(`El profesor de  <b>${informacion[1]}</b> es: <b style = "color: blue"> ${profesor}</b><br>
            los alumnos son: <b style="color: green">${alumnos}</b><br><br>
            `);
    }
}

const cantidadDeClases = (alumno)=>{
    let informacion = ObtenerInformacion()
    let cantidadTotal = 0;
    for(info in informacion){
        if (informacion[info].includes(alumnno)){
            cantidadTotal++;
        }
    }
    return cantidadTotal;
}

mostrarInformacion("fisica");
mostrarInformacion("quimica");
mostrarInformacion("programacion");
mostrarInformacion("logica");

document.write (cantidadDeClases("juan"))