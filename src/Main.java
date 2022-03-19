public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        if (c == 999999999){
            System.out.println("Деление на ноль!");  }
          calc.println.accept(c);
//        Можно не менять devide , а поймать исключение.
//        try {
//            c = calc.devide.apply(a, b);
//            calc.println.accept(c);
//        } catch ( ArithmeticException e){
//        System.out.println("Деление на ноль!");
//        }

    }
}
