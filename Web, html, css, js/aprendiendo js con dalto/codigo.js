dineroCofla = prompt("cuanto dinero tienes Cofla?");
if (dineroCofla >= 0.6 && dineroCofla < 1){
    alert("comprate el helado de agua");
}

if (dineroCofla >= 1 && dineroCofla < 1.6){
    alert("comprate el helado de crema");
}

if (dineroCofla >= 1.6 && dineroCofla < 1.7){
    alert("comprate el helado de heladix");
}

if (dineroCofla >= 1.7 && dineroCofla < 1.8){
    alert("comprate el helado de conito");

}if (dineroCofla >= 1.8 && dineroCofla < 2.9){
    alert("comprate el helado de conazo");
}
else if(dineroCofla >= 2.9){
    alert("helado con confites o el tarro de 1/4")
} else {
    alert("Lo siento no te alcanza ");
}