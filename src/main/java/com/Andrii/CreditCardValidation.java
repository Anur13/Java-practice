package com.Andrii;

public class CreditCardValidation {
    public static boolean validate(String cardNumber) {
        char[] nums = cardNumber.toCharArray();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = Character.getNumericValue(nums[i]);
            int reversedIndex = Math.abs(i - nums.length);
            if (reversedIndex % 2 == 0) {
                num = num * 2 >= 10 ? (num * 2) - 9 : num * 2;
            }
            sum += num;
        }
        return sum % 10 == 0;
    }
}
