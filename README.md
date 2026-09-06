# 📅 Verificação de Ano Bissexto

Este projeto foi desenvolvido em **Java** para verificar se um determinado ano é **bissexto**.

O programa recebe um ano e utiliza regras matemáticas para determinar se ele possui um dia a mais no mês de fevereiro.

## 💻 Tecnologias

* Java
* `Scanner`
* Estrutura condicional `if` e `else`
* Operador módulo `%`
* Operadores lógicos `||` e `&&`

## 📋 Funcionamento

O programa recebe um ano e verifica duas condições:

```text
ano % 400 == 0
```

**OU**

```text
ano % 4 == 0 && ano % 100 != 0
```

Se uma dessas condições for verdadeira, o ano é considerado bissexto.

Caso contrário, não é bissexto.

## 🧮 Regra do ano bissexto

Um ano é bissexto quando:

* É divisível por **400**;

**ou**

* É divisível por **4** e não é divisível por **100**.

### Exemplos

|  Ano | Resultado   |
| ---: | ----------- |
| 2024 | BISSEXTO    |
| 2023 | NAOBISSEXTO |
| 2000 | BISSEXTO    |
| 1900 | NAOBISSEXTO |

## ▶️ Exemplo de entrada

```text
2024
```

## 📤 Saída

```text
BISSEXTO
```

### Outro exemplo

**Entrada:**

```text
2023
```

**Saída:**

```text
NAOBISSEXTO
```

## 🧠 Conceitos praticados

Este exercício ajuda a praticar:

* Entrada de dados com `Scanner`;
* Variáveis do tipo `int`;
* Operador módulo `%`;
* Operadores lógicos;
* Estruturas condicionais;
* Regras matemáticas;
* Tomada de decisão em Java.

## 📁 Estrutura do projeto

```text
├── HuxleyCode.java
└── README.md
```

## 🎯 Objetivo

Praticar **operadores matemáticos, operadores lógicos e estruturas condicionais em Java**, utilizando as regras para identificação de anos bissextos.

---

📚 **Exercício de programação em Java**
