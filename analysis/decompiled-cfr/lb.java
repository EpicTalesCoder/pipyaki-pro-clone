/*
 * Decompiled with CFR 0.152.
 */
public class lb {
    public int b;
    public int c;
    public j d;
    public int[] e;
    public int[] f;

    public lb(fb fb2) {
    }

    public lb() {
    }

    public static String b() {
        String string;
        try {
            string = System.getProperty("microedition.platform");
            if (string.indexOf("Nokia") != -1) {
                return "nokia";
            }
            if (string.indexOf("SonyEricsson") != -1) {
                return "sonyericsson";
            }
        }
        catch (Exception exception) {}
        try {
            Class.forName("com.samsung.util.Vibration");
            return "samsung";
        }
        catch (Exception exception) {
            try {
                Class.forName("com.motorola.multimedia.Vibrator");
                return "motorola";
            }
            catch (Exception exception2) {
                try {
                    Class.forName("com.motorola.graphics.j3d.Effect3D");
                    return "motorola";
                }
                catch (Exception exception3) {
                    try {
                        Class.forName("com.motorola.multimedia.Lighting");
                        return "motorola";
                    }
                    catch (Exception exception4) {
                        try {
                            Class.forName("com.motorola.multimedia.FunLight");
                            return "motorola";
                        }
                        catch (Exception exception5) {
                            if (ab.z != null) {
                                try {
                                    if (ab.z.getKeyName(-21).toUpperCase().indexOf("SOFT") >= 0) {
                                        return "motorola";
                                    }
                                }
                                catch (Exception exception6) {
                                    try {
                                        if (ab.z.getKeyName(21).toUpperCase().indexOf("SOFT") >= 0) {
                                            return "motorola";
                                        }
                                    }
                                    catch (Exception exception7) {
                                        try {
                                            if (ab.z.getKeyName(-20).toUpperCase().indexOf("SOFT") >= 0) {
                                                return "motorola";
                                            }
                                        }
                                        catch (Exception exception8) {}
                                    }
                                }
                            }
                            try {
                                Class.forName("com.siemens.mp.io.File");
                                return "siemens";
                            }
                            catch (Exception exception9) {
                                try {
                                    Class.forName("mmpp.media.MediaPlayer");
                                    return "lg";
                                }
                                catch (Exception exception10) {
                                    try {
                                        Class.forName("mmpp.phone.Phone");
                                        return "lg";
                                    }
                                    catch (Exception exception11) {
                                        try {
                                            Class.forName("mmpp.lang.MathFP");
                                            return "lg";
                                        }
                                        catch (Exception exception12) {
                                            try {
                                                Class.forName("mmpp.media.BackLight");
                                                return "lg";
                                            }
                                            catch (Exception exception13) {
                                                string = System.getProperty("microedition.platform");
                                                if (string != null && string.equals("j2me")) {
                                                    string = null;
                                                }
                                                return string;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static String c() {
        String string = System.getProperty("microedition.platform");
        if (string != null && string.equals("j2me")) {
            string = null;
        }
        String string2 = System.getProperty("device.model");
        string = string == null ? string2 : string;
        return string;
    }
}

