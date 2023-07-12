public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
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
                this.performRemoval(currentItem.next(),currentItem);
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

    private void performRemoval(ListItem itemToRemove, ListItem parent){

    }
}
// -  It implements NodeList.
//
//         -  It has one field of type ListItem called root.
//
//         -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
//
//         -  And five methods:
//
//         -  getRoot(), getter for root.
//
//         -  addItem(), same as MyLinkedList.
//
//         -  removeItem(), same as MyLinkedList.
//
//         -  performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't return anything and is declared as private. Call this method from removeItem() when the item is found.
//
//         -  traverse(), takes the root as an argument and does not return anything. It uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.