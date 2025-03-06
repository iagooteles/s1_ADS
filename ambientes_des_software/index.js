import readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let tasks = [];

function showMenu() {
  console.log("\n-- tasks --");
  console.log("1. Adicionar task");
  console.log("2. Listar tasks");
  console.log("3. Sair");
}

function addTask() {
  rl.question("Adicione uma task:\n", (task) => {
    tasks.push(task);
    console.log("task foi adicionada com sucesso");
    showMenu();
    askOptions();
  });
}

function listTasks() {
  console.log("\n--- tasks ---");
  if (tasks.length === 0) {
    console.log("lista vazia");
  } else {
    tasks.forEach((task, index) => {
      console.log(`${index + 1} - ${task}`);
    });
  }
  showMenu();
  askOptions();
}

function askOptions() {
  rl.question("Selecione uma opção", (op) => {
    switch (op) {
      case "1":
        addTask();
        break;
      case "2":
        listTasks();
        break;
      case "3":
        console.log("saindo...");
        rl.close();
        break;
      default:
        console.log("essa opção é invalida");
        break;
    }
  });
}

showMenu();
askOptions();