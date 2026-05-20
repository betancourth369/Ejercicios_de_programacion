// let palabra = "amigdalas";
// let contador = 0;

// console.log(palabra);

// for (let i = 0; i < palabra.length; i++) {
//     let char = palabra.charAt(i);
//     if (char == 'a') {
//         contador++

//     }

// }
// console.log("en esta palabra hay " + contador + " 'a'")

// //////////////////////////////////////////////////////////////////

// let text = "hola";
// let textInvertido = text.split('').reverse().join('');
// console.log(text);
// console.log(textInvertido);

// ////////////////////////////////////////////////////////////////////////

// let palindromas = ["ana", "casa", "radar", "agua", "a luna ese anula"];

// for (let i = 0; i < palindromas.length; i++) {
//     let invertida = palindromas[i].split('').reverse().join('');
//     if (invertida == palindromas[i]) {
//         console.log("es palindroma")
//     } else {
//         console.log("no es palindroma")

//     }

// }

// //////////////////////////////////////////////////////////////////////////////

// function reverse(string) {
//     let textInv = string.split('').reverse().join('');
//     console.log(textInv);

// }
// reverse("amigo");

/////////////////////////////////////////////////////////////////////////

// let palindroma2 = ["ana", "casa", "radar", "agua", "a luna ese anula"];
// palindroma2("A luna ese anula");

// function palindroma2(frase) {

//     frase = frase.replaceAll(" ", "").toLowerCase();
//     let reves = '';

//     for (let i = frase.length - 1; i >= 0; i--) {
//         reves = reves + frase.charAt(i);
//     }
//     if (frase === reves) {
//         console.log("es palindroma")

//     } else { console.log("no es palindroma") }


// }

// malaPalabra = ["'puto','mierda','malo','carechimba'"];

// function fuck(malaPalabra) {
//     frase = frase + malaPalabra.split('').reverse().join('');

// }




// function mayus(frase) {
//     let resultado = frase.split(' ');
//     console.log(resultado);

// }
// mayus("hola munde desde js")

cortarNombre("alberto.profesor@gmail.com");

function cortarNombre(correo) {
    let corte = correo.indexOf("@");
    // console.log(corte);
    correoCotado = correo.slice(0, corte);
    console.log(correoCotado);

}


contarVocals("perro");

function contarVocals(palabra) {
    let contador = 0;
    for (let i = 0; i < palabra.length; i++) {
        let letras = palabra.charAt(i);
        if (letras == "a") {
            contador++
        } if (letras == "e") {
            contador++
        } if (letras == "i") {
            contador++
        } if (letras == "o") {
            contador++
        } if (letras == "u") {
            contador++
        }

    }
    console.log(`En esta palabra hay: ${contador} vocales.`);
}



