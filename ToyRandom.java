import java.util.ArrayList;
import java.util.Random;

public class ToyRandom {
    /**
     * 
     */
    public void playToys(){
        ArrayList<AddToys> toys = new ArrayList<AddToys>(ToysList.allToysList());
        int numberOfToys = toys.size();
        Random random = new Random();
        int randomID = random.nextInt(numberOfToys - 1) + 1;
        System.out.println("randomID = " + randomID);
        System.out.println("Поздравляю! Ваша игрушка - " + toys.get(randomID).toyName);
        System.out.println("Подойдите, пожалуйста, к нашему управляющему, чтоб забрать ее");
        /*System.out.println("Обновленное количество - " + toys.get(randomID).quantity);
        toys.get(randomID).quantity = toys.get(randomID).quantity - 1;
        System.out.println("Обновленное количество - " + toys.get(randomID).quantity);*/
    }
}
