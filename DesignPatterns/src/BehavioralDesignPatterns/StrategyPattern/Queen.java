package BehavioralDesignPatterns.StrategyPattern;

public class Queen extends Character {
    public Queen(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }
    @Override
    public void fight() {
        System.out.print("Queen fighting with ");
        weaponBehaviour.useWeapon();
    }
    public void setWeapon(WeaponBehaviour weapon){
        this.weaponBehaviour = weapon;
    }
}
