package BehavioralDesignPatterns.StrategyPattern;

public abstract class Character {
    public WeaponBehaviour weaponBehaviour;
    Character(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
    public abstract void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
}
