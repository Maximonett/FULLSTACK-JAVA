//crear y guardar datos

localStorage.setItem('nombre','Nicolas');
localStorage.setItem('edad','43');


var nombreUsuario=localStorage.getItem('nombre');
var nombreEdad=localStorage.getItem('edad');

console.log(nombreUsuario);
console.log(localStorage.getItem('edad'));

localStorage.setItem('edad','45');
console.log(localStorage.getItem('edad'));