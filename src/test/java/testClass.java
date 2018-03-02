import org.junit.Test;
import static org.junit.Assert.*;
public class testClass {

    @Test
    public void testingTest() throws Exception {

        linkedList list = new linkedList();

        assertEquals(0, list.getSize());
    }

    @Test
    public void addFrontElementAndGetIt() {
        linkedList list = new linkedList();
        list.addFrontElement("Bonjour");
        String tst = list.getFront();

        assertEquals("Bonjour", tst);
    }

    @Test
    public void addBackElementAndGetIt() {
        linkedList list = new linkedList();
        list.addBackElement("salut");
        String tst = list.getBack();

        assertEquals("salut", tst);
    }

    @Test
    public void testGetElementAtPosition() {
        linkedList list = makeTestList();

        assertEquals("salut01", list.getElementAtPosition(0));
        assertEquals(null, list.getElementAtPosition(1));
        assertEquals("salut03", list.getElementAtPosition(2));
        assertEquals("salut01", list.getElementAtPosition(-2));
        assertEquals("salut05", list.getElementAtPosition(12));
    }

    @Test
    public void testGetPositionOfElement() {
        linkedList list = makeTestList();

        assertEquals(2, list.getPositionOfElement("salut03"));
    }

    public linkedList makeTestList() {
        linkedList list = new linkedList();
        list.addBackElement("salut01");
        list.addBackElement(null);
        list.addBackElement("salut03");
        list.addBackElement("salut04");
        list.addBackElement("salut05");
        return list;
    }
}