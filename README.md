# 📇 Agenda de Contatos — Versão V.0.1.0 (Arrays / Vetores)


## 📌 Visão Geral do Projeto

O projeto **Agenda de Contatos** é desenvolvido de forma incremental ao longo da disciplina de POO. Na versão **V.0.1.0**, o sistema evolui da utilização de variáveis simples unitárias (V.0.0.0) para **arrays de tamanho fixo (`String[]`)**.

Esta etapa tem como objetivo consolidar os conceitos de **manipulação de vetores, índices, controle de limite/capacidade e deslocamento manual de elementos**, antes do aprendizado de coleções dinâmicas (`ArrayList`) (V.0.2.0+).

---

## 🚀 Funcionalidades da Versão V.0.1.0

- ➕ **Adicionar Contato:** Cadastra nome, celular e e-mail no vetor.
- 📋 **Listar Contatos:** Exibe todos os contatos atualmente armazenados.
- 🔍 **Procurar Contato:** Pesquisa contatos pelo nome (busca insensível a maiúsculas/minúsculas).
- 🗑️ **Excluir Contato:** Remove um contato pelo nome e reorganiza o vetor (deslocamento à esquerda).
- ⚠️ **Tratamento de Capacidade:** Previne erros de estouro de memória (`ArrayIndexOutOfBoundsException`) quando a agenda atinge o limite máximo.

---

## 🔄 Evolução Incremental das Versões

| Versão | Estrutura de Dados | Conceitos Trabalhados | Limitações |
| :--- | :--- | :--- | :--- |
| **V.0.0.0** | Variáveis Simples (`String`) | `Scanner`, `if-else`, `switch-case`, `while` | Armazena apenas 1 contato por vez. |
| **V.0.1.0** *(Atual)* | **Arrays Fixos (`String[]`)** | **Vetores, índices, controle de quantidade, laço `for`, deslocamento** | Capacidade fixa e gestão manual de posições. |
| **V.0.2.0** | `List` + `ArrayList` | Coleções dinâmicas, `add()`, `remove()`, `size()` | Elimina a necessidade de vetor fixo e shift manual. |

---

## 📂 Estrutura de Arquivos

```text
.
├── Principal.java    # Código fonte completo da aplicação Java
└── README.md         # Documentação detalhada da versão V.0.1.0
```

---
*IFCE Campus Maranguape 
        └── edu/
            └── principal/
                └── Principal.java
```
