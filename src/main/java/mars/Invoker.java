package mars;

import mars.command.Command;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<ArrayList<Command>> commandQueues;

    public Invoker() {
        this.commandQueues = new ArrayList<>();
    }

    public void configureNewCommandQueue(ArrayList<Command> commands) {
        this.commandQueues.add(commands);
    }

    public void executeQueue() {
        // TODO: One command each time (avoid execute queues in order)
        for(ArrayList<Command> queue: commandQueues) {
            while (queue.size()>0) {
                Command c = queue.remove(0);
                c.execute();
            }
        }
    }
}
