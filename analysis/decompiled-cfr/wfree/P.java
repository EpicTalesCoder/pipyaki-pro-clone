/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
package wfree;

import javax.microedition.midlet.MIDlet;
import wfree.C;

public class P {
    public static boolean pr(MIDlet mIDlet, String string) {
        if (C.m(string)) {
            return false;
        }
        return mIDlet.platformRequest(string);
    }
}

