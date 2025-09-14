# Exercício de Programação: Sistema de Conta Bancária em Java

Este projeto é uma solução em Java para um exercício de fundamentos de Programação Orientada a Objetos, focado na criação e manipulação de uma conta bancária.

## Enunciado do Problema

Criar um banco:

Para cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial
que o titular depositou ao abrir a conta. Esse valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro
a depositar no momento de abrir a sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

> **Importante:** Uma vez que uma conta bancária foi aberta, o número da conta **nunca poderá ser alterado**. Já o nome do titular **pode ser alterado** (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques.

> **Regra de Negócio:** Para cada saque realizado, o banco cobra uma **taxa de $ 5.00**.
> **Nota:** A conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

O programa deve realizar o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial.
Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.

## Estrutura do Projeto

O código está organizado em dois pacotes principais:

-   `entities`: Contém a classe `Account`, que modela a conta bancária, seus atributos e regras de negócio (encapsulamento, construtores, métodos de depósito e saque).
-   `application`: Contém a classe `Program`, responsável pela interação com o usuário (leitura de dados do console e exibição de resultados).

## Como Executar

1.  Abra o projeto em uma IDE Java (como IntelliJ, Eclipse, etc.).
2.  Localize o arquivo `Program.java` dentro do pacote `application`.
3.  Execute o método `main()` contido neste arquivo.
4.  Siga as instruções que aparecerão no console para inserir os dados da conta e realizar as operações.