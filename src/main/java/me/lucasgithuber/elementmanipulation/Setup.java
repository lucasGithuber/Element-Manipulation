package me.lucasgithuber.elementmanipulation;

import me.lucasgithuber.elementmanipulation.elements.nonmetals.EM_Hydrogen;
import me.lucasgithuber.elementmanipulation.elements.nonmetals.EM_Oxygen;
import me.lucasgithuber.elementmanipulation.machines.EM_Deconstructor;
import me.lucasgithuber.elementmanipulation.utils.Categories;



public class Setup {

        public static void setup(ElementManipulation p) {
            // Category
            Categories.EMMAIN.register(p);
            // Items
            new EM_Hydrogen(Categories.EMELEMENTS).register(p);
            new EM_Oxygen(Categories.EMELEMENTS).register(p);
            new EM_Deconstructor(Categories.EMMACHINES).register(p);
        }

    }
