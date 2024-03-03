public class QuestionOne {

    /*

    Print the given pattern for Solid Rectangle

    *****
    *****
    *****
    *****

     */


    public static void main(String[] args) {

        for(int i = 0; i < 4 ; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


/*
        Time complexity of the code : O(n^2)
        Space Complexity : O(1)
 */
