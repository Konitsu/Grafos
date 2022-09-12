import util.*;

public class Testes {
    public static void main(String[] args) {
        String msg = "Int";
        int i = util.Read.Int(msg);
        System.out.println("int ->"+i);

        msg = "Char";
        char c = util.Read.Char(msg);
        System.out.println("Char ->"+c);

        msg = "Double";
        double d = util.Read.Double(msg);
        System.out.println("Double ->"+d);

        util.Read.SkipLine();

        msg = "String";
        String s = util.Read.String(msg);
        System.out.println("String ->"+s);

        int DTI = util.Convert.DoubleToInt(d);
        System.out.println("Double para int -> "+DTI);
    }
}
