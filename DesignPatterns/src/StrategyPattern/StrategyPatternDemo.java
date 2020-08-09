package StrategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args){
        King king = new King(new SwordBehaviour());
        king.fight();
        king.setWeaponBehaviour(new BowAndArrowBehaviour());
        king.fight();

        Troll troll = new Troll(new AxeBehaviour());
        troll.fight();
        troll.setWeapon(new KnifeBehaviour());
        troll.fight();
    }
}
