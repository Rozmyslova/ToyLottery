import java.util.ArrayList;

public class Employee {
    private int choise;
    public void workingMoments(){
        System.out.printf("Здравствуйте, коллега! Что вы хотите сделать? \n");
        System.out.printf("1 - просмотреть список игрушек; \n");
        System.out.printf("2 - просмотреть вероятность выпадения игрушки \n");
        System.out.printf("Ваш выбор: ");
        CorrectChoise ch = new CorrectChoise();
        choise = ch.correctChoise();
                
        if (choise == 1) {
            ShowToysList showToys = new ShowToysList();
            showToys.showList();
        }
        else {
            var toys = new ArrayList<AddToys>(ToysList.allToysList());
            ShowToysList probList = new ShowToysList();
            probList.probability(toys);;
        }
    }
}
