public class UImenu {

    private int choise;
    public void mainMenu() {
        System.out.printf("Добро пожаловать в наш магазин! Сейчас у нас проходит розыгрыш игрушек! \n");
        do {
            System.out.printf("Но для начала скажите нам - кто вы? \n");
            System.out.printf("1 - любимый покупатель; \n");
            System.out.printf("2 - уважаемый сотрудник \n");
            System.out.printf("Итак, выберите цифру - ");
            CorrectChoise ch = new CorrectChoise();
            choise = ch.correctChoise();
        } while (choise <= 0 | choise >= 3);
        if (choise == 1) {
            Client ourClient = new Client();
            ourClient.randomToys();
        }
        else {
            Employee workingTask = new Employee();
            workingTask.workingMoments();
        }
    }
}
