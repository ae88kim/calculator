import java.util.Scanner;

    public class Input {
        private double var1;
        private double var2;
        private boolean Romatrue;
        private char oper;

        public void read() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input: ");
            String value = scanner.nextLine();
            value = value.replaceAll(" ","");

            boolean arab = value.matches("^([1-9]{0,1}\\b|10{0,1}\\b)+([+/*-]\\b)+([1-9]{0,1}\\b|10{0,1}\\b)$");
            boolean roma = value.matches("^(X\\b|IX\\b|IV\\b|V?I{0,3}\\b)+([+/*-]\\b)+(X\\b|IX\\b|IV\\b|V?I{0,3}\\b)$");
            if (roma || arab) {
                if (roma) {

                    String[] romblocks = value.split("[+/*-]");
                    var1 = Roman.valueOf(romblocks[0]).getnum();
                    oper = value.charAt(romblocks[0].length());
                    var2 = Roman.valueOf(romblocks[1]).getnum();
                    Romatrue = true;
                }

                if (arab) {

                    String[] blocks = value.split("[+/*-]");
                    var1 = Double.parseDouble(blocks[0]);
                    oper = value.charAt(blocks[0].length());
                    var2 = Double.parseDouble(blocks[1]);
                    Romatrue = false;
                }
            }
            else {
                throw new IllegalArgumentException("неверный формат строки");
            }
        }

        public double getVar1() {
        return var1;
        }

        public double getVar2() {
        return var2;
        }

        public char getOper() {
        return oper;
        }

        public boolean getRomatrue() {
            return Romatrue;
        }
    }

