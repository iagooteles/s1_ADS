/**
 * Exercício 2: Constantes mágicas
 * Problema: O código abaixo contém valores numéricos "mágicos" e métodos e outros valores sem significado claro.
 */
function calcularPrecoFinal(produto) {
  let precoBase = produto.preco;
  const descontoBaixo = 0.94;
  const descontoMedio = 0.92;
  const descontoAlto = 0.9;

  if (produto.tipo === 1) {
    return precoBase * descontoMedio;
  } else if (produto.tipo === 2) {
    return precoBase * descontoBaixo;
  } else if (produto.tipo === 3) {
    return precoBase * descontoAlto;
  } else {
    return precoBase;
  }
}

const produto1 = {preco: 10, tipo: 1}

console.log(calcularPrecoFinal());
