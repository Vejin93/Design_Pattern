package behavioral.command;

public class Parser {

    public Command parse(String s){
        String commandStr = getCommand(s.trim());
        String param = getParams(s.trim());
        if(commandStr.equalsIgnoreCase("dir"))
            return new DirCommand();
        else if (commandStr.equalsIgnoreCase("exit"))
            return new ExitCommand();
        else if (commandStr.equalsIgnoreCase("cd")){
            return new CdCommand(param);
        }
        else if (commandStr.equals(""))
            return new BlankCommand();
        else
            return null;
    }

    public String getCommand(String s){
        int index = s.indexOf(' ');
        if(index!=-1){
            return s.substring(0,index);
        }else {
            return s;
        }
    }

    private String getParams(String s){
        int index = s.indexOf(' ');
        if(index != -1){
            return s.substring(index + 1);
        } else {
            return "";
        }
    }
}
