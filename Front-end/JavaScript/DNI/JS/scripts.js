function calcularLetra() {
    const letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    let numeroDni = document.getElementById("numeroDNI").value;
    console.log(numeroDni);

    let index = numeroDni % 23;
    console.log(index);

    const letra = letras.charAt(index);
    console.log(letra);

    document.getElementById("letra").innerHTML = letra;


}