# Resolução de Questão - Loja Virtual (Interface + Polimorfismo)

## Questão – Loja Virtual (Interface + Polimorfismo)

**Enunciado:**

Um sistema de loja virtual precisa armazenar produtos de diferentes categorias. Crie uma interface `Produto` com os métodos `getNome()` e `getPreco()`. Implemente as classes:

- **Eletronico** (nome, preço e garantia em meses)
- **Vestuario** (nome, preço e tamanho da roupa)

No `main`, crie um menu para:
1. Adicionar Eletrônico (nome, preço e garantia)
2. Adicionar Vestuário (nome, preço e tamanho)
3. Listar todos os produtos cadastrados, mostrando nome, preço e total acumulado da compra
4. Encerrar

Esse exercício simula o carrinho de compras de um site de vendas online.

## Estrutura do Projeto

A estrutura do projeto está organizada da seguinte forma:

src
│
└── java
└── arquitetura
├── Daos
│ └── ProdutoDao.java
│
├── Models
│ ├── Eletronico.java
│ ├── IProduto.java
│ └── Vestuario.java
│
├── Services
│ └── ProdutoService.java
│
├── Utilidades
│ └── Ferramentas.java
│
├── Views
│ ├── menuEletronico.java
│ ├── menuInicial.java
│ ├── menuProdutos.java
│ ├── menuSair.java
│ └── menuVestuario.java
│
├── Main.java
└── README.md
