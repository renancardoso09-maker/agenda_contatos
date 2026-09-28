# Agenda de Contatos

Projeto didático desenvolvido em Java para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos (POO).

O sistema é desenvolvido de forma incremental. Cada versão introduz novos conceitos, estruturas e melhorias sobre a versão anterior.

## Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo gradualmente para uma aplicação organizada com conceitos de Programação Orientada a Objetos, interface gráfica e persistência de dados.

## Evolução do Projeto

| Versão | Armazenamento / Recursos | Descrição |
|---|---|---|
| v0.0.0 | Variáveis simples | Permite armazenar apenas um contato em memória |
| v0.1.0 | Arrays | Permite vários contatos com capacidade fixa |
| v0.2.0 | List + ArrayList | Permite vários contatos com tamanho dinâmico |
| v0.3.0 | List + ArrayList | Adiciona a opção de alteração de contatos cadastrados |
| v1.0.0 | List + ArrayList | Modularização das funcionalidades em métodos na classe principal |
| v1.1.0 | List + ArrayList | Separação das responsabilidades e métodos em arquivos/classes utilitárias |
| v1.1.1 | List + ArrayList | Correção de bug no fluxo de encerramento do sistema (opção Sair) |
| v2.1.0 | Arquivo TXT (I/O Java) | Persistência de dados em arquivo texto utilizando `java.io` |

---

### v0.0.0 — Programação Procedural Básica

Primeira versão da Agenda.

#### Principais características

- Uma única classe `Principal`;
- Todo o código dentro do método `main()`;
- Armazenamento de apenas um contato;
- Variáveis `nome`, `celular` e `email`;
- Menu interativo via console;
- Uso de `Scanner`;
- Uso de `if-else`;
- Uso de `switch-case`;
- Uso de `while`;
- Funcionalidades:
  - adicionar contato;
  - listar contato;
  - procurar contato;
  - excluir contato;
  - sair.

Nesta versão, um novo contato substitui o contato armazenado anteriormente.

---

### v0.1.0 — Arrays e Capacidade Fixa

Segunda versão da Agenda.

#### Principais características

- Uso de arrays simples (`String[]`) para cada atributo;
- Controle de capacidade máxima pré-definida;
- Manipulação através de índices e estrutura `for`;
- Busca sequencial nos arrays;
- Remoção de elementos com reorganização física do array (deslocamento de itens).

---

### v0.2.0 — Armazenamento Dinâmico com ArrayList

Terceira versão da Agenda.

#### Principais características

- Uso da API de Coleções do Java (`List` e `ArrayList`);
- Uso de Generics (`<String>`);
- Alocação e redimensionamento dinâmico;
- Utilização dos métodos da API (`add`, `get`, `remove`, `size`, `indexOf`, etc.);
- Iteração com `for-each`;
- Simplificação das operações de inserção, busca e remoção.

---

### v0.3.0 — Atualização de Registros

Quarta versão da Agenda.

Nesta versão, a Agenda de Contatos recebeu a implementação da funcionalidade de **alteração de contatos**.

#### Principais características

- Nova opção no menu: **Alterar contato**;
- Busca prévia do registro a ser modificado;
- Atualização dos dados nas listas (`List` / `ArrayList`) utilizando o método `set()`;
- Reutilização da lógica de validação e busca para localização do registro antes da modificação.

---

### v1.0.0 — Modularização com Métodos

Nesta versão, o código procedural foi reorganizado por meio da criação de métodos dentro da mesma classe.

#### Principais alterações

- Criação do método `adicionar()`;
- Criação do método `listar()`;
- Criação do método `pesquisar()`;
- Criação do método `atualizar()`;
- Criação do método `excluir()`;
- Simplificação da estrutura do `switch-case` no `main()`;
- Passagem de dados por meio de parâmetros e argumentos;
- Organização das responsabilidades do método `main()`.

#### Conceitos trabalhados

- Métodos;
- Parâmetros;
- Argumentos;
- Retorno;
- `void`;
- Escopo de variáveis;
- Modularização;
- Refatoração.

---

### v1.1.0 — Modularização em Múltiplos Arquivos

Nesta versão, o projeto Agenda de Contatos foi reorganizado com a separação das funcionalidades em diferentes arquivos e classes.

#### Principais alterações

- Criação das classes `Uteis` e `Agenda`;
- Separação das responsabilidades entre as classes;
- Divisão entre a interface com o usuário (menu no console) e a lógica de processamento dos dados;
- Reorganização dos métodos e funcionalidades do projeto.

Os contatos continuam sendo armazenados em três listas do tipo `List<String>`:

- nomes;
- celulares;
- e-mails.

#### Conceitos trabalhados

- Modularização em múltiplos arquivos;
- Separação de responsabilidades;
- Classes;
- Métodos;
- Parâmetros e argumentos;
- Refatoração.

---

### v1.1.1 — Correção de Bug (Hotfix)

Versão de ajuste e refinamento da série v1.x.

#### Principais alterações

- Correção de bug no encerramento da execução da aplicação (opção **Sair**);
- Garantia do fechamento correto dos fluxos de leitura do `Scanner`.

Esta versão mantém a estrutura da v1.1.0, introduzindo principalmente a correção relacionada ao fluxo de encerramento da aplicação.

---

### v2.1.0 — Persistência de Dados em Arquivo Texto (TXT)

Nesta versão, foi introduzida a **persistência de dados**.

Os contatos cadastrados deixam de ser perdidos ao encerrar a aplicação e passam a ser gravados em disco em um arquivo de texto `.txt`.

#### Principais características e conceitos

- Leitura e escrita de dados em disco utilizando a API `java.io`;
- Representação e verificação do arquivo com `File`;
- Leitura estruturada linha a linha com `FileReader` e `BufferedReader`;
- Gravação e manipulação do fluxo de escrita com `FileWriter` e `PrintWriter`;
- Carregamento automático dos contatos ao iniciar a aplicação;
- Atualização e sincronização do arquivo texto nas operações de inserção, alteração e exclusão;
- Tratamento de exceções de entrada e saída (`IOException`).

---

## Versão Atual

**v2.1.0 — Persistência de dados em arquivos TXT (`java.io`)**

### Próximas versões

O projeto continuará evoluindo.

---

## Controle de Versões

As versões estáveis do projeto são identificadas por tags Git.

Exemplo:

```text
- v0
  - v0.0.0
  - v0.1.0
  - v0.2.0
  - v0.3.0

- v1
  - v1.0.0
  - v1.1.0
  - v1.1.1

- v2
  - v2.1.0
```
