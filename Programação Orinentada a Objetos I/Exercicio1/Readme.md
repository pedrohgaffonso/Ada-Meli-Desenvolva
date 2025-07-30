## 📦 Exercício 1 - Sistema Bancário

### Descrição
Implementação de um sistema básico de contas bancárias com dois tipos de conta:
- Conta Bancária comum
- Conta Especial com limite de crédito

### Funcionalidades
- Criação de contas bancárias
- Operações de saque e depósito
- Consulta de saldo
- Gerenciamento de limite especial para contas especiais

## 📝 Descrição
Este é um sistema de gerenciamento de contas bancárias desenvolvido em Java. Ele permite a criação e administração de dois tipos de contas: **Comum** e **Especial**. O programa é interativo e funciona através de um menu no terminal, guiando o usuário em todas as operações.

A principal característica do sistema é a criação de contas de forma inteligente: com base na renda mensal informada pelo usuário, o sistema decide automaticamente se cria uma conta comum ou uma conta especial com um limite de crédito pré-calculado.

## ⭐ Bônus: Funcionalidade Adicional

### Encerramento Seguro de Conta
Como uma funcionalidade bônus, o sistema agora permite que o usuário solicite o encerramento de uma conta. Para garantir a integridade financeira, essa operação possui regras claras:
-   **Verificação de Débitos**: A conta só pode ser encerrada se o saldo for exatamente **R$ 0,00**.
-   **Bloqueio por Dívida**: Se a conta tiver um saldo negativo (débito), o sistema impede o encerramento e informa o valor pendente.
-   **Aviso de Saldo Positivo**: Caso a conta ainda tenha saldo positivo, o sistema instrui o usuário a sacar o valor restante antes de poder encerrá-la.

## ⚙️ Como o Programa Funciona (Passo a Passo)

O sistema opera a partir de um menu principal que oferece as seguintes opções:

### 1. Criar Nova Conta
Ao escolher esta opção, o sistema inicia o processo de abertura de conta:
1.  **Solicita os Dados**: Pede ao usuário que digite o **número da conta**, o **saldo inicial** e a sua **renda mensal**.
2.  **Análise de Renda**: O sistema verifica a renda informada.
    -   Se a renda for **menor que R$ 5.000,00**, uma **Conta Comum** (`ContaBancaria`) é criada.
    -   Se a renda for **maior ou igual que R$ 5.000,00**, o sistema cria uma **Conta Especial** (`ContaEspecial`).
3.  **Cálculo Automático de Limite**: Para a **Conta Especial**, o limite de crédito é calculado automaticamente, correspondendo a **1.8 vezes a renda** do usuário. O usuário é informado sobre o limite concedido.
4.  **Confirmação**: Uma mensagem de sucesso confirma a criação da conta.

### 2. Acessar Conta
Permite que o usuário gerencie uma conta já existente.
1.  **Login**: O sistema pede o **número da conta** para localizá-la.
2.  **Menu da Conta**: Se a conta for encontrada, um novo menu é exibido com as operações disponíveis:
    -   **Depositar**, **Sacar**, **Consultar Saldo**.
    -   **Voltar ao Menu Principal**.

### 3. Encerrar Conta
1.  **Solicitação**: O usuário informa o número da conta que deseja encerrar.
2.  **Validação de Saldo**: O sistema verifica se o saldo da conta está zerado.
3.  **Execução**: Se não houver pendências, a conta é removida do sistema. Caso contrário, uma mensagem informativa é exibida.

### 4. Sair
Encerra a execução do programa.

## 🛠️ Classes Principais
-   `ContaBancaria`: Classe base que representa uma conta comum.
-   `ContaEspecial`: Herda de `ContaBancaria` e adiciona a funcionalidade de um limite de crédito.
-   `Main`: Classe principal que controla o fluxo do programa e a interação com o usuário.

## 🔧 Tecnologias Utilizadas
-   Java 11
-   `Scanner` para interação com o usuário via terminal.
-   `ArrayList` para armazenar as contas em memória.

## ▶️ Como Executar
1.  Compile todas as classes Java (`.java`).
2.  Execute a classe `Main` para iniciar o programa.
3.  Siga as instruções exibidas no terminal.