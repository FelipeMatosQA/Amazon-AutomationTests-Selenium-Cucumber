$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Teste.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Teste inicial",
  "description": "\r\nSou um usuário e quero acessar o site.",
  "id": "teste-inicial",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "teste-inicial;",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@Teste"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que eu estou na tela inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "TestSteps.que_eu_estou_na_tela_inicial()"
});
formatter.result({
  "duration": 28734348299,
  "status": "passed"
});
formatter.after({
  "duration": 105200,
  "status": "passed"
});
});