package stackAndqueue;

public class AnimalShelter <T> {
  Queue <T> dog;
  Queue <T> cat;

  public AnimalShelter() {
    dog=new Queue<>();  // create queue for dog
    cat=new Queue<>();   //create queue for cat
  }

  public void enqueue(T animal){
    if (animal instanceof Cat){   // check if the animal cat if it's true added to cat object eles added to dog object
      cat.enqueue(animal);
    }else {
      dog.enqueue(animal);
    }

  }

  public T dequeue(T pref) throws Exception {   // dequeue in depend on preference
    if (pref.equals("dog")){
      return dog.dequeue();
    }else if(pref.equals("cat")){
      return  cat.dequeue();
    }else
      return null;
  }
}
