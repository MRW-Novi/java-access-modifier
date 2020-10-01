package nl.novi.javaprogrammeren.four.hidden;

import java.util.ArrayList;
import java.util.List;

public class PrisonCell {
int numberOfInhabitants;
List<Inhabitant> inhabitants;
int cellNumber;

    public PrisonCell(int cellNumber) {
        this.cellNumber = cellNumber;
        inhabitants = new ArrayList<>();
    }

    public void addPrisoner(String name){
        Inhabitant inhabitant = new Inhabitant(name);
        this.inhabitants.add(inhabitant);
    }

    public List<String> getInhabitants() {
        List<String> listOfNames = new ArrayList<>();
        for (Inhabitant inhabitant : inhabitants) {
                listOfNames.add(inhabitant.getName());
        }
        return listOfNames;
    }

    public int getCellNumber() {
        return cellNumber;
    }
}
