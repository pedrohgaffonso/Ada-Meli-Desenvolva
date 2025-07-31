# 💰 Desafio 2 – Sistema de Reembolso de Despesas

Este repositório contém a solução para um desafio de programação em Java, focado em criar um sistema para calcular o reembolso de despesas de funcionários.

## 📝 Descrição

O projeto consiste em um sistema interativo de console, desenvolvido em Java, para calcular o valor de reembolso de despesas de funcionários. O sistema solicita ao usuário os dados do funcionário e suas despesas de alimentação, transporte e, opcionalmente, hospedagem. Ele aplica regras de negócio específicas, como a sobrecarga de métodos para diferentes cenários de despesa e a aplicação de um bônus com base no número de dias trabalhados.

## ⚙️ Requisitos Funcionais

O sistema foi construído em torno da classe `Reembolso`, que possui as seguintes características:

#### Atributos
-   `nomeFuncionario` (String): Nome do colaborador.
-   `diasTrabalhados` (int): Quantidade de dias que justificam o reembolso.

#### Métodos
-   **`public double calcularReembolso(double alimentacao, double transporte, double hospedagem)`**
    -   Soma os três tipos de despesas e retorna o valor total.

-   **`public double calcularReembolso(double alimentacao, double transporte)`**
    -   Método sobrecarregado que calcula o reembolso quando não há despesas de hospedagem.

-   **`public void imprimirResumoReembolso(double valorTotal)`**
    -   Exibe um resumo formatado com os dados do funcionário e o valor final do reembolso.

#### Regra de Negócio
-   Se o número de `diasTrabalhados` for **maior que 7**, um **bônus de 10%** é aplicado sobre o valor total do reembolso antes de ser impresso.

## 🚀 Classes do Projeto

-   **`Reembolso.java`**: Modela a entidade de reembolso, contendo os atributos do funcionário e os métodos para o cálculo e a impressão dos valores.
-   **`Main.java`**: Classe principal (`main`) que torna o sistema interativo. Ela utiliza a classe `Scanner` para coletar dados do usuário, como nome do funcionário, dias trabalhados e valores das despesas, e em seguida, exibe o cálculo final do reembolso.

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
-   O programa solicitará que você insira os dados do funcionário e os valores das despesas diretamente no console. Após fornecer as informações, o resumo do reembolso será exibido.