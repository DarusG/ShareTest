package behaivoral.state.chainOfResponsebility;

public class Dollar50Dispense implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=50){
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0){
                this.chain.dispense(new Currency((remainder)));
            } else{
                this.chain.dispense(currency);
            }
        }
    }
}