# 📝 Projeto: Workshop Spring Boot + MongoDB

Curso: **Programação Orientada a Objetos com Java**  
📚 [Educando Web](http://educandoweb.com.br)  
👨‍🏫 Prof. Dr. Nelio Alves  

---

## 🎯 Objetivos do Projeto
- Compreender as diferenças entre paradigma orientado a documentos e relacional  
- Implementar operações **CRUD**  
- Refletir sobre decisões de design para banco de dados orientado a documentos  
- Implementar associações entre objetos  
  - Objetos aninhados  
  - Referências  
- Realizar consultas com **Spring Data** e **MongoRepository**  

---

## ⚙️ Instalação do MongoDB

### 🔹 Windows
1. Baixar [MongoDB Community Server](https://www.mongodb.com)  
2. Instalar (opção **Complete**)  
   - **Obs.:** não instalar o Compass por enquanto  
3. Criar pasta `\data\db`  
4. Adicionar ao **PATH**:  
5. Testar no terminal:  
```bash
mongod

🔹 Mac

Instalar o brew → https://brew.sh

🛠️ Instalação do Mongo Compass
https://www.mongodb.com/products/tools/compass

🚀 Criação do Projeto

File → New → Spring Starter Project

Selecionar apenas o pacote Web

Rodar o projeto e acessar:
http://localhost:8080

🧩 Estrutura do Projeto

domain → entidades (User, Post, etc.)

repository → interfaces do Spring Data

services → regras de negócio

resources → controladores REST

dto → objetos de transferência de dados

config → inicialização da base de dados

📌 Principais Funcionalidades

CRUD de usuários

CRUD de posts

Relacionamento User ↔ Post

Comentários em posts

Consultas com query methods e @Query

Busca por título, texto ou intervalo de datas

🔗 Exemplos de Documentos

{
  "id": "1001",
  "name": "Maria Brown",
  "email": "maria@gmail.com",
  "posts": [
    {
      "date": "2018-03-21",
      "title": "Partiu viagem",
      "body": "Vou viajar para São Paulo. Abraços!"
    }
  ]
}

Post com autor e comentários

{
  "id": "5001",
  "date": "2018-03-21",
  "title": "Partiu viagem",
  "body": "Vou viajar para São Paulo. Abraços!",
  "author": {
    "id": "1001",
    "name": "Maria Brown"
  },
  "comments": [
    {
      "text": "Boa viagem mano!",
      "date": "2018-03-21",
      "author": {
        "id": "1013",
        "name": "Alex Green"
      }
    }
  ]
}

📡 Endpoints da API
👤 Usuários

GET /users → Lista todos os usuários

GET /users/{id} → Retorna um usuário por ID

POST /users → Insere um novo usuário

PUT /users/{id} → Atualiza os dados de um usuário

DELETE /users/{id} → Remove um usuário

GET /users/{id}/posts → Lista posts de um usuário

📝 Posts

GET /posts/{id} → Retorna um post por ID

GET /posts/titlesearch?text=palavra → Busca posts pelo título

GET /posts/fullsearch?text=palavra&minDate=yyyy-MM-dd&maxDate=yyyy-MM-dd
→ Busca posts por texto e intervalo de datas



