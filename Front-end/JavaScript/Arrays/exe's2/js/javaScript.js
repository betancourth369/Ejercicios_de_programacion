let numbers = [3, 8, 5, 2, 10, 7, 4];

numbers.forEach((x) => {//metodo 1
    if ((x) >= 5) {
        console.log("Aprovado")
    } else { console.log("Suspenso") }

});

numbers.forEach(function (x) {//metodo 2
    if ((x) >= 5) {
        console.log("bien")
    } else { console.log("mal") }

});
////////////////////////////////////////////////////////
let commit = ["hola", "gana dinero facil", "me gusta el post", "compralo ya"];
const prohibidas = ["dinero", "compra"];


commit.forEach((com, x) => { //metodo 1

    let contieneProhibida = false;

    for (let i = 0; i < prohibidas.length; i++) {
        if (com.indexOf(prohibidas[i]) !== -1) {
            contieneProhibida = true;
            break;
        }
    }

    if (!contieneProhibida) {
        console.log(`Comentario ${x} permitido: ${com}`);
    }
});


commit.forEach((com, x) => {//metodo 2
    if (!prohibidas.some(palabra => com.indexOf(palabra) !== -1)) {
        console.log(`Comentario ${x} permitido: ${com}`);
    }
});
//////////////////////////////////////////////////////////////////////

let precios = [45, 12, 89, 5, 24];
let minimo = precios[0];

precios.forEach((Element) => {
    if (Element < minimo) {
        minimo = Element;

    }

});
console.log(minimo);




