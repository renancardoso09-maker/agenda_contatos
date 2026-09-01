# 📇 Agenda de Contatos — Versão V.0.2.0 (List & ArrayList)

---

## 📌 Visão Geral do Projeto

O projeto **Agenda de Contatos** é desenvolvido de forma incremental ao longo da disciplina de POO. Na versão **V.0.2.0**, a aplicação evolui do uso de arrays de tamanho fixo (V.0.1.0) para a utilização de coleções dinâmicas com **`List`** e **`ArrayList`** (`java.util.List` e `java.util.ArrayList`).

Esta versão introduz o armazenamento de dados com capacidade dinâmica e demonstra o uso de métodos nativos da biblioteca padrão do Java (`add()`, `get()`, `remove()` e `size()`), eliminando a necessidade de controle prévio de limite da agenda e de deslocamentos manuais de elementos após exclusões.

---

## 🚀 Funcionalidades da Versão V.0.2.0

- ➕ **Adicionar Contato:** Insere nome, celular e e-mail no final das listas dinâmicas utilizando o método `add()`.
- 📋 **Listar Contatos:** Exibe os contatos cadastrados percorrendo as listas via laço `for` com `get(i)` até a quantidade retornada por `size()`.
- 🔍 **Procurar Contato:** Pesquisa um contato pelo nome (utilizando `equalsIgnoreCase()`) e exibe as informações armazenadas no índice correspondente.
- 🗑️ **Excluir Contato:** Remove o contato das listas paralelas utilizando `remove(indiceExcluir)`, deixando a reorganização dos elementos a cargo da coleção.
- ⚡ **Armazenamento Dinâmico:** Permite cadastrar contatos sem definir limite fixo, eliminando a verificação de agenda cheia e a variável de controle manual `cont`.

---

## 🔄 Evolução Incremental das Versões

| Versão | Estrutura de Armazenamento | Conceitos Trabalhados | Limitações / Características |
| :--- | :--- | :--- | :--- |
| **V.0.0.0** | Variáveis simples (`String`) | `Scanner`, `if-else`, `switch-case`, laços de repetição | Armazena apenas 1 contato por vez. |
| **V.0.1.0** | Arrays fixos (`String[]`) | Vetores, índices, tamanho fixo, laço `for`, deslocamento manual | Armazena vários contatos, mas com capacidade pré-definida e estática. |
| **V.0.2.0** *(Atual)* | **`List` + `ArrayList`** | **Coleções Java, tamanho dinâmico, `add()`, `get()`, `remove()`, `size()`** | **Suporta contatos ilimitados dinamicamente; mantém os dados em três listas paralelas.** |

---

## 📊 Comparativo: Array (V.0.1.0) vs ArrayList (V.0.2.0)

| Operação | Array (V.0.1.0) | ArrayList (V.0.2.0) |
| :--- | :--- | :--- |
| **Criação** | `new String[capacidade]` | `new ArrayList<>()` |
| **Capacidade** | Fixa | Dinâmica |
| **Adicionar** | `nomes[cont] = nome` | `nomes.add(nome)` |
| **Acessar** | `nomes[i]` | `nomes.get(i)` |
| **Quantidade** | `cont` | `nomes.size()` |
| **Excluir** | Deslocamento manual | `nomes.remove(i)` |

---

## 📂 Estrutura de Arquivos

```text
.
├── Principal.java    # Código-fonte principal com a estrutura do menu e execução
└── README.md         # Documentação da versão V.0.2.0
```

---
*IFCE Campus Maranguape — Disciplina de Programação Orientada a Objetos*
