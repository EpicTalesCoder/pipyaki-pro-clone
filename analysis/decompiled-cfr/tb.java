/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class tb {
    private Vector b = new Vector();
    private int c = 4;
    private int d = 0;
    private int e;
    public int f = -1;
    public boolean g = false;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;

    public final void b(pb pb2) {
        this.b.addElement(pb2);
        this.c += pb2.e + 4;
    }

    public final void b(String stringArray) {
        block19: {
            int n2;
            int n3;
            Vector<String> vector;
            boolean bl;
            block18: {
                bl = ab.xc;
                int n4 = ab.D - 8;
                String string = "";
                int n5 = 0;
                String string2 = "";
                int n6 = 0;
                int n7 = ab.F.charWidth(' ');
                vector = new Vector<String>();
                stringArray = (String)stringArray + '\r';
                for (n3 = 0; n3 < stringArray.length(); ++n3) {
                    char c2;
                    block26: {
                        block30: {
                            block27: {
                                block31: {
                                    block28: {
                                        block29: {
                                            block20: {
                                                block24: {
                                                    block21: {
                                                        block25: {
                                                            block22: {
                                                                block23: {
                                                                    n2 = stringArray.charAt(n3);
                                                                    if (bl) break block18;
                                                                    if (n2 != 13) break block20;
                                                                    if (n5 + n7 + n6 > n4) break block21;
                                                                    if (n5 != 0) break block22;
                                                                    if (n6 != 0) break block23;
                                                                    if (n3 == stringArray.length() - 1) break block24;
                                                                    vector.addElement("");
                                                                    if (!bl) break block24;
                                                                }
                                                                vector.addElement(string2);
                                                                if (!bl) break block24;
                                                            }
                                                            if (n6 != 0) break block25;
                                                            vector.addElement(string);
                                                            if (!bl) break block24;
                                                        }
                                                        vector.addElement(string + " " + string2);
                                                        if (!bl) break block24;
                                                    }
                                                    if (n5 > 0) {
                                                        vector.addElement(string);
                                                    }
                                                    if (n6 > 0) {
                                                        vector.addElement(string2);
                                                    }
                                                }
                                                string = "";
                                                n5 = 0;
                                                string2 = "";
                                                n6 = 0;
                                                if (!bl) continue;
                                            }
                                            if (c2 != ' ') break block26;
                                            if (n5 + n7 + n6 > n4) break block27;
                                            if (n5 != 0) break block28;
                                            if (n6 != 0) break block29;
                                            string = " ";
                                            n5 = n7;
                                            if (!bl) break block30;
                                        }
                                        string = string2;
                                        n5 = n6;
                                        if (!bl) break block30;
                                    }
                                    if (n6 != 0) break block31;
                                    string = string + " ";
                                    n5 += n7;
                                    if (!bl) break block30;
                                }
                                string = string + " " + string2;
                                n5 += n7 + n6;
                                if (!bl) break block30;
                            }
                            if (n5 > 0) {
                                vector.addElement(string);
                            }
                            string = string2;
                            n5 = n6;
                        }
                        string2 = "";
                        n6 = 0;
                        if (!bl) continue;
                    }
                    if (c2 == '\n') continue;
                    string2 = string2 + c2;
                    n6 += ab.F.charWidth(c2);
                    if (!bl) continue;
                }
                n2 = vector.size();
            }
            if (n2 == 0) {
                String[] stringArray2 = new String[1];
                stringArray = stringArray2;
                stringArray2[0] = "";
            } else {
                stringArray = new String[vector.size()];
                for (n3 = 0; n3 < vector.size(); ++n3) {
                    stringArray[n3] = (String)vector.elementAt(n3);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break block19;
                }
            }
            this.b.addElement(stringArray);
            this.c += stringArray.length * ab.F.getHeight() + 4;
        }
    }

    public final void b(Graphics graphics) {
        int n2;
        block8: {
            boolean bl = ab.xc;
            graphics.setColor(0);
            graphics.fillRect(0, 0, ab.D, ab.E);
            if (this.b == null || !this.g) {
                return;
            }
            graphics.setClip(0, 1, ab.D, this.e);
            graphics.setColor(0xFFFFFF);
            graphics.setFont(ab.F);
            int n3 = 4 + this.d + 1;
            block0: for (int i2 = 0; i2 < this.b.size(); ++i2) {
                Object object = this.b.elementAt(i2);
                n2 = object instanceof Image;
                if (!bl) {
                    if (n2 != 0) {
                        object = (Image)object;
                        graphics.drawImage(object, (ab.D - object.getWidth()) / 2, n3, 0);
                        n3 += object.getHeight() + 4;
                        if (!bl) continue;
                    }
                    if (object instanceof String[]) {
                        String[] stringArray = (String[])object;
                        for (int i3 = 0; i3 < stringArray.length; ++i3) {
                            graphics.drawString(stringArray[i3], (ab.D - ab.F.stringWidth(stringArray[i3])) / 2, n3, 0);
                            n3 += ab.F.getHeight();
                            if (bl) continue block0;
                            if (!bl) continue;
                        }
                        n3 += 4;
                        continue;
                    }
                    if (!(object instanceof pb)) continue;
                    object = (pb)object;
                    ((pb)object).b((ab.D - ((pb)object).d) / 2, n3);
                    ((pb)object).c = 0;
                    ((pb)object).b(graphics);
                    n3 += ((pb)object).e + 4;
                    if (!bl) continue;
                }
                break block8;
            }
            graphics.setColor(0x808080);
            graphics.fillRect(ab.D - 3, this.h, 2, this.i);
            graphics.setClip(0, 0, ab.D, ab.E);
            n2 = this.f;
        }
        if (n2 == 0 || this.f == 1) {
            qb.b.c = 0;
            qb.b.b = 0;
            qb.b.b(ab.D - 1 - qb.b.d, ab.E - 1 - qb.b.e);
            qb.b.b(graphics);
            qb.b.b = 1;
            qb.b.b(1, ab.E - 1 - qb.b.e);
            qb.b.b(graphics);
            return;
        }
        if (this.f == 5) {
            qb.b.c = 0;
            qb.b.b = 2;
            qb.b.b(ab.D - 1 - qb.b.d, ab.E - 1 - qb.b.e);
            qb.b.b(graphics);
            qb.b.b = 1;
            qb.b.b(1, ab.E - 1 - qb.b.e);
            qb.b.b(graphics);
            return;
        }
        qb.b.b = 1;
        qb.b.b(ab.D - 1 - qb.b.d, ab.E - 1 - qb.b.e);
        qb.b.c = 2;
        qb.b.b(graphics);
    }

    public final void b() {
        block3: {
            block2: {
                this.e = ab.E - 3 - qb.b.e;
                if (this.c <= this.e) break block2;
                this.d = 0;
                this.i = this.e * this.e / this.c;
                this.e();
                if (!ab.xc) break block3;
            }
            this.d = (this.e - this.c) / 2;
        }
        this.g = true;
    }

    public final void c() {
        this.g = false;
        try {
            this.b.removeAllElements();
            this.b = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d() {
        block17: {
            block19: {
                block18: {
                    if (!this.g) {
                        return;
                    }
                    if (this.j == 0 || this.c <= this.e) break block17;
                    this.d -= this.j;
                    if (this.d <= 0) break block18;
                    this.d = 0;
                    if (!ab.xc) break block19;
                }
                if (this.d < this.e - this.c) {
                    this.d = this.e - this.c;
                }
            }
            this.e();
        }
        if (this.k) {
            this.j += 2;
            if (this.j > 12) {
                this.j = 12;
                return;
            }
        } else if (this.l) {
            this.j -= 2;
            if (this.j < -12) {
                this.j = -12;
                return;
            }
        } else if (this.j > 0) {
            this.j -= 2;
            if (this.j < 0) {
                this.j = 0;
                return;
            }
        } else if (this.j < 0) {
            this.j += 2;
            if (this.j > 0) {
                this.j = 0;
            }
        }
    }

    public final void b(int n2) {
        if (!this.g) {
            return;
        }
        int n3 = rc.b.getGameAction(n2);
        if (n3 == 6 || n2 == ab.nb) {
            if (this.j < 0) {
                this.j = 2;
            }
            this.k = true;
            return;
        }
        if (n3 == 1 || n2 == ab.pb) {
            if (this.j > 0) {
                this.j = -2;
            }
            this.l = true;
            return;
        }
        if (n2 == ab.jb || n2 == ab.lb) {
            if (this.f == 0 || this.f == 1 || this.f == 5) {
                fb.I.b(false);
                return;
            }
        } else if (n2 == ab.kb || n2 == ab.mb) {
            if (this.f == 3 || this.f == 7) {
                ab.B.L();
                return;
            }
            fb.I.b(true);
        }
    }

    public final void c(int n2) {
        if (!this.g) {
            return;
        }
        int n3 = rc.b.getGameAction(n2);
        if (n3 == 6 || n2 == ab.nb) {
            this.k = false;
            return;
        }
        if (n3 == 1 || n2 == ab.pb) {
            this.l = false;
        }
    }

    private void e() {
        this.h = 1 + (this.e - this.i) * this.d / (this.e - this.c);
    }
}

