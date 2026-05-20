function sumar() {
    let numberA = document.getElementById("numA").value;
    let numberB = document.getElementById("numB").value;
    let total = Number(numberA) + Number(numberB);

    document.getElementById("total").innerHTML = total;
    // console.log(total)

}

function resta() {
    let numberA = document.getElementById("numA").value;
    let numberB = document.getElementById("numB").value;
    let total = Number(numberA) - Number(numberB);

    document.getElementById("total").innerHTML = total;

}

function multi() {
    let numberA = document.getElementById("numA").value;
    let numberB = document.getElementById("numB").value;
    let total = Number(numberA) * Number(numberB);

    document.getElementById("total").innerHTML = total;

}

function divi() {
    let numberA = document.getElementById("numA").value;
    let numberB = document.getElementById("numB").value;
    let total = Number(numberA) / Number(numberB);

    document.getElementById("total").innerHTML = total;

}

function resto() {
    let numberA = document.getElementById("numA").value;
    let numberB = document.getElementById("numB").value;
    let total = Number(numberA) % Number(numberB);

    document.getElementById("total").innerHTML = total;

}

