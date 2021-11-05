package me.lucasgithuber.elementmanipulation;

import me.lucasgithuber.elementmanipulation.elements.alcalines.*;
import me.lucasgithuber.elementmanipulation.elements.nonmetals.*;
import me.lucasgithuber.elementmanipulation.machines.EM_Deconstructor;
import me.lucasgithuber.elementmanipulation.machines.EM_JunctionTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;


public class Setup {

        public static void setup(ElementManipulation p) {
            // Category
            Categories.EMMAIN.register(p);
            // Items

            //elements/non-metals
            new EM_Hydrogen(Categories.EMELEMENTS).register(p);
            new EM_Carbon(Categories.EMELEMENTS).register(p);
            new EM_Nitrogen(Categories.EMELEMENTS).register(p);
            new EM_Oxygen(Categories.EMELEMENTS).register(p);
            new EM_Phosphorus(Categories.EMELEMENTS).register(p);
            new EM_Sulfur(Categories.EMELEMENTS).register(p);
            new EM_Selenium(Categories.EMELEMENTS).register(p);

            //elements/alkalines
            new EM_Lithium(Categories.EMELEMENTS).register(p);
            new EM_Sodium(Categories.EMELEMENTS).register(p);
            new EM_Potassium(Categories.EMELEMENTS).register(p);
            new EM_Rubidium(Categories.EMELEMENTS).register(p);
            new EM_Caesium(Categories.EMELEMENTS).register(p);
            new EM_Francium(Categories.EMELEMENTS).register(p);

            //machines
            new EM_JunctionTable(Categories.EMMACHINES).register(p);
            new EM_Deconstructor(Categories.EMMACHINES).register(p);

        }

    }
