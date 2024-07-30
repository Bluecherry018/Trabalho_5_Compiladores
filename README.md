# Trabalho Gerador de Código da Linguagem Algorítmica (LA) - T5

Alexandra Floriano - 761771

## Pré-requisitos

Python 3.x

ANTLR

## Descrição

Este é um projeto que implementa um geredor de código para a linguagem LA (Linguagem Algorítmica), utilizando a ferramenta ANTLR (ANother Tool for Language Recognition).

O projeto desenvolvido é capaz de gerar um código na linguagem C da liguagem LA descrita em um arquivo de entrada.

## Estrutura do Projeto

* 'LAGrammar.g4': Arquivo contendo a gramática em formato ANTLR.
* 'main.py': Script Python para executar o gerador de código.
* 'entrada.alg': Arquivo de exemplo contendo um código fonte em LA para ser analisado.
* 'saida.alg.c': Arquivo de saída contendo um código na liguagem C da liguagem analisada.
* 'tes.py': Arquivos para imprimir todos as saídas dos casos-testes.

## Como Executar

1. Instale o ANTLR seguindo as instruções em [antlr](https://www.antlr.org/).
2. Execute no seu terminal para poder utilizar em Python.

```Python3
pip install antlr4-python3-runtime
```

4. Execute o comando para gerar os analisadores léxico e sintático em Python.

```Python3
antlr4 -Dlanguage=Python3 LAGrammar.g4
```

3. Execute o analisador sintático com o comando, onde entrada.txt é o arquivo contendo o código fonte em LA a ser analisado e saida.txt é o arquivo de saída onde serão registradas as mensagens de erro.

```Python3
Python3 main.py entrada.alg saida.alg.c
```

## Casos de teste

O trabalho possui 20 casos de teste, para automatizar o processo de testar as saidas,o arquivo test.py faz os arquivos saida.alg.c para todos casos de teste, como utilizar:

```Python3
Python3 tes.py
```