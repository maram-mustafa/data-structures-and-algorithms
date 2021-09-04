package HashTable;

import java.util.LinkedList;

public class HashTable<T> {
  Node[] arrayHash;
  int size;

  public HashTable(int size) {
    this.size = size;
    arrayHash = new Node[this.size];

    for (int i = 0; i < arrayHash.length; i++) {
      arrayHash[i] = new Node<T>();
    }
  }

  public int generateHash(int key) {
    return key % size;
  }

  public void add (int key , T value){
    int index = generateHash(key);
    Node arrayValue = arrayHash[index];
    Node newItem = new Node(key,arrayValue);
    newItem.next=arrayValue.next;
    arrayValue.next=newItem;
  }

  public T Get(int key){
    T value = null;
    int index= generateHash(key);
    Node arrayValue = arrayHash[index];
    while(arrayValue.next != null){
      if(arrayValue.getKey()==key){
         value = (T) arrayValue.getValue();
        break;
      }
      arrayValue=arrayValue.next;
    }
    return value;
  }

//  public boolean contains(int key){
//    int index = generateHash(key);
//    if(arrayHash[index] = ){
//
//    }
//  }





}
