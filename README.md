# 📇 Agenda de Contatos — Versão V.0.3.0 (CRUD Completo com `set()`)

---

## 📌 Visão Geral do Projeto

O projeto **Agenda de Contatos** é desenvolvido de forma incremental ao longo da disciplina de POO. Na versão **V.0.3.0**, a aplicação atinge a maturidade funcional ao introduzir a operação de **Alteração de Contatos**, completando formalmente o ciclo **CRUD** (*Create, Read, Update, Delete*).

Aproveitando a estrutura de coleções dinâmicas (**`List`** e **`ArrayList`**) estabelecida na versão anterior, esta versão introduz o método nativo **`set()`**, responsável por substituir elementos existentes em posições específicas das listas dinâmicas paralelas (`nomes`, `celulares` e `emails`).

---

## 🚀 Funcionalidades da Versão V.0.3.0

* ➕ **Adicionar Contato (Create):** Insere novos registros dinamicamente no final das listas com o método `add()`.
* 📋 **Listar Contatos (Read):** Exibe todos os contatos cadastrados percorrendo as coleções com `get(i)` até o tamanho indicado por `size()`.
* 🔍 **Procurar Contato (Read):** Pesquisa um contato pelo nome (via `equalsIgnoreCase()`) e exibe as informações correspondentes.
* ✏️ **Alterar Contato (Update) — *Novidade*:** Localiza a posição de um contato existente e substitui seus dados antigos por novos valores utilizando o método `set()`.
* 🗑️ **Excluir Contato (Delete):** Remove o registro da posição selecionada usando `remove()`, mantendo o reorganização automática dos índices.
* 🛡️ **Tratamento de Registro Ausente:** Exibe mensagens informativas ao tentar alterar ou excluir contatos não localizados na agenda.

---

## 🔄 Evolução Incremental das Versões

| Versão | Estrutura de Armazenamento | Conceitos Trabalhados | Limitações / Evolução |
| :--- | :--- | :--- | :--- |
| **V.0.0.0** | Variáveis simples (`String`) | `Scanner`, `if-else`, `switch-case`, laços de repetição | Armazena apenas 1 contato por vez. |
| **V.0.1.0** | Arrays fixos (`String[]`) | Vetores, índices, capacidade fixa, laço `for`, deslocamento manual | Suporta múltiplos contatos, porém com limite estático. |
| **V.0.2.0** | `List` + `ArrayList` | Coleções Java, capacidade dinâmica, `add()`, `get()`, `remove()`, `size()` | Elimina limite fixo, mas não permite alterar registros já criados. |
| **V.0.3.0** *(Atual)* | **`List` + `ArrayList` com `set()`** | **Substituição de elementos com `set()`, Mapeamento CRUD Completo** | **Completa as quatro operações fundamentais (Create, Read, Update, Delete).** |

---

## 💡 Mapeamento CRUD & Métodos Java sobre `ArrayList`

Nesta versão, todas as operações básicas de gerenciamento de dados sobre `ArrayList` são consolidadas:

| Operação CRUD | Funcionalidade na Agenda | Método Java (`List` / `ArrayList`) |
| :--- | :--- | :--- |
| **C**reate | Adicionar contato | `add(elemento)` |
| **R**ead | Listar / Procurar contato | `get(indice)` / `size()` |
| **U**pdate | Alterar contato | `set(indice, novoElemento)` |
| **D**elete | Excluir contato | `remove(indice)` |

---

## 📊 Comparativo de Operações em Coleções: `add()` vs `set()`

| Característica | Método `add()` (V.0.2.0) | Método `set()` (V.0.3.0) |
| :--- | :--- | :--- |
| **Ação** | Insere um novo elemento no final da lista | Substitui o valor existente em uma posição específica |
| **Tamanho da Lista (`size`)** | Aumenta em +1 | Permanece inalterado |
| **Parâmetros** | `add(valor)` | `set(posicao, novoValor)` |
| **Finalidade** | Cadastro / Criação (Create) | Edição / Atualização (Update) |

---

## 📂 Estrutura de Arquivos

```text
.
├── Principal.java    # Código-fonte principal com a estrutura do menu e execução do CRUD
└── README.md         # Documentação da versão V.0.3.0
```

---
*IFCE Campus Maranguape — Disciplina de Programação Orientada a Objetos*
