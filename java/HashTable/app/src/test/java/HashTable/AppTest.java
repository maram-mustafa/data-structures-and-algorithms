/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
  public void testHashTable(){
      HashTable<String> hash = new HashTable<String>(10);
      hash.add(10, "maram");
      hash.add(5, "rand");
      hash.add(15, "zaina");
//      System.out.println(hash.get(5));
//      System.out.println(hash.contains(10));

      assertEquals("rand" , hash.get(5));
      assertTrue(hash.contains(10));

    }
}
