package StrategyPattern;

public class Queen extends Character {

    WeaponBehaviour weaponBehaviour;
    public Queen(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
        this.weaponBehaviour = weaponBehaviour;
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
