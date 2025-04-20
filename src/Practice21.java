public class Practice21{
    public static void main(String[] args){
        int maxScore = 500;

        //The actual score of the user
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        //Print the result
        System.out.println("User's percentage is: " + percentage);
    }
}