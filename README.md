# HorasAulas

Projeto Java Spring Boot com Maven para consultar horas de aula de professores e horários de salas, usando PostgreSQL.

## Funcionalidades
- API para consultar a quantidade de horas que cada professor tem comprometido em aulas.
- API para listar salas com horários livres e ocupados.

## Configuração do Banco de Dados
- PostgreSQL
- As credenciais e URL de conexão devem ser configuradas em `src/main/resources/application.properties`.
<<<<<<< HEAD
- data.sql contem dados das tabelas.
- Foi usado o serviço da https://console.aiven.io/ para o banco de dados.
=======
>>>>>>> ffd673f (master)

## Como rodar
1. Configure o arquivo `application.properties` com os dados do banco.
2. Execute `mvn spring-boot:run` na raiz do projeto.

## Dependências
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- postgresql
