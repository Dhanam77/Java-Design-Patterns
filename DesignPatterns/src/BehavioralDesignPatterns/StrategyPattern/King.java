package BehavioralDesignPatterns.StrategyPattern;

public class King extends Character {

    public King(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }
    @Override
    public void fight() {
        System.out.print("King fighting with ");
        weaponBehaviour.useWeapon();
    }
}
