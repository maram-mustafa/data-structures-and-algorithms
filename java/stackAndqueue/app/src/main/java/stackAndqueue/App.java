/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndqueue;

public class App {

  public static void main(String[] args) throws Exception {

    //////////////////////////////////////////// Stack Method////////////////////////////////////////////////////////

//      //stack - push
//      Stack<Integer> stackValue = new Stack<>();
//      stackValue.push(10);
//      stackValue.push(20);
//      stackValue.push(30);
//      stackValue.push(40);
//      System.out.println(stackValue.top.value);
//
//      //pop - stack
//      System.out.println(stackValue.pop());
//
//      //peek - stack
//      System.out.println(stackValue.peek());
//
//    //isEmpty - stack
//    System.out.println(stackValue.isEmpty());
//
//    //////////////////////////////////////////////// Queue Methods////////////////////////////////////////////////////
//
//      //enqueue - queue
//    Queue<Integer> queueValue = new Queue<>();
//      queueValue.enqueue(1);
//      queueValue.enqueue(2);
//      queueValue.enqueue(3);
//    System.out.println(queueValue.front.value);
//    System.out.println(queueValue.rear.value);
//
//      //dequeue - queue
//      System.out.println(queueValue.dequeue());
//
//      //peek  - queue
//     System.out.println(queueValue.peek());
//
//      //isEmpty - queue
//      System.out.println(queueValue.isEmpty());

    ////////////////////////////////////// code challenge 11 //////////////////////////////////////////////////////

    //enqueue
//      PseudoQueue<Integer> stackQueue = new PseudoQueue<>();
//      stackQueue.enqueue(10);
//      stackQueue.enqueue(20);
//      stackQueue.enqueue(30);
//      stackQueue.enqueue(40);
//
//      System.out.println(stackQueue.toString());
//      stackQueue.dequeue();
//      System.out.println(stackQueue.toString());
//      stackQueue.dequeue();
//      System.out.println(stackQueue.toString());
//    }

    ////////////////////////////////////////// code challenge 12 /////////////////////////////////////////////////////
//
//    Cat cat1 = new Cat("lolo");
//    Cat cat2 = new Cat("viki");
//    Dog dog1 = new Dog("bella");
//    Dog dog2 = new Dog("roger");
//    AnimalShelter animalShelter = new AnimalShelter();
//
//
//    animalShelter.enqueue(cat1);
//    animalShelter.enqueue(cat2);
//    animalShelter.enqueue(dog1);
//    animalShelter.enqueue(dog2);
//
//
//    System.out.println(animalShelter.dequeue("cat").toString());
//    System.out.println(animalShelter.dequeue("roger"));
//    System.out.println(animalShelter.dequeue("dog"));
//    System.out.println(animalShelter.dequeue("lolo"));



    ///////////////////////////////////// code challenge 13 /////////////////////////////////////////////////////////


    System.out.println(BalancedBrackets.validateBrackets("{(hello)"));
    System.out.println(BalancedBrackets.validateBrackets("{}"));
    System.out.println(BalancedBrackets.validateBrackets("}]"));
    System.out.println(BalancedBrackets.validateBrackets("{}{hi}[hey]()"));

  }


}

