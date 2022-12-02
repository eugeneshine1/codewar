class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
      //loop through the array and check if number in the array is divisible to its index
      //add 1 to counter if true
      //create a new array with size of count
      //loop through the array and add each number taht was divisible by its own index
      //return the array
      int k = 0;
      int count = 0;
          for (int i = 1; i < array.length; i++) {
              if (array[i] % i == 0) {
      
                count++;
              }
          }
      int nums[] = new int[count];
       for (int i = 1; i < array.length; i++) {
              if (array[i] % i == 0) {
                    nums[k] = array[i];
          
                  k++;
      }
         }
          return nums;
    }
    
  }
    