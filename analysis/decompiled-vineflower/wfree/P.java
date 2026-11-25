package wfree;

import javax.microedition.midlet.MIDlet;

public class P {
   public static boolean pr(MIDlet var0, String var1) {
      return C.m(var1) ? false : var0.platformRequest(var1);
   }
}
