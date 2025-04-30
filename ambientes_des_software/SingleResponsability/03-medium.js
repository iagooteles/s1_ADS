/**
 * Exercício 3:
 * Refatore esta função para seguir o princípio de responsabilidade única,
 * separando as preocupações de obtenção de dados, validação, transformação e apresentação.
 */

// DONE 

async function exibirDadosUsuario(id) {
  try {
    const resposta = fetchDadosUsuario(id);
    const usuario = resposta.json();

    if (checarDadosCompletos(usuario)) {
      return;
    }

    const enderecoFormatado = formatarEndereco(usuario);

    injetarDadosNoHTML(usuario, enderecoFormatado);
    stopLoader();
    mostrarDadosUsuario();
  } catch (erro) {
    console.error("Falha ao processar dados do usuário:", erro);
  }
}

async function fetchDadosUsuario(id) {
  const resposta = await fetch(`https://api.exemplo.com/usuarios/${id}`);
  if (!resposta.ok) {
    console.error("Erro ao buscar dados do usuário");
    return;
  }

  return resposta;
}

function checarDadosCompletos(usuario) {
  if (!usuario.nome || !usuario.email || !usuario.endereco) {
    console.error("Dados do usuário incompletos");
    return false;
  }
  return true;
}

function formatarEndereco(usuario) {
  return `${usuario.endereco.rua}, ${usuario.endereco.numero} - ${usuario.endereco.cidade}/${usuario.endereco.estado}`
}

function injetarDadosNoHTML(usuario, enderecoFormatado) {
  const elementoNome = document.getElementById("nome-usuario");
  const elementoEmail = document.getElementById("email-usuario");
  const elementoEndereco = document.getElementById("endereco-usuario");

  elementoNome.textContent = usuario.nome;
  elementoEmail.textContent = usuario.email;
  elementoEndereco.textContent = enderecoFormatado;
}

function stopLoader() {
  document.getElementById("carregando").style.display = "none";
}

function mostrarDadosUsuario() {
  document.getElementById("dados-usuario").style.display = "block";
}
