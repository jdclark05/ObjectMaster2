public class Samurai extends Human {
    public int health = 200;
    private static int noOfSamurai = 0;

    public int displayHealth(){
        return health;
    }

    public Samurai(){
        noOfSamurai++;
    }

    public int deathBlow(int h, String enemy, String name){
        h = 0;
        this.health = health/2;
        System.out.println("Samurai " + name + " attacks " + enemy + " with the Death Blow. Reducing their health to " + h + "\n");
        return h;
    }

    public void meditate(String name){
        this.health = health + (health/2);
        System.out.println("Samurai " + name + " meditates, increasing their health to " + this.health + "\n");
    }

    public int howMany(){
        return noOfSamurai;
    }
}
