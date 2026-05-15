# Entrega Inicial - Gestor Financeiro
**Opção:** B (Projeto Livre)
**SGBD:** MySQL (Justificação: Padrão de mercado e fácil integração com Java)

## Objetivo
Criar uma aplicação para controlo de despesas pessoais por categorias

## Fronteiras do Sistema
- Registo de despesas
- Listagem em consola
- Persistência em base de dados

## Modelação de Dados (Sessão 2)
- Conceção do Modelo Entidade-Relacionamento (ER) com 3 entidades: Utilizadores, Categorias e Despesas.
- Definição de relacionamentos 1-para-N (um utilizador tem várias despesas; uma categoria engloba várias despesas).
- Criação do script DDL (`schema.sql`) estruturado para MySQL com integridade referencial (Foreign Keys)