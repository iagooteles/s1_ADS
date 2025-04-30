/**
 * Exercício 1: 
 * Refatore o código abaixo substituindo os números mágicos por constantes com nomes significativos.
 */

function calcularDesconto(valor) {
  const limite = 100;
  const desconto10 = 0.1;
  const desconto5 = 0.05;

  if (valor > limite) {
    return valor * desconto10;
  }
  return valor * desconto5;
}
