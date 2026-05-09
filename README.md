# Sistema de Controle de Estoque

# Integrantes do Projeto:

-Julia Dick, RA 1072615460, usuário do Github: juliadick-blip

-Eduardo Daniel G. Pereira, RA 10726110334, usuário do Github: EduardoGoncalves-02

-Melissa Mel Monteiro, RA 1072616173, usuário do Github: melmonteirosilva

-João Trilha, RA 10722618828, usuário do Github: TrilhaX 

## Sobre o Projeto
Este projeto consiste no desenvolvimento de um sistema de controle de estoque em
Java, criado para atender os requisitos da atividade A3 da unidade curricular de
Algoritmos e Programação da UNISUL.

O sistema tem como objetivo auxiliar uma empresa fictícia no gerenciamento de 
produtos armazenados em estoque, permitindo o cadastro, movimentação, reajuste 
de preços e emissão de relatórios.

---

# Contexto do Sistema

Toda empresa comercial precisa manter um controle eficiente do estoque para 
garantir organização, evitar perdas e auxiliar no planejamento de compras.

O sistema desenvolvido busca representar esse cenário, permitindo que os 
produtos sejam registrados e controlados de maneira simples e funcional.

A cada entrada ou saída de mercadorias, o estoque é atualizado automaticamente, 
permitindo que a empresa acompanhe:

- quantidade disponível de produtos;
- preços atualizados;
- movimentações realizadas;
- valor total do estoque.

---

# Objetivos do Sistema

O sistema possui como principais objetivos:

- Realizar o cadastro de produtos;
- Controlar entradas e saídas do estoque;
- Permitir reajustes de preços;
- Gerar relatórios físicos e financeiros;
- Aplicar conceitos de lógica de programação;
- Utilizar vetores e subrotinas em Java.

---

# Funcionalidades

## Cadastro de Produtos

Permite:

- inclusão;
- alteração;
- consulta;
- exclusão de produtos.

Cada produto possui:

- nome;
- preço unitário;
- unidade;
- quantidade em estoque.

---

## Movimentação de Estoque

Responsável pelo controle de:

- entrada de produtos;
- saída de produtos.

O sistema atualiza automaticamente a quantidade disponível após cada movimentação.

---

## Reajuste de Preços

Permite:

- reajustar o preço de um único produto;
- reajustar todos os produtos do estoque.

---

## Relatórios

O sistema disponibiliza:

### Lista de Preços

Exibe:

- nome do produto;
- unidade;
- preço unitário.

### Balanço Físico-Financeiro

Exibe:

- quantidade em estoque;
- preço unitário;
- valor total por produto;
- valor total geral do estoque.

---

# Tecnologias Utilizadas

- Java
- JOptionPane
- Vetores
- Subrotinas (métodos)
- NetBeans

---

# Estrutura do Projeto

O sistema foi dividido em métodos para facilitar a organização do código e 
seguir os requisitos da atividade.

Exemplo:

| Método | Responsabilidade |
|---|---|
| menuPrincipal() | Exibir menu principal |
| menuCadastro() | Exibir menu de cadastro |
| incluirProduto() | Realizar inclusão |
| produtoExiste() | Validar produtos repetidos |

---

# Regras de Validação

O sistema realiza validações importantes, como:

- não permitir produtos com nomes duplicados;
- preço maior que zero;
- quantidade maior ou igual a zero;
- confirmação antes de salvar operações.

---

# Organização dos Dados

Os dados são armazenados em vetores, conforme solicitado na atividade.



Desenvolvido utilizado JDK 25 e NetBeans 29.
