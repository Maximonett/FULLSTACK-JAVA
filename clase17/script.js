function escribirTexto2(){
    var local="Variable Local";
    console.log("imprimo por primera vez una variable " +local);
}

escribirTexto2();

//variable Local 2.0

function escribirTexto3()
{
    var habilitado=true;
    if(habilitado)
    {   
        // let y const tienen el mismo scout 
        let bloque="Alumno habilitado para cursar"; //si esta variable la creo con let y me va a servir solo para el bloque del IF
        console.log(bloque); 
    }
    console.log(bloque);    
}

escribirTexto3();


