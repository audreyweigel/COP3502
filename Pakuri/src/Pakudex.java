import java.util.Arrays;
import java.util.ArrayList;

public class Pakudex {

    private int sizeofPakudex = 0;
    private int capacity = 0;

    private ArrayList<Pakuri> newPakudex;

    public Pakudex() {
        // Default constructor; if called, the default size for the Pakudex should be 20

        newPakudex = new ArrayList(20);
        capacity = 20;

    }

    public Pakudex(int capacity) {
        // Initializes this object to contain exactly capacity objects when completely full

        newPakudex = new ArrayList(capacity);
        this.capacity = capacity;

    }

    public int getCapacity() {
        // Returns the number of critters that the Pakudex has the capacity to hold at most

        return capacity;

    }


    public int getSize() {
        // Returns the number of critters currently being stored in the Pakudex

        return sizeofPakudex;

    }

    public String[] getSpeciesArray() {
    /* Returns a String array containing the species of the critters as ordered in the Pakudex;
        if there are no species added yet, this method should return null */

        String[] pakuriNames = new String[sizeofPakudex];
        if (this.getSize() == 0) {
            return null;
        }
        // assigning species for each pakuri
        for (int i = 0; i < pakuriNames.length; i++){
           pakuriNames[i] = newPakudex.get(i).getSpecies();
        }
        return pakuriNames;
    }

    public int[] getStats(String species) {
    /* Returns  an  int  array  containing  the  attack,  defense,  and  speed  statistics  of
    species  at  indices  0,  1,  and  2  respectively; if species is not in the Pakudex, returns null */

        Pakuri newSpecies = returnPakuri(species);
        int[] stats = new int [3];

        if (newSpecies == null) {
            return null;
        }

        else {
            stats[0] = newSpecies.getAttack();
            stats[1] = newSpecies.getDefense();
            stats[2] = newSpecies.getSpeed();
            return stats;
        }
    }

    public void sortPakuri() {
    /* Sorts the Pakuri objects in this Pakudex according to Java standard lexicographical ordering
    of species name */
        ArrayList<Pakuri> newList = new ArrayList();
        String[] names = getSpeciesArray();
        Arrays.sort(names);
        for(String s : names){
            newList.add(returnPakuri(s));
        }
        newPakudex = newList;
    }

    public boolean addPakuri(String species) {
        // Adds species to the Pakudex; if successful, return true, and false otherwise

        if (sizeofPakudex == capacity) {
            System.out.println("Error: Pakudex is full!");
            return false;
        }

        else {
            if (newPakudex.contains(returnPakuri(species))){
                System.out.println("Error: Pakudex already contains this species!");
                return false;
            }
            //Only happens if not already in array
            newPakudex.add(new Pakuri(species));
            sizeofPakudex++;
            return true;
        }
    }

    public boolean evolveSpecies(String species) {
        // Attempts to evolve species within the Pakudex; if successful, return true, and false otherwise
        if (newPakudex.contains(returnPakuri(species))) {
            returnPakuri(species).evolve();
            return true;
        }

        else {
            return false;
        }
    }

    private Pakuri returnPakuri(String pakuriGetter) {
        Pakuri result = null;
        String currentPakuri;
        for (int i = 0; i < sizeofPakudex; i++) {
            currentPakuri = newPakudex.get(i).getSpecies();
            if (currentPakuri.equals(pakuriGetter)) {
                result = newPakudex.get(i);
            }
        }
        return result;
    }
}
