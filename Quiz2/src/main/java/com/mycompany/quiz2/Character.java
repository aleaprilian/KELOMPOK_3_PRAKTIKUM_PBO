package com.mycompany.quiz2;

public class Character {
    private String nama;
    private double hp;
    private double attackPower;
    private double defense;

    public Character(String nama, double hp, double attackPower, double defense) {
        this.nama = nama;
        this.attackPower = attackPower;
        this.hp = hp;
        this.defense = defense;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHp() {
        return hp;
    }

    protected void setHp(double newHp) {
        this.hp = newHp;
    }
    public double getDefense() {
        return defense;
    }
    protected void setDefense(double newDefense) {
        this.defense = newDefense;
    }

    public double getAttackPower() {
        return attackPower;
    }
    protected void setAttackPower(double newPower) {
        this.attackPower= newPower;

    }
}