//STOCK
let productos = ["manzana", "pera", "platano", "SANDIA"];
let precios = [1.5, 2.0, 1.2, 5.0];
let stock = [10, 0, 4, 8];

//FUNTIONS

// function limpiarProductos(element) {
//     let capitalizada = element.toUpperCase();
//     console.log(capitalizada)

// }
// limpiarProductos(productos[1]);

function limpiarProductos(element) {
    element.forEach(element => {
        let letra = element[0].toUppercase();

        console.log(letra);
    });

}
limpiarProductos(productos);
