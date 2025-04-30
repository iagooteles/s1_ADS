/**
 * Exercício 2: 
 * Melhore o código a seguir removendo os números mágicos.
 */

function calcularIdade(anoNascimento) {
  return new Date().getFullYear() - anoNascimento;
}

console.log(calcularIdade(1995));