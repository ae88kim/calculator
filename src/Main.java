public class Main {

    public static void main(String[] args) {
        Start();
    }
    public static void Start() {
        Input task = new Input();
        task.read();
        boolean res = task.getRomatrue();
        double result = Calculator.calculate(task.getVar1(), task.getVar2(), task.getOper());

        if (result == (int) result) {
            if (res) {
                System.out.println("Output:" + "\n" + Backtoroman.intToRoman((int) result));
            }
            else {
                System.out.println("Output:" + "\n" + (int) result);
            }
            Start();
        }
        else
        {
            throw new IllegalArgumentException("результат не является целым числом");
        }
    }

}