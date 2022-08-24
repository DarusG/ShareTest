package behaivoral.state;

public class StartState implements State{
    @Override
    public void doAction(StateContext context){
        System.out.println("The player is at the start state");
        context.setState(this);
    }

    public String toString(){
        return "Start state";
    }
}
