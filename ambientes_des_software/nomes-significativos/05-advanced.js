/**
 * Exercício 5: Classes com nomes não representativos e métodos inconsistentes
 * Problema: A classe abaixo tem nomes vagos e métodos com convenções de nomenclatura inconsistentes.
 */
class Gerenciador {
  constructor(configuration) {
    this.config = configuration;
    this.itens = [];
  }

  AddItem(item) {
    // Adiciona um item à coleção
    this.itens.push(item);
  }

  getItem(id) {
    // Retorna um item da coleção pelo ID
    return this.itens.find((item) => item.id === id);
  }

  updateItem(id, novosValores) {
    // Atualiza um item pelo ID
    const index = this.itens.findIndex((item) => item.id === id);
    if (index !== -1) {
      this.itens[index] = { ...this.itens[index], ...novosValores };
      return true;
    }
    return false;
  }

  deleteItem(id) {
    // Remove um item pelo ID
    const index = this.itens.findIndex((item) => item.id === id);
    if (index !== -1) {
      this.itens.splice(index, 1);
      return true;
    }
    return false;
  }

  fetch_all(sort = false) {
    // Retorna todos os itens, opcionalmente ordenados
    if (sort) {
      return [...this.itens].sort((a, b) => a.id - b.id);
    }
    return [...this.itens];
  }

  save_data() {
    // Salva os dados conforme configuração
    if (this.config.method === "local") {
      localStorage.setItem(this.config.key, JSON.stringify(this.itens));
    } else if (this.config.method === "server") {
      // Código para salvar no servidor
    }
  }
}
