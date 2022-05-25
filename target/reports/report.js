$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BuscaNoBlog.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar pesquisa no site",
  "description": "Eu como visitante do site\r\nquero fazer uma pesquisa\r\npara encontrar a informação que procuro",
  "id": "realizar-pesquisa-no-site",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar resultado da pesquisa",
  "description": "",
  "id": "realizar-pesquisa-no-site;visualizar-resultado-da-pesquisa",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da AgeTechnology",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu preencho o campo de pesquisa",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu recebo a pagina com resultado correspondente",
  "keyword": "Então "
});
formatter.match({
  "location": "buscasSoc.acessar_site()"
});
formatter.result({
  "duration": 6450885900,
  "status": "passed"
});
formatter.match({
  "location": "buscasSoc.eu_preencho_pesquisa()"
});
formatter.result({
  "duration": 496687300,
  "status": "passed"
});
formatter.match({
  "location": "buscasSoc.clico_em_pesquisar()"
});
formatter.result({
  "duration": 2007001600,
  "status": "passed"
});
formatter.match({
  "location": "buscasSoc.resultado_pesquisa()"
});
formatter.result({
  "duration": 238410500,
  "status": "passed"
});
formatter.uri("BuscarCredenciado.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Fazer uma busca de credenciado",
  "description": "Eu como visitante do site\r\nquero fazer uma pesquisa\r\npara encontrar a informação que procuro",
  "id": "fazer-uma-busca-de-credenciado",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar resultado da pesquisa",
  "description": "",
  "id": "fazer-uma-busca-de-credenciado;visualizar-resultado-da-pesquisa",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da AgeTechnology",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu clico em funcionalidades",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em Rede SocNET",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clico em Buscar credenciados",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "preencho os campos de pesquisa",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "eu consigo exibir seu perfil",
  "keyword": "Então "
});
formatter.match({
  "location": "buscasSoc.acessar_site()"
});
formatter.result({
  "duration": 1722018600,
  "status": "passed"
});
formatter.match({
  "location": "buscascredenciado.eu_clico_em_funcionalidades()"
});
formatter.result({
  "duration": 532056500,
  "status": "passed"
});
formatter.match({
  "location": "buscascredenciado.clico_em_Rede_SocNET()"
});
formatter.result({
  "duration": 2657292100,
  "status": "passed"
});
formatter.match({
  "location": "buscascredenciado.clico_em_Buscar_credenciados()"
});
formatter.result({
  "duration": 613609000,
  "status": "passed"
});
formatter.match({
  "location": "buscascredenciado.preencho_os_campos_de_pesquisa()"
});
formatter.result({
  "duration": 2654371700,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"btn-filtro col-2 center icon \"\u003e...\u003c/button\u003e is not clickable at point (342, 101). Other element would receive the click: \u003cdiv id\u003d\"div-carregando-operacao\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d101.0.4951.67)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NOTEYUU\u0027, ip: \u0027192.168.1.88\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\yukii\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56318}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 16ab8595968dfed450e881d8bebb6a3f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat steps.buscascredenciado.preencho_os_campos_de_pesquisa(buscascredenciado.java:62)\r\n\tat ✽.E preencho os campos de pesquisa(BuscarCredenciado.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "buscascredenciado.eu_consigo_exibir_seu_perfil()"
});
formatter.result({
  "status": "skipped"
});
});