package ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main;
public class InterpreterException extends Exception
{
    // Parameterless Constructor
    public InterpreterException() {}

    // Constructor that accepts a message
    public InterpreterException(String message)
    {
        super(message);
    }
}