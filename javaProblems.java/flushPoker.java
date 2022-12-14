class Kata{
    public static boolean CheckIfFlush(String[] cards){
    //set int variables for each suit
    //loop through the array 
    //add 1 to each suit variable when the respective suit it found in the element
    //if any of the suit variable is the same length as the array return true 
    //(all of the array being the same suit is a flush therefore the count variable should equal the length of array)
    //else return false 
    int countHeart =0;
    int countSpade =0;
    int countDiamond =0;
    int countClover =0;
    
    for (String string : cards){
      if (string.contains("H")){
        countHeart++;
        }
      else if (string.contains("S")){
        countSpade++;
        }
      else if (string.contains("D")){
        countDiamond++;
        }
      else if (string.contains("C")){
        countClover++;
        }
    }
    if (countHeart == cards.length || countSpade == cards.length || countDiamond == cards.length ||countClover == cards.length){
      return true;
    } else{
      return false;
    }
  }
}
