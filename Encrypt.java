package Project;
//package project 

//encrypt class
class Encrypt {
            //static block to excute program without object
            public static String encrypt(String plainText, int key) {
                //temporary store plaintext in temp
                String temp = plainText;
                // newtemp array store temp length
                int[] NewTemp = new int[temp.length()];
                String encrypt = "" ;
        
                for (int i = 0; i < temp.length(); i++) {
                    //store i index array position 
                    NewTemp[i] = (temp.charAt(i)-'A');
                    encrypt += (char)((NewTemp[i]*key)%26 + 'A');
                    System.out.println(temp.charAt(i) + " -> " + NewTemp[i]);
                }
                return encrypt;
            }
    
}
