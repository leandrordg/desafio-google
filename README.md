<p align="center">
  <img src="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png" alt="Google Logo" />
</p>

<p align="center">
  <a href="https://github.com/leandrordg/desafio-google/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/leandrordg/desafio-google" alt="License: MIT" />
  </a>
  <a href="https://github.com/leandrordg/desafio-google">
    <img src="https://img.shields.io/github/languages/top/leandrordg/desafio-google" alt="Top Language: Java" />
  </a>
  <a href="https://github.com/leandrordg/desafio-google/commits/main">
    <img src="https://img.shields.io/github/last-commit/leandrordg/desafio-google" alt="Last Commit" />
  </a>
  <a href="https://github.com/leandrordg/desafio-google">
    <img src="https://img.shields.io/github/repo-size/leandrordg/desafio-google" alt="Repo Size" />
  </a>
</p>

# SmartDictionary

Sistema de correção ortográfica desenvolvido em Java 21 para um desafio técnico proposto pelo Google. Utiliza o algoritmo de **distância de Levenshtein** para sugerir palavras corretas com base em um dicionário pré-definido.

## 📌 Funcionalidades

- Verifica se a palavra existe no dicionário.
- Sugere correções para palavras com até 2 letras de diferença.
- Ignora palavras já corretas.
- Fácil de adaptar para dicionários maiores ou aplicações reais.

## 🧠 Como funciona

1. Se a palavra digitada estiver no dicionário, ela é retornada como válida.
2. Caso contrário, calcula a **distância de Levenshtein** entre a palavra digitada e cada palavra do dicionário.
3. Retorna a sugestão mais próxima, se a distância for menor que 3 (conforme solicitado no desafio).

## 💻 Exemplo de uso

```java
List<String> dictionary = List.of("casa", "cama", "carro", "gato", "pato");
String[] words = {"casa", "caso", "gatu", "pata", "carroça"};
```

**Saída esperada:**
```
Input: casa, Output: casa  
Input: caso, Output: casa  
Input: gatu, Output: gato  
Input: pata, Output: pato  
Input: carroça, Output: null
```

## 🚀 Como executar

### Usando IntelliJ IDEA

1. Abra o projeto via `File > Open` e selecione o diretório do projeto.
2. Aguarde o Maven importar as dependências (IDE deve fazer isso automaticamente).
3. Navegue até a classe `SmartDictionary`.
4. Clique com o botão direito no método `main` e selecione **Run 'SmartDictionary.main()'**.

### Usando linha de comando

> Pré-requisitos: Java 21 e Maven instalados

```bash
git clone https://github.com/seu-usuario/desafio-google.git
cd desafio-google

mvn clean install
mvn exec:java -Dexec.mainClass="SmartDictionary"
```

> Certifique-se de que a classe `SmartDictionary` está no pacote raiz ou ajuste o caminho no comando acima.

## 🛠 Tecnologias

- Java 21  
- Maven  
- IntelliJ IDEA Ultimate  
- Algoritmo de Levenshtein

## 📄 Licença

Projeto desenvolvido como parte de um desafio técnico do Google. Uso educacional e demonstrativo.
