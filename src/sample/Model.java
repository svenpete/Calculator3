package sample;

public class Model {

    public long calculate(long number1, long number2, String operator)
    {
        switch (operator)
        {
            case "+":
                return number1 + number2;

            case "*":
                return number1 * number2;

            case "/":
                return number1 / number2;

            case "-":
                return number1 - number2;
        }
        System.out.println("Unknown Operator - " + operator);
          return 0;
    }
}
