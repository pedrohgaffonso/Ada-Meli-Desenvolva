## 🎓 Exercício 3 – Classe Aluno

### Descrição
O objetivo deste exercício é criar uma classe para representar um Aluno e gerenciar suas informações básicas, como nome, matrícula e curso.

### Requisitos
Crie a seguinte classe:
- **Aluno**: com os atributos `nome`, `matricula` e `curso`.
- **Construtores**:
    - Um que recebe todos os atributos (`nome`, `matricula`, `curso`).
    - Um que recebe apenas `nome` e `curso`.
- **Métodos**:
    - `exibirDados()`: para imprimir os dados do aluno no console.

### Detalhes da Implementação
- Garanta o bom encapsulamento dos atributos na classe `Aluno`.
- Crie uma classe `Main` para instanciar objetos da classe `Aluno` utilizando ambos os construtores.
- Chame o método `exibirDados()` para cada objeto criado para testar a funcionalidade.

## 🛠️ Classes Principais
O sistema é estruturado nas seguintes classes:
- `Aluno`: Representa um estudante, contendo atributos como `nome`, `matricula` e `curso`.
- `Main`: É a classe principal que gerencia o cadastro interativo de alunos, armazena-os em uma lista e, ao final, exibe os dados de todos os alunos cadastrados.

## 🔧 Tecnologias Utilizadas
- Java 11
- **`java.util.Scanner`**: Para ler as entradas do usuário no console.
- **`java.util.ArrayList`**: Para armazenar a lista de alunos cadastrados.

## ▶️ Como Executar
1. Compile todas as classes Java (`.java`).
2. Execute a classe `Main` para iniciar o programa.
3. Siga as instruções no console para cadastrar os alunos. Você pode adicionar quantos alunos desejar.
4. Ao encerrar o cadastro, o programa exibirá a lista completa de alunos com seus respectivos dados.
