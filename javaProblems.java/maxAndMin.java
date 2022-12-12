class Kata {

    public int min(int[] list) {
        //loop through the array and compare it to the intialized variable 
        //if its less, set the variable equal to that number
        //at the end of the loop return the variable, which should contain the lowest number
        int min=0;
        for (int i =0; i<= list.length-1; i++) {
            if (list [i]< min) {
              min = list [i];
            }
          }
        return min;
    }
    
    public int max(int[] list) {
        //loop through the array and compare it to the intialized variable 
        //if its greater, set the variable equal to that number
        //at the end of the loop return the variable, which should contain the greatest number
        int max=0;
        for (int i = 0; i<= list.length-1; i++) {
          if (list [i]> max) {
            max = list [i];
          }
        }
      return max;
    }
  }