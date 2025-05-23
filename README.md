# 📦 API de Lojistas

API RESTful desenvolvida com **Spring Boot** para gerenciar usuários (lojistas e clientes) e realizar transações financeiras entre eles.

---

## 🚀 Funcionalidades

- ✅ Cadastro de usuários  
- ✅ Listagem de todos os usuários  
- ✅ Criação de transações financeiras entre usuários  
- ✅ Notificação de transação  
- ✅ Validação de autorização via serviço externo  

---

## 🛠️ Tecnologias Utilizadas

- Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- Hibernate  
- H2 Database 
- RestTemplate para consumo de APIs externas  
- Lombok  

---

▶️ Como executar o projeto
Clone o repositório:
git clone https://github.com/gessicameireles30/lojistas-api.git

Entre na pasta do projeto:
cd lojistas-api

Execute:
./mvnw spring-boot:run
ou
mvn spring-boot:run

Acesse o console H2 (se habilitado):
http://localhost:8080/h2-console

🧪 Endpoints

✅ Criar usuário

POST /users

Exemplo de JSON:

json
Copiar
Editar

{

  "name": "João Silva",
  
  "email": "joao.silva@example.com",
  
  "cpf": "12345678900",
  
  "password": "123456",
  
  "balance": 1000.00
  
}

✅ Listar todos os usuários

GET /users


✅ Criar transação

POST /transactions


Exemplo de JSON:

json
Copiar
Editar

{

  "senderId": 1,
  
  "receiverId": 2,
  
  "value": 150.00
  
}

Descrição:

Realiza uma transação de valor value do usuário senderId para receiverId.


📡 Serviço de Autorização Externa

A autorização da transação é realizada via RestTemplate, consumindo a API:

https://util.devi.tools/api/v2/authorize

Exemplo de resposta:

json
Copiar
Editar

{

  "message": "Autorizado"
  
}

Se não autorizado, a transação será bloqueada.


❌ Tratamento de Erros

403 Forbidden: Erro de autorização


500 Internal Server Error: Falhas internas na criação da transação


404 Not Found: Usuário não encontrado


🧩 Testes

Testes manuais via Postman



📄 Licença

Este projeto é de livre utilização para fins de aprendizado.
