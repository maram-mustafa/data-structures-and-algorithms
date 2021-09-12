package HashTable;

import java.util.LinkedList;
import java.util.Map;

public class HashTable<T> {
  Node[] arrayHash;
  int size;

  public HashTable(int size) {
    this.size = size;
    arrayHash = new Node[size];

    for (int i = 0; i < size; i++) {
      arrayHash[i] = new Node();
    }
  }

  public int generateHash(Object key) {
    if(key.getClass().getSimpleName().equals("String")){
      return Math.abs(key.hashCode()%size);
    }else{
      return(Integer) key % size;
    }
  }

  public void add(Object key, Object value) {
    int index = generateHash(key);
    Node newItem = new Node(key, value);

    if(arrayHash[index].key == null){
      arrayHash[index] = newItem;
    }else{
      newItem.next=arrayHash[index].next;
      arrayHash[index].next=newItem;
    }
  }

  public T get(Object key) {
    T value = null;
    int index = generateHash(key);
    Node arrayValue = arrayHash[index];
    while (arrayValue != null) {
      if (arrayValue.key == key) {
        value = (T) arrayValue.value;
        break;
      }
      arrayValue = arrayValue.next;
    }
    return value;
  }

  public boolean contains(Object key) {
    boolean value = false;
    int index = generateHash(key);
    Node arrayValue = arrayHash[index];
    while (arrayHash != null) {
      if (arrayValue.key == key) {
        value = true;
        break;
      }
      if(arrayValue.next==null){
        break;
      }
      arrayValue = arrayValue.next;
    }
    return value;
  }
}
