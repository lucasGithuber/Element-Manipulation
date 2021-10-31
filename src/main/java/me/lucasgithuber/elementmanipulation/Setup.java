package me.lucasgithuber.elementmanipulation;

import me.lucasgithuber.elementmanipulation.elements.nonmetals.EM_Hydrogen;
import me.lucasgithuber.elementmanipulation.utils.Categories;

import static me.lucasgithuber.elementmanipulation.Textures.EM_HYDROGEN;

public class Setup {

        public static void setup(ElementManipulation p) {
            // Category
            Categories.EMMAIN.register(p);
            // Items
            new EM_Hydrogen(Categories.EMELEMENTS).register(p);
        }

    }
