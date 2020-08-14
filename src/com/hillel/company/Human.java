package com.hillel.company;

import java.util.Arrays;

class Human {

    static void bubleSort(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for(int j =0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void turnWord(String word){
        char [] letterWord = word.toCharArray();
        for (int i = 0; i < letterWord.length / 2; i++){
            char temp = letterWord[letterWord.length - (i+1)];
            letterWord[letterWord.length - (i + 1)] = letterWord[i];
            letterWord[i] = temp;
            }

        System.out.println("Reverse with swapping variables and result is:  " +Arrays.toString(letterWord));
    }

    static void reverseWord(String word){
        StringBuilder wordOut  = new StringBuilder();
        wordOut.append(word);
        wordOut.reverse();

        System.out.println("Reverse with StringBuilder method and result is:  " + wordOut);
    }

    static void smallReverse(String word){
        char [] letterWord = word.toCharArray();
        System.out.print("Reverse with writing letters from end and result is:  " );
        for (int i = letterWord.length - 1; i >= 0; i--){
            System.out.print(letterWord[i]);
        }
    }
}
