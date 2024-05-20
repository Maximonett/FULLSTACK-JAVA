document.getElementById("miFormulario").addEventListener("submit", function(event) {
    event.preventDefault();

    // Obtener valores de los campos del formulario
    var nombre = document.getElementById('nombreI').value.trim(); //.trim quita espacios en blanco
    var apellido = document.getElementById('apellidoI').value.trim();
    var mail = document.getElementById('emailI').value.trim();
    var password = document.getElementById('passwordI').value.trim();
    var date = document.getElementById('fechaNacimiento').value.trim();

    // Obtener referencias a los elementos de error
    var nombreError = document.getElementById("nombreError");
    var apellidoError = document.getElementById("apellidoError");
    var emailError = document.getElementById("emailError");
    var passwordError = document.getElementById("passwordError");
    var fechaNacimientoError = document.getElementById("fechaNacimientoError");

    var regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // var regexPassword= /^(?=.*[\d])(?=.*[!@#$%^&*])[\w!@#$%^&*]{6,16}$/;

    // Limpiar mensajes de error
    nombreError.textContent = "";
    apellidoError.textContent = "";
    emailError.textContent = "";
    passwordError.textContent = "";
    fechaNacimientoError.textContent = "";

    // Validar cada campo
    if (nombre === "") {
        nombreError.textContent = "El nombre no puede estar vacío";
        return;
    }
    if (apellido === "") {
        apellidoError.textContent = "El apellido no puede estar vacío";
        return;
    }
    if (mail === "") {
        emailError.textContent = "El email no puede estar vacío";
        return;
    }
    if (!regexEmail.test(mail)) {
        emailError.textContent = "El email no es válido";
        return;
    }
    //if (!regexPassword.test(mail)) {
    //  passwordErrorError.textContent = "La contraseña no es válida";
    //return;
    //  }
    if (password === "") {
        passwordError.textContent = "La contraseña no puede estar vacía";
        return;
    }
    if (date === "") {
        fechaNacimientoError.textContent = "La fecha de nacimiento no puede estar vacía";
        return;
    }

    alert("El formulario se envió con éxito");
});