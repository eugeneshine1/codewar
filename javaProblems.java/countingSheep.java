class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // try catch for null pointer exception
        // loop through the array
        // if the elements are true, add 1 to the count variable
        // add the catch phrase here for any null values in the array
        // return the count
        int count =0;
        try {
            for (Boolean answer : arrayOfSheeps){
                if (answer==true){
                count++;
                } 
            }
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
        return count;
    }
}