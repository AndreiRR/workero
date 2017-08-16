package exceptions;

public class Exceptions {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(numbers[i]);
            }
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Eroare" + e.getMessage());
        }
    }
}
