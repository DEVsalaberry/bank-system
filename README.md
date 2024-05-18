# Bank System

Este é um projeto de sistema bancário simples, implementado em Java, que demonstra conceitos básicos de orientação a objetos, como herança, encapsulamento e polimorfismo.

## Funcionalidades do Projeto

- **Criação de Contas**: Permite a criação de contas correntes e poupança para os clientes.
- **Depósitos**: Permite a realização de depósitos nas contas.
- **Transferências**: Permite a transferência de valores entre contas.
- **Extratos**: Gera e imprime extratos detalhados das contas.
- **Gestão de Banco**: Permite adicionar contas a um banco e imprimir os saldos de todas as contas do banco.

## Estrutura do Projeto

### Classe Banco

- **Banco**: Representa o banco e contém uma lista de contas.
- **Métodos**:
  - `imprimirSaldos()`: Imprime o saldo de todas as contas do banco.
 
    ![banco](https://github.com/DEVsalaberry/bank-system/assets/160683550/218cac86-61a0-4051-92ba-f02d525cded3)


### Classe Cliente

- **Cliente**: Representa um cliente do banco.
- **Atributos**:
  - `nome`: Nome do cliente.
- **Métodos**:
  - `getNome()`: Retorna o nome do cliente.
  - `setNome(String nome)`: Define o nome do cliente.

    ![cliente](https://github.com/DEVsalaberry/bank-system/assets/160683550/e48c4307-ff25-4ec9-aa1f-b7069498c500)


### Interface IConta

- **IConta**: Define as operações básicas de uma conta.
- **Métodos**:
  - `sacar(double valor)`: Saca um valor da conta.
  - `depositar(double valor)`: Deposita um valor na conta.
  - `transferir(double valor, IConta contaDestino)`: Transfere um valor para outra conta.
  - `imprimirExtrato()`: Imprime o extrato da conta.

    ![iconta](https://github.com/DEVsalaberry/bank-system/assets/160683550/6b2e03a6-dc52-4924-8f51-02eb26c84f32)


### Classe Abstrata Conta

- **Conta**: Classe abstrata que define uma conta bancária e suas operações básicas.
- **Atributos**:
  - `agencia`: Agência da conta.
  - `numero`: Número da conta.
  - `saldo`: Saldo da conta.
  - `cliente`: Cliente associado à conta.
    ![conta](https://github.com/DEVsalaberry/bank-system/assets/160683550/4aef307a-14a9-454b-90c0-66cb27ba116d)

- **Métodos**:
  - `depositar(double valor)`: Deposita um valor na conta.
  - `sacar(double valor)`: Saca um valor da conta.
  - `transferir(double valor, IConta contaDestino)`: Transfere um valor para outra conta.
  - `imprimirExtrato()`: Imprime o extrato da conta.
  - `imprimirInfosComuns()`: Método abstrato para imprimir informações comuns.
    ![conta 1](https://github.com/DEVsalaberry/bank-system/assets/160683550/74e7ac79-a131-4756-9ba7-92279563e8bc)

    

  

### Classe ContaCorrente

- **ContaCorrente**: Extende `Conta` e representa uma conta corrente.
- **Métodos**:
  - `imprimirExtrato()`: Imprime o extrato da conta corrente.
  - `imprimirInfosComuns()`: Imprime as informações comuns da conta corrente.
 
    ![contaCorrente](https://github.com/DEVsalaberry/bank-system/assets/160683550/47617db2-e5f3-4029-ac46-c9d4b9be7163)


### Classe ContaPoupanca

- **ContaPoupanca**: Extende `Conta` e representa uma conta poupança.
- **Métodos**:
  - `imprimirExtrato()`: Imprime o extrato da conta poupança.
  - `imprimirInfosComuns()`: Imprime as informações comuns da conta poupança.

  ![contaPoupanca](https://github.com/DEVsalaberry/bank-system/assets/160683550/f8cb1f6d-b155-492b-be12-0529caeedc38)


    
### Classe Main

- **Main**: Classe principal que contém o método `main` para executar o programa.
- **Funcionalidades**:
  - Criação de um cliente.
  - Criação de contas corrente e poupança para o cliente.
  - Realização de depósito e transferência.
  - Impressão dos extratos das contas.
  - Criação de um banco e adição das contas ao banco.
  - Impressão dos saldos de todas as contas do banco.
 
    ![main](https://github.com/DEVsalaberry/bank-system/assets/160683550/f04eafb4-6597-4a1b-9416-1ede137a7fe9)
