package Multidimentional;

public class Practice4 {
    public static void main(String[] args){
        int[][]myNumbers = { {1,2,3,4}, {5,6,7} };
        for(int[]row : myNumbers){
            for(int i : row){
                System.out.println(i);
            }
        }
    }
}
