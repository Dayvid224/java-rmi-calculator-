# java-rmi-calculator-

Primeiro de tudo, colocar todas essas quatro classes dentro da pasta bin do JDK. Vamos supor que a nossa pasta JDK está dentro da pasta java na unidade E:, agora com o prompt de comando aberto executamos o seguinte:

cd e:
cd Java \ jdk1.6.0_23 \ bin
javac Calculator.java
javac CalculatorImple.java
javac CalculatorServer.java
javac CalculatorClient.java
rmic CalculatorImple
iniciar registro RMI
java CalculatorServer
Abrir outro prompt de comando e novamente ir para mesmo caminho e: \ java1 \ jdk1.6.0_23 \ bin
java CalculatorClient
