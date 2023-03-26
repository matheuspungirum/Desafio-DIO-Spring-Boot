# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Desafio "Explorando Padrões de Projetos na Prática com Java". Este projeto teve como foco explorar padrões usando o Spring Framework, são eles:
- **Singleton**

  (Tem como foco garantir a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto.  como por exemplo, a conexão com banco de dados, para não instanciar várias a classe do banco de dados, ao usar o padrão **Singleton** essa instância será executada uma vez.)

- **Strategy/Repository**

  (O **Strategy**  é um padrão de design comportamental e tem como objetivo, definir um grupo de algoritmos, fazer o encapsulamento de cada grupo e os tornar intercambiáveis, permitindo que cada um deles variem entre os clientes que a utilizarem.

  Já o **Repository** permite um encapsulamento da lógica de acesso a dados, impulsionando o uso da injeção de dependência (DI) e proporcionando uma visão mais orientada a objetos das interações com a DAL ( Data Access Layer) permitindo a troca de Banco de Dados sem afetar o sistema como um todo, evitando duplicidade já que há um código centralizado, a facilitação ao implementar testes unitários, redução do acoplamento entre classes e padronização de códigos e serviços.)

- **Facade**

  (O **Facade** é um padrão estrutural que tem como foco encapsular uma lógica complicada de uma interface de alto nível, tornando sua utilização mais fácil e simples. Por isso que toda API (Application Programming Interface) pode ser considerada uma implementação pdo padrão **Facade**. Esse padrão é implementado para simplificar o acesso unificado a sistemas legados, criar API's públicas para classes, combinação de serviços e oferecimento de acesso único, reduzindo as chamadas de rede e encapsulamento do fluxo e detalhes internos de uma aplicação.)
