let animales = ["gato","perro","tortuga","paloma","tigre"];

for (animal in animales) {
        document.write(animal + "<br>");
}

document.write("<br>");

for (animal of animales) {
    document.write(animal + "<br>");
}