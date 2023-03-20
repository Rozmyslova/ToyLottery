import java.util.Scanner;

public class CorrectChoise {
    /**
     * @return 
     *
     */
    public int correctChoise(){
        int choise;
        Scanner sc = new Scanner(System.in);
        do {
            while (!sc.hasNextInt()){ 
                System.out.printf("Вы ввели не число! Проверьте, пожалуйста, правильность написания. Итак: "); 
                sc.next(); 
            }
            choise = sc.nextInt();
            if (choise != 1 & choise != 2) {
                System.out.printf("Такого пункта нет! \n");
            }
        } while (choise <= 0 | choise >= 3);
        return(choise); 
    }
}
    
