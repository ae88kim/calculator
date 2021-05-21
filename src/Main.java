public class Main {

    public static void main(String[] args) {
        Start();
    }
    public static void Start() {
        Input task = new Input();
        task.read();
        boolean res = task.getRomatrue();
        int result = Calculator.calculate(task.getVar1(), task.getVar2(), task.getOper());

            if (res) {
                System.out.println("Output:" + "\n" + Backtoroman.intToRoman(result));
            }
            else {
                System.out.println("Output:" + "\n" + result);
            }
            Start();

    }

}