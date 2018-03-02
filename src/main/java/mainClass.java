public class mainClass {

    public static void main(String[] args) {
        linkedList	list = new linkedList();

        list.addFrontElement("Salut");
        list.addFrontElement("hey");
        list.addBackElement("back");
        list.addFrontElement("bonjour");
        list.addFrontElement("toto");

        list.addElementAtPosition("yo", 2);

        list.removeElementAtPosition(12);
        list.removeElement("yo");

        list.displayList();

        System.out.println("Premier element : " + list.getFront());
        System.out.println("Dernier element : " + list.getBack());
        System.out.println("1er element : " + list.getElementAtPosition(0));
        System.out.println("3ème element : " + list.getElementAtPosition(2));
        System.out.println("12ème element : " + list.getElementAtPosition(11));
        System.out.println("position of toto : " + list.getPositionOfElement("toto"));
        System.out.println("position of Salut : " + list.getPositionOfElement("Salut"));
        System.out.println("position of hey : " + list.getPositionOfElement("hey"));
        System.out.println("Size of list : " + list.getSize());
    }
}
