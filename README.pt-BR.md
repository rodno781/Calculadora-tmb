# 📊 Calculadora de Taxa Metabólica Basal (TMB) / BMR Calculator

> Aplicação em Java de linha de comando para cálculo de Taxa Metabólica Basal (TMB) e Gasto Calórico Total Diário, desenvolvida para compor portfólio no GitHub com boas práticas de código e documentação bilíngue.

---

## 🌐 Idiomas / Languages

Esta aplicação possui duas versões do código-fonte:
* 🇧🇷 **Português:** [`CalculadoraTMB.java`](./CalculadoraTMB.java)
* 🇺🇸 **English:** [`BmrCalculator.java`](./BmrCalculator.java)

---

## 🎯 Sobre o Projeto

A **Calculadora de TMB** é uma ferramenta de console simples e eficiente que calcula quantas calorias o corpo de uma pessoa gasta em repouso (Taxa Metabólica Basal) e qual é o seu gasto calórico total considerando o nível de atividade física diária.

### ✨ Funcionalidades Principais
* **Validação de Entradas:** Loops de verificação para gênero, idade, peso e altura, garantindo que o programa não aceite dados zerados, negativos ou inválidos.
* **Tratamento de Decimais:** Substituição automática de vírgula por ponto (`replace(',', '.')`), evitando erros de execução (*parsing*) e garantindo melhor experiência para o usuário brasileiro.
* **Cálculo Base por Gênero:** Aplicação de fórmulas específicas para o perfil masculino e feminino.
* **Fator de Atividade Física:** Ajuste do gasto energético total diário com base na intensidade de rotina do usuário (Baixo, Médio ou Alto).

---

## 🧮 Fórmulas Utilizadas

A aplicação utiliza a equação de **Mifflin-St Jeor / Harris-Benedict**:

* **Homens:**
  $$\text{TMB} = (10 \times \text{peso em kg}) + (6.25 \times \text{altura em cm}) - (5 \times \text{idade}) + 5$$

* **Mulheres:**
  $$\text{TMB} = (10 \times \text{peso em kg}) + (6.25 \times \text{altura em cm}) - (5 \times \text{idade}) - 161$$

### Multiplicadores de Atividade Física:
1. **Baixo:** $\text{TMB} \times 1.2$
2. **Médio:** $\text{TMB} \times 1.375$
3. **Alto:** $\text{TMB} \times 1.725$

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Entrada de Dados:** `java.util.Scanner`
* **Ambiente / Ferramentas:** VS Code / Git & GitHub

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Ter o **JDK (Java Development Kit)** instalado em sua máquina.

### Passo a Passo

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/rodno781/Calculadora-tmb.git