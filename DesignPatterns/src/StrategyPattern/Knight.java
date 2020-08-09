package StrategyPattern;

public class Knight extends Character {

    WeaponBehaviour weaponBehaviour;
    public Knight(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
        this.weaponBehaviour = weaponBehaviour;
    }
    @Override
    public void fight() {
        System.out.print("Knight fighting with ");
        weaponBehaviour.useWeapon();
    }
    public void setWeapon(WeaponBehaviour weapon){
        this.weaponBehaviour = weapon;
    }
}
