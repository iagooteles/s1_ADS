// Exercício 1: trabalhando com fatoriais
// • Versão imperativa: implemente a função “fatorialImperativo” que recebe um número (“n”)
// e calcula o fatorial e “n” utilizando um loop.
// • Versão funcional: implemente a função “fatorialFuncional” que recebe um número (“n”) e
// calcula o fatorial e “n” utilizando chamadas de funções.

function fatorialImperativo(n) {
    let result = n;

    for  (let i = n - 1 ; i > 0; i--) {
        result *= i
    }

    return result;
}

function fatorialFuncional(n) {
    const result = n;

    return n === 1 ? result : result * fatorialFuncional(n - 1);
}

// const resultado = fatorialImperativo(5);
// console.log(resultado);
// const resultado = fatorialFuncional(3);
// console.log(resultado);


// Exercício 2: trabalhando com Fibonacci
// • Versão imperativa: implemente a função “fibonacciImperativo” que recebe um número
// (“n”) e calcula o fatorial e “n” utilizando um loop.
// • Versão funcional: implemente a função “fibonacciFuncional” que recebe um número (“n”)
// e calcula o fatorial e “n” utilizando chamadas de funções.

function fibonacciImperativo(n) {
    if (n === 0) return 0;
    if (n === 1) return 1;

    let a = 0, b = 1, result;
    for (let i = 2; i <= n; i++) {
        result = a + b;
        a = b;
        b = result;
    }
    return result;
}

function fibonacciFuncional(n) {
    if (n === 1 || n === 2) {
        return 1;
    } else {
        return fibonacciFuncional(n - 1) + fibonacciFuncional(n - 2);
    }
}

console.log(fibonacciFuncional(1))
console.log(fibonacciFuncional(2))
console.log(fibonacciFuncional(3))
console.log(fibonacciFuncional(4))
console.log(fibonacciFuncional(5))
console.log(fibonacciFuncional(6))

// Exercício 3: trabalhando com números pares e seus quadrados
// • Versão imperativa: implemente a função “somaDosQuadradosImperativo” que recebe um
// array de números (“arrayN”) e calcula a soma dos quadrados de todos os números pares
// utilizando um loop.
// • Versão funcional: implemente a função “somaDosQuadradosFuncional” que recebe um
// array de números (“arrayN”) e calcula a soma dos quadrados de todos os números pares
// contidos no array utilizando chamadas de funções.
// Exercício 4: para pensar e discutir
// • Quais são as principais diferenças entre a abordagem imperativa e a funcional?
// • Em qual situação cada abordagem é mais adequada?
// • Qual paradigma é mais palatável/legível para você? Por quê?