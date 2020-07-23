import java.util.*;
public class functionmethods{
 static void product(String name, int price) {
    System.out.println(name + " costs " + "$"+price);
      int[]quantity = available(5,10,15,20);
      System.out.println(quantity[0]);

    }

  public static void main(String[] args){
  product("Potato",400);
  product("Tomato",400);
  product("Pohtahto",5000);
  product("Tohmahto",5000);
  }

  
  public static int[] available(int a, int b, int c, int d) {
  int[] instock = new int [4];
  instock[0] = a;
  instock[1] = b;
  instock[2] = c;
  instock[3] = d;
  return instock;
  }
}
