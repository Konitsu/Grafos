package util;

import java.util.Scanner;
public class Read {
    /*
    Classe para a entrada de dados. Na classe principal basta criar a variável mensagem e atribuir um valor a ela.
    Depois, crie a variavel desjada e iguale ela ao tipo primitivo que você deseja ler(um dos métodos).
     */
    public static Scanner sc = new Scanner(System.in);
    public static int Int(String x){
        System.out.print(x+" ->");
        return sc.nextInt();
    }
    public static String String(String x){
        System.out.print(x+" ->");
        return sc.nextLine();
    }
    public static double Double(String x){
        System.out.print(x+" ->");
        return sc.nextDouble();
    }
    public static char Char(String x){
        System.out.print(x+" ->");
        return sc.next().charAt(0);
    }
    public static void SkipLine(){//Método para pular uma linha.
        sc.nextLine();
    }
}
