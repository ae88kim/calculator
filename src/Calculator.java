public class Calculator {

        public static double calculate ( double var1, double var2, char operation){
            double result = 0;
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