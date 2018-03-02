public class linkedList {

    public element		first;
    public element		next;

    int size;

    void	addFrontElement(String elem) {
        element item = new element(elem);

        if (this.first == null) {
            this.first = item;
        }
        else {
            item.next = this.first;
            this.first = item;
        }
        this.size++;
    }

    void	addBackElement(String elem) {
        element	item = new element(elem);
        element iterator = this.first;

        if (this.first == null) {
            this.first = item;
            return;
        }

        while (iterator.next != null)
            iterator = iterator.next;

        iterator.next = item;
        this.size++;
    }

    void	addElementAtPosition(String elem, int pos) {
        element	item = new element(elem);
        element iterator = this.first;
        element previousIterator = this.first;
        int		counter = 0;

        if (pos <= 0) {
            addFrontElement(item.getValue());
            return;
        }
        else if (pos >= this.size) {
            addBackElement(item.getValue());
            return;
        }

        while (counter++ != pos && iterator.next != null) {
            previousIterator = iterator;
            iterator = iterator.next;
        }

        previousIterator.next = item;
        item.next = iterator;
        this.size++;
    }

    void	removeElementAtPosition(int pos) {
        element iterator = this.first;
        element previousIterator = this.first;
        int	counter = 0;

        if (this.size == 0)
            return;

        if (this.size == 1) {
            first = null;
            this.size = 0;
            return;
        }

        if (pos <= 0) {
            first = first.next;
            return;
        }

        while (counter++ != pos && iterator.next != null) {
            previousIterator = iterator;
            iterator = iterator.next;
        }

        previousIterator.next = iterator.next;
        this.size--;
    }

    void	removeElement(String elemToRemove) {
        element iterator = this.first;
        element previousIterator = this.first;

        if (this.size == 0)
            return;

        for (int i = 0; i < this.size; i++) {
            if (iterator.getValue().equals(elemToRemove)) {
                if (i == 0)
                    this.first = this.first.next;
                else
                    previousIterator.next = iterator.next;
                this.size--;
                return;
            }
            if (iterator.next == null)
                return;
            previousIterator = iterator;
            iterator = iterator.next;
        }
    }

    String	getFront() {
        if (this.size == 0)
            return "";
        else
            return (first.getValue());
    }

    String	getBack() {
        if (this.size == 0)
            return "";

        element iterator = this.first;

        while (iterator.next != null) {
            iterator = iterator.next;
        }
        return (iterator.getValue());
    }

    String getElementAtPosition(int pos) {
        if (this.size == 0)
            return "";
        if (pos <= 0)
            return first.getValue();

        element iterator = this.first;

        for (int i = 0; i < pos; i++) {
            if (iterator.next == null)
                return iterator.getValue();
            iterator = iterator.next;
        }

        return iterator.getValue();
    }

    int	getPositionOfElement(String elem) {
        if (this.size == 0)
            return -1;

        int	position = 0;
        element iterator = this.first;

        while (iterator.next != null) {
            if (iterator.getValue().equals(elem)) {
                return position;
            }
            iterator = iterator.next;
            position++;
        }
        return position;
    }

    public void	displayList() {
        element iterator = this.first;

        if (iterator == null)
            return;

        while (iterator.next != null) {
            System.out.println(iterator.getValue());
            iterator = iterator.next;
        }
        System.out.println(iterator.getValue());
    }

    public int	getSize() {
        return this.size;
    }
    public linkedList() {
        size = 0;
    }
}
