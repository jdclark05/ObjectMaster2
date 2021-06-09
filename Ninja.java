public class Ninja extends Human {
    public int stealth = 10;

    public int displayHealth(){
        return health;
    }

    public int displayStealth(){
        return stealth;
    }
    
    public int steal(int h, String enemy, String name){
        h -= this.stealth;
        this.health += this.stealth;
        System.out.println("The ninja " + name + " attacks " + enemy + " with a stealth attack. Stealing " + this.stealth + " health from them. Reducing their health to " + h + ", and increasing their own to " + this.health + "\n");
        return h;
    }

    public void runAway(String name){
        this.health -= 10;
        System.out.println("The ninja " + name + " ran away. Reducing their health to " + this.health + "\n");
    }
}
