class Vowels {
    public static int getCount(String str) {
      // loop through the string and look at each character in the string
      // if the string is a vowel add 1 to the counter
      // return the count

    int count =0;
    for (int x =0; x<str.length();x++) {
      if (str.charAt(x)== 'a' || str.charAt(x)== 'e'|| str.charAt(x)== 'i' ||str.charAt(x)== 'o'||str.charAt(x)== 'u'){
        count++;
      }
    }
    return count;
    }
  }