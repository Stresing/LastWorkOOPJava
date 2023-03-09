// package lastOOPJava;

import model.FamilyFree;
import model.Human;
import presenter.Presenter;
import ui.Console;
import ui.View;

public class Main
{
    public static void main(String[] args)
    {
        FamilyFree<Human> familyFree = new FamilyFree<>();
        familyFree.addFamilyFree(new Human("Сергей", "муж.", 43));
        familyFree.addFamilyFree(new Human("Алиса", "жен.", 57));
        familyFree.addFamilyFree(new Human("Айран", "муж.", 7, 
            familyFree.getByName("Алиса"), familyFree.getByName("Сергей")));
        familyFree.addFamilyFree(new Human("Мира", "жен.", 4, 
            familyFree.getByName("Алиса"), familyFree.getByName("Сергей")));


        familyFree.addFamilyFree(new Human("Агата", "жен.", 2));
        familyFree.getByName("Сергей").addChild(familyFree.getByName("Агата"));

        View view = new Console();
        new Presenter(view, familyFree);
        view.start();
    }
    
}