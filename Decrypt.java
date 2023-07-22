//package Project 
package Project ;

//class Decrypt
class Decrypt{
    //static blcok 
    public static String decrypt (String encryptedText,int key){
        //call findinverse block on inversefinder class
        int decrypKey = InverseFinder.findInverse(key);
        String temp = encryptedText ;
        //newtemp array
        int NewTemp[] = new int[temp.length()];
        String DecryptedText = "";
        for (int i = 0 ; i<temp.length();i++){
            NewTemp[i] = (temp.charAt(i)-'A');
            DecryptedText += (char)((NewTemp[i]*decrypKey) % 26 + 'A');

            System.out.println(temp.charAt(i) + " -> " + NewTemp[i]);
        }
        return DecryptedText ;



    }



}