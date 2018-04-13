import java.util.*;
public class Postfix {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    double num1;
    double num2;
    double result;
    for (int i=0; i < args.length; i++) {
      String value = args[i];
      try {
        int intValue = Integer.parseInt(args[i]);
        stack.push(value);
        System.out.println("push "+intValue);
      } catch (Exception e) {
        switch(value) {
          case "-": 
            System.out.println("subt");
            num1 = Double.parseDouble(stack.pop());
            num2 = Double.parseDouble(stack.pop());
            result = num2 - num1;
            stack.push(result+"");
          break;
          case "+": System.out.println("add");
            num1 = Double.parseDouble(stack.pop());
            num2 = Double.parseDouble(stack.pop());
            result = num1+num2;
            stack.push(result+"");
          break;
          case "x": System.out.println("mult");
            num1 = Double.parseDouble(stack.pop());
            num2 = Double.parseDouble(stack.pop());
            result = num1 * num2;
            stack.push(result+"");
          break;
          case "/": System.out.println("div");
            num1 = Double.parseDouble(stack.pop());
            num2 = Double.parseDouble(stack.pop());
            result = num2/num1;
            stack.push(result+"");
          break;
          default: System.out.println("Invalid input");
        }
      }
    }
    double finalResult = Double.parseDouble(stack.pop());
    System.out.println("Final result : "+finalResult);
  }
}