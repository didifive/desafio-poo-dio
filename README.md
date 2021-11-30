# Desafio: Aprenda na Prática Programação Orientada a Objetos

## Digital Innovation One: Bootcamp Spread Java Developer

Projeto desenvolvido com instruções de [Camila Cavalcante] na trilha de estudo do Bootcamp [Spread Java Developer] da [dio.].
Este é um *Fork* do repositório [cami-la/desafio-poo-dio].
 
O objetivo principal é colocar em prática umas das principais ferramentas da OO:
**ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO,** através de um projeto Java.  
Para informações mais detalhadas sobre as ferramentas citadas, consulte o README.md do original [cami-la/desafio-poo-dio].


<p align="center">
	<img alt="Repository language count" src="https://img.shields.io/github/languages/count/didifive/desafio-poo-dio">
	<a href="https://www.linkedin.com/in/cami-la/">
		<img alt="Made by Camila" src="https://img.shields.io/badge/made%20by-Camila-blue">
	</a>
    <a href="https://www.linkedin.com/in/luis-carlos-zancanela/">
		<img alt="Update by Didi" src="https://img.shields.io/badge/update%20by-Didi-green">
	</a>
	<a href="https://github.com/didifive/desafio-poo-dio/commits/master">
		<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/didifive/desafio-poo-dio?color=blue">
	</a>
	<img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen?color=blue">
</p>

<p align="center">
	<a href="https://dev.java/">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java">
	</a>
</p>


## 🛑 Pré-Requisitos
✅ Conhecer a sintaxe da Java  
✅ Java JDK 11  
✅ IDE para desenvolvimento Java (IntelliJ)  
✅ Git  
✅ Conta no GitHub

---

## 🔧 Alterações realizadas neste *Fork*
* Classe `Dev`:
  * Sobrecarga no construtor, criando a opção de parâmetro para receber o nome do "dev", assim não necessita de utilizar o `setNome()` para setar nome pela primeira vez;
  * Sobrescrita, `@Override`, do método `toString()` para montar um padrão de retorno das informações do dev;
  * O método `calcularTotalXp()` teve o modificador de acesso alterado para `private` para ser consumido somente pela classe Dev;
  * O método `progredir()` também retorna texto para demonstrar visualmente ao usuário o progresso do dev;
* Classes `Curso` e `Mentoria`:
  * Método `toString()` alterado para retornar os dados simulando um JSON formatado;
  * Sobrecarga no construtor das respectivas classes com parâmetro para setar o título;
* Criada a classe `Desafio`, que estende `Conteudo`, para também poder ser inclusa como conteúdo em bootcamps;
* Classe `Bootcamp` teve o método `@Override toString()` para retornar resumo do Bootcamp.

---

## 🤝 Contribuindo 
Este repositório foi criado para fins de estudo, então contribua com ele e com o original: [cami-la/desafio-poo-dio]

---

Disponibilizado com ♥ por [cami-la]  
Atualizado com ✨👀 por [Luis Carlos]

[Camila Cavalcante]: https://github.com/cami-la
[cami-la]: https://www.linkedin.com/in/cami-la/
[cami-la/desafio-poo-dio]: https://github.com/cami-la/desafio-poo-dio
[dio.]: https://dio.me/
[Luis Carlos]: https://www.linkedin.com/in/luis-carlos-zancanela/
[Spread Java Developer]: https://web.dio.me/track/spread-java-developer