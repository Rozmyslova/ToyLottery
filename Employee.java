public class Employee {
    private int choise;
    public void workingMoments(){
        do {
            System.out.printf("Здравствуйте, коллега! Что вы хотите сделать? \n");
            System.out.printf("1 - просмотреть список игрушек; \n");
            System.out.printf("2 - редактировать список \n");
            System.out.printf("Ваш выбор: ");
            CorrectChoise ch = new CorrectChoise();
            choise = ch.correctChoise();
        } while (choise <= 0 | choise >= 3);
        
        if (choise == 1) {
            ShowToysList showToys = new ShowToysList();
            showToys.showList();
        }
        /*else {
            Employee workingTask = new Employee();
            workingTask.workingMoments();
        }*/
    }
}
