package com.company;

public class isIEndsOH {
    public static void main(String[] args) {
        String myObjects[]={"KOH","H2O2","NACL","NAOH","COH804","MGOH"};
        String myStrings[]=new String[myObjects.length];

        // 'myObjects' dizisindeki elemanlarda bulunan numerik değerleri siler.
        for(int i=0;i<myObjects.length;i++){
            myObjects[i]=myObjects[i].replaceAll("[^A-Za-z]","");
            int len=myObjects[i].length();
            if(myObjects[i].substring(len-2,len).equals("OH"))
                System.out.println(myObjects[i]);


        }


    }



}

