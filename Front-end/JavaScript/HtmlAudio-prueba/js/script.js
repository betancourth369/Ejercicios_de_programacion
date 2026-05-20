
let arraysongs = ["./music/Pink Floyd - Wish You Were Here (320).mp3", "./music/The Cure - Boys Don't Cry (Official Music Video) [HD] (320).mp3", "./music/The Doors - People Are Strange (Official Audio) (320).mp3"];
let repSongs = 0;
let player = document.getElementById("musicPlayer");
player.src = arraysongs[repSongs];


document.getElementById("btnPause").addEventListener("click", function () {
    player.pause();
});

document.getElementById("btnStart").addEventListener("click", function () {
    player.play();
});

document.getElementById("btnNext").addEventListener("click", function () {
    player.pause();
    repSongs++;
    player.src = arraysongs[repSongs];
    player.play();

});

document.getElementById("btnPrevious").addEventListener("click", function () {
    player.pause();
    repSongs--;
    player.src = arraysongs[repSongs];
    player.play();

});






console.log(player);

