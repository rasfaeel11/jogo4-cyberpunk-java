package main.view;

import main.service.GameEngine;
import main.model.Personagem;
import java.util.Scanner;

public class ConsoleUI {
    private GameEngine engine;
    private Scanner input = new Scanner(System.in);

    public ConsoleUI(GameEngine engine){
        this.engine = engine;
    }

    public void iniciarCampanha(){
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Escolha sua classe: 1-CyberPunk 2-NetRunner 3-StreetSamurai 4-Techie");
        int classe = input.nextInt();

        System.out.println("Escolha sua dificuldade: 1-Fácil 2-Normal 3-Difícil 4-Insano");
        int dificuldade = input.nextInt();

        engine.iniciarJogo(nome, classe, dificuldade);

        while(true){
            Personagem inimigo = engine.getInimigoAtual();
            if(inimigo == null) break;

            System.out.println("Um inimigo aparece: " + inimigo.getNome());

            while(engine.getJogador().estaVivo() && inimigo.estaVivo()){
                mostrarStatus();
                System.out.println("Escolha ação: 1-Ataque físico 2-Ataque cibernético 3-Usar Stim");
                int escolha = input.nextInt();

                int danoCausado = engine.turnoJogador(escolha);
                System.out.println("Você causou " + danoCausado + " de dano!");

                if(!inimigo.estaVivo()){
                    System.out.println("Inimigo derrotado!");
                    break;
                }

                int danoRecebido = engine.turnoInimigo();
                System.out.println("Inimigo causou " + danoRecebido + " de dano!");

                if(!engine.getJogador().estaVivo()){
                    System.out.println("Você foi derrotado!");
                    return;
                }
            }

            // Próximo inimigo
            if(!engine.proximoInimigo()){
                System.out.println("Todos os inimigos derrotados! Vitória!");
                break;
            }
        }
    }

    private void mostrarStatus(){
        Personagem jogador = engine.getJogador();
        Personagem inimigo = engine.getInimigoAtual();
        System.out.println("=== STATUS ===");
        System.out.println("Você: HP " + jogador.getHp() + " | EP " + jogador.getEp() + " | Stims " + jogador.getStims());
        System.out.println("Inimigo: HP " + inimigo.getHp() + " | EP " + inimigo.getEp() + " | Stims " + inimigo.getStims());
        System.out.println("==============");
    }
}
