
package com.mycompany.latihan7;
import java.util.concurrent.ThreadLocalRandom;

public class Player implements  Utility{
    private String nama;
    private double hp;
    private double exp;
    private double damage;
    private int  level;


    Player(String nama,double hp,double exp,double damage){
        this.nama = nama;
        this.hp = hp;
        this.exp = exp;
        this.damage = damage;
    }

    @Override
    public String getNama(){
        return nama;
    }

    @Override
    public void startGame(){
        System.out.println("Hi!" +  nama + " " + "HP anda : " + hp + " Exp : " + exp);
    }

    protected double setDamage(double addDamage){
        return damage += addDamage;
    }

    protected void setHp(double newHp){
        if(newHp > 0){
            this.hp = newHp;
        }else{
            System.out.println(this.nama + " " + "Sudah Dikalahkan");
            this.hp = 0;
        }

    }

    public double getHp(){
        return hp;
    }

    protected double getDamage(){
        boolean crit5 = ThreadLocalRandom.current().nextInt(20) == 0;
        return crit5 ? damage * 2.0 : damage;
    }


    public void attackGoblin(Goblin e){
        if(hp > 0){
            double dmg = getDamage();
            System.out.println(this.nama+ " " +  "Menyerang " + " " +  e.getNama() + "...");
            System.out.println("Damage : " + " " + dmg);
            e.setHp(e.getHp() - dmg);
            System.out.println("Hp" + " " + e.getNama() + " " +  " Sekarang... " + e.getHp());
            this.exp += 15;
            if(exp > 100 && hp > 0){
                exp = 0;
                level++;
                setDamage(5);
                System.out.println("Level Up... ");
                System.out.println("Level" +  " " + this.nama + "Sekarang : " + " " + level);
            }else if(hp > 0){
                System.out.println("Exp " + " " + this.nama + " " +  "Bertambah +" + exp);
            }
            System.out.println(" ");
        }else{
            System.out.println(nama + " "+ " Sudah Dikalahkan, Tidak Bisa Menyerang..");
        }
    }


}
