

saludar();



//defincion de la funcion

function saludar()
{
    console.log("hola mundo...");
    alert("hola mundo....");
}

saludar();


function saludarConNombre(nombre) {
    console.log("Hola Mundo mi nombre es " + nombre);
    alert("Hola Mundo mi nombre es " + nombre);
}
saludarConNombre("Miguel");
saludarConNombre("Julieta");
saludarConNombre("Martina");


function sumar(valor1,valor2) 
{
    var result=(valor1+valor2);
    console.log("El resultado es "+ result);  
    alert("El resultado es "+ result);

    return result;

}
nota= sumar(2,8); 

if (nota>5) {
    console.log("aprobado");
}
else{
    console.log("desaprobado");
}


function calcular(valor1,valor2,operacion)
{

}

function div(a,b=1)   //o usa el numero que esta predeterminado o el valor que se fija  
{
    var resultado=a/b;
    console.log(resultado);    
}

div(1,9);


function saludoCompleto(nombre,apellido) {
    var nombreCompleto;

    nombreCompleto= "Felicitaciones "+ nombre+apellido+" Aprobo el curso.";
    return nombreCompleto;
}

nota= 7;

if (nota>=7) {
    console.log(saludoCompleto(maximo,simonetti));

}
