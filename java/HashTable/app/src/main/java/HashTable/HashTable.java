package HashTable;

import java.util.LinkedList;

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

  public int generateHash(int key) {
    return key % size;
  }

  public void add(int key, T value) {
    int index = generateHash(key);
    Node arrayValue = arrayHash[index];
    Node newItem = new Node(key, value);

    newItem.next = arrayValue.next;
    arrayValue.next = newItem;
  }

  public T get(int key) {
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

  public boolean contains(int key) {
    boolean value = false;
    int index = generateHash(key);
    Node arrayValue = arrayHash[index];
    while (arrayHash != null) {
      if (arrayValue.key == key) {
        value = true;
        break;
      }
      arrayValue = arrayValue.next;
    }
    return value;
  }
}
