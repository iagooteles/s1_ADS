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
  console.log("3. Remover Tarefa");
  console.log("4. Sair");
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

function removeTask() {
  rl.question("Digite o número da tarefa a ser removida: ", (taskNumber) => {
    const index = parseInt(taskNumber) - 1;
    if (index >= 0 && index < tasks.length) {
      //array.splice(start, deleteCount);
      // hovear o splice para ver a documentação
      const removedTask = tasks.splice(index, 1);
      console.log(`Tarefa "${removedTask[0]}" removida com sucesso!`);
    } else {
      console.log("Número de tarefa inválido.");
    }
    showMenu();
    askOption();
  });
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
        removeTask();
        break;
      case '4':
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
