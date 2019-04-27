package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestGreeter {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void testGreeterEmpty()

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }



   @Test
   @DisplayName("Test for Name='Worldsss'")
   public void testGreeter()
   {

      g.setName("Worldsss");
      assertEquals(g.getName(),"Worldsss");
      assertEquals(g.sayHello(),"Hello Worldsss!");
   }

   @Test
   @DisplayName("Test for Name='Worldsssss'")
   public void testGreeters()
   {

      g.setName("Worldsssss");
      assertEquals(g.getName(),"Worldsssss");
      assertEquals(g.sayHello(),"Hello Worldsssss!");
   }

}
