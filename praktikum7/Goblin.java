
package com.mycompany.latihan7;

public class Goblin extends Enemy implements Utility{
    private int level;
    private String nama;
    private double hp;

    public Goblin(String nama,double hp,double exp,double damage){
        super(damage,exp);
        this.nama = nama;
        this.hp = hp;
    }

    @Override
    public void startGame(){
        System.out.println("Hi!" +  this.nama + " " + "HP anda : " + this.hp + " Exp : " + getExp());
    }

    @Override
    public String getNama(){
        return nama;
    }


    public double getHp(){
        return hp;
    }

    public void setHp(double newHp){
        if(newHp > 0){
            this.hp = newHp;
        }else{
            System.out.println(this.nama + " " + "Sudah Dikalahkan");
            this.hp = 0;
        }

    }

    public void attackPlayer(Player e){
        if(hp > 0){
            double dmg = getDamage();
            System.out.println(this.nama+ " " +  "Menyerang " + " " +  e.getNama() + "...");
            System.out.println("Damage : " + " " + dmg);
            e.setHp(e.getHp() - dmg);
            System.out.println("Hp" + " " + e.getNama() + " " +  " Sekarang... " + e.getHp());
            setExp(15);
            if(getExp() > 100 && hp > 0){
                setExp(0);
                level++;
                setDamage(5);
                System.out.println("Level Up... ");
                System.out.println("Level" +  " " + this.nama + "Sekarang : " + " " + level);
            }else if(hp > 0){
                System.out.println("Exp " + " " + this.nama + " " +  "Bertambah +" + getExp());
            }
            System.out.println(" ");
        }else{
            System.out.println(nama + " "+ " Sudah Dikalahkan, Tidak Bisa Menyerang..");
        }
    }


}
