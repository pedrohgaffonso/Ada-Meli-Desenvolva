# 🚀 Desafio 4 – Sistema de Movimentação Bancária

Este repositório contém a solução para um desafio de programação em Java, focado na criação de um mini sistema de movimentação bancária via console.

## 📝 Descrição

O projeto consiste em um sistema interativo que simula as operações básicas de uma conta bancária. Desenvolvido em Java, o programa permite ao usuário realizar depósitos, saques, transferências e pagamentos, aplicando regras de negócio como taxas por operação e validação de saldo. A interação é totalmente realizada através do console.

## ⚙️ Requisitos Funcionais

A estrutura do sistema foi definida pelas seguintes regras:

#### Classe `Conta`
-   **Atributos:**
    -   `titular`: Nome do titular da conta.
    -   `numero`: Número da conta.
    -   `saldo`: Saldo atual da conta.
-   **Métodos:**
    -   `depositar(double valor)`: Adiciona um valor ao saldo.
    -   `sacar(double valor)`: Remove um valor do saldo, se houver fundos suficientes.
    -   `transferir(double valor)`: Realiza uma transferência, debitando do saldo.
    -   `pagar(double valor)`: Efetua um pagamento, debitando do saldo.

#### Regras de Negócio
-   **Taxa de Operação:** Cada operação (depósito, saque, transferência ou pagamento) tem um custo de **R$ 0,50**.
-   **Validação de Saldo:** Não é permitido realizar operações que resultem em saldo negativo. O sistema deve validar se o valor a ser debitado (operação + taxa) é coberto pelo saldo disponível.
-   **Feedback ao Usuário:** Após cada operação, o saldo atualizado da conta deve ser exibido no console.
-   **Menu Interativo:** O sistema deve apresentar um menu contínuo com as opções `Depositar`, `Sacar`, `Transferir`, `Pagar` e `Sair`, repetindo o ciclo até que o usuário escolha sair.

## 🚀 Classes do Projeto

-   **`Conta.java`**: Classe que encapsula os atributos (titular, número, saldo) e os comportamentos (métodos de operação) de uma conta bancária.
-   **`Main.java`**: Classe principal (`main`) que gerencia o fluxo do programa. É responsável por:
    -   Instanciar um objeto `Conta`.
    -   Exibir o menu de operações em um loop `while`.
    -   Utilizar a classe `Scanner` para capturar a escolha e os valores do usuário.
    -   Invocar os métodos da classe `Conta` para processar as operações.

## 🔧 Tecnologias Utilizadas

-   **Java 11**: Linguagem de programação principal do projeto.
-   **`java.util.Scanner`**: Para ler as entradas do usuário no console.

## ▶️ Como Executar o Projeto

Para compilar e executar o projeto localmente, siga os passos abaixo.

#### 1. Pré-requisitos

-   É necessário ter o **Java Development Kit (JDK) na versão 11 ou superior** instalado em sua máquina.

#### 2. Compilação

-   Abra um terminal ou prompt de comando no diretório raiz do projeto e execute o seguinte comando para compilar os arquivos `.java`:
    ```shell
    javac *.java
    ```

#### 3. Execução

-   Após a compilação bem-sucedida, execute a classe principal para iniciar o programa:
    ```shell
    java Main
    ```
-   O programa iniciará um menu interativo no console. Siga as instruções para criar uma conta e realizar as operações bancárias.
