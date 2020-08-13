package BehavioralDesignPatterns.StrategyPattern;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Knife");
    }
}
