function agregarImagen()
{
    var nuevaImagen=document.createElement("img");

    nuevaImagen.src="peli_6.jpg";
    nuevaImagen.alt="Messi";

    var nuevo=document.getElementById("nuevo");
    nuevo.appendChild(nuevaimagen);
}

var btnNuevo=document.getElementById("btnNuevo"); //aca cree el boton

btnNuevo.addEventListener("click",agregarImagen);  //est es para agregar la funcion al boton