const alphabet = [
  'A','B','C','D','E','F',
  'G','H','I','J','K','L',
  'M','N','O','P','Q','R',
  'S','T','U','V','W','X',
  'Y','Z'
];

const form = document.forms[0];
const output = document.getElementById('output');

form.addEventListener('submit', (event) => {
    event.preventDefault();
  output.innerHTML = [... form.plaintext.value ].map(char => encrypt(char)).join('');
}
);

function encrypt(char) {
  const key = Number(form.key.value);
  if (alphabet.includes(char.toUpperCase()))
 { 
    const position = alphabet.indexOf(char.toUpperCase());
    const newPosition = (position + key)%26;
    return alphabet[newPosition] 
  }
  else { return char }
  }