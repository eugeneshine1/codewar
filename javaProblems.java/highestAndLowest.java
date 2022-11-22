class Kata {
    public static String highAndLow(String numbers) {
        // if the length of string is 2, return both numbers in string format
        // this is because if both numbers are the same, it needs to be returned separtely 
        // set variables for highest and lowest
        // loop throught the string and parseInt the see value of the numbers
        // compare if set number to a varible if it is the highest
        // do the same with the lowest number
        // return both numbers as a string 
        if (numbers.length()==2){       
            int nums = Integer.parseInt(numbers);
            
            return String.format("%d %d", nums, nums);
          }
          int highest =-1;
          int lowest =1;
          String [] nm = numbers.split(" ");
         
          for (int x=0; x<nm.length;x++){
            if(Integer.parseInt(nm[x])>=highest){
              highest = Integer.parseInt(nm[x]);
            }
            if(Integer.parseInt(nm[x])<=lowest){
              lowest = Integer.parseInt(nm[x]);
            }
          }
          return String.format("%d %d", highest, lowest);
    }
}