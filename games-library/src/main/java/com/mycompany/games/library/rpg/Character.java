/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.games.library.rpg;

import java.util.Scanner;

/**
 *
 * @author mynordma
 */
public class Character {
    
    private int hp;
    private int mp;
    private int xp;
    private final String name;
    private int gold;
    private int lvl;
    
    private final Scanner scanner;
    
    public Character(String name){
        this.name = name;
        this.hp = 100;
        this.mp = 10;
        this.xp = 0;
        this.gold = 100;
        this.lvl = 1;
        
        scanner = new Scanner(System.in);
    }

    public void sleep(){
        if(this.gold < 30){
            System.out.println("Oro insuficiente");
        }else{
            this.hp = 100 * (this.lvl + 1);
            this.mp = 10 * (this.lvl + 1);
            this.gold = this.gold - 30;
            System.out.println(".....has recuperado tu vida y mana");
            System.out.println(".....-30 de oro");
        }
    }
    
    public void showStatus(){
        System.out.println("----------------------------------------------------");
        System.out.println("Estado del personaje");
        System.out.println("Nombre: " + name);
        System.out.println("Oro: " + gold);
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("XP: " + xp);
        System.out.println("Nivel: " + this.lvl);
        System.out.println("----------------------------------------------------");
    }
    
    public void powerUp(){
        System.out.println("Nivel anterior: " + this.lvl);
        while(this.xp >= 100){
            this.lvl++;
            this.xp = this.xp - 100;
        }
        System.out.println("Nivel actual: " + this.lvl);
    }
    
    // battle methods
    
    public void attack(Enemy enemy){
        int damage = (this.lvl + 1) * 10;
        enemy.setHp(enemy.getHp() - damage);
        
        System.out.println(".....el enemigo ha recibido " + damage + " de daño");
    }
    
    public void heal(){
        if(this.mp <= 0){
            System.out.println("Sin suficiente mp");
        }else{
            int n = (this.lvl + 1) * 5;
            this.hp = this.hp + n;
            this.mp = this.mp - 1;
            
            System.out.println(".....+" + n + " hp");
            System.out.println(".....-1 mp");
        }
    }
    
    public void seeItems(){
        System.out.println("----------------------------------------------------");
        System.out.println("Items");
        System.out.println("Selecciona una opcion 1-1");
        System.out.println("1. Pocion curativa");
        
        String option = scanner.nextLine();
        
        if(option.equals("1")){
            this.mp = this.mp + 15;
            this.hp = this.hp + 50;
        }
        
        System.out.println(".....+50 hp");
        System.out.println(".....+15 mp");
    }
    
    public void win(){
        int newXp = (int)(Math.random() * ((30 - 20) + 1)) + 20;
        int newGold = (int)(Math.random() * ((45 - 15) + 1)) + 15;
        
        this.xp = this.xp + newXp;
        this.gold = this.gold + newGold;
        
        System.out.println("...has ganado " + newXp + " de experiencia");
        System.out.println("...has ganado " + newGold + " de oro");
    }
    
    public void run(){
        //disminuir oro
        //sin implementar
    }
    
    // getters and setters

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    
}
