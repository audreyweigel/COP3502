public class Pakuri {

    private String species;
    private int attack, defense, speed;

    public Pakuri(String species) {
    /* This method should be the only constructor for this class. */
    this.species = species;
    attack = (species.length() * 7) + 9;
    defense = (species.length() * 5) + 17;
    speed = (species.length() * 6) + 13;
    }

    public String getSpecies() {
    // Returns the species of this critter
    return species;
    }

    public int getAttack() {
    // Returns the attack value for this critter
    return attack;
    }

    public int getDefense() {
    // Returns the defense value for this critter
    return defense;
    }

    public int getSpeed() {
    // Returns the speed of this critter
    return speed;
    }

    public void setAttack(int newAttack) {
    // Changes the attack value for this critter to newAttack
    attack = newAttack;
    }

    public void evolve() {
    // Will evolve the critter as follows: a) double the attack; b) quadruple the defense; and c) triple the speed
    attack *= 2;
    defense *= 4;
    speed *= 3;
    }
}