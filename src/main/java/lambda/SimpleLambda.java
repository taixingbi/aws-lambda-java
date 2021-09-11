package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger


public class SimpleLambda implements RequestHandler<String, String> {
  @Override
  public String handleRequest(String input, Context context) {
    System.out.println("\n-----------------");
    System.out.println("hi, saks lambda!");
    System.out.println("-----------------\n");

    return "hi jaks, this java11 ";
//    String message = System.getenv("MESSAGE");
//    return input + " " + message;
  }
}
