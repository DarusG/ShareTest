package behaivoral.state.chainOfResponsebility;
import java.util.Scanner;

public class Main {
    private DispenseChain c1;
    public Main(){
        this.c1 = new Dollar50Dispense();
        DispenseChain c2 = new Dollar20Dispense();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    public static void main(String[] args){
        Main main = new Main();
        while(true){
            System.out.println("Input amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if(amount % 10 != 0){
                System.out.println("Amount should be in multiples of 10.");
                return;
            }
            main.c1.dispense(new Currency(amount));
        }
    }
}
