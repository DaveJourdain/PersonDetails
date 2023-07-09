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
        String result = "";
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        int counter = 0;
        while (counter < personArray.length)
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        {
            Person currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            counter++;
        }
        return result;
    }
    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++)
        // identify initial value
        // identify terminal condition
        // identify increment
        {
            Person currentPerson = personArray[i];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }
    public String forEachLoop()  {
        String result = "";
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        for (Person currentPerson : personArray) {
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }
        // end loop
        return result;
    }
    public Person[] getPersonArray() {
        return personArray;
    }
}