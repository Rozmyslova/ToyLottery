import java.util.ArrayList;
import java.util.Random;

public class ToyRandom {
    /**
     * 
     */
    public void playToys() {
        ArrayList<AddToys> toys = new ArrayList<AddToys>(ToysList.allToysList());
        Random random = new Random();
        int randomID = random.nextInt(toys.size() - 1) + 1;
        while (toys.get(randomID).quantity == 0) {
            System.out.println("К сожалению, такой игрушки нет в наличии, попробуйте еще раз!");
            randomID = random.nextInt(toys.size() - 1) + 1;
        }
        System.out.println("Поздравляю! Ваша игрушка - " + toys.get(randomID).toyName);
        System.out.println("Подойдите, пожалуйста, к нашему управляющему, чтоб забрать ее");
    }

    public ToyRandom() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
