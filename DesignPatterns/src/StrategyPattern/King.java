package StrategyPattern;

public class King extends Character {

    WeaponBehaviour weaponBehaviour;
    public King(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
        this.weaponBehaviour = weaponBehaviour;
    }
    @Override
    public void fight() {
        System.out.print("King fighting with ");
        weaponBehaviour.useWeapon();
    }
    public void setWeapon(WeaponBehaviour weapon){
        this.weaponBehaviour = weapon;
    }
}
