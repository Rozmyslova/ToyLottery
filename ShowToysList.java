import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ShowToysList {
    private int choise;
    public void showList(){
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
            for (int i = 0; i < toys.size(); i++) {
                toys.get(i).info();
            }
            System.out.println();
        }
        else {
            File file = new File("toyList.txt");
            try (PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8))
            {
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
    }
}

