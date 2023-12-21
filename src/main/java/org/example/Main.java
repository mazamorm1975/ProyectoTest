package org.example;


import org.example.models.Persona;

import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setName("Mario");
        p.setLastName("Zamora");
        p.setIdPerson(580062);

        Consumer<Persona> name = x -> {
            System.out.println(x.getIdPerson()+" "+x.getName()+" "+x.getLastName());
        };

        Main m = new Main();
        m.MetodoFiltrado(p, name);


        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public void MetodoFiltrado(Persona p, Consumer<Persona> persona){
        persona.accept(p);
    }
}