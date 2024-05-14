const array= new Array("a","b","c");
var array2= new Array("a",1,"c",true,false);

console.log(array2[3]);
console.log(array[2]);


//Recorrer un arreglo

function Recorrer(vector) {
    for (let i = 0; i < vector.length; i++) {
        console.log(vector[i]);
    }
}

//metodos de arrays

console.log(array2.pop()); //elimina un elemento del final y ahora queda de 1 posicion menos

console.log(array2.push("max"));

Recorrer(array2);


const numeros=[1,2,3,4,5];

const numerosMultiplicados = numeros.map(numero=>numero*2); //funcion flecha

console.log(numerosMultiplicados);
