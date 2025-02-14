/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.games.library.rpg;

import com.mycompany.games.library.Menu;
import java.util.Scanner;

/**
 *
 * @author mynordma
 */
public class Battle {
    
    private final Character character;
    private final Enemy enemy;
    private final Menu menu;
    private final Scanner scanner;
    
    public Battle(Character character){
        this.character = character;
        this.enemy = new Enemy();
        this.menu = new Menu();
        this.scanner = new Scanner(System.in);
    }
    
    public void start(){
        double rand = Math.random();
        
        // Inicia el enemigo
        if(rand > 0.5){
            enemy.attack(character);
        }
        
        while(true){
            
            // Batalla terminada
            
            if(character.getHp() <= 0){
                System.out.println("Has muerto!");
                break;
            }
            
            if(enemy.getHp() <= 0){
                System.out.println("Has ganado");
                break;
            }
            
            //
            
            System.out.println("HP: " + character.getHp() + " MP: " + character.getMp());
            System.out.println("HP Enemigo: " + enemy.getHp());
            menu.showBattleMenu();
            String option = scanner.nextLine();
            
            switch(option){
                case "1" -> {//Atacar
                    character.attack(enemy);
                }
                case "2" -> {//Curar
                    character.heal();
                }
                case "3" -> {//Item
                    character.seeItems();
                }
                case "4" -> {//Tengo miedo
                    System.out.println("Has huído del enemigo");
                    return;
                }
                default -> System.out.println("Opcion no valida, pasando al turno del enemigo");
            }
            
            enemy.attack(character);
        }
    }
}
