//Array

// let array = [];//array vacio
// let arrayConValores = [1, 2, 3, 4, 5, 6];//array con valores0
// let arrayConstructor = new array(); //array con constructor

//acceso mediante indice
// console.log(arrayConValores[0]);

let nombres = ["hugo", "paco", "luis", "donald", "pluto"];
console.log(nombres[2]);
////////////////////////////////////////////////////////////

let colores = ["azul", "rojo"];//creo el []
console.log(colores);
colores.push("verde");//añado el "verde" al final del []
console.log(colores);
colores.unshift("amarillo");//añado "amarillo" al principio del []
console.log(colores);
colores.pop();
console.log(colores);//elimino el ultimo elemento del ["verde"] 
///////////////////////////////////////////////////////////////////////////////

let languages = ["java", "python", "javascript"];
console.log(languages);
console.log(languages.includes("java"));
console.log(languages.includes("php"));
/*======================================================================================*/
function existe(languages) {
    if (languages.includes("java"))
        console.log("este [] contiene 'java'");

} if (!languages.includes("php")) {
    console.log("este [] no contiene 'php'")
}

existe(languages);
/////////////////////////////////////////////////////////////////////////////

let decimos = [10, 20, 30]
console.log(decimos);

const multi2 = decimos.map(num => num * 2);//metodo 1
console.log(multi2);

const multi = decimos.map(function (num) { //metodo 2
    return num * 2;
});
console.log(multi);
//////////////////////////////////////////////////////////////////////////////

let edades = [12, 18, 25, 10, 30, 16];
console.log(`edades sin filtrar: ${edades}`);

let result = edades.filter((edad) => edad > 18);//metodo 1

edades.filter(function (edad) {//metodo 2
    return edad > 18;
});

console.log(`edades filtradas : ${result}`);
///////////////////////////////////////////////////////////////////

let saludo = ["Hola", "mundo", "js"];
console.log(saludo);
let saludoSin = saludo.join(' ');
console.log(saludoSin);
///////////////////////////////////////////////////////////////////

let dato = [5, 8, -3, 10, -2];
console.log(dato);

const arreglo = dato.find((Element) => Element < 0);//metodo 1
console.log(arreglo);

const arreglo2 = dato.find(function (dato) {//metodo 2
    return dato < 0;
});
console.log(arreglo2);
/////////////////////////////////////////////////////////////////

let compra = ["uvas", "aguacates", "naranjas", "limones"];
console.log(compra);

const compraMejorada = compra.sort();
console.log(compraMejorada);
/////////////////////////////////////////////////////////////////////////

const numbers = [3, 6, 9];
console.log(numbers);

let suma = 0;
let suma2 = 0;


numbers.forEach(Element => {//( metodo 1 ) => para cada elemento de []
    suma += Element;//ejecuta esta funcion 
})
console.log(suma);

numbers.forEach(function (Element) {//metodo 2
    suma2 += Element;
});
console.log(suma2)
///////////////////////////////////////////////////////////////////////////////

let frase = "hola mundo de js";
console.log(frase);

const fraseMejorada = frase.split('').reverse().join('');
console.log(fraseMejorada);


