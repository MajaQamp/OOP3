package OOP;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    ArrayList<Integer> listOfNumbers;


    public Numbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }


    public int maxNumber() {
        for (Integer number : listOfNumbers) {
        }
        Integer max = Collections.max(listOfNumbers);
        return max;
    }

    public int minNumber() {
        for (Integer number : listOfNumbers) {
        }
        Integer min = Collections.min(listOfNumbers);
        return min;
    }

    public int sumOfNumbers() {
        int sumOfAllNumbers = 0;
        for (Integer number : listOfNumbers) {
            sumOfAllNumbers = sumOfAllNumbers + number.intValue();
        }
        return sumOfAllNumbers;
    }

 /*   public ArrayList<Integer> primeNumbers() {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primeNumbers().add(i);
        }
        return primeNumbers();
        }
        */


}



