package mars.command;

public class InvalidCommand implements Command {
    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }
}
