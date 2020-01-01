package homework1002;

/**
 *
 * @author kanaporn1
 */
public class OrderedList {
private SNode first;
  private int nItems;

  public OrderedList()
  { first = null;
    nItems = 0;
  }
  public int size()
  { return nItems;
  }
  public void insertAtFront(int o)
  {
    SNode newSNode = new SNode(o, first);
    first = newSNode;
    nItems++;
  }
  public boolean isEmpty()
  { return (nItems == 0);
  }
  public int removeAtFront() throws OrderedListEmptyException
  { if (isEmpty())
      throw new OrderedListEmptyException("Singly linked list is empty.");
    SNode temp = first;
    first = temp.getNext();
    nItems--;
    return temp.getItem();
  }
  public int first() throws OrderedListEmptyException
  { if (isEmpty())
      throw new OrderedListEmptyException("Singly linked list is empty.");
    return first.getItem();
  }
  public void printList()
  {
    SNode curr = first;
    while (curr != null)
    {
      System.out.print(curr.getItem() + " ");
      curr = curr.getNext();
    }
    System.out.println();
  }
  public void removeDuplicates()
  {
    SNode curr = first;
    if (curr != null)
    {
      SNode next = curr.getNext();
      while (next != null)
      {
        if (curr.getItem() == next.getItem())
        {
          curr.setNext(next.getNext());
          nItems--;
        }
        else
          curr = next;
        next = curr.getNext();
      }
    }
  }

}
