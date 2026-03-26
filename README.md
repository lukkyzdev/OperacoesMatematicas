# <img align="center" alt="Fontes-Java" height="60" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg"> ATIVIDADE PRÁTICA ADS - Desenvolver um Programa em JAVA Que Simule Operações Matemáticas Utilizando Classe Abstrata e Tratamento de Exceções.

## ORIENTAÇÃO DO PROJETO 📝

### *Atividade Proposta: Desenvolver um programa em Java que simule operações matemáticas utilizando classe abstrata e tratamento de exceções.*

*O aluno deverá:*

***1- Criar uma classe abstrata chamada `OperacaoMatematica`, com um método abstrato `double calcular(double a, double b)`.***

***2- Criar duas classes concretas que herdam de `OperacaoMatematica`:***

- *Soma: implementa o método para somar dois valores.*
- *Divisao: implementa o método para dividir dois valores, mas lança uma exceção personalizada caso o segundo valor (b) seja zero.*

***3- Criar uma exceção personalizada chamada `DivisaoPorZeroException`, estendendo `Exception`.***

***4- Criar a classe `Principal` com o método `main`, onde:***

- *Serão instanciadas as classes `Soma` e `Divisao`.*
- *Serão feitas chamadas ao método `calcular()`.*
- *Será usado um bloco `try-catch` para tratar a exceção da divisão por zero.*

---
## EXPLICAÇÃO DO PROJETO ✅

- ***O projeto consistiu em transformar uma simples conta de matemática em um sistema de software robusto, onde as regras são claras, os erros são controlados e novos recursos podem ser adicionados sem quebrar o que já existe.***

> *Técnicas e Métodos Utilizados*


***Foi criada uma Classe Abstrata `(OperacaoMatematica)`. Ela não pode ser "instanciada" (criada como objeto), mas serve como um contrato: ela obriga qualquer operação filha a ter um método calcular.***



***As subclasses `Soma` e `Divisao` usaram o `extends`.***

- *Elas herdaram a estrutura do pai `(OperacaoMatematica)`.*
- *Foi usado o `@Override` para escrever a lógica real (somar ou dividir) em cima do método que estava vazio no pai.*


***Foi criada a `DivisaoPorZeroException` estendendo a classe `Exception`.***

- *Isso criou um erro personalizado.*
- *O uso do `super("Não é possível dividir por zero.")` no construtor travou uma explicação clara para o usuário, evitando que o programa trave sem aviso.*


***Na classe `Main`, foi colocado tudo para rodar:***

- ***Instanciação:*** *Criou os objetos com `new`.*
- ***Polimorfismo:*** *Chamou o mesmo método `(calcular)`, mas cada objeto respondeu do seu jeito (um somou, outro dividiu).*
- ***Try-Catch:*** *Criou uma rede de proteção que captura o erro de divisão por zero e exibe no `System.err`, mantendo o programa vivo.*

---
## RESULTADO 💻
