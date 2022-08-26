//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields
    private String name;
    private double height;
    private int sentence;
    private Cell obj;

    //Constructor
    public Prisoner(String name, double height, int sentence, Cell obj){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.obj = obj;
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell Name: " + obj.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public void setObj(Cell obj) {
        this.obj = obj;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getSentence() {
        return sentence;
    }

    public Cell getObj() {
        return obj;
    }
}
