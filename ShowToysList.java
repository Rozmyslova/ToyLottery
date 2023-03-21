import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ShowToysList {
    private int choise;

    public void showList() {
        do {
            System.out.printf("Вы хотите: \n");
            System.out.printf("1 - вывести список на экран; \n");
            System.out.printf("2 - сохранить в файл \n");
            System.out.printf("Ваш выбор: ");
            CorrectChoise ch = new CorrectChoise();
            choise = ch.correctChoise();
        } while (choise <= 0 | choise >= 3);

        var toys = new ArrayList<AddToys>(ToysList.allToysList());

        if (choise == 1) {
            show(toys);
            System.out.println();
        } else {
            inFile(toys);
        }
    }

    public void show(ArrayList<AddToys> toys) {
        for (int i = 0; i < toys.size(); i++) {
            toys.get(i).info();
        }
    }

    public void inFile(ArrayList<AddToys> toys) {
        File file = new File("toyList.txt");
        try (PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8)) {
            for (int i = 0; i < toys.size(); i++) {
                out.println("Название игрушки - " + toys.get(i).toyName);
                out.println("Количество игрушек - " + toys.get(i).quantity);
                out.println();
            }
            System.out.println("Данные успешно записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param toys
     */
    public void probability(ArrayList<AddToys> toys) {
        Double sum = 0.0;
        for (int i = 0; i < toys.size(); i++) {
            sum = sum + toys.get(i).quantity;
        }
        
        for (int i = 0; i < toys.size(); i++) {
            Double probability = (double) (toys.get(i).quantity / sum * 100) ;
            System.out.println("Название игрушки - " + toys.get(i).toyName);
            System.out.print("Вероятность выпадения - ");
            System.out.printf( "%.2f", probability);
            System.out.println(" % ");
            System.out.println();
        }

    }

    private Double Double(int i) {
        return null;
    }
}
