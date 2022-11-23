class DnaStrand {
    public static String makeComplement(String dna) {
      // instantiate an emtpy string
      // loop through the string 
      // for every A character add T string to the new instantiated string'
      // if character is T add A, if C add G, and if G add C
      // return the new string

        String answer="";
        for (int x=0; x<dna.length(); x++) {
            if (dna.charAt(x)=='A'){
            answer += "T";
            } else if (dna.charAt(x)=='T') {
            answer += "A";
            } else if (dna.charAt(x)=='C') {
            answer += "G";
            } else {
            answer += "C";
            }
        }
        return answer;
    }
  }
  