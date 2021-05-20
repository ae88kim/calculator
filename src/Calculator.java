public class Calculator {

        public static int calculate ( int var1, int var2, char operation){
            int result = 0;
            switch (operation) {

                case '+':
                    result = var1 + var2;
                    break;
                case '-':
                    result = var1 - var2;
                    break;
                case '*':
                    result = var1 * var2;
                    break;
                case '/':
                    result = var1 / var2;
                    break;
            }
            return result;
        }

}