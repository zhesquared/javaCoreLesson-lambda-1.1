package twiin;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 1);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);


        /*
        Листинг из задания не работает из-за того, что при вывозе метода divide() в качестве
        делителя используется 0, а на нуль делить нельзя. В качестве решения изменим реализацию
        метода divide() таким образом, чтобы она проверяла делитель на равенство нулю и в случае
        истинности условия в качестве результата возвращать -1.
         */
    }
}
