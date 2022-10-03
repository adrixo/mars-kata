package mars.command;

import mars.widgets.GPS;

import java.util.ArrayList;

public class Factory {
   public static ArrayList<Command> parse(String rawCommands, GPS receiver) {
       ArrayList<Command> commands = new ArrayList<>();
       for(char c : rawCommands.toCharArray()) {
           commands.add(fromChar(c, receiver));
      }
       return commands;
   }

   public static Command fromChar(char c, GPS receiver) {
       if (c == 'R') {
           return new TurnRight(receiver);
       }
       if (c == 'L') {
           return new TurnLeft(receiver);
       }
       if (c == 'M') {
           return new Move(receiver);
       }
       return new InvalidCommand();
   }
}
