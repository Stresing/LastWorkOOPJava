package ui.commands;

import ui.Console;

public class HumanSearch extends Command 
{
    public HumanSearch(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Поиск по имени. ";
    }

    @Override
    public void execute() 
    {
        getConsole().humanSearch();
    }
}