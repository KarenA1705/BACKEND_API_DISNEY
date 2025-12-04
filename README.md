# 🎬 Disney API – Backend Challenge (Java Spring Boot)

API REST diseñada para explorar y administrar el universo de Disney, permitiendo consultar, crear y modificar **personajes**, **películas/series** y **géneros**.  
El proyecto implementa autenticación segura con **Spring Security + JWT**, relaciones entre entidades, filtros avanzados y arquitectura limpia, garantizando que cualquier frontend pueda consumir la información de manera confiable.

---

## 🚀 Características principales

### 🔐 Autenticación y Seguridad
- Registro y login de usuarios:  
  - `POST /auth/register`  
  - `POST /auth/login`
- Generación de **JSON Web Tokens (JWT)**.
- Protección de endpoints con **Spring Security**.
- Acceso libre únicamente para rutas de autenticación.

---

## 👥 Módulo Personajes
- `GET /characters` — Listado de personajes (imagen y nombre).
- Filtros disponibles: `name`, `age`, `movies`.
- `GET /characters/{id}` — Detalle completo.
- `POST /characters` — Crear personaje.
- `PUT /characters/{id}` — Actualizar información del personaje.
- `DELETE /characters/{id}` — Eliminar personaje.

---

## 🎬 Módulo Películas / Series
- `GET /movies` — Imagen, título y fecha de creación.
- Filtros: `name`, `genre`, `order` (ASC/DESC).
- `GET /movies/{id}` — Detalle completo con personajes.
- `POST /movies` — Crear película con opción de asociar personajes.
- `PUT /movies/{id}` — Actualizar información.
- `DELETE /movies/{id}` — Eliminar película.

#### 🔄 Relaciones
- `POST /movies/{idMovie}/characters/{idCharacter}` — Asociar personaje a película.
- `DELETE /movies/{idMovie}/characters/{idCharacter}` — Remover personaje de película.

---

## 🎭 Módulo Géneros
- Modelo de género con nombre, imagen y películas asociadas.
- Endpoint para consulta y administración (opcional según implementación).

---

## ✉️ Funcionalidades adicionales (opcionales)
- Envío de correo de bienvenida al registrarse.
- Documentación con **Swagger** o colección de **Postman**.
- Pruebas unitarias y de integración con **JUnit + Mockito**.

---

## 🛠️ Tecnologías utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security + JWT**
- **Hibernate**
- **MySQL / PostgreSQL**
- **Lombok**
- **Swagger/OpenAPI** (opcional)

---

## 📂 Arquitectura
La aplicación está estructurada siguiendo principios de buenas prácticas:  
- Separación clara entre controladores, servicios y repositorios.  
- Entidades relacionadas mediante asociaciones **Many-to-Many** y **One-to-Many** usando JPA.  
- Validación, excepciones personalizadas y DTOs para mantener un API clara.

---

## ▶️ Ejecución del proyecto

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/usuario/disney-api.git](https://github.com/KarenA1705/BACKEND_API_DISNEY.git)
