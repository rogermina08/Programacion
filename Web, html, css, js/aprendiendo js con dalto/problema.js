materias = {
    fisica: ["perez","pedro", "juan", "roger", "maria", "vane"],
    programacion: ["dalto","pedro", "juan", "roger", "camilo", "vane"],
    logica: ["hernandez","pedro", "juan", "julian", "maria", "vane"],
    quimica: ["rodriguez","pedro", "ricardo", "roger", "victor", "vane"]
}

const inscribir = (alumno,materia) =>{
    personas = materias[materia];
    personas.shift();
    alumnos = personas;
    if (alumno.length >= 2){
        document.write (`lo sineto ${alumno}, las clases de ${materia} ya estan llenas mi rey`);
    }

}

inscribir ("pedrito","fisica");