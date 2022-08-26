public class Cell {
    private String name;
    private boolean isOpen;
    private int securityCode;

    public Cell (String name, boolean isOpen){
        this.name = name;
        this.isOpen = isOpen;
        securityCode = 1234;

    }
    private void openDoor(boolean doorIsOpen){
        if (doorIsOpen) {
            System.out.println("Closing door");
        }
        if (!doorIsOpen) {
            System.out.println("Opening door");
        }
    }


    public String getName() {
        return name;
    }
    public boolean getIsOpen(){
        return isOpen;
    }

    public void setOpen(boolean open, int code) {
        if (code == securityCode){
            System.out.println("Correct.");
            openDoor(open);
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
