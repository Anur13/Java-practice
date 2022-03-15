package com.Andrii;

public class NumberZooPatrol {

    //         Not optimized solution

    //    public static int findMissingNumber(int[] numbers) {
//
//        int [] myNums = Arrays.copyOf(numbers, numbers.length);
//        Arrays.sort(myNums);
//
//        int curr = 0;
//        int shouldBeNext = curr + 1;
//        int missingNum = 0;
//        for (int number : myNums) {
//            curr = number;
//            if (curr != shouldBeNext) {
//                missingNum =  shouldBeNext;
//                break;
//            }
//            shouldBeNext = curr + 1;
//        }
//        return missingNum;
//    }

    public static int findMissingNumber(int[] numbers) {
        var sum = 0;
        var expectedSum = numbers.length + 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            expectedSum += i + 1;
        }
//        return expectedSum - sum;
        return 1;
    }


}