package behaivoral.state;

public class StopState implements State{
    @Override
    public void doAction(StateContext context){
        System.out.println("The player is at the stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop state";
    }
}
