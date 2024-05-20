async function obtenerUsuarioAleatorio() {
    try {
        let respuesta = await fetch('https://randomuser.me/api/');
        let datos = await respuesta.json();
        return datos.results[0];
    } catch (error) {
        throw new Error("Error en conexión: " + error.message);
    }
}

function agregarUsuario(usuario) {
    let contenedorUsuario = document.getElementById("usuarios");
    let nuevoUsuarioDiv = document.createElement("div");

    nuevoUsuarioDiv.innerHTML = `
        <img src="${usuario.picture.medium}" alt="Foto de usuario"></img>
        <p>Nombre: ${usuario.name.first}</p>
        <p>Apellido: ${usuario.name.last}</p>
        <p>E-mail: ${usuario.email}</p>
    `;

    contenedorUsuario.appendChild(nuevoUsuarioDiv);
}

let obtenerUsuarioBtn = document.getElementById("obtenerUsuarioBtn");
obtenerUsuarioBtn.addEventListener('click', async () => {
    try {
        let usuario = await obtenerUsuarioAleatorio();
        agregarUsuario(usuario);
    } catch (error) {
        console.log("Hay un error:", error);
    }
});