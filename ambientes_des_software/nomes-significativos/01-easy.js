/**
 * Exercício 1: Variáveis com nomes ruins
 * Problema: As variáveis abaixo têm nomes ruins que não comunicam sua intenção.
 */



function calcularCustoTotal(carrinhoDeCompras, descontoPadrao, pesos) {
  let valorAcumulado = 0;
  for (let i = 0; i < carrinhoDeCompras.length; i++) {
    const valorIndividual = carrinhoDeCompras[i].preco * carrinhoDeCompras[i].quantidade;
    if (carrinhoDeCompras[i].t === "alimento") {
      valorAcumulado += valorIndividual * (1 + pesos.alim);
    } else {
      valorAcumulado += valorIndividual * (1 + pesos.geral);
    }
  }
  return valorAcumulado - descontoPadrao;
}

console.log(
  calcularCustoTotal(
    [
      { preco: 10, quantidade: 2, tipo: "alimento" },
      { preco: 10, quantidade: 2, tipo: "alimento" },
    ],
    10,
    { alimento: 0.1, geral: 0.05 }
  )
);
