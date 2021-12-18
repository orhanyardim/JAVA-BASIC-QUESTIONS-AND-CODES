public class romaRakamlari {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++)
            System.out.println(i+" = "+convertToRomaNumbers(i));
        }

        static String convertToRomaNumbers (int number){

            StringBuilder strb = new StringBuilder();
            int value = 0;

            String[] romaNumbers = new String[]{"I", "IV", "V", "IX", "X","XL","L","XC","C"};

             int[] numbersArray = new int[]{1, 4, 5, 9, 10, 40,
                50, 90, 100};
             //Bu sayılar roma rakamlarında yazılışları farklı karakterler içerir ve bazı farklılıklar oluştururlar
            //bu yüzden bu sayılara göre girien değerimizi kontrol edeceğiz.Bundan sonra bu sayılardan "ayırt edici sayı olarak bahsedeceğiz."

            for (int i = numbersArray.length -1; i >= 0; i--) {

                value = number / numbersArray[i]; //girilen sayının ayırt edici sayılardan hangisinin içinde 1 den fazla bulunduğu kontrol edilir
                number %= numbersArray[i];//sayının seçilen ayırt edici sayıdan kalanı bulunur ve sayıya  aktarılır.

                while (value > 0) {
                    strb.append(romaNumbers[i]);//dizi içindeki uygun roma rakamı stringe eklenir
                    value--;//sonsuz döngü olmaması için value değeri azaltılır.
            }
        }
             return strb.toString();
    }
}
