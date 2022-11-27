package behavioral.command;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class Command {

    public static File currentDir = new File(".");

    public List<String> parametrs;

    public Command(){
        parametrs = new ArrayList<String>();
    }

    public abstract boolean execute();
}
