class Human {
    public int strength = 3;
    public int intelligence = 3;
    public int stealth = 3;
    public int health = 100;

    public int displayHealth(){
        return health;
    }

    public int attack(String name, int x, String enemy){
        x -= 25; 
        System.out.println(name + " attacked " + enemy + " dealing 25 damage. " + enemy + "'s health drops to " + x + "\n");
        return x;
    }
}