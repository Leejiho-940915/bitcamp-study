public class Test1 {
  public static void main(String[]args) {
    java.util.Scanner keyboardScanner = new java.util.Scanner(System.in);

    System.out.print("나이? ");
    int age = keyboardScanner.nextInt();
    keyboardScanner.nextLine();

    System.out.print("이름? ");
    String name = keyboardScanner.nextLine();

    System.out.print("키? ");
    float key = keyboardScanner.nextFloat();
    keyboardScanner.nextLine();

    System.out.print("거주지? ");
    String name2 = keyboardScanner.nextLine();

    System.out.print("번호? ");
    long tel = keyboardScanner.nextLong();
    keyboardScanner.nextLine();
    System.out.print("지원동기");
    String name3= keyboardScanner.nextLine();

    java.sql.Date registeredDate = new java.sql.Date(System.currentTimeMillis());

    keyboardScanner.close();

    System.out.println("---------------");
    System.out.printf("나이: %d\n", age);
    System.out.printf("이름: %s\n", name);
    System.out.printf("키: %f\n", key);
    System.out.printf("거주지: %s\n", name2);
    System.out.printf("번호: %d\n", tel);
    System.out.printf("지원동기: %s\n", name3);
    System.out.printf("가입일: %s\n", registeredDate);



  }
}
