package Lab1.ex1;

public class BuzzFizz  {
    public static void main(String[] args) {
        for(int i= 1; i<= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz,\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz,\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz,\n");
            } else if ( i % 7 == 0) {
                System.out.print("Rizz, \n");
            } else if (i % 11 == 0) {
                System.out.print("Jazz,\n");
            } else {
                System.out.print(i+ ",\n");
            }
        }

    }
}


