const persona = {
    nombre: "pablo",
    apellido: "betancourth",
    edad: 30,
    ciudad: "armenia"

}

console.log(`Hola mi nombre es ${persona.nombre} y soy de ${persona.ciudad}`);
/////////////////////////////////////////////////////////////////////////////////////

const coche = {
    marca: "toyota",
    modelo: "prado"

}
console.log(coche);//valor inicial

coche.modelo = "txl";
console.log(coche);//cambio el valor de la propiedad

coche.color = "negro";
console.log(coche);//agregamos una nueva propiedad
////////////////////////////////////////////////////////////////////////////////////

const smartphone = {
    especificaciones: {
        ram: 64,
        almacenamiento: "2 tb",
        procesador: "i9"
    }
}

console.log(smartphone.especificaciones.ram);
////////////////////////////////////////////////////////////////////////////////////////

const estudiantes = [
    { nombre: "pablo", edad: 30 },
    { nombre: "pepito", edad: 25 },
    { nombre: "conchita", edad: 20 }

];
estudiantes.forEach(element => {
    console.log(element.nombre);
    /////////////////////////////////////////////////////////////////////////////////////

    const productos =

