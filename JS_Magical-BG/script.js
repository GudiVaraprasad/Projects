
function changecolor(id) {
  document.body.style.background = document.getElementById(id).innerHTML;
}

document.addEventListener('contextmenu', event => event.preventDefault());