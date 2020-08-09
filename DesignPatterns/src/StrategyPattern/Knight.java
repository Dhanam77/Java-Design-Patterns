package StrategyPattern;

public class Knight extends Character {
    public Knight(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }
    @Override
    public void fight() {
        System.out.print("Knight fighting with ");
        weaponBehaviour.useWeapon();
    }
}
