package ui.commands;

import ui.Console;

public class FamilyPrint extends Command 
{
    public FamilyPrint(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Вывод семейного древа.";
    }

    @Override
    public void execute() 
    {
        getConsole().familyPrint();
    }
}