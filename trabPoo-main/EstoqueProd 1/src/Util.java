import java.util.Scanner;

public class Util {

    public static String scanString(String mensagem) {
        String result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null) {
            System.out.print(mensagem);
            result = scan.nextLine();
        }
        return result;
    }

    public static Double scanDouble(String mensagem, String errorMessage) {
        Double result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null) {
            System.out.print(mensagem);
            String aux = scan.next();
            try {
                result = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return result;
    }

    public static Integer scanInt(String mensagem, String errorMessage) {
        Integer result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null) {
            System.out.print(mensagem);
            String aux = scan.next();
            try {
                result = Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return result;
    }
}
