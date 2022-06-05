package br.edu.iftm.rpgjava.teste;


/*----------------------------[ Enunciado ]-----------------------------------[]
                            
-  Faça um método main com o seguinte programa:

Peça para usuário criar dois personagem para cada personagem o usuário deve escolher qual a sua classe (Guerreiro, Mago ou Arqueiro), informe todos os valores de atributos para cada objeto (ex: nome, forca, etc...)
Faça o combate do dois personagem conforme fizemos na classe Principal.java
Não esquece que criar a armadura e arma para cada personagem. */

//---------------------------------------------------------------------------[]




//---------------------------[ Imports ]-------------------------------------[]

import java.util.Scanner;
import java.util.Random;
import br.edu.iftm.rpgjava.classes.Personagem1;
import br.edu.iftm.rpgjava.classes.Personagem2;

//---------------------------------------------------------------------------[]


public class Principal2 {
    public static void main(String[]args){

//---------------------------[ """Métodos""" ]-------------------------------------[]

        Scanner entrada = new Scanner(System.in);
        Personagem1 P1 = new Personagem1("" , 0, 0, 0, 0, 0, 0,0, 0, 0, 0);
        Personagem2 P2 = new Personagem2("", 0, 0, 0, 0, 0, 0,0, 0, 0, 0);

//------------------------[ Programa ]-----------------------------[] 

        System.out.println("\n");
        System.out.println("Agora, vamos criar o Personagem 1\n");
        System.out.println("Escolha um nome para o Personagem 1:\n");
        P2.nome = entrada.next();
        System.out.println("\n");

        //----------[ Classe Personagens ]---------[]

        System.out.println("Qual Será a Classe do Personagem?");
        System.out.println("Insira 'G' para Guerreiro | 'M' para Mago | 'A' para Arqueiro");
        int controle = 0;
        
        while(controle == 0){
            char classe = entrada.next().charAt(0);
            switch (classe) {
                
            case 'G'| 'g':
                P1.classe = "Guerreiro";
                P1.forca = 80;
                P1.destreza = 50;
                P1.agilidade = 30;
                P1.inteligencia = -3;
                P1.carisma = 0;
                P1.resistencia = 80;
                P1.vida = 100;
                P1.estamina = 90;
                P1.sorte = 10;
                P1.mana = 63;
                controle = 1;
                P1.armadura.getNome();
                P1.armadura.getDurabilidade();
                P1.armadura.getPeso();
                P1.armadura.getDefesa();
                P1.armadura.getClass();
                P1.arma.getClass();
                P1.arma.getDano();
                P1.arma.getDurabilidade();
                P1.arma.getNome();
                break;
            case 'M' | 'm':
                P1.classe = "Mago";
                P1.forca = 0;
                P1.destreza = 90;
                P1.agilidade = 0;
                P1.inteligencia = 95;
                P1.carisma = 0;
                P1.resistencia = 50;
                P1.vida = 40;
                P1.estamina = 45;
                P1.sorte = 85;
                P1.mana = 100;
                P1.armadura.getNome();
                P1.armadura.getDurabilidade();
                P1.armadura.getPeso();
                P1.armadura.getDefesa();
                P1.armadura.getClass();
                P1.arma.getClass();
                P1.arma.getDano();
                P1.arma.getDurabilidade();
                P1.arma.getNome();
                controle = 1;
                break;
            case 'A' | 'a':
                P1.classe = "Arqueiro";
                P1.forca = 0;
                P1.destreza = 90;
                P1.agilidade = 0;
                P1.inteligencia = 60;
                P1.carisma = 0;
                P1.resistencia = 30;
                P1.vida = 75;
                P1.estamina = 0;
                P1.sorte = 5;
                P1.mana = 60;
                P1.armadura.getNome();
                P1.armadura.getDurabilidade();
                P1.armadura.getPeso();
                P1.armadura.getDefesa();
                P1.armadura.getClass();
                P1.arma.getClass();
                P1.arma.getDano();
                P1.arma.getDurabilidade();
                P1.arma.getNome();
                controle = 1;
                break;
            default:
                System.out.println("Classe Inválida, Tente Novamente:");

                break;
            }
        }

        
        System.out.println("Agora, vamos criar o Personagem 2\n");
        System.out.println("Escolha um nome para o Personagem 2:\n");
        P2.nome = entrada.next();
        System.out.println("\n");
        System.out.println("Qual Será a Classe do Personagem?");
        System.out.println("Insira 'G' para Guerreiro | 'M' para Mago | 'A' para Arqueiro");
        controle = 0;
        while(controle == 0){
            char classe = entrada.next().charAt(0);
            switch (classe) {
                
            case 'G'| 'g':
                P2.classe = "Guerreiro";
                P2.forca = 80;
                P2.destreza = 50;
                P2.agilidade = 30;
                P2.inteligencia = -3;
                P2.carisma = 0;
                P2.resistencia = 80;
                P2.vida = 100;
                P2.estamina = 90;
                P2.sorte = 10;
                P2.mana = 63;
                P2.armadura.getNome();
                P2.armadura.getDurabilidade();
                P2.armadura.getPeso();
                P2.armadura.getDefesa();
                P2.armadura.getClass();
                P2.arma.getClass();
                P2.arma.getDano();
                P2.arma.getDurabilidade();
                P2.arma.getNome(); 
                controle = 1;
                break;
            case 'M' | 'm':
                P2.classe = "Mago";
                P2.forca = 0;
                P2.destreza = 90;
                P2.agilidade = 0;
                P2.inteligencia = 95;
                P2.carisma = 0;
                P2.resistencia = 50;
                P2.vida = 40;
                P2.estamina = 45;
                P2.sorte = 85;
                P2.mana = 100;
                P2.armadura.getNome();
                P2.armadura.getDurabilidade();
                P2.armadura.getPeso();
                P2.armadura.getDefesa();
                P2.armadura.getClass();
                P2.arma.getClass();
                P2.arma.getDano();
                P2.arma.getDurabilidade();
                P2.arma.getNome();
                controle = 1;
                break;
            case 'A' | 'a':
                P2.classe = "Arqueiro";
                P2.forca = 0;
                P2.destreza = 90;
                P2.agilidade = 0;
                P2.inteligencia = 60;
                P2.carisma = 0;
                P2.resistencia = 30;
                P2.vida = 75;
                P2.estamina = 0;
                P2.sorte = 5;
                P2.mana = 60;
                P2.armadura.getNome();
                P2.armadura.getDurabilidade();
                P2.armadura.getPeso();
                P2.armadura.getDefesa();
                P2.armadura.getClass();
                P2.arma.getClass();
                P2.arma.getDano();
                P2.arma.getDurabilidade();
                P2.arma.getNome();
                controle = 1;
                break;
            default:
                System.out.println("Classe Inválida, Tente Novamente:");

                break;
            }
        }
        //---------------------------[]

        //-----------------------[ Pancadaria :P ]-------------------[]
        Random dado = new Random();

        int round  = 1;
        while(P1.getVida() > 0 && P2.getVida() > 0){
            System.out.println("Round: " + round);
            System.out.println("Oponente 1: " + P1.getNome());
            System.out.println("Oponente 2: " + P2.getNome());

            //turno do Personagem 2 (P2)
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            
            int valorAtaque;
            valorAtaque = P2.atacar(valorDado, valorAtaque);
            P1.defender(valorAtaque);
            
            //turno do Personagem 1 (P1)
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            valorAtaque = P1.atacar(valorDado, valorAtaque);
            P2.defender(valorAtaque);
            //round = round +1
            round++;
        }
        if(P2.getVida() <= 0){
            System.out.println("Gerreiro " + P1.getNome() + " foi campeão!!!" );
        }else if(P1.getVida() <= 0){
            System.out.println("br.edu.iftm.rpgjava.classes.Mago " + P2.getNome() + " foi campeão!!!");
        }


        
        entrada.close();

    }
}
