public class Client {

    /**
     * 
     */
    public void randomToys() {
        System.out.println("Здравтсвуйте, любимый покупатель! Сегодня у нас проходит розыгрыш игрушек! ");
        int choise;
        System.out.printf("Хотите поучаствовать в нашем розыгрыше? \n");
        System.out.printf("1 - да; \n");
        System.out.printf("2 - нет. \n");
        System.out.printf("Ваш ответ: ");
        CorrectChoise ch = new CorrectChoise();
        choise = ch.correctChoise();

        if (choise == 1) {
            System.out.printf("Отличный выбор! Попытай удачу! \n");
            ToyRandom play = new ToyRandom();
            play.playToys();
        } else {
            System.out.printf("Жаль! Будем ждать вас в следующий раз!  \n");
        }
    }
}
