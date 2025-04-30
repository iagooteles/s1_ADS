/**
 * Exercício 2:
 * Divida a função abaixo em múltiplas funções para seguir o princípio de responsabilidade única.
 */

// DONE

vendas = [1, 2, 3, 4, 5, 6, 7, 10]

function gerarRelatorio(vendas) {
  const {totalVendas, maiorVenda, menorVenda} = processarVendas(vendas);

  const media = calcularMedia(vendas, totalVendas);

  exibirRelatorio(totalVendas, media, maiorVenda, menorVenda);
}

function processarVendas(vendas) {
  let totalVendas = 0;
  let maiorVenda = 0;
  let menorVenda = Infinity;

  for (const venda of vendas) {
    totalVendas += venda;
    if (venda > maiorVenda) maiorVenda = venda;
    if (venda < menorVenda) menorVenda = venda;
  }

  return {totalVendas, maiorVenda, menorVenda};
}

function calcularMedia(vendas, totalVendas) {
  return totalVendas / vendas.length;
}

function exibirRelatorio(totalVendas, media, maiorVenda, menorVenda) {
  console.log("=== Relatório de Vendas ===");
  console.log(`Total: R$ ${totalVendas.toFixed(2)}`);
  console.log(`Média: R$ ${media.toFixed(2)}`);
  console.log(`Maior venda: R$ ${maiorVenda.toFixed(2)}`);
  console.log(`Menor venda: R$ ${menorVenda.toFixed(2)}`);
}

gerarRelatorio(vendas);