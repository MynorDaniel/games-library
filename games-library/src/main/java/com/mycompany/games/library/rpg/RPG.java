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
public class RPG {
    
    private final Menu menu;
    private final Scanner scanner;
    
    public RPG(){
        menu = new Menu();
        scanner = new Scanner(System.in);
    }
    
    public void start(){
        
        Character character = createCharacter();
        
        while(true){
            menu.showRPGMenu();
            String option = scanner.nextLine();
            
            switch(option){
                case "1" -> {//A la carga!!!
                    Battle battle = new Battle(character);
                    battle.start();
                }
                case "2" -> {//Tienda
                    //sin implementacion
                }
                case "3" -> {//zzz
                    character.sleep();
                }
                case "4" -> {//Estado
                    character.showStatus();
                }
                case "5" -> {//Mas poder!!!
                    character.powerUp();
                }
                case "6" -> {//Salir
                    break;   
                }
                default -> System.out.println("Seleccione una opcion valida");
            }
        }
    }
    
    private Character createCharacter(){
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese el nombre del personaje:");
        String name = this.scanner.nextLine();
        return new Character(name);
    }
    
    
}
