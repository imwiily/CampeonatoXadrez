# ♟️ Projeto: Sistema de Gerenciamento de Campeonato de Xadrez

## 🎯 Objetivo
Desenvolver um sistema orientado a objetos em Java para gerenciar um campeonato de xadrez, com persistência de dados, incluindo cadastro de jogadores, simulação de partidas, organização de rodadas, cálculo de rankings e geração de estatísticas.

---

## 🧱 Requisitos Funcionais

### 1. Cadastro de Jogadores
- Atributos:
  - Nome
  - Nível: Iniciante, Intermediário, Avançado
  - Estilo de jogo: Agressivo, Defensivo, Equilibrado
- Deve ser possível comparar jogadores com base em seu desempenho.

### 2. Simulação de Partidas
- Cada partida envolve dois jogadores.
- A partida registra:
  - Vencedor (ou empate)
  - Número de jogadas
- A lógica da partida pode ser simulada aleatoriamente, respeitando o estilo dos jogadores.

### 3. Organização de Rodadas
- Jogadores são pareados para partidas em rodadas.
- Regras:
  - Ninguém joga contra si mesmo.
  - Um par de jogadores só pode se enfrentar uma vez durante o campeonato.

### 4. Ranking dos Jogadores
- Pontuação:
  - Vitória: 3 pontos
  - Empate: 1 ponto
  - Derrota: 0 pontos
- O ranking deve ser atualizado após cada rodada.
- Deve ser possível consultar o Top 5 do campeonato a qualquer momento.

### 5. Estatísticas do Campeonato
- Total de partidas jogadas.
- Número médio de jogadas por partida.
- Taxa de vitórias por estilo de jogo dos jogadores.

---

## 💾 Requisitos de Persistência

- Os dados devem ser **salvos e recuperados** mesmo após o encerramento do programa.
- Persistir:
  - Lista de jogadores.
  - Histórico de partidas.
  - Pontuação e estatísticas.
- Tecnologias sugeridas (escolha uma):
  - Arquivos JSON ou CSV.
  - Serialização de objetos Java.
  - Banco de dados leve como **SQLite** usando **JDBC**.
- O sistema deve ser capaz de:
  - **Salvar** o estado atual do campeonato.
  - **Carregar** um campeonato salvo e continuar a execução.

---

## ⚙️ Técnicas e Conceitos Esperados
- **Enumerações** para representar níveis e estilos.
- **Encapsulamento**, **herança**, **polimorfismo** e **composição**.
- Uso de **coleções genéricas** (`List`, `Map`, etc.) para gerenciamento de dados.
- **Ordenação e filtragem** para ranking e estatísticas.
- **Camadas separadas** para modelo, lógica de negócio e persistência.

---

## 🧪 Desafio Extra (Opcional)
Implemente uma funcionalidade de "revanche", onde os jogadores podem desafiar adversários específicos uma única vez adicional.

