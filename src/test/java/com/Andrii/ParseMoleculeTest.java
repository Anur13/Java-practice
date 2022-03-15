package com.Andrii;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParseMoleculeTest {

    @Test
    void getAtoms() {
        String test = "Mg(OH)2";
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Mg", 1);
        testMap.put("H", 2);
        testMap.put("O", 2);

        assertEquals(testMap, ParseMolecule.getAtoms(test));
    }
}