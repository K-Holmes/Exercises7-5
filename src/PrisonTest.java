//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    //static Cell userCell = new Cell("Bubba's cell", true);
    public static void main(String[] args){
        Cell userCell = new Cell("Bubba's cell", true);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, userCell);
        bubba.display(true);
        userCell.setOpen(true, 3456);
        userCell.setOpen(true, 1234);

    }
}
