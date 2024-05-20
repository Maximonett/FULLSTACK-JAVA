//crear un nuevo elemento

var nuevoParrafo=document.createElement("p");

//crear 


var texto=document.createTextNode("hola mundo.....");

//añadir el texto al elemento

nuevoParrafo.appendChild(texto);

var nuevo=document.getElementById("nuevo");
nuevo.appendChild(nuevoParrafo);

