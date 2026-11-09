# Agenda de Contatos

Aplicação desenvolvida em **Java** para gerenciamento de contatos, construída de forma incremental como parte das atividades da disciplina de **Programação Orientada a Objetos (POO)**.

O projeto acompanha a evolução dos conceitos de programação, desde a utilização de variáveis e estruturas de dados até a aplicação de princípios de orientação a objetos, organização em camadas, persistência e interfaces gráficas.

**Versão atual: V4.1.0 — DAO Orientado a Objetos**

## Objetivo

Desenvolver uma aplicação que permita cadastrar, listar, pesquisar, atualizar e excluir contatos, aplicando progressivamente os conceitos estudados na disciplina.

## Funcionalidades

- Adicionar contatos.
- Listar contatos cadastrados.
- Pesquisar contatos.
- Atualizar informações.
- Excluir contatos.
- Salvar contatos em arquivo TXT.
- Recuperar contatos automaticamente ao iniciar a aplicação.
- Apresentar informações sobre o sistema.

Cada contato possui os seguintes atributos:

- Nome
- Celular
- E-mail

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Collections Framework (`List` e `ArrayList`)
- Manipulação de arquivos TXT
- Tratamento de exceções
- Git e GitHub

## Estrutura do projeto

```text
AgendaContatos/
├── src/
│   └── br/
│       └── edu/
│           ├── principal/
│           │   └── Principal.java
│           ├── modelo/
│           │   └── Contato.java
│           ├── servico/
│           │   └── Agenda.java
│           ├── dao/
│           │   └── ContatoDAO.java
│           └── uteis/
│               └── Uteis.java
├── contatos.txt
└── README.md
```

O arquivo `contatos.txt` é utilizado para armazenar os dados e será criado durante a gravação, caso ainda não exista.

## Organização das classes

| Classe | Responsabilidade |
|---|---|
| `Principal` | Inicializar e coordenar a execução da aplicação. |
| `Contato` | Representar os dados de um contato. |
| `Agenda` | Implementar as operações do CRUD. |
| `ContatoDAO` | Realizar a leitura e gravação dos contatos em arquivo. |
| `Uteis` | Disponibilizar funcionalidades auxiliares da aplicação. |

## V4.1.0 — DAO Orientado a Objetos

Nesta versão, aprimoramos a implementação do padrão **DAO (Data Access Object)**, introduzido na V4.0.0.

Anteriormente, os métodos de persistência eram estáticos e acessados diretamente pela classe `ContatoDAO`.

Agora, utilizamos um objeto DAO, criado por meio de um construtor.

### Principais alterações

- Introdução do atributo privado `caminhoArquivo`.
- Implementação de construtor para configurar o arquivo utilizado.
- Conversão dos métodos estáticos em métodos de instância.
- Atualização da classe `Principal` para instanciar o DAO.
- Manutenção da separação entre CRUD e persistência.
- Refinamento do método `toString()` da classe `Contato`.
- Melhoria no tratamento de erros durante a gravação.
- Implementação de retorno `boolean` no método `salvarContatos()`.

### Exemplo de utilização

```java
List<Contato> contatos = new ArrayList<>();

ContatoDAO dao = new ContatoDAO("contatos.txt");

// Carregar os contatos
dao.carregarContatos(contatos);

// Salvar os contatos
boolean salvou = dao.salvarContatos(contatos);
```

O objeto `dao` mantém a configuração do arquivo e disponibiliza os métodos necessários para realizar a persistência.

### Persistência dos dados

Os contatos são armazenados no arquivo `contatos.txt`, utilizando o caractere `;` como separador.

Exemplo:

```text
Maria;85999999999;maria@email.com
João;85988888888;joao@email.com
```

Ao iniciar a aplicação, os contatos são carregados do arquivo para a coleção em memória.

Ao selecionar a opção de saída, a aplicação tenta salvar os dados atualizados.

Caso ocorra um erro durante a gravação, a aplicação apresenta uma mensagem e permanece em execução.

## Histórico de versões

| Versão | Descrição |
|---|---|
| **V0.0.0** | Introdução às variáveis e cadastro de um contato. |
| **V0.1.0** | Utilização de arrays para armazenar contatos. |
| **V0.2.0** | Introdução a `List` e `ArrayList`. |
| **V0.3.0** | Implementação das operações do CRUD. |
| **V1.0.0** | Modularização das funcionalidades em métodos. |
| **V1.1.0** | Organização dos métodos em classes. |
| **V1.1.1** | Correção do funcionamento da opção de saída. |
| **V2.0.0** | Introdução à manipulação de arquivos. |
| **V2.1.0** | Persistência dos contatos em arquivo TXT. |
| **V3.0.0** | Introdução aos conceitos de classe e objeto. |
| **V3.1.0** | Utilização de `ArrayList<Contato>`. |
| **V3.2.0** | CRUD utilizando objetos. |
| **V3.3.0** | Encapsulamento e aprimoramento da classe `Contato`. |
| **V4.0.0** | Introdução ao padrão DAO e organização em pacotes. |
| **V4.1.0** | DAO orientado a objetos, com construtor e métodos de instância. |

## Conceitos trabalhados na V4.1.0

- Classes e objetos.
- Instanciação com `new`.
- Construtores.
- Encapsulamento.
- Palavra-chave `this`.
- Métodos estáticos e métodos de instância.
- Compartilhamento de referências.
- Separação de responsabilidades.
- Persistência de objetos em arquivos.
- Tratamento de exceções.
- Retorno de métodos.

## Execução

Para executar o projeto:

1. Instalar o Java JDK.
2. Abrir o projeto em uma IDE Java.
3. Localizar a classe `Principal`, no pacote `br.edu.principal`.
4. Executar o método `main()`.
5. Utilizar o menu apresentado no terminal.

Os contatos serão carregados automaticamente quando o arquivo de dados estiver disponível.

## Próxima versão

**V5.0.0 — Introdução ao MVC**

Na próxima versão, vamos introduzir o padrão arquitetural **Model-View-Controller (MVC)**, aprimorando a separação entre os dados, a apresentação e o controle das operações da aplicação.
