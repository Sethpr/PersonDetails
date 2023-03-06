package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder result = new StringBuilder("");
        int counter = 0;
        Person[] per = getPersonArray();
        // create a `counter`

        while(counter < per.length) {// while `counter` is less than length of array
            // begin loop
            result.append(per[counter].toString());
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            counter++;

        }// end loop
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder("");
        Person[] per = getPersonArray();
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int i = 0; i<per.length; i++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            result.append(per[i].toString());
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
        }// end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder("");
        Person[] per = getPersonArray();
        // identify array's type
        // identify array's variable-name
        for(Person p: per) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            result.append(p.toString());
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
        }// end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
