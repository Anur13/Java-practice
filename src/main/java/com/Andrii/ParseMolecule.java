package com.Andrii;

import java.util.HashMap;
import java.util.Map;

public class ParseMolecule {

    public static Map<String, Integer> getAtoms(String formula) {
        HashMap<String, Integer> atoms = new HashMap<>();

        char[] characters = formula.toCharArray();
        StringBuilder currentAtom = new StringBuilder();

        // Add molecules to hashmap
        for (char currentC : characters) {
            if (Character.isUpperCase(currentC)) {
                if (!currentAtom.isEmpty() && !atoms.containsKey(currentAtom.toString())) {
                    atoms.put(currentAtom.toString(), 0);
                    currentAtom.delete(0, 5);
                }
                currentAtom.append(currentC);
            }
            if (Character.isLowerCase(currentC)) {
                currentAtom.append(currentC);
            }
        }
        atoms.put(currentAtom.toString(), 0);
        //---------------------------------------


        String answer = formula.substring(formula.indexOf("(") + 1, formula.lastIndexOf(")"));
        System.out.println(answer);
        return atoms;
    }
}
