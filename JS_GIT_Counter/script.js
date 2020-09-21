var code = document.querySelector(".code");
var counter = document.querySelector(".counter");


let count = 1;

setInterval(() => {

	if (count<500)
	{
		count++;
		counter.innerText = count;
	}
}, 50);

setTimeout(() => {
	code.innerText = "Git forks..";
}, 4000);

setTimeout(() => {
	code.innerText = "Git repos..";
}, 7000);

setTimeout(() => {
	code.innerText = "Git projects..";
}, 10000);

setTimeout(() => {
	code.innerText = "Github profile views..";
}, 13000);

setTimeout(() => {
	code.innerText = "Github followers..";
}, 17000);

setTimeout(() => {
	code.innerText = "Git commits..";
}, 21000);

document.addEventListener('contextmenu', event => event.preventDefault());