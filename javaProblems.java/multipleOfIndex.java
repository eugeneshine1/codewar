import java.util.ArrayList;
import java.util.List;

class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
      //create a list
      //loop through the array and check if number in the array is divisible to its index
      //if so, add the number to the list
      //return the list as an array using stream 
     
      List <Integer> list = new ArrayList<>();
      for (int i = 1; i < array.length; i++) {
          if (array[i] % i == 0) {
          list.add(array[i]);
          }
      }
    return list.stream().mapToInt(i->i).toArray();
    }
  }
    