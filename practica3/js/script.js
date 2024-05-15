fetch('https://randomuser.me/api/')
    .then(response => response.json())
    .then(data => {
        const usuario = data.results[0];
        let nombre = usuario.name.first;
        let apellido = usuario.name.last;
        let mail = usuario.email;
        let password = usuario.login.password;

        const first = document.getElementById('nombre');
        first.innerHTML = `${nombre}`;
        const last = document.getElementById('apellido');
        last.innerHTML = `${apellido}`;
        const email = document.getElementById('email');
        email.innerHTML = `${mail}`;
        const pass = document.getElementById('password');
        pass.innerHTML = `${password}`;

    })
    .catch(error => {
        console.log("No se obtuvieron datos");
    }
    );