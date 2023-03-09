package ui;

import model.FamilyFree;
import model.Human;
import presenter.Presenter;

public interface View 
{
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
    void print(Human human);
    void print(FamilyFree<Human> FamilyFree);
    String scan(); 
}