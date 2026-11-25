/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;

public final class ib {
    private static char b = ";".charAt(0);
    public static boolean c = true;
    private static String[] d;
    public static int e;

    public static void b() {
        d = ib.b("/lang.txt");
    }

    private static String[] b(String object) {
        try {
            object = new DataInputStream(((Object)((Object)midlet.a)).getClass().getResourceAsStream((String)object));
            byte[] byArray = new byte[((FilterInputStream)object).available() - 3];
            ((FilterInputStream)object).read();
            ((FilterInputStream)object).read();
            ((FilterInputStream)object).read();
            ((DataInputStream)object).read(byArray);
            try {
                ((FilterInputStream)object).close();
            }
            catch (Exception exception) {}
            return rb.b(new String(byArray, "UTF-8"), b);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static String b(int n2) {
        if (d != null) {
            return d[n2];
        }
        return "";
    }

    public static String c(int n2) {
        if (d != null) {
            return d[n2 + 64];
        }
        return "";
    }

    public static String b(String stringArray, int n2) {
        if ((stringArray = ib.b((String)stringArray)) == null) {
            return "";
        }
        if (n2 < 0 || n2 >= stringArray.length) {
            return "";
        }
        return stringArray[n2];
    }

    static {
        e = -1;
    }
}

