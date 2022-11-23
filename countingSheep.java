class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // loop through the array
        // if the elements are true, add 1 to the count variable
        // return the count
        int count =0;
        for (Boolean answer : arrayOfSheeps){
            if (answer==true){
              count++;
            } 
          }
          return count;
    }
}