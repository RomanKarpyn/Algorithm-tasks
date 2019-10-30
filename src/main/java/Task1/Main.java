package Task1;

import java.util.Scanner;

public class Main {

    public boolean isSumOftwoNum(int [] array, int k){

        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++){
                if(array[i] + array[j] == k){
                    return true;
                }
            }
        }
        return false;
    }

    public int [] initArray(int [] array){
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter int for array["+i+"]: ");
            array[i] = kb.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = new int[5];
        Main main = new Main();

        main.initArray(array);
        System.out.println("Is in array sum of any two numbers which = k: " + main.isSumOftwoNum(array, 11));
    }
}