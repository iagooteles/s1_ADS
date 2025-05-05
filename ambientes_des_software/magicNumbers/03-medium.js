/**
 * Exercício 3: 
 * Refatore o algoritmo de cálculo de preço, 
 * substituindo todos os números mágicos por constantes significativas.
 */

// DONE

function calcularPrecoFinal(preco, quantidade) {
  let desconto = 0;

  const qntdAlta = 10;
  const qntdMedia = 5;
  const qntdBaixa = 3;
  const descontoValorMaximo = .15;
  const descontoValorMedio = .1;
  const descontoValorMinimo = .05;

  const descontoMaster = 0.93;

  if (quantidade >= qntdAlta) {
    desconto = descontoValorMaximo;
  } else if (quantidade >= qntdMedia) {
    desconto = descontoValorMedio;
  } else if (quantidade >= qntdBaixa) {
    desconto = descontoValorMinimo;
  }

  const precoComDesconto = preco * (1 - desconto);

  const valorDeBarreira = 1000;

  if (precoComDesconto > valorDeBarreira) {
    return precoComDesconto * descontoMaster;
  }

  return precoComDesconto;
}
