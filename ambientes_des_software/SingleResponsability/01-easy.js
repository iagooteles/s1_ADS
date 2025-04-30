/**
 * Exercício 1:
 * Refatore a função abaixo em múltiplas funções, cada uma com responsabilidade única.
 */

// DONE //

const usuario = {
  "nome": "iago",
  "email": "@algo.com"
}

function processarDadosUsuario(usuario) {
  // Validação
  checarUsuarioExistente(usuario);

  // Formatação
  const {nomeFormatado, emailFormatado} = formatarDadosUsuario(usuario);

  // Persistência
  showFeedbackMsg(nomeFormatado, emailFormatado);

  return {
    sucesso: true,
    usuario: { nome: nomeFormatado, email: emailFormatado },
  };
}

function checarUsuarioExistente(usuario) {
  if (!usuario.nome || !usuario.email) {
    return { sucesso: false, mensagem: "Nome e email são obrigatórios" };
  }
  return true;
}

function formatarDadosUsuario(usuario) {
  const nomeFormatado = usuario.nome
    .trim()
    .toLowerCase()
    .split(" ")
    .map((parte) => parte.charAt(0).toUpperCase() + parte.slice(1))
    .join(" ");

  const emailFormatado = usuario.email.trim().toLowerCase();

  return {nomeFormatado, emailFormatado};
}

function showFeedbackMsg(nomeFormatado, emailFormatado) {
  console.log(`Salvando usuário: ${nomeFormatado}, ${emailFormatado}`);
}

processarDadosUsuario(usuario)