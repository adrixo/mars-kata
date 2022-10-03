package mars.command;

import java.util.ArrayList;

public class Factory {
   public ArrayList<Command> parse(String rawCommands) {
       ArrayList<Command> commands = new ArrayList<>();
       for(char c : rawCommands.toCharArray()) {
           commands.add(fromChar(c));
      }
       return commands;
   }

   public static Command fromChar(char c) {
       if (c == 'R') {
           return new TurnRight();
       }
       if (c == 'L') {
           return new TurnLeft();
       }
       if (c == 'M') {
           return new Move();
       }
       return new InvalidCommand();
   }
}
