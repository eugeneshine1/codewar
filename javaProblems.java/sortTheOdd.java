class Kata {
    public static int[] sortArray(int[] array) {
        //use bubble sort
        //double for loop
        //if both the number in the array is odd and one is greater than the other, switch places
        //use temp variable to hold the value when switching
        //return array

        for (int x=0; x<array.length;x++){
            for (int y=0; y<array.length;y++){
              if (array[y]%2 ==0 && x!=y){
              } else if (array[y]%2 ==1 && array[x]%2 ==1 && x!=y && array[y]>array[x]){
                int temp =array[y];
                array[y]= array[x];
                array[x] = temp;
              }
            }
          }
          return array;
      
    }
  }