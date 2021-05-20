import java.util.Scanner;

    public class Input {
        private int var1;
        private int var2;
        private boolean Romatrue;
        private char oper;

        public void read() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input: ");
            String value = scanner.nextLine();

            boolean arab = value.matches("^([1-9]{0,1}\\b|10{0,1}\\b)+(\040[+/*-]\040\\b)+([1-9]{0,1}\\b|10{0,1}\\b)$");
            boolean roma = value.matches("^(X\\b|IX\\b|IV\\b|V?I{0,3}\\b)+(\\040[+/*-]\\040\\b)+(X\\b|IX\\b|IV\\b|V?I{0,3}\\b)$");
            if (roma || arab) {
                if (roma) {
                    value = value.replaceAll(" ","");
                    String[] romblocks = value.split("[+/*-]");
                    var1 = Roman.valueOf(romblocks[0]).getnum();
                    oper = value.charAt(romblocks[0].length());
                    var2 = Roman.valueOf(romblocks[1]).getnum();

                    Romatrue = true;
                }

                if (arab) {
                    value = value.replaceAll(" ","");
                    String[] blocks = value.split("[+/*-]");
                    var1 = Integer.parseInt(blocks[0]);
                    oper = value.charAt(blocks[0].length());
                    var2 = Integer.parseInt(blocks[1]);
                    Romatrue = false;
                }
            }
            else {
                throw new IllegalArgumentException("неверный формат строки");
            }
        }

        public int getVar1() {
        return var1;
        }

        public int getVar2() {
        return var2;
        }

        public char getOper() {
        return oper;
        }

        public boolean getRomatrue() {
            return Romatrue;
        }
    }

