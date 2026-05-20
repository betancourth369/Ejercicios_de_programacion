function saludar() {
    let saludo = document.getElementById("saludo").value; //recibo el parametro desde el input html
    console.log(saludo);
    const respuesta = saludo;//variable para recoger el parametro recibido

    document.getElementById("respuesta").innerHTML = respuesta;//devuelvo el parametro al html 

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function interruptor() {
    let cambio = document.getElementById("cuadrado"); //recibo los parametros y los guardo en esta variable
    let colorActual = getComputedStyle(cambio).backgroundColor //uso "getCompu..." para extraer los valores css y guardarlos aqui

    if (colorActual === "rgb(255, 255, 255)") { //pregunto si ese es color para poder entrar al IF
        cambio.style.backgroundColor = "yellow";
    } else {
        cambio.style.backgroundColor = "white";
    }

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

let contador = 0;

function aumenta() {
    contador++;

    document.getElementById("parrafos").innerHTML = contador;
    // console.log(parrafos);

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function azul() {
    let cambioP = document.getElementById("parrafo").style.color = "blue";

}


function grande() {
    let cambioP = document.getElementById("parrafo").style.fontSize = "30px";

}


function sub() {
    let cambioP = document.getElementById("parrafo").style.textDecoration = "underline";

}

function dinamic(propiedad, valor) {
    let p = document.getElementById("parrafo");
    p.style[propiedad] = valor;
    if (p.style[propiedad] === valor) {
        p.style[propiedad] = "";
    } else {
        p.style[propiedad] = valor;
    }

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////





