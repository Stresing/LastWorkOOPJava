package ui.commands;

import ui.Console;

public class AddHuman extends Command
{
    public AddHuman(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Добавление человека в семейное древо. ";
    }
    
    @Override
    public void execute() 
    {
        getConsole().addHumanNew();
    }
}