/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.games.library;

import com.mycompany.games.library.carreras.Carrera;
import com.mycompany.games.library.rpg.RPG;
import java.util.Scanner;

/**
 *
 * @author mynordma
 */
public class GameEngine {
    
    private final Menu menu;
    private final Scanner scanner;
    
    public GameEngine(){
        menu = new Menu();
        scanner = new Scanner(System.in);
    }
    
    public void start(String[] args){
        
        if(args.length != 0){
            String selectedGame = args[0];
            switch(selectedGame){
                case "rpg" -> {
                    RPG rpg = new RPG();
                    rpg.start();
                }
                case "carreras" -> {
                    Carrera carrera = new Carrera();
                    carrera.start();
                }
            }
        }
        
        startLoop();
    }
    
    private void startLoop(){
        
        while(true){
          menu.showMainMenu();
          String option = scanner.nextLine();
          
          switch(option){
                case "1" -> {
                    RPG rpg = new RPG();
                    rpg.start();
                }
                case "2" -> {
                    Carrera carrera = new Carrera();
                    carrera.start();
                }
                case "3" -> System.exit(0);
                default -> System.out.println("Seleccione una opcion valida");
            }
        }
    }
}
