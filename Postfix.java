import java.util.*;

class Postfix {
  public static void main(String args[]){
    HashMap <Character, Double> valueMap = new HashMap<>();
    Stack <Double> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);

    for (int i=0; i < args.length; i++) {
      char input = args[i].charAt(0);
      if (Character.isLetter(input) && (input!='x')) {
        if (!valueMap.containsKey(input)) {
          System.out.println("Enter the value for "+input);
          double value = scanner.nextDouble();
          stack.push(value);
          valueMap.put(input,value);
        } else {
          stack.push(valueMap.get(input));
        }
      } else {
        double num1;
        double num2;
        double result;
        switch(input) {
          case '-': 
            System.out.println("SUBT");
            num1 = stack.pop();
            num2 = stack.pop();
            result = num2 - num1;
            stack.push(result);
          break;
          case '+': System.out.println("ADD");
            num1 = stack.pop();
            num2 = stack.pop();
            result = num1+num2;
            stack.push(result);
          break;
          case 'x': System.out.println("MULT");
            num1 = stack.pop();
            num2 = stack.pop();
            result = num1 * num2;
            stack.push(result);
          break;
          case '/': System.out.println("DIV");
            num1 = stack.pop();
            num2 = stack.pop();
            result = num2/num1;
            stack.push(result);
          break;
          default: System.out.println("Invalid input");
        }
      }
    }
    double finalResult = stack.pop();
    System.out.println("Final result : "+finalResult);
  }
}