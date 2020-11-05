import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workers {

    List <Detail> details = new ArrayList<>();
    List <Worker> workerArrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);
    private int id;
    private int idd;


    public void addOne(){
        Detail detail = new Detail(id++, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner2.nextInt());
        Worker worker = new Worker(idd++, scanner.nextLine());
        workerArrayList.add(worker);
        details.add(detail);
    }

    public void showByWorker(int di){
        for (int j = 0; j < workerArrayList.size(); j++) {
            showCertain(workerArrayList.get(di).getId());
        }
    }


    public void showCertain(int i){
        System.out.println("id: " + details.get(i).getId() + "\n"
                + "name of detail: " + details.get(i).getNameOfDetail() + "\n"
                + "type of material: " + details.get(i).getMaterial() + "\n"
                + "purpose of detail: " + details.get(i).getPurpose() + "\n"
                + "amount: " + details.get(i).getAmount() + "\n"
                + "name of Worker: " + workerArrayList.get(i).getName());
    }

    public void showAll(){
        for (int i = 0; i < details.size(); i++) {
            showCertain(i);
        }
    }

    public void menu(){
        System.out.println("1 - add one\n" +
                "2 - show certain\n" +
                "3 - show by worker name\n" +
                "4 - show all\n" +
                "0 - exit");
    }

}
