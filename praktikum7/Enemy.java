
package com.mycompany.latihan7;
import java.util.concurrent.ThreadLocalRandom;

public class Enemy{
        private double exp;
        private double damage;


        public Enemy(double damage,double exp){
            this.damage = damage;
            this.exp = exp;

        }

       protected double getExp(){
            return exp;
       }

       protected double setExp(double addExp){
            if(addExp > 0){
                return exp += addExp;
            }else{
                return exp = 0;
            }

       }


    public void attackPlayer(Player e){
        e.setHp(e.getHp() - getDamage());
    }

    protected double getDamage(){
        boolean crit5 = ThreadLocalRandom.current().nextInt(20) == 0;
        return crit5 ? damage * 2.0 : damage;
    }

    protected double setDamage(double addDamage){
            return damage += addDamage;
    }
}
