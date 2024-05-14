//calse 
//model persona

class Persona
{
    //Constructor-->function
    constructor(nombre,edad)
    {
        this.nombre=nombre;
        this.edad=edad;
    } 
    saludar()
    {
        console.log("Hola Mundo...")
    }
}

var persona1= new Persona('Max', 40); 
let persona2= new Persona('jime',35);
const persona3= new Persona('juan',24);

persona1.saludar();
console.log(persona3.nombre); 

//int -> Integer 
//float->Float
//objeto String-->pero ademas tiene funciones

