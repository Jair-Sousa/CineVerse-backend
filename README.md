# 🎬 CineVerse - Backend

API REST desenvolvida em **Java 21 com Spring Boot** para gerenciamento de filmes.  
Este é o backend do sistema **CineVerse**, responsável por operações CRUD completas 
com integração em banco **PostgreSQL** na nuvem.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 21
- ✅ Spring Boot 3
- ✅ Spring Data JPA
- ✅ PostgreSQL (Render Cloud Database)
- ✅ Swagger (SpringDoc OpenAPI)
- ✅ Lombok
- ✅ Git & GitHub
- ✅ Docker (build local)
- ✅ H2 (usado temporariamente na fase inicial)

---

## 🌐 Integração & Deploy

- 🌍 **Backend hospedado em:** [Render.com](https://render.com)
- 🛢️ **Banco de dados:** PostgreSQL remoto
- 🔐 **Configurações seguras:** Variáveis de ambiente com Render Environment
- ⚙️ **CORS habilitado:** permitindo integração total com o frontend
- 📡 Testes de requisição com **Insomnia**

---

## 🛠️ Funcionalidades da API

- ✅ `GET /api/filmes` - Listar todos os filmes
- ✅ `POST /api/filmes` - Adicionar um novo filme
- ✅ `PUT /api/filmes/{id}` - Atualizar um filme por ID
- ✅ `DELETE /api/filmes/{id}` - Excluir um filme por ID
- ✅ Validações com `@NotBlank`, `@NotNull` e `@Valid`
- ✅ Suporte ao padrão RESTful
- ✅ Documentação interativa com Swagger UI

---

## 🔐 Banco de Dados

- **Modelo atual:**
  ```java
  class Filme {
      Long id;
      String nome;
      String tipoAudio;
      Double preco;
  }
  
👨‍💻 Autor: Jair Sousa

🌐 Portfólio • LinkedIn
www.linkedin.com/in/jair-sousa-ads
