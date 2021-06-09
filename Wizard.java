public class Wizard extends Human {
    public int health = 50;
    public int intelligence = 8;

    public int displayHealth(){
        return health;
    }

    public int heal(int h, String enemy, String name){
        h += this.intelligence;
        System.out.println("The Wizard knwon as " + name + " heals " + enemy + ". Increasing their health to " + h + "\n");
        return h;
    }

    public int fireball(int h, String enemy, String name){
        h -= (this.intelligence * 3);
        System.out.println("The Wizard known as " + name + " attacks " + enemy + " with the Fireball spell. Reducing their health to " + h + "\n");
        return h;
    }
}
