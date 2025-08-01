# 🚀 Desafio 3 – Controle de Acesso com Modificadores

Este repositório contém a solução para um desafio de programação em Java, focado em criar um sistema de controle de acesso de usuários que demonstra o uso correto dos principais modificadores da linguagem.

## 📝 Descrição

O projeto consiste em um sistema interativo de console, desenvolvido em Java, para gerenciar usuários e autenticação. A estrutura foi projetada para aplicar conceitos essenciais de Programação Orientada a Objetos, como herança, abstração e o uso de modificadores de acesso (`public`, `protected`, `private`), além de palavras-chave como `final` e `static`.

O sistema permite cadastrar um administrador com uma senha forte, testar sua autenticação e redefinir sua senha, garantindo que as regras de negócio e segurança sejam seguidas.

## ⚙️ Requisitos Funcionais

A estrutura do sistema foi definida pelas seguintes regras:

#### Classe Abstrata `Usuario`
-   **Atributos:**
    -   `private String senha`: Acessível apenas dentro da própria classe.
    -   `protected String email`: Acessível na classe e em suas subclasses.
    -   `public String nome`: Acessível de qualquer lugar.
-   **Métodos:**
    -   `public abstract boolean autenticar(String senha)`: Método de autenticação que deve ser implementado pelas subclasses.
    -   `public final void exibirUsuario()`: Método que não pode ser sobrescrito e imprime o nome e o e-mail do usuário.

#### Classe `Administrador`
-   Herda da classe `Usuario`.
-   Implementa o método `autenticar(String senha)` para validar a senha.
-   Adiciona um método `public void redefinirSenha(String novaSenha)` para alterar a senha do administrador.

#### Classe Utilitária `SegurancaUtils`
-   Declarada como `final` para impedir que seja herdada.
-   Possui um construtor `private` para não poder ser instanciada.
-   Contém um método `public static boolean validarSenhaForte(String senha)` que verifica se a senha possui mais de 8 caracteres e pelo menos um número.

## 🚀 Classes do Projeto

-   **`Usuario.java`**: Classe abstrata que serve como modelo base para todos os tipos de usuário, definindo os atributos e comportamentos comuns.
-   **`Administrador.java`**: Classe concreta que herda de `Usuario` e implementa as funcionalidades específicas de um administrador.
-   **`SegurancaUtils.java`**: Classe utilitária final que centraliza as lógicas de validação de segurança, como a de senhas fortes.
-   **`Main.java`**: Classe principal (`main`) que torna o sistema interativo. Ela utiliza a classe `Scanner` para coletar dados do usuário, instanciar um `Administrador` e testar suas funcionalidades.

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



