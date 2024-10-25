# Java RMI Calculator

## Introdução
Este projeto implementa um servidor de calculadora usando Java RMI (Remote Method Invocation). O objetivo é demonstrar a criação e o uso de um serviço remoto simples.

## Requisitos
- Java Development Kit (JDK) 1.6 ou superior
- Configuração do PATH para incluir o diretório `bin` do JDK

## Instruções

### 1. Preparação
Coloque as seguintes classes dentro da pasta `bin` do JDK:
- `Calculator.java`
- `CalculatorImpl.java`
- `CalculatorServer.java`
- `CalculatorClient.java`

### 2. Compilação
Abra o prompt de comando e navegue até o diretório do JDK:
```sh
cd E:\Java\jdk1.6.0_23\bin
javac Calculator.java
javac CalculatorImpl.java
javac CalculatorServer.java
javac CalculatorClient.java
rmic CalculatorImpl
