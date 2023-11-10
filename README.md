# Projeto: Banco Divida Fácil

## Justificação das Decisões Arquiteturais

### Estrutura do Projeto:

A estrutura do projeto segue a convenção do Maven. Decisões arquiteturais foram tomadas com o objetivo de criar um projeto modular seguindo boas práticas de desenvolvimento. A escolha de tecnologias como Spring Boot e a organização em camadas contribui para a construção de uma aplicação robusta e escalável. A decisão de não utilizar o Spring Data foi influenciada pela adoção do CQRS, garantindo uma separação entre a persistência e queries.

### Arquitetura Hexagonal:

A aplicação adota a Arquitetura Hexagonal, também conhecida como Ports and Adapters. Essa arquitetura promove a separação clara entre o núcleo da aplicação (domínio) e as preocupações externas, como interfaces com o usuário e acesso a banco de dados.



PS: Ainda não está pronto



