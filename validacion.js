document.getElementById("miFormulario").addEventListener("submit", function(event) {
    event.preventDefault();
    
    document.getElementById('nombreI').value = nombre;
    document.getElementById('apellidoI').value = apellido;
    document.getElementById('emailI').value = mail;
    document.getElementById('passwordI').value = password;
    document.getElementById('fechaNacimiento').value = date;
    
    var nombreError = document.getElementById("nombreError");
    var apellidoError = document.getElementById("apellidoError");
    var passwordError = document.getElementById("passwordError");
    var fechaNacimientoError = document.getElementById("fechaNacimientoError");
    var emailError = document.getElementById("emailError");
    var regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    nombreError.textContent = "";
    emailError.textContent = ""; //  se establece el texto vacío en el elemento de error de email y de todos los demas
    apellidoError.textContent = "";
    passwordError.textContent="";
    fechaNacimientoError.textContent="";


    if (nombre.trim() === "") {
        nombreError.textContent = "El nombre no puede estar vacío";
        return;
    }
    if (apellido.trim() === "") {
        nombreError.textContent = "El apellido no puede estar vacío";
        return;
    }
    if (mail.trim() === "") {
        nombreError.textContent = "El mail no puede estar vacío";
        return;
    }
    if (password.trim() === "") {
        nombreError.textContent = "La contraseña no puede estar vacía";
        return;
    }

    if (!regexEmail.test(email)) {
        emailError.textContent = "El email no es válido"; // Corregido: se cambió el mensaje de error
        return;
    }

    alert("El formulario se envió con éxito");
});