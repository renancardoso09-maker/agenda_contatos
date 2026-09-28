# Agenda de Contatos

Projeto de uma Agenda de Contatos desenvolvida em Java, com evolução gradual da implementação e organização do código.

## Versão atual

**V1.1.0 - Modularização das funcionalidades em arquivos separados (Uteis e Agenda)**

Nesta versão, o projeto foi reorganizado em arquivos separados, dividindo as responsabilidades entre as classes `Uteis` e `Agenda`.

A classe `Agenda` concentra as funcionalidades relacionadas ao gerenciamento dos contatos, enquanto a classe `Uteis` reúne funcionalidades auxiliares utilizadas pelo sistema.

### Funcionalidades

- Adicionar contato
- Listar contatos
- Alterar contato
- Buscar/localizar contato
- Validação dos dados informados
- Armazenamento dos contatos utilizando `List` / `ArrayList`
- Organização das funcionalidades em métodos
- Separação das funcionalidades em arquivos distintos

### Estrutura

Os contatos continuam sendo armazenados em três listas do tipo `List<String>`.

A organização do projeto passou a utilizar arquivos separados para facilitar a manutenção e a reutilização das funcionalidades.

> A versão v1.1.0 mantém as funcionalidades da v1.0.0, modificando principalmente a organização estrutural do código.

## Histórico de versões

### v0.1.0 — Armazenamento com Arrays

Primeira versão do projeto, utilizando Arrays para o armazenamento dos contatos.

### v0.2.0 — Armazenamento com List e ArrayList

Nesta versão, o armazenamento dos contatos foi alterado para estruturas baseadas em `List` e `ArrayList`.

### v0.3.0 — Funcionalidade de alterar contato

Foi adicionada a possibilidade de modificar os dados de um contato já cadastrado.

- Atualização dos dados nas listas (`List` / `ArrayList`) utilizando o método `set()`
- Reutilização da lógica de validação/busca para localização do registro antes da modificação

### v1.0.0 — Modularização das funcionalidades

Nesta versão, o projeto Agenda de Contatos foi reorganizado por meio da criação de métodos.

As funcionalidades passaram a ser divididas em métodos específicos, melhorando a organização e a legibilidade do código.

> A versão v1.0.0 mantém as funcionalidades da v0.3.0, alterando principalmente a organização interna do código.

### v1.1.0 — Modularização das funcionalidades em arquivos separados

Nesta versão, a modularização foi ampliada com a separação das funcionalidades em arquivos distintos.

As responsabilidades do projeto foram divididas entre as classes `Uteis` e `Agenda`, tornando a estrutura do código mais organizada e facilitando sua manutenção.

## Próximas versões

O projeto continuará evoluindo.

Possíveis versões futuras poderão incluir novas funcionalidades e melhorias na organização do código.

## Controle de versões

- v0.1.0
- v0.2.0
- v0.3.0
- v1.0.0
- v1.1.0
