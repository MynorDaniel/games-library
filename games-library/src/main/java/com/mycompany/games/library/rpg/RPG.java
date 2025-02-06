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
        
        //Crear personaje
        
        while(true){
            menu.showRPGMenu();
            String option = scanner.nextLine();
            
            switch(option){
                case "1" -> {//A la carga
                    Battle battle = new Battle();
                    battle.start();
                }
                case "2" -> {//Tienda
                }
                case "3" -> {//zzz
                }
                case "4" -> {//Estado
                }
                case "5" -> {//Mas poder
                }
                case "6" -> {//Salir
                    break;   
                }
                default -> System.out.println("Seleccione una opcion valida");
            }
        }
    }
}
