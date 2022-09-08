import java.util.Random;

public class Tasl02 {
    public static void main(String[] args) {
        Random random = new Random();
        // random integer numbers
//        int bound = 100;
//        for(int i = 0; i < 10; i++){
//            System.out.print(random.nextInt(bound) + " ");
//        }
//    }
        // random integer numbers 10-20

       int a = 10;
       int b = 20;
       for(int i = 0; i < 10; i++){
           System.out.print(random.nextInt(b - a + 1) + " ");
      }
  }

    }
