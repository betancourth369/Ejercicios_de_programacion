let arraysongs = ["./music/Pink Floyd - Wish You Were Here (320).mp3", "./music/The Cure - Boys Don't Cry (Official Music Video) [HD] (320).mp3", "./music/The Doors - People Are Strange (Official Audio) (320).mp3"];
let repSongs = 0; //indice
let player = document.getElementById("musicPlayer");
player.src = arraysongs[repSongs]; //guardo en player el array y su posicion actual.

player.addEventListener("ended", () => {//evento para detectar el final de una cancion y pasar a la OTRA
    repSongs++;//aumento para pasar a la siguiente
    console.log(repSongs);

    //¿es mi indice menor que el numero de elementos del []?
    if (repSongs < arraysongs.length) {//pregunto si mi indice es menor que la cantidad de elementos del array
        player.src = arraysongs[repSongs];//guardo en player el array y su nueva posicion actual.
        player.play();//llamo a mi funcion para que suene la cancion
    } else {
        repSongs = 0;//en caso de no cumplir con la condicion del IF mi inice vuelve al principio
        // console.log(arraysongs[repSongs]);
        player.src = arraysongs[repSongs];//guardo en player el array y su nueva posicion actual.
        // console.log(arraysongs[repSongs]);
        player.play();
    }
});



document.getElementById("btnPause").addEventListener("click", function () {
    player.pause();
});

document.getElementById("btnStart").addEventListener("click", function () {
    player.play();
});

document.getElementById("btnNext").addEventListener("click", function () {
    player.pause();
    repSongs++;//pendiente(controlar cantidad de canciones empy)
    player.src = arraysongs[repSongs];
    player.play();

});

document.getElementById("btnPrevious").addEventListener("click", function () {
    player.pause();
    repSongs--;
    player.src = arraysongs[repSongs];
    player.play();

});