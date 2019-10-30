package Task1;

public class Main {

    public boolean isSumOftwoNum(int size, int k){

        int [] array = new int [size];

        for (int i = 0; i <= size; i++){
            for (int j = 1; j <= size; j++){
                if(array[i] + array[j] == k){
                    return true;
                }
            }
        }
        return false;
    }

    public int []

    public static void main(String[] args) {

    }
}