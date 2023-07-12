public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        ListItem currentItem = this.root;
        while (currentItem.next() != null) {
            if (currentItem.next().compareTo(item) == 0) {
                return false;
            }
            if (currentItem.next().compareTo(item) > 0) {
                break;
            }
            currentItem = currentItem.next();

        }
        currentItem.setNext(item);
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        while (currentItem.next() != null) {
            if (currentItem.next().compareTo(item) == 0) {
                currentItem.setNext(currentItem.next().next());
                return true;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        ListItem currentItem = root;
        while (currentItem.next() != null) {
            System.out.println(currentItem.value);
            currentItem = currentItem.next();
        }
    }
}
//    -  It implements NodeList.
//
//            -  It has one field of type ListItem called root.
//
//            -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
//
//            -  And four methods:
//
//            -  getRoot(), getter for root.
//
//            -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise. If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
//
//            -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
//
//            -  traverse(), takes the root as an argument and does not return anything. If the root is null it prints out: The list is empty, otherwise print each value on a separate line.

