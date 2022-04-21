# language: pt

Funcionalidade: Fazer uma busca de credenciado
  Eu como visitante do site
  quero fazer uma pesquisa
  para encontrar a informação que procuro

  Cenário: Visualizar resultado da pesquisa
    Dado que estou no site da AgeTechnology
    Quando eu clico em funcionalidades
    E clico em Rede SocNET
    E clico em Buscar credenciados
    E preencho os campos de pesquisa
    Então eu consigo exibir seu perfil
