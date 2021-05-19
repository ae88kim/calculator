public class Backtoroman {

        static String intToRoman(int num)
        {

            String c[] = {"", "C", "CC", "CCC", "CD", "D",
                    "DC", "DCC", "DCCC", "CM"};
            String x[] = {"", "X", "XX", "XXX", "XL", "L",
                    "LX", "LXX", "LXXX", "XC"};
            String i[] = {"", "I", "II", "III", "IV", "V",
                    "VI", "VII", "VIII", "IX"};

            String hundereds = c[(num%1000)/100];
            String tens = x[(num%100)/10];
            String ones = i[num%10];

            String answer = hundereds + tens + ones;

            return answer;
        }


}
