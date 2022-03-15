package com.Andrii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardValidationTest {
    @Test
    public void test891(){
        assertEquals(true, CreditCardValidation.validate("8675309"));
    }
}