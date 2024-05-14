let persona={
    "nombre":"Nicolas",
    "edad":"43",
    "ciudad":"Quilmes"
};

console.log(persona.nombre);
console.log(persona.ciudad);

//json anidados

let pelicula={
    "titulo":"El caballero de la noche",
    "fechaEstreno":"2018-01-01",
    "publico":"mayores de 14",
    "director":
                {
                    "nombre":"Chritopher Nolan",
                    "Origen":"ingles",
                    "edad":"50"
                },
    "actores":["Actor1","Actor2","Actor3"],
    
};

console.log(pelicula);
console.log(pelicula.fechaEstreno);
console.log(pelicula.director.edad);
console.log(pelicula.actores[1]);