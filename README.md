🌆 Cyberpunk RPG - Java
Um RPG cyberpunk baseado em turnos, desenvolvido em Java, com combate estratégico, gestão de recursos e campanha desafiadora. <br>
O projeto mantém backend puro (lógica do jogo) e frontend separado (ConsoleUI) para melhor organização. <br>

🎮 Funcionalidades <br>
Escolha de classe do jogador: <br>
🥷 CyberPunk <br>
🕶️ NetRunner <br>
⚔️ StreetSamurai <br>
🛠️ Techie <br>

Sistema de combate por turnos: <br>
👊 Ataque físico <br>
💻 Ataque cibernético (gasta EP) <br>
💉 Uso de Stims para cura <br>

Dificuldade ajustável: <br>
1️⃣ Fácil <br>
2️⃣ Normal <br>
3️⃣ Difícil <br>
4️⃣ Insano <br>

Campanha com múltiplos inimigos: <br>
🤖 Drone <br>
🧑‍💻 Hacker <br>
🪖 Mercenário <br>


📂 Estrutura do Projeto <br>
/src <br>
 └─ main <br>
     ├─ Main.java                # Ponto de entrada do jogo <br>
     ├─ view <br>
     │   └─ ConsoleUI.java       # Interface em console <br>
     ├─ service <br>
     │   ├─ GameEngine.java      # Lógica do jogo e campanha <br>
     │   └─ CombatService.java  # Lógica de combate <br>
     └─ model <br>
         ├─ Personagem.java      # Classe abstrata base <br>
         ├─ CyberPunk.java <br>
         ├─ NetRunner.java <br>
         ├─ StreetSamurai.java <br>
         ├─ Techie.java <br>
         ├─ Drone.java <br>
         ├─ Hacker.java <br>
         └─ Mercenario.java <br>
🛠️ Backend <br>

CombatService: responsável por ataques físicos, cibernéticos e cura via Stims <br>

GameEngine: controla turnos, inimigos e dificuldade <br>

Personagem: classe abstrata base para todas as classes de jogador e inimigos <br>

O frontend apenas solicita entradas do jogador e mostra o resultado do turno. A lógica do jogo está completamente encapsulada no backend. <br>
