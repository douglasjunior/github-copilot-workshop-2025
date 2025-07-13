function exemploMalEscrito() {
  let numeros = [];
  for (let i = 0; i < 10; i++) {
    numeros[i] = i + 1;
  }
  for (let i = 0; i < 10; i++) {
    if (numeros[i] % 2 === 0) {
      console.log("O número " + numeros[i] + " é par");
    } else {
      console.log("O número " + numeros[i] + " não é par");
    }
  }
  let soma = 0;
  for (let i = 0; i < 10; i++) {
    soma = soma + numeros[i];
  }
  console.log("A soma é " + soma);
}

exemploMalEscrito();
