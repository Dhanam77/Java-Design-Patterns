package BehavioralDesignPatterns.StrategyPattern;

public class SwordBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("Sword");
    }
}
