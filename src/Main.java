public class Main {

    public static void main(String[] args) {
        Start();
    }
    public static void Start() {
        Input task = new Input();
        task.read();
        boolean Romatrue = task.getRomatrue();
        double result = Calculator.calculate(task.getVar1(), task.getVar2(), task.getOper());

        if (result == (int) result) {
            if (Romatrue) {
                Backtoroman number = new Backtoroman();
                System.out.println("Output:" + "\n" + number.intToRoman((int) result));
                Start();
            }
            else {
                System.out.println("Output:" + "\n" + (int) result);
                Start();
            }
        }
        else
        {
            throw new IllegalArgumentException("результат не является целым числом");
        }
    }

}