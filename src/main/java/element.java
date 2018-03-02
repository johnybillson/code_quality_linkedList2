public class element {
    public String	value;
    public element	next;

    String	getValue() {
        return value;
    }

    public element(String Elemvalue) {
        value = Elemvalue;
        next = null;
    }
}
