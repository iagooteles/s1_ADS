/**
 * Exercício 3: 
 * Refatore o algoritmo de cálculo de preço, 
 * substituindo todos os números mágicos por constantes significativas.
 */

function calcularPrecoFinal(preco, quantidade) {
  let desconto = 0;

  const qntd10 = 10;
  const qntd5 = 5;
  const qntd3 = 3;
  const descontoValue15 = .15;
  const descontoValue10 = .1;
  const descontoValue5 = .05;

  const descontoExtraAcimaDe1000 = 0.93;

  if (quantidade >= qntd10) {
    desconto = descontoValue15;
  } else if (quantidade >= qntd5) {
    desconto = descontoValue10;
  } else if (quantidade >= qntd3) {
    desconto = descontoValue5;
  }

  const precoComDesconto = preco * (1 - desconto);

  if (precoComDesconto > 1000) {
    return precoComDesconto * descontoExtraAcimaDe1000;
  }

  return precoComDesconto;
}
