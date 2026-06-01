# 💰 FinFlow

> Plataforma de gestão financeira pessoal desenvolvida com Java, Spring Boot e Arquitetura Orientada a Eventos.

---

## 📖 Sobre o Projeto

O FinFlow é uma plataforma criada para ajudar pessoas a organizarem suas finanças de forma simples, visual e inteligente.

O projeto nasceu inicialmente como um desafio técnico para aprofundar conhecimentos em:

- Java 21
- Spring Boot
- PostgreSQL
- Docker
- Microsserviços
- Apache Kafka
- Arquitetura Orientada a Eventos (EDA)

Além disso, a ideia possui potencial para evoluir futuramente para um SaaS voltado à gestão financeira pessoal.

---

## 🚀 Visão do Produto

Muitas pessoas não sabem exatamente:

- Quanto gastam por categoria;
- Quanto conseguem economizar por mês;
- Se estão atingindo suas metas financeiras;
- Quando estão ultrapassando seus limites de gastos.

O FinFlow busca resolver esse problema centralizando todas essas informações em uma única plataforma.

---

## 🎯 Objetivos

### Para o usuário

- Controlar receitas e despesas;
- Categorizar movimentações financeiras;
- Definir metas financeiras;
- Criar orçamentos por categoria;
- Visualizar indicadores financeiros;
- Receber alertas e notificações.

### Para o projeto

- Aplicar boas práticas de desenvolvimento backend;
- Explorar arquiteturas modernas;
- Implementar comunicação assíncrona com eventos;
- Construir um produto escalável desde sua concepção.

---

# 🛣️ Roadmap

## Fase 1 — Fundação

- [x] Estrutura inicial do projeto
- [ ] Spring Boot
- [ ] PostgreSQL
- [ ] Docker

---

## Fase 2 — Usuários

- [ ] Cadastro de usuários
- [ ] Login
- [ ] JWT Authentication

---

## Fase 3 — Categorias

- [ ] CRUD de categorias
- [ ] Categorias personalizadas

---

## Fase 4 — Transações

- [ ] Cadastro de receitas
- [ ] Cadastro de despesas
- [ ] Histórico financeiro

---

## Fase 5 — Dashboard

- [ ] Saldo atual
- [ ] Receitas do mês
- [ ] Despesas do mês
- [ ] Indicadores financeiros

---

## Fase 6 — Metas Financeiras

- [ ] Criação de metas
- [ ] Acompanhamento de progresso

---

## Fase 7 — Orçamentos

- [ ] Limites por categoria
- [ ] Monitoramento de consumo
- [ ] Alertas automáticos

---

## Fase 8 — Frontend

- [ ] Interface Web
- [ ] Dashboard visual
- [ ] Experiência responsiva

---

## Fase 9 — Infraestrutura

- [ ] Dockerização completa
- [ ] Ambiente local completo

---

## Fase 10 — Event Driven Architecture

- [ ] Apache Kafka
- [ ] Publicação de eventos
- [ ] Consumers
- [ ] Notificações
- [ ] Analytics

---

# 🏗️ Arquitetura Inicial

```text
Frontend
    ↓
Spring Boot API
    ↓
PostgreSQL
```

---

# 🔮 Arquitetura Futura

```text
                 +----------------+
                 |   Frontend     |
                 +--------+-------+
                          |
                          ▼
                 +----------------+
                 | API Gateway    |
                 +--------+-------+
                          |
          +---------------+---------------+
          |                               |
          ▼                               ▼

+----------------+           +----------------+
| User Service   |           | Transaction    |
+--------+-------+           | Service        |
         |                   +--------+-------+
         |                            |
         +-------------+--------------+
                       |
                       ▼

                +-------------+
                |   Kafka     |
                +------+------+ 
                       |
       +---------------+---------------+
       |               |               |
       ▼               ▼               ▼

+--------------+ +--------------+ +--------------+
| Notification | | Analytics    | | Budget       |
| Service      | | Service      | | Service      |
+--------------+ +--------------+ +--------------+
```

---

# 🛠️ Stack Tecnológica

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Maven
- PostgreSQL

## Frontend

- React
- Next.js
- TypeScript

## Mensageria

- Apache Kafka

## Infraestrutura

- Docker
- Docker Compose

---

# 📂 Estrutura do Projeto

```text
finflow/
│
├── backend/
│
├── frontend/
│
├── docs/
│
├── docker/
│
└── README.md
```

---

# 📈 Possível Evolução para SaaS

### Plano Gratuito

- Controle financeiro básico
- Limite de lançamentos mensais

### Plano Premium

- Relatórios avançados
- Metas ilimitadas
- Insights financeiros
- Alertas personalizados
- Exportação de relatórios
- Recomendações com IA

---

# 👨‍💻 Autor

Desenvolvido por João Victor como projeto de estudo, portfólio e potencial produto digital.