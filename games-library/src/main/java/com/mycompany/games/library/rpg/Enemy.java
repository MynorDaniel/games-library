/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.games.library.rpg;

/**
 *
 * @author mynordma
 */
public class Enemy {
    
    private int hp;
    private final int attackFactor;

    public Enemy() {
        this.hp = 100;
        this.attackFactor = 10;
    }
    
    public void attack(Character enemy){
        int min = attackFactor + enemy.getLvl();
        int max = min + 10;
        int damage = (int)(Math.random() * ((max - min) + 1)) + min;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(".....turno del enemigo");
        System.out.println(".....has recibido " + damage + " de daño");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
}
