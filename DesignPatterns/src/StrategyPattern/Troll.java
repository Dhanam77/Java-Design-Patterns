package StrategyPattern;

public class Troll extends Character {
    public Troll(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }
    @Override
    public void fight() {
        System.out.print("Troll fighting with ");
        weaponBehaviour.useWeapon();
    }
    public void setWeapon(WeaponBehaviour weapon){
        this.weaponBehaviour = weapon;
    }
}
