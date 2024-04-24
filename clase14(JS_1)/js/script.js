var miDato="2500";

console.log("El valor de la variable es: "+miDato);

console.log("El tipo de la variable es: " +typeof(miDato));

/*operadores aritmeticos

+
*
*
/
%


*/
var miDato2=2;

console.log("El valor de la suma es: "+ (miDato + miDato2));

/*
operadores logicos
>
<
>=
<=
!= distinto de 
= asignacion
== igualacion
=== deben coincidir valor y tipo de dato
*/

/*function imprimirVariable(){
    // obtengo el elemento
    var elemento=document.getElementById("resultado");
    //agrego el valor a  la avriable
    elemento.innerHTML=miDato;
}*/
var miDatoConvertido=parseInt(miDato); //cambio de texto a number

console.log("El valor de la suma es: " + (miDato - miDato2));
console.log("El valor de la suma es: " + (miDatoConvertido + miDato2));
console.log("El valor de la suma es: " + (parseInt(miDato) + miDato2));

var nota=9;

function imprimirVariable(){
    // obtengo el elemento
    var elemento=document.getElementById("resultado");
    if (nota>=7){
        elemento.innerHTML= nota + " El alumno entra en promocion..";
    }
    else if (nota>=4 && nota<=6){
        elemento.innerHTML= nota + " El alumno esta aprobado..";
    }
    else{
        elemento.innerHTML= nota + " El alumno esta desaprobado..";
    }
    
    //agrego el valor a  la avriable
}



function imprimirVariableDos(){
    nota=4;
    trabajo=1;
    
    // obtengo el elemento
    var elemento=document.getElementById("resultado");
    if (nota>=7 || (trabajo>=8))//
    {
        elemento.innerHTML= nota + " El alumno entra en promocion..";
    }
    else
    { 
        elemento.innerHTML= nota + " Te fuiste al tacho";
    }
}

/* Tabla de verdad
and ** &&
v+v =v
v+f=f
f+v=f
f+f=f

or = ||
v+v =v
v+f=v
f+v=v
f+f=f
*/


function imprimirVariableTres(){
    var nota2=6;
    var elemento=document.getElementById("resultado");
    if(nota2!=7)
    {
        elemento.innerHTML="el resultado de la nota no es 7";
        console.log("el resultado de la nota no es 7");
    }
    else
    {
        elemento.innerHTML="el resultado de la nota es 7";
        console.log("el resultado de la nota es 7");
    }

}