package StrategyPattern;

public class Troll extends Character {

    WeaponBehaviour weaponBehaviour;
    public Troll(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
        this.weaponBehaviour = weaponBehaviour;
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
