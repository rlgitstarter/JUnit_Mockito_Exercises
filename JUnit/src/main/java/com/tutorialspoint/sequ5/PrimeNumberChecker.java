package com.tutorialspoint.sequ5;

public class PrimeNumberChecker {
    // If you want to ensure a variable always points to the same object, mark the variable final.
    public Boolean validate(final Integer primeNumber) {
        for(int i = 2; i< (primeNumber / 2); i++) {
            if(primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
