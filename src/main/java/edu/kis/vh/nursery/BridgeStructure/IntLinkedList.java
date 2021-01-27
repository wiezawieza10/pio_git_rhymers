package edu.kis.vh.nursery.BridgeStructure;

public class IntLinkedList implements StackAndListInterface {

    /**
     * Return - zwracana wartość w metodzie pop i top gdy metoda isEmpty zwraca 'true' - lista jest pusta
     */
    public static final int RETURN = -1;

    Node last;
    int i;

    /**
     * push - wrzucenie elementu do listy na ostatnią pozycję
     * @param i - element wrzucany na koniec listy o typie liczby calkowitej
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * sprawdzenie czy lista zawiera elementy (zwróci false) lub czy jest pusta (zwróci true)
     * @return
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * sprawdzenie czy lista zawiera maksymalna ilosc elementow
     * @return - funkcja zwraca false w przypadku gdy lista nie jest pelna i true gdy lista jest pelna
     */
    public boolean isFull() {
        return false;
    }

    /**
     * zwracanie ostatniego elementu listy
     * @return - zwraca ostatni element listy jesli lista nie jest pusta
     */
    public int top() {
        if (isEmpty())
            return RETURN;
        return last.value;
    }

    /**
     * zwraca ostatni element listy jesli lista nie jest pusta. Element ten zostaje usuniety z listy.
     * @return - zwraca ostatni element listy jesli lista nie jest pusta
     */
    public int pop() {
        if (isEmpty())
            return RETURN;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
