cargarDatosEnTabla();//Funcion para crear la TABLA (definida abajo ↓)

document.getElementById("btnGuardar").addEventListener('click', () => {

    const Isbn = document.getElementById("Isbn").value;
    const Titulo = document.getElementById("Titulo").value;
    const Autor = document.getElementById("Autor").value;
    const Genero = document.getElementById("Genero").value; //traer los datos que introduce el usuario
    const Cantidad = document.getElementById("Cantidad").value;
    const Psinopsis = document.getElementById("Psinopsis").value;

    const libro = {
        Isbn: Isbn,
        Titulo: Titulo,// objeto donde agrupo toda la informacion que me da el usuario
        Genero: Genero,
        Cantidad: Cantidad,
        Psinopsis: Psinopsis
    };


    const libros = localStorage.getItem("libros"); //variable donde se va guardar la clave existente en el localStorage

    //¿ es "libros" una variable vacia?
    if (libros == null) {
        const arrayLibros = [];//si "libros" esta vacia entro al bloque de code y creo un [] vacio donde se guardaran lo libros 

        arrayLibros.push(libro);//hago un push al array con el objeto libro que contiene la informacion introducida por el usuario = [libro]

        localStorage.setItem("libros", JSON.stringify(arrayLibros));//guardo o actualizo la clave "libros" y su valor = "libros" ,[libro] parseada a string

        //El otro caso, aqui "libros" ya existe y contiene la clave
    } else {
        const arrayLibros = JSON.parse(libros);// 

        arrayLibros.push(libro);

        localStorage.setItem("libros", JSON.stringify(arrayLibros));
    }

    cargarDatosEnTabla();

});

function cargarDatosEnTabla() {
    const cuerpoTabla = document.querySelector("#tablaLibros tbody");

    cuerpoTabla.innerHTML = '';

    const librosGuardados = localStorage.getItem("libros");

    if (librosGuardados != null) {

        arrayLibros = JSON.parse(librosGuardados);

        arrayLibros.forEach(function (libro) {
            const fila = document.createElement('tr');

            fila.innerHTML = `
                <td>${libro.Isbn}</td>
                <td>${libro.Titulo}</td>
                <td>${libro.autor ? libro.Autor : ''}</td>
                <td>${libro.Genero}</td>
                <td>${libro.Psinopsis}</td>
                
            `;

            cuerpoTabla.appendChild(fila);
        });

    } else {
        const fila = document.createElement('tr');

        fila.innerHTML = `<td colspan="5">Ups!!, No tenemos existencias de el libro que buscas</td>`;

        cuerpoTabla.appendChild(fila);
    }
}