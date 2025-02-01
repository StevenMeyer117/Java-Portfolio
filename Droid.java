/*
Build a Droid project:
We've set up a robot workshop to build some droids. All that's missing are the instructions on how to create the robots
and what they'll do.
Write a Java program that will define the state and behavior of the droids using instance fields and methods.
 */

public class Droid {
    // Create droid state containing name and battery level
    int batteryLevel;
    String name;

    // Constructor method
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }


    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    // Method for task performance
    public void performTask(String task) {
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing task: " + task);
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("organizing office");
        codey.performTask("coding");
    }
}