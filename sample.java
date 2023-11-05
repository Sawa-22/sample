public class sample {

  public static void main(String []args) {
    System.out.println("Hello, My World!");

    System.out.println("The sum of 123 and 321 is 444.");

    int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

    System.out.format("The sum of %s and %s is %s.\n",
      args[0], args[1], Integer.toString(sum));
  }
}