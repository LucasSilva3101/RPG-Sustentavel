# Jogo de Aventura: Pinu vs Poluidor

## Descrição

Este é um jogo simples de aventura baseado em texto, onde você assume o papel de "Pinu", o herói, que deve combater o "Poluidor", um inimigo responsável pela poluição no planeta. O objetivo é derrotar o Poluidor usando diversas ações e estratégias enquanto coleta pontos de pontuação.

## Estrutura do Código

### Classes e Funções

1. **Dialogos (Interface)**: Define dois métodos para os personagens interagirem com diálogos. Os personagens podem dialogar de forma vitoriosa (`dialogarV()`) ou derrotada (`dialogarD()`).

2. **Personagem (Classe Abstrata)**: Representa um personagem do jogo (herói ou inimigo) com atributos como nome e vida. Ela define métodos comuns para o gerenciamento de dano, vida e nome do personagem.

3. **Heroi (Classe)**: Estende a classe `Personagem` e adiciona funcionalidades específicas para o herói, como a pontuação e as ações de ataque:
   - `ataqueBasico()`: Ataque básico com um estilingue.
   - `ataqueGrito()`: Grita em pânico, sem causar dano.
   - `ataqueEfetivo()`: Ataque que utiliza conhecimento de sustentabilidade.
   - `curar()`: Cura o herói com uma ação de "postar no blog".
   Além disso, tem o método `calcularPontuacao()` para atualizar a pontuação do herói.

4. **Inimigo (Classe)**: Estende a classe `Personagem` e adiciona a funcionalidade de atacar o herói com um método `atacar()`, causando dano. O inimigo também possui métodos de diálogo.

5. **CodTXT (Classe)**: Responsável pela interação entre os personagens com o método `conversarV()` e `conversarD()`, que representam os diálogos durante a vitória e derrota.

6. **JogoRPG (Classe Principal)**: Contém o loop principal do jogo, onde o usuário escolhe ações a serem realizadas pelo herói. O jogo continua até que o herói ou o inimigo sejam derrotados.

## Como Jogar

1. Ao iniciar o jogo, você será saudado como "Pinu" e estará pronto para enfrentar o inimigo "Poluidor".
2. Durante o jogo, você terá a opção de realizar ações:
   - **Ataque básico**: Causa um pequeno dano ao inimigo.
   - **Gritar em pânico**: Causa nenhum dano, mas pode afetar a moral do inimigo.
   - **Usar conhecimentos**: Aplica técnicas de reciclagem e sustentabilidade, causando um dano significativo.
   - **Cura**: Recupera uma pequena quantidade de vida.
3. O objetivo é derrotar o inimigo "Poluidor" antes que o herói seja derrotado.

## Comandos

1. O jogo solicita que você insira um número inteiro para escolher uma ação:
   - 1 - Ataque básico
   - 2 - Gritar em pânico
   - 3 - Usar conhecimentos
   - 4 - Cura

2. Você pode continuar jogando até que um dos personagens perca toda a vida. O jogo irá apresentar um diálogo final após a vitória ou derrota.

## Requisitos

- JDK 8 ou superior.
- Ambiente de desenvolvimento Java (IDE ou terminal).
