var zoom = function(){
    var thumb = document.getElementById("thumb");
    //thumb.setAttribute("class","thumb grande");

    if(thumb.className == "thumb"){
        thumb.className = "thumb grande";
    } else{
        thumb.className = "thumb";
    }
}