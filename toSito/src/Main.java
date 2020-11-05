import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public void sol(){
        Workers workers = new Workers();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        workers.menu();
        int choice = scanner.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("well, input by this instruction:\n" +
                            "name of detail\n" +
                            "material\n" +
                            "purpose\n" +
                            "amount\n" +
                            "name of Worker\n");
                    workers.addOne();
                    workers.menu();
                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("which?");
                    int c = scanner2.nextInt();
                    workers.showCertain(c);
                    workers.menu();
                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("which?");
                    int ci = scanner2.nextInt();
                    workers.showByWorker(ci);
                    workers.menu();
                    choice = scanner.nextInt();
                    break;
                case 4:
                    workers.showAll();
                    workers.menu();
                    choice = scanner.nextInt();
                    break;


            }
        }
    }
}
