package me.lucasgithuber.elementmanipulation;

import me.lucasgithuber.elementmanipulation.elements.EMHellium;
import me.lucasgithuber.elementmanipulation.machines.EMDeconstructor;
import me.lucasgithuber.elementmanipulation.machines.EMJunctionTable;
import me.lucasgithuber.elementmanipulation.machines.EMUltraCompressor;
import me.lucasgithuber.elementmanipulation.utils.Categories;


public class Setup {
    public static void setup(ElementManipulation p) {
        // Category
        Categories.setup(p);

        new EMDeconstructor(Categories.EMMachines).register(p);
        new EMUltraCompressor(Categories.EMMachines).register(p);
        new EMJunctionTable(Categories.EMMachines).register(p);
    }
}
