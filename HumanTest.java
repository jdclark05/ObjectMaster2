public class HumanTest {
    public static void main(String[] args){
        //Human Creation
        Human madMax = new Human();
        int madMaxH = madMax.displayHealth();

        Human rickSanchez = new Human();
        int rickSanchezH = rickSanchez.displayHealth();

        //Ninja Creation
        Ninja kobi = new Ninja();
        int kobiH = kobi.displayHealth();

        Ninja powMei = new Ninja();
        int powMeiH = powMei.displayHealth();

        //Wizard Creation
        Wizard gandolf = new Wizard();
        int gandolfH = gandolf.displayHealth();

        Wizard dumbledore = new Wizard();
        int dumbledoreH = dumbledore.displayHealth();

        //Samurai Creation
        Samurai jack = new Samurai();
        int jackH = jack.displayHealth();

        Samurai dew = new Samurai();
        int dewH = dew.displayHealth();

        //Method Testing
        //Human Methods
        madMaxH = madMax.attack("madMax", rickSanchezH, "rickSanchez");
        rickSanchezH = rickSanchez.attack("rickSanchez", madMaxH, "madMax");

        //Ninja Methods
        dewH = kobi.steal(dewH, "dew", "kobi");
        powMei.runAway("powMei");

        //Wizard Methods
        rickSanchezH = dumbledore.heal(rickSanchezH, "rickSanchez", "dumbledore");
        jackH = gandolf.fireball(jackH, "jack", "gandolf");

        //Samurai Methods
        madMaxH = jack.deathBlow(madMaxH, "madMax", "jack");
        dew.meditate("dew");
        System.out.println("There are currently " + jack.howMany() + " Samurai in the D&D world" + "\n");
    }
}
