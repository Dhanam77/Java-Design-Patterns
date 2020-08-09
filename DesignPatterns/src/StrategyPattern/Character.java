package StrategyPattern;

public abstract class Character {
    public WeaponBehaviour weaponBehaviour;
    Character(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
    public abstract void fight();
}
