/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.games.library.rpg;

/**
 *
 * @author mynordma
 */
public class Character {
    
    private int hp;
    private int mp;
    private int xp;
    private String name;
    private int gold;

    public void sleep(){
    
    }
    
    public void showStatus(){
        System.out.println("----------------------------------------------------");
        System.out.println("Estado del personaje");
        System.out.println("Nombre: " + name);
        System.out.println("Oro: " + gold);
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("XP: " + xp);
        System.out.println("----------------------------------------------------");
    }
    
    public void powerUp(){
        
    }
}
