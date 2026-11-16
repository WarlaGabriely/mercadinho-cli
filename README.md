
# Mercadinho CLI

## Objetivo

Desenvolver um sistema de Ponto de Venda (PDV) utilizando Java, executado no console, para praticar lógica de programação, estruturas de repetição, estruturas condicionais e organização de projetos.

## Requisitos funcionais

1. Cadastrar produtos informando nome, preço e quantidade em estoque.
2. Registrar vendas contendo vários produtos.
3. Informar a quantidade de cada produto vendido.
4. Calcular automaticamente o valor total da venda.
5. Atualizar o estoque após a confirmação de uma venda.
6. Emitir recibo no console com os produtos, quantidades e valor total.

## Regras de negócio

1. Não permitir cadastrar produtos com nome vazio.
2. Não permitir cadastrar produtos com preço igual ou inferior a zero.
3. Não permitir cadastrar produtos com quantidade negativa.
4. Não permitir realizar vendas sem produtos cadastrados.
5. Não permitir vender quantidade superior ao estoque disponível.
6. Atualizar o estoque após a confirmação de uma venda.

## Tecnologias utilizadas

- Java
- Eclipse IDE
- Git
- GitHub

## Como rodar

1. Clone o repositório:
   
   ```bash
   git clone git@github.com:WarlaGabriely/mercadinho-cli.git
   ```

2. Abra o Eclipse.
3. Importe o projeto como um projeto Java existente.
4. Abra a classe Main.java.
5. Execute utilizando Run As > Java Application.

## Status do projeto

Em desenvolvimento.

Nesta primeira etapa, foi criado o menu principal utilizando while e switch. As funcionalidades serão implementadas posteriormente.
