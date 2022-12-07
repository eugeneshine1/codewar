class Maskify {
    public static String maskify(String str) {
        //if the length of the string given is less or equal to 4, return the string
        // create an emtpy string
        // loop from start to the length-4 of the string
        // with each iteration, add # to the empty string
        // return the string variable with the # and the last for digits in the string
        
        if (str.length()<=4) {
            return str;
        }
        String ans="";
        for (int i=0; i<str.length()-4;i++) {
            ans+="#";
        }
        return ans + str.substring(str.length()-4);
    }
}