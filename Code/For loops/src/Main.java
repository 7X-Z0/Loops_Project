public class Main {
    public static void main (String[] args) throws InterruptedException {
        //all iterations run with a 0.5 second interruption for readability while running.
        //regular +1 for loop
        System.out.println("Iteration: 1");
        for (int i = 1; i < 10; i++){
            Thread.sleep(500);
            System.out.println(i);
        }
        //for loop that add +2 to each iteration, giving all odd numbers
        System.out.println("Iteration: 2");
        for (int x = 1; x < 10; x = x + 2){
            Thread.sleep(500);
            System.out.println(x);
        }
        //for loop in which the variable starts at 10, and adds 5 to each iteration
        System.out.println("Iteration: 3");
        for (int b = 10; b <= 50; b+=5){
            Thread.sleep(500);
            System.out.println(b);
        }
        //for loop in which the variable is subtracted until it is greater than -15
        System.out.println("Iteration: 4");
        for (int t = 1; t > -15; t = t - 1){
            Thread.sleep(500);
            System.out.println("This person owes " + t + " dollars!");
        }
        //simple for loop in which the variable is added to a sentence
        System.out.println("Iteration: 5");
        for (int p = 0; p < 5; p++){
            Thread.sleep(500);
            System.out.println("Congrats! you found " + p + " dollars!");
        }
        //for loop in which the code does not stop until it equals 25
        System.out.println("Iteration: 6");
        for (int c = 5; c <= 25; c++){
            Thread.sleep(500);
            System.out.println(c);
        }
        //for loop in which the variable is subtracted by 5 until the variable reaches 0
        System.out.println("Iteration: 7");
        for (int k = 50; k >= 0; k = k - 5){
            Thread.sleep(500);
            System.out.println("Oh no! You're losing money! You have " + k + " dollars left!");
        }
        //for loop in which the variable is added 2 then subtracted by 1 within the iteration
        System.out.println("Iteration: 8");
        for (int o = 1; o < 10; o = o + 2){
            Thread.sleep(500);
            System.out.println(o);
            o = o - 1;
            Thread.sleep(500);
            System.out.println(o);
        }
        //for loop in which the variable is added by 10 then subtracted by 5
        System.out.println("Iteration: 9");
        for (int y = -50; y < 10; y = y + 10){
            Thread.sleep(500);
            System.out.println(y);
            y = y - 10;
            Thread.sleep(500);
            System.out.println(y);
        }
        //for loop in which it never ends until the program is interrupted
        for (int q = 1; q >= 1; q++){
            Thread.sleep(500);
            System.out.println(q);
        }
    }
}
//Code made by 7X_Z0 (Github)
