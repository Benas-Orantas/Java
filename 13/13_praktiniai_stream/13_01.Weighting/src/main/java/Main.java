

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);
        Suitcase pekkaCase = new Suitcase(10);
        pekkaCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkaCase);

        hold.printItems();
    }

}
