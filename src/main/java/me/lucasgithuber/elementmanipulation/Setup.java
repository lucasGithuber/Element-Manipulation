package me.lucasgithuber.elementmanipulation;

import me.lucasgithuber.elementmanipulation.machines.EMDeconstructor;
import me.lucasgithuber.elementmanipulation.utils.Categories;


public class Setup {
    public static void setup(ElementManipulation p) {
        // Category
        Categories.setup(p);

        new EMDeconstructor(Categories.EMMachines).register(p);

    }
}
