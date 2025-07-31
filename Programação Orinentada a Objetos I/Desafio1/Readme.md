## 🛒 Desafio 1 – Sistema de Cadastro de Produtos

### Descrição
O objetivo deste desafio é criar e implementar uma classe `Produto` para gerenciar um cadastro simples de itens em um estoque.

### Requisitos da Classe `Produto`

-   **Atributos**:
    -   `nome`
    -   `preco`
    -   `estoque` (representando a quantidade)

-   **Construtores**:
    -   Um construtor que define todos os atributos (`nome`, `preco`, `estoque`).
    -   Um construtor que define apenas `nome` e `preco`, com o `estoque` inicializado em `0`.

-   **Métodos**:
    -   `adicionarEstoque(int quantidade)`: Para acrescentar itens ao estoque.
    -   `vender(int quantidade)`: Permite a venda apenas se houver quantidade suficiente em estoque.
    -   `exibirResumo()`: Mostra um resumo com as informações do produto.

### 🚀 Classes Principais

-   **`Produto.java`**: Modela a entidade `Produto` com os seguintes componentes:
    -   **Atributos**: `nome` (String), `preco` (double) e `estoque` (int).
    -   **Construtores**:
        -   Um construtor completo que inicializa `nome`, `preco` e `estoque`.
        -   Um construtor que define `nome` e `preco`, inicializando o `estoque` como `0`.
    -   **Getters e Setters**: Métodos para acessar e modificar os atributos privados.
    -   **Métodos de Negócio**:
        -   `adicionarEstoque(int quantidade)`: Aumenta a quantidade do produto, validando se a quantidade é positiva.
        -   `vender(int quantidade)`: Reduz o estoque se a quantidade for válida e houver estoque suficiente.
        -   `exibirResumo()`: Imprime um resumo formatado com os dados do produto.

-   **`Main.java`**: Classe principal que gerencia a interação com o usuário e o ciclo de vida da aplicação.
    -   **Atributos**: `produtos` (um `ArrayList<Produto>`) e `scanner` (um `Scanner`).
    -   **Método `main`**: Contém o loop principal da aplicação, que exibe o menu e processa a entrada do usuário através de uma estrutura `switch`.
    -   **Métodos Auxiliares**:
        -   `exibirMenu()`: Mostra as opções disponíveis para o usuário.
        -   `adicionarProduto()`: Coleta os dados e cria um novo `Produto`. Permite iniciar o estoque com `0` se a quantidade não for informada.
        -   `alterarProduto()`: Permite ao usuário modificar o nome, preço e/ou estoque de um produto existente.
        -   `removerProduto()`: Exclui um produto da lista.
        -   `venderProduto()`: Solicita a quantidade e chama o método `vender` do produto selecionado.
        -   `listarProdutos()`: Exibe todos os produtos cadastrados.
    -   **Nota**: As funcionalidades de `alterar` e `remover` produtos são recursos adicionais que não foram solicitados no desafio original.

### 🔧 Tecnologias Utilizadas
-   **Java 11**: Linguagem de programação principal.
-   **`java.util.Scanner`**: Para ler as entradas do usuário no console.
-   **`java.util.ArrayList`**: Para armazenar a lista de produtos em memória durante a execução.

### ▶️ Como Executar
1.  **Pré-requisitos**: É necessário ter o Java Development Kit (JDK) versão 11 ou superior instalado.
2.  **Compilação**: Abra um terminal na pasta do projeto e compile os arquivos `.java` com o comando:
    ```shell
    javac Produto.java Main.java
    ```
3.  **Execução**: Após a compilação, execute a classe `Main` para iniciar o programa:
    ```shell
    java Main
    ```
4.  **Interação**: Siga as instruções exibidas no menu do terminal para gerenciar os produtos.