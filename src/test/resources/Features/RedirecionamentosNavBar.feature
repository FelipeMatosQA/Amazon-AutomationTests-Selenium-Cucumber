# language: pt
Funcionalidade: Redirecionamentos dos botoes de navegacao

  Eu sou um usuario e quero navegar pela barra do menu de navegacao.

 Esquema do Cenario: Testando botao carrinho

    Dado que eu estou na tela inicial
    Quando eu clico no botao carrinho
    Entao sou redirecionado para a tela e o titulo e validado "<titulo>"

   Exemplos:

   |               titulo                  |
   |  Carrinho de compras da Amazon.com    |


  Cenario: Testando botao Venda na Amazon

    Dado que eu estou na tela inicial
    Quando eu clico no botao Venda na amazon
    Entao sou redirecionado para a tela e o titulo e validado "Comece a Vender na Amazon | Amazon.com.br "



  Esquema do Cenario: Testando botao Mais Vendidos

    Dado que eu estou na tela inicial
    Quando eu clico no Mais Vendidos
    Entao sou redirecionado para a tela e o titulo e validado "<titulo>"

    Exemplos:

      |                             titulo                                 |
      |  Amazon.com.br Mais Vendidos: Os itens mais populares na Amazon    |



  Esquema do Cenario: Testando botao Prime

    Dado que eu estou na tela inicial
    Quando eu clico no botao Prime
    Entao sou redirecionado para a tela e o titulo e validado "<titulo>"

    Exemplos:

      |             titulo              |
      |  Amazon.com.br: Amazon Prime    |


  Esquema do Cenario: Testando botao Ofertas do dia

    Dado que eu estou na tela inicial
    Quando eu clico no botao Ofertas do Dia
    Entao sou redirecionado para a tela e o titulo e validado "<titulo>"

    Exemplos:

      |             titulo              |
      |  Ofertas e Promoções \| Amazon.com.br   |










