## 🛒 Exercício 2 – Loja Virtual

### Descrição
O objetivo deste exercício é criar um sistema simples de loja virtual para gerenciar produtos e pedidos.

### Requisitos
Crie as seguintes classes:
-   **Produto**: com atributos `nome` e `preco`.
-   **ItemPedido**: deve conter um `Produto` e a `quantidade`.
-   **Pedido**: deve ter uma lista de `ItemPedido` e um método `calcularTotal()`.

### Detalhes da Implementação
-   Utilize `ArrayList` para armazenar a lista de itens em um pedido.
-   Garanta o bom encapsulamento dos atributos em todas as classes.
-   Simule a criação de um pedido contendo dois produtos para testar a funcionalidade.


## 🛠️ Classes Principais
O sistema é estruturado nas seguintes classes:
-   `Produto`: Representa um produto disponível na loja, contendo atributos como `nome` e `preco`.
-   `ItemPedido`: Associa um `Produto` a uma `quantidade` específica, representando um item dentro de um pedido.
-   `Pedido`: Gerencia uma lista de `ItemPedido` e possui a lógica para `calcularTotal()` do pedido.
-   `Main`: É a classe principal que inicia a aplicação, exibe o menu interativo e processa as entradas do usuário.


## 🔧 Tecnologias Utilizadas
-   Java 11
-   `Scanner` para interação com o usuário via terminal.
-   `ArrayList` para armazenar as contas em memória.

## ▶️ Como Executar
1.  Compile todas as classes Java (`.java`).
2.  Execute a classe `Main` para iniciar o programa.
3.  Siga as instruções exibidas no terminal.

