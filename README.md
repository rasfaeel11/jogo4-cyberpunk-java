🌆 Cyberpunk RPG - Java
Um RPG cyberpunk baseado em turnos, desenvolvido em Java, com combate estratégico, gestão de recursos e campanha desafiadora.
O projeto mantém backend puro (lógica do jogo) e frontend separado (ConsoleUI) para melhor organização.

🎮 Funcionalidades
Escolha de classe do jogador:
🥷 CyberPunk
🕶️ NetRunner
⚔️ StreetSamurai
🛠️ Techie

Sistema de combate por turnos:
👊 Ataque físico
💻 Ataque cibernético (gasta EP)
💉 Uso de Stims para cura

Dificuldade ajustável:
1️⃣ Fácil
2️⃣ Normal
3️⃣ Difícil
4️⃣ Insano

Campanha com múltiplos inimigos:
🤖 Drone
🧑‍💻 Hacker
🪖 Mercenário


📂 Estrutura do Projeto
/src
 └─ main
     ├─ Main.java                # Ponto de entrada do jogo
     ├─ view
     │   └─ ConsoleUI.java       # Interface em console
     ├─ service
     │   ├─ GameEngine.java      # Lógica do jogo e campanha
     │   └─ CombatService.java  # Lógica de combate
     └─ model
         ├─ Personagem.java      # Classe abstrata base
         ├─ CyberPunk.java
         ├─ NetRunner.java
         ├─ StreetSamurai.java
         ├─ Techie.java
         ├─ Drone.java
         ├─ Hacker.java
         └─ Mercenario.java
🛠️ Backend

CombatService: responsável por ataques físicos, cibernéticos e cura via Stims

GameEngine: controla turnos, inimigos e dificuldade

Personagem: classe abstrata base para todas as classes de jogador e inimigos

O frontend apenas solicita entradas do jogador e mostra o resultado do turno. A lógica do jogo está completamente encapsulada no backend.
