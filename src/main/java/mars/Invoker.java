package mars;

import mars.command.Command;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commands;

    public void configure(ArrayList<Command> parse) {
        this.commands = parse;
    }

    public void executeQueue() {
        while (commands != null && commands.size()>0) {
            Command c = commands.remove(0);
            c.execute();
        }
    }
}
