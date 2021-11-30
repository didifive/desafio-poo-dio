# Desafio: Aprenda na Prática Programação Orientada a Objetos

## Digital Innovation One: Bootcamp Spread Java Developer

Projeto desenvolvido com instruções de [Camila Cavalcante] na trilha de estudo do Bootcamp [Spread Java Developer] da [dio.].
Este é um *Fork* do repositório [cami-la/desafio-poo-dio].
 
O objetivo principal é colocar em prática umas das principais ferramentas da OO:
**ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO,** através de um projeto Java.  
Para informações mais detalhadas sobre as ferramentas citadas, consulte o README.md do original [cami-la/desafio-poo-dio].

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
* Classes `Curso` e `Mentoria`:
  * Método `toString()` alterado para retornar os dados simulando um JSON formatado;
  * Sobrecarga no construtor das respectivas classes com parâmetro para setar o título;


```
TODO:
Criar Classe Desafio que extende Conteúdo.
```

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