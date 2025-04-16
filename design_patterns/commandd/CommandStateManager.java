package design_patterns.commandd;

import java.util.Stack;

public class CommandStateManager {
    Stack<Command> history= new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    public void undoCommand(){
        if(!history.empty()){
            history.pop();
            //code to undo
            //maybe store the stack.top and write undo function for that command
        } else {
            System.out.println("No previous command to undo");
        }
    }
}
