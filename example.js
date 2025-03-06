// Tipagem fraca: Permite conversões implícitas entre tipos diferentes.
// Tipagem dinâmica: O tipo da variável pode mudar em tempo de execução.

// Exemplo prático para demonstrar tipagem fraca:
let x = "5"; // String
let y = 2;
console.log(x + y); // "52" (concatenação, não soma)

// Exemplo prático para demonstrar tipagem dinâmica:
let a = 10;
console.log(typeof a); // "number"
a = "Agora sou uma string!";
console.log(typeof a); // "string"

// Paradigmas de Programação (3:30 - 6:30)
// Explicar que JavaScript suporta múltiplos paradigmas, incluindo imperativo, funcional e orientado a objetos.
// Escolher o paradigma funcional e justificar a escolha.

// readline é um módulo nativo do Node.js que permite interagir com o terminal
// O readline é útil para criar interfaces de linha de comando (CLI) em Node.js
import readline from "readline";

// Configuração do readline para interagir com o terminal //
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let tasks = [];

// Ao ir criando as funções, explicar porque o javascript é uma liguagem de paradigma funcional //
function showMenu() {
  console.log("\n/// To-Do List ///");
  console.log("1. Adicionar Tarefa");
  console.log("2. Listar Tarefas");
  console.log("3. Sair");
}

function addTask() {
  // rl.question é uma função assíncrona que recebe uma string e uma função de callback Essa função de callback é chamada quando o usuário digita algo e aperta enter
  // O que o usuário digitou é passado como argumento para a função de callback Nesse caso, o que o usuário digitou é a tarefa que ele quer adicionar
  // Essa tarefa é adicionada ao array de tarefas
  rl.question("Digite a nova tarefa: ", (task) => {
    tasks.push(task);
    console.log(`Tarefa "${task}" adicionada com sucesso!`);
    showMenu();
    askOption();
  });
}

function listTasks() {
  console.log("\n=== Tarefas ===");
  if (tasks.length === 0) {
    console.log("Nenhuma tarefa cadastrada.");
  } else {
    tasks.forEach((task, index) => {
      console.log(`${index + 1}. ${task}`);
    });
  }
  showMenu();
  askOption();
}

function askOption() {
  rl.question("\nEscolha uma opção: ", (option) => {
    switch (option) {
      case '1':
        addTask();
        break;
      case '2':
        listTasks();
        break;
      case '3':
        console.log("Saindo...");
        // fecha a interface do readline, logo o programa não vai mais aguardar entradas do usuário
        rl.close();
        break;
      default:
        console.log("Opção inválida. Tente novamente.");
        showMenu();
        askOption();
    }
  });
}

showMenu();
askOption();
