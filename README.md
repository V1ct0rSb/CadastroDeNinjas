# Cadastro de Ninjas - API REST com Spring Boot

Projeto desenvolvido com o objetivo de praticar e aprender os fundamentos do Spring Boot na criação de APIs RESTful. Nele, é possível cadastrar **Ninjas** e associá-los a **Missões**, utilizando boas práticas como a separação em camadas (`Controller`, `Service`, `Repository`), uso de JPA, e persistência de dados com o H2 Database.

---

## 🚀 Tecnologias e Ferramentas Utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)
- Lombok
- IntelliJ IDEA
- Postman

---

## 📦 Endpoints Disponíveis

### 🔹 Ninja
| Método | Endpoint         | Descrição                     |
|--------|------------------|-------------------------------|
| GET    | `/ninja`         | Lista todos os ninjas         |
| POST   | `/ninja`         | Cadastra um novo ninja        |
| DELETE | `/ninja/{id}`    | Deleta um ninja por ID        |

> Obs: O Ninja é relacionado a uma missão (ManyToOne)

---

## 📺 Canal utilizado como base
Link do canal: [@GrandeFiasco](https://www.youtube.com/@GrandeFiasco)

