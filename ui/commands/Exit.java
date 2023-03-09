package ui.commands;

import ui.Console;

public class Exit extends Command 
{
    public Exit(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Выход из программы.";
    }

    @Override
    public void execute() 
    {
        getConsole().end();
    }
}