
# 🚀 DesafioControleFluxo

Este projeto em Java tem como objetivo praticar estruturas de repetição e tratamento de exceções personalizadas.

## 📚 Descrição

O programa solicita dois números inteiros ao usuário:

- Se o **segundo número for maior que o primeiro**, ele calcula a diferença entre os dois e imprime mensagens numeradas no formato:

  ```
  Imprimindo o número 1
  Imprimindo o número 2
  ...
  ```

- Se o **primeiro número for maior que o segundo**, uma **exceção personalizada** é lançada com a mensagem:

  ```
  O segundo parâmetro deve ser maior que o primeiro
  ```

---

## 🛠 Tecnologias utilizadas

- Java (versão 8 ou superior)
- Estruturas de controle: `for`, `if`
- Entrada de dados com `Scanner`
- Criação e uso de exceção customizada (`ParametrosInvalidosException`)

---

## 💻 Como executar

1. Clone o repositório ou copie os arquivos:
   ```bash
   git clone https://github.com/joaofvic/DesafioControleFluxo.git
   ```

2. Compile e execute o programa:
   ```bash
   javac application/Contador.java
   java application.Contador
   ```

3. Digite os números quando solicitado no terminal.

---

## 📁 Estrutura do projeto

```
DesafioControleFluxo/
│
├── application/
│   └── Contador.java
│
└── model/exceptions/
    └── ParametrosInvalidosException.java
```

---

## 🧠 Aprendizados

- Como utilizar estruturas de repetição (`for`) em Java
- Validação de entrada com lógica condicional
- Criação de exceções personalizadas
- Organização de pacotes em projetos Java

---

## ✍️ Autor

Feito por [João Victor Firmino Sousa](https://github.com/joaofvic) – Projeto de prática em Java 💻
