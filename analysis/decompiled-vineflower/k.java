import java.io.DataInputStream;

public final class k {
   public static final int[][] b = new int[][]{
      {-10, -12, 45}, {-12, -10, 55}, {-10, -37, 110}, {-30, -30, 150}, {-10, -25, 50}, {5, -20, 81}, {-12, -25, 140}, {0, -18, 60}
   };
   private static int[][][] c = new int[][][]{
      {
            {0, 2, 400, 30},
            {0, 2, 350, 30},
            {0, 2, 200, 30},
            {0, 2, 200, 30},
            {0, 2, 350, 30},
            {0, 2, 300, 30},
            {0, 2, 500, 30},
            {0, 2, 150, 30},
            {0, 2, 200, 30},
            {0, 2, 200, 30},
            {0, 2, 150, 30},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {0, 2, 20, 80},
            {0, 2, 20, 80},
            {0, 2, 20, 80},
            {0, 2, 20, 80},
            {0, 2, 20, 80},
            {0, 2, 60, 90},
            {0, 2, 60, 90},
            {0, 0, 0, 0}
      },
      {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 2, 1000, 30},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {0, 2, 30, 80},
            {0, 2, 30, 80},
            {0, 2, 30, 80},
            {0, 2, 30, 80},
            {0, 2, 30, 80},
            {0, 2, 70, 80},
            {0, 2, 70, 80},
            {0, 2, 70, 80},
            {0, 2, 60, 80},
            {0, 2, 60, 80},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
      },
      {{1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}},
      {{1, 1, 0, 0}, {1, 1, 0, 0}},
      {{1, 1, 0, 0}, {1, 1, 0, 0}},
      {{1, 1, 0, 0}, {1, 1, 0, 0}},
      {{1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}}
   };
   private static Class d;

   private static boolean b(byte[] param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic ab.xc Z
      // 003: istore 17
      // 005: aconst_null
      // 006: astore 2
      // 007: aconst_null
      // 008: astore 3
      // 009: aconst_null
      // 00a: astore 4
      // 00c: aconst_null
      // 00d: astore 5
      // 00f: bipush 14
      // 011: newarray 10
      // 013: putstatic y.N [I
      // 016: new java/io/ByteArrayInputStream
      // 019: dup
      // 01a: aload 0
      // 01b: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 01e: astore 2
      // 01f: new java/io/DataInputStream
      // 022: dup
      // 023: aload 2
      // 024: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 027: dup
      // 028: astore 3
      // 029: invokevirtual java/io/DataInputStream.readByte ()B
      // 02c: bipush -87
      // 02e: if_icmpne 90a
      // 031: aload 3
      // 032: invokevirtual java/io/DataInputStream.readByte ()B
      // 035: dup
      // 036: istore 0
      // 037: bipush 2
      // 038: if_icmpge 051
      // 03b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 03e: ldc "OLD MAP FORMAT!"
      // 040: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 043: aload 3
      // 044: invokevirtual java/io/DataInputStream.close ()V
      // 047: aload 2
      // 048: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 04b: goto 04f
      // 04e: pop
      // 04f: bipush 0
      // 050: ireturn
      // 051: aload 3
      // 052: invokevirtual java/io/DataInputStream.readInt ()I
      // 055: pop
      // 056: aload 3
      // 057: invokevirtual java/io/DataInputStream.readByte ()B
      // 05a: putstatic fb.Pe B
      // 05d: aload 3
      // 05e: invokevirtual java/io/DataInputStream.readByte ()B
      // 061: putstatic fb.Qe B
      // 064: getstatic ab.A Lfb;
      // 067: invokevirtual fb.d ()V
      // 06a: aload 3
      // 06b: invokevirtual java/io/DataInputStream.readInt ()I
      // 06e: dup
      // 06f: istore 0
      // 070: newarray 8
      // 072: astore 6
      // 074: aload 3
      // 075: aload 6
      // 077: bipush 0
      // 078: iload 0
      // 079: invokevirtual java/io/DataInputStream.read ([BII)I
      // 07c: pop
      // 07d: new java/io/ByteArrayInputStream
      // 080: dup
      // 081: aload 6
      // 083: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 086: astore 5
      // 088: new java/io/DataInputStream
      // 08b: dup
      // 08c: aload 5
      // 08e: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 091: astore 4
      // 093: aload 3
      // 094: invokevirtual java/io/DataInputStream.readInt ()I
      // 097: dup
      // 098: istore 0
      // 099: newarray 8
      // 09b: astore 6
      // 09d: aload 3
      // 09e: aload 6
      // 0a0: bipush 0
      // 0a1: iload 0
      // 0a2: invokevirtual java/io/DataInputStream.read ([BII)I
      // 0a5: pop
      // 0a6: aload 6
      // 0a8: bipush 0
      // 0a9: baload
      // 0aa: invokestatic ab.c (I)V
      // 0ad: aload 6
      // 0af: bipush 1
      // 0b0: baload
      // 0b1: putstatic ab.s B
      // 0b4: bipush 0
      // 0b5: putstatic ab.v Z
      // 0b8: invokestatic fb.i ()Z
      // 0bb: ifeq 0ce
      // 0be: aload 6
      // 0c0: bipush 2
      // 0c1: baload
      // 0c2: bipush 1
      // 0c3: if_icmpne 0ca
      // 0c6: bipush 1
      // 0c7: goto 0cb
      // 0ca: bipush 0
      // 0cb: putstatic ab.v Z
      // 0ce: aload 4
      // 0d0: invokevirtual java/io/DataInputStream.readByte ()B
      // 0d3: istore 0
      // 0d4: goto 0db
      // 0d7: pop
      // 0d8: goto 8e5
      // 0db: iload 0
      // 0dc: ifne 14e
      // 0df: bipush 0
      // 0e0: istore 0
      // 0e1: iload 0
      // 0e2: getstatic fb.Pe B
      // 0e5: if_icmpge 0ce
      // 0e8: bipush 0
      // 0e9: iload 17
      // 0eb: ifne 0d3
      // 0ee: istore 6
      // 0f0: iload 6
      // 0f2: getstatic fb.Qe B
      // 0f5: if_icmpge 146
      // 0f8: aload 4
      // 0fa: invokevirtual java/io/DataInputStream.readByte ()B
      // 0fd: dup
      // 0fe: istore 7
      // 100: iload 17
      // 102: ifne 0e2
      // 105: ifle 131
      // 108: getstatic ab.oc Ljava/util/Random;
      // 10b: bipush 4
      // 10c: invokevirtual java/util/Random.nextInt (I)I
      // 10f: ifne 124
      // 112: getstatic ab.oc Ljava/util/Random;
      // 115: bipush 9
      // 117: invokevirtual java/util/Random.nextInt (I)I
      // 11a: bipush 27
      // 11c: iadd
      // 11d: istore 7
      // 11f: iload 17
      // 121: ifeq 12e
      // 124: getstatic ab.oc Ljava/util/Random;
      // 127: bipush 6
      // 129: invokevirtual java/util/Random.nextInt (I)I
      // 12c: istore 7
      // 12e: iinc 7 1
      // 131: getstatic fb.Re [[Llb;
      // 134: iload 0
      // 135: aaload
      // 136: iload 6
      // 138: aaload
      // 139: iload 7
      // 13b: putfield lb.b I
      // 13e: iinc 6 1
      // 141: iload 17
      // 143: ifeq 0f0
      // 146: iinc 0 1
      // 149: iload 17
      // 14b: ifeq 0e1
      // 14e: iload 0
      // 14f: bipush 1
      // 150: if_icmpne 1a9
      // 153: bipush 0
      // 154: istore 0
      // 155: iload 0
      // 156: getstatic fb.Pe B
      // 159: if_icmpge 0ce
      // 15c: bipush 0
      // 15d: iload 17
      // 15f: ifne 0d3
      // 162: istore 6
      // 164: iload 6
      // 166: getstatic fb.Qe B
      // 169: if_icmpge 1a1
      // 16c: aload 4
      // 16e: invokevirtual java/io/DataInputStream.readByte ()B
      // 171: dup
      // 172: istore 7
      // 174: iload 17
      // 176: ifne 156
      // 179: ifle 18c
      // 17c: getstatic fb.Re [[Llb;
      // 17f: iload 0
      // 180: aaload
      // 181: iload 6
      // 183: aaload
      // 184: iload 7
      // 186: bipush 6
      // 188: iadd
      // 189: putfield lb.b I
      // 18c: getstatic fb.Re [[Llb;
      // 18f: iload 0
      // 190: aaload
      // 191: iload 6
      // 193: aaload
      // 194: iload 7
      // 196: putfield lb.c I
      // 199: iinc 6 1
      // 19c: iload 17
      // 19e: ifeq 164
      // 1a1: iinc 0 1
      // 1a4: iload 17
      // 1a6: ifeq 155
      // 1a9: iload 0
      // 1aa: bipush 2
      // 1ab: if_icmpne 2df
      // 1ae: aload 4
      // 1b0: invokevirtual java/io/DataInputStream.readShort ()S
      // 1b3: istore 9
      // 1b5: bipush 0
      // 1b6: istore 11
      // 1b8: iload 11
      // 1ba: iload 9
      // 1bc: if_icmpge 2da
      // 1bf: aload 4
      // 1c1: invokevirtual java/io/DataInputStream.readByte ()B
      // 1c4: istore 0
      // 1c5: aload 4
      // 1c7: invokevirtual java/io/DataInputStream.readByte ()B
      // 1ca: istore 6
      // 1cc: aload 4
      // 1ce: invokevirtual java/io/DataInputStream.readByte ()B
      // 1d1: dup
      // 1d2: istore 8
      // 1d4: bipush -1
      // 1d5: iload 17
      // 1d7: ifne 150
      // 1da: if_icmpeq 1f0
      // 1dd: aload 4
      // 1df: invokevirtual java/io/DataInputStream.readByte ()B
      // 1e2: istore 7
      // 1e4: aload 4
      // 1e6: invokevirtual java/io/DataInputStream.readByte ()B
      // 1e9: istore 10
      // 1eb: iload 17
      // 1ed: ifeq 1f6
      // 1f0: bipush 0
      // 1f1: istore 7
      // 1f3: bipush 0
      // 1f4: istore 10
      // 1f6: iload 8
      // 1f8: bipush 1
      // 1f9: if_icmpne 205
      // 1fc: bipush 0
      // 1fd: invokestatic fb.e (I)V
      // 200: iload 17
      // 202: ifeq 22e
      // 205: iload 8
      // 207: bipush 3
      // 208: if_icmpne 214
      // 20b: bipush 2
      // 20c: invokestatic fb.e (I)V
      // 20f: iload 17
      // 211: ifeq 22e
      // 214: iload 8
      // 216: bipush 5
      // 217: if_icmpne 223
      // 21a: bipush 3
      // 21b: invokestatic fb.e (I)V
      // 21e: iload 17
      // 220: ifeq 22e
      // 223: iload 8
      // 225: bipush 7
      // 227: if_icmpne 22e
      // 22a: bipush 4
      // 22b: invokestatic fb.e (I)V
      // 22e: iload 8
      // 230: bipush 2
      // 231: if_icmpne 273
      // 234: getstatic fb.Re [[Llb;
      // 237: iload 0
      // 238: aaload
      // 239: iload 6
      // 23b: aaload
      // 23c: new j
      // 23f: dup
      // 240: bipush 0
      // 241: bipush 0
      // 242: iload 0
      // 243: i2b
      // 244: iload 6
      // 246: i2b
      // 247: iload 10
      // 249: invokespecial j.<init> (BBBBB)V
      // 24c: putfield lb.d Lj;
      // 24f: getstatic fb.Re [[Llb;
      // 252: iload 0
      // 253: bipush 2
      // 254: iadd
      // 255: aaload
      // 256: iload 6
      // 258: aaload
      // 259: new j
      // 25c: dup
      // 25d: bipush 0
      // 25e: bipush 0
      // 25f: iload 0
      // 260: bipush 2
      // 261: iadd
      // 262: i2b
      // 263: iload 6
      // 265: i2b
      // 266: iload 10
      // 268: invokespecial j.<init> (BBBBB)V
      // 26b: putfield lb.d Lj;
      // 26e: iload 17
      // 270: ifeq 2d2
      // 273: iload 8
      // 275: bipush -1
      // 276: if_icmpne 287
      // 279: getstatic fb.Re [[Llb;
      // 27c: iload 0
      // 27d: aaload
      // 27e: iload 6
      // 280: aaload
      // 281: getfield lb.d Lj;
      // 284: ifnonnull 2d2
      // 287: getstatic ab.bc I
      // 28a: bipush 7
      // 28c: if_icmpne 29e
      // 28f: iload 0
      // 290: bipush 5
      // 291: if_icmpne 2b3
      // 294: iload 6
      // 296: bipush 29
      // 298: if_icmpne 2b3
      // 29b: goto 2d2
      // 29e: getstatic ab.bc I
      // 2a1: bipush 17
      // 2a3: if_icmpne 2b3
      // 2a6: iload 0
      // 2a7: bipush 10
      // 2a9: if_icmpne 2b3
      // 2ac: iload 6
      // 2ae: bipush 10
      // 2b0: if_icmpeq 2d2
      // 2b3: getstatic fb.Re [[Llb;
      // 2b6: iload 0
      // 2b7: aaload
      // 2b8: iload 6
      // 2ba: aaload
      // 2bb: new j
      // 2be: dup
      // 2bf: iload 8
      // 2c1: i2b
      // 2c2: iload 7
      // 2c4: i2b
      // 2c5: iload 0
      // 2c6: i2b
      // 2c7: iload 6
      // 2c9: i2b
      // 2ca: iload 10
      // 2cc: invokespecial j.<init> (BBBBB)V
      // 2cf: putfield lb.d Lj;
      // 2d2: iinc 11 1
      // 2d5: iload 17
      // 2d7: ifeq 1b8
      // 2da: iload 17
      // 2dc: ifeq 0ce
      // 2df: iload 0
      // 2e0: bipush 3
      // 2e1: if_icmpne 4fc
      // 2e4: aload 4
      // 2e6: invokevirtual java/io/DataInputStream.readInt ()I
      // 2e9: istore 13
      // 2eb: bipush 0
      // 2ec: istore 12
      // 2ee: iload 12
      // 2f0: iload 13
      // 2f2: if_icmpge 4f7
      // 2f5: aload 4
      // 2f7: invokevirtual java/io/DataInputStream.readShort ()S
      // 2fa: istore 0
      // 2fb: aload 4
      // 2fd: invokevirtual java/io/DataInputStream.readShort ()S
      // 300: istore 6
      // 302: aload 4
      // 304: invokevirtual java/io/DataInputStream.readByte ()B
      // 307: istore 8
      // 309: aload 4
      // 30b: invokevirtual java/io/DataInputStream.readByte ()B
      // 30e: istore 7
      // 310: iload 0
      // 311: bipush 30
      // 313: idiv
      // 314: istore 11
      // 316: iload 6
      // 318: bipush 30
      // 31a: idiv
      // 31b: istore 14
      // 31d: getstatic k.c [[[I
      // 320: iload 8
      // 322: aaload
      // 323: iload 7
      // 325: aaload
      // 326: bipush 0
      // 327: iaload
      // 328: istore 10
      // 32a: getstatic k.c [[[I
      // 32d: iload 8
      // 32f: aaload
      // 330: iload 7
      // 332: aaload
      // 333: bipush 1
      // 334: iaload
      // 335: istore 9
      // 337: iload 10
      // 339: iload 17
      // 33b: ifne 0d3
      // 33e: ifne 34a
      // 341: getstatic ab.Jb Z
      // 344: ifeq 4ef
      // 347: goto 4ef
      // 34a: iload 10
      // 34c: bipush 1
      // 34d: if_icmpne 4ef
      // 350: getstatic ab.Jb Z
      // 353: ifeq 36e
      // 356: iload 8
      // 358: bipush 3
      // 359: if_icmpeq 36e
      // 35c: iload 8
      // 35e: bipush 4
      // 35f: if_icmpeq 36e
      // 362: iload 8
      // 364: bipush 5
      // 365: if_icmpeq 36e
      // 368: iload 8
      // 36a: bipush 2
      // 36b: if_icmpne 4ef
      // 36e: bipush 0
      // 36f: istore 15
      // 371: iload 9
      // 373: bipush 1
      // 374: if_icmpeq 37d
      // 377: iload 9
      // 379: bipush 3
      // 37a: if_icmpne 3ab
      // 37d: getstatic fb.Re [[Llb;
      // 380: iload 11
      // 382: aaload
      // 383: iload 14
      // 385: aaload
      // 386: getfield lb.d Lj;
      // 389: ifnonnull 3ab
      // 38c: getstatic fb.Re [[Llb;
      // 38f: iload 11
      // 391: aaload
      // 392: iload 14
      // 394: aaload
      // 395: new j
      // 398: dup
      // 399: bipush -1
      // 39a: bipush 0
      // 39b: iload 11
      // 39d: i2b
      // 39e: iload 14
      // 3a0: i2b
      // 3a1: bipush 0
      // 3a2: invokespecial j.<init> (BBBBB)V
      // 3a5: putfield lb.d Lj;
      // 3a8: bipush 1
      // 3a9: istore 15
      // 3ab: iload 6
      // 3ad: bipush 30
      // 3af: irem
      // 3b0: bipush 22
      // 3b2: if_icmpge 3ba
      // 3b5: iload 15
      // 3b7: ifeq 456
      // 3ba: getstatic fb.Re [[Llb;
      // 3bd: iload 11
      // 3bf: aaload
      // 3c0: iload 14
      // 3c2: aaload
      // 3c3: getfield lb.f [I
      // 3c6: ifnonnull 3e7
      // 3c9: getstatic fb.Re [[Llb;
      // 3cc: iload 11
      // 3ce: aaload
      // 3cf: iload 14
      // 3d1: aaload
      // 3d2: dup
      // 3d3: astore 9
      // 3d5: bipush 3
      // 3d6: newarray 10
      // 3d8: dup
      // 3d9: bipush 0
      // 3da: bipush -1
      // 3db: iastore
      // 3dc: dup
      // 3dd: bipush 1
      // 3de: bipush -1
      // 3df: iastore
      // 3e0: dup
      // 3e1: bipush 2
      // 3e2: bipush -1
      // 3e3: iastore
      // 3e4: putfield lb.f [I
      // 3e7: bipush 0
      // 3e8: istore 16
      // 3ea: iload 16
      // 3ec: getstatic fb.Re [[Llb;
      // 3ef: iload 11
      // 3f1: aaload
      // 3f2: iload 14
      // 3f4: aaload
      // 3f5: getfield lb.f [I
      // 3f8: arraylength
      // 3f9: if_icmpge 453
      // 3fc: getstatic fb.Re [[Llb;
      // 3ff: iload 11
      // 401: aaload
      // 402: iload 14
      // 404: aaload
      // 405: getfield lb.f [I
      // 408: iload 16
      // 40a: iaload
      // 40b: bipush -1
      // 40c: iload 17
      // 40e: ifne 2f2
      // 411: if_icmpne 44b
      // 414: iload 8
      // 416: invokestatic k.b (I)V
      // 419: getstatic fb.Rd Ljava/util/Vector;
      // 41c: new o
      // 41f: dup
      // 420: iload 8
      // 422: i2b
      // 423: iload 7
      // 425: i2b
      // 426: iload 0
      // 427: iload 6
      // 429: invokespecial o.<init> (BBII)V
      // 42c: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 42f: getstatic fb.Re [[Llb;
      // 432: iload 11
      // 434: aaload
      // 435: iload 14
      // 437: aaload
      // 438: getfield lb.f [I
      // 43b: iload 16
      // 43d: getstatic fb.Rd Ljava/util/Vector;
      // 440: invokevirtual java/util/Vector.size ()I
      // 443: bipush 1
      // 444: isub
      // 445: iastore
      // 446: iload 17
      // 448: ifeq 4ef
      // 44b: iinc 16 1
      // 44e: iload 17
      // 450: ifeq 3ea
      // 453: goto 4ef
      // 456: getstatic fb.Re [[Llb;
      // 459: iload 11
      // 45b: aaload
      // 45c: iload 14
      // 45e: aaload
      // 45f: getfield lb.e [I
      // 462: ifnonnull 483
      // 465: getstatic fb.Re [[Llb;
      // 468: iload 11
      // 46a: aaload
      // 46b: iload 14
      // 46d: aaload
      // 46e: dup
      // 46f: astore 9
      // 471: bipush 3
      // 472: newarray 10
      // 474: dup
      // 475: bipush 0
      // 476: bipush -1
      // 477: iastore
      // 478: dup
      // 479: bipush 1
      // 47a: bipush -1
      // 47b: iastore
      // 47c: dup
      // 47d: bipush 2
      // 47e: bipush -1
      // 47f: iastore
      // 480: putfield lb.e [I
      // 483: bipush 0
      // 484: istore 16
      // 486: iload 16
      // 488: getstatic fb.Re [[Llb;
      // 48b: iload 11
      // 48d: aaload
      // 48e: iload 14
      // 490: aaload
      // 491: getfield lb.e [I
      // 494: arraylength
      // 495: if_icmpge 4ef
      // 498: getstatic fb.Re [[Llb;
      // 49b: iload 11
      // 49d: aaload
      // 49e: iload 14
      // 4a0: aaload
      // 4a1: getfield lb.e [I
      // 4a4: iload 16
      // 4a6: iaload
      // 4a7: bipush -1
      // 4a8: iload 17
      // 4aa: ifne 2f2
      // 4ad: if_icmpne 4e7
      // 4b0: iload 8
      // 4b2: invokestatic k.b (I)V
      // 4b5: getstatic fb.Rd Ljava/util/Vector;
      // 4b8: new o
      // 4bb: dup
      // 4bc: iload 8
      // 4be: i2b
      // 4bf: iload 7
      // 4c1: i2b
      // 4c2: iload 0
      // 4c3: iload 6
      // 4c5: invokespecial o.<init> (BBII)V
      // 4c8: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 4cb: getstatic fb.Re [[Llb;
      // 4ce: iload 11
      // 4d0: aaload
      // 4d1: iload 14
      // 4d3: aaload
      // 4d4: getfield lb.e [I
      // 4d7: iload 16
      // 4d9: getstatic fb.Rd Ljava/util/Vector;
      // 4dc: invokevirtual java/util/Vector.size ()I
      // 4df: bipush 1
      // 4e0: isub
      // 4e1: iastore
      // 4e2: iload 17
      // 4e4: ifeq 4ef
      // 4e7: iinc 16 1
      // 4ea: iload 17
      // 4ec: ifeq 486
      // 4ef: iinc 12 1
      // 4f2: iload 17
      // 4f4: ifeq 2ee
      // 4f7: iload 17
      // 4f9: ifeq 0ce
      // 4fc: iload 0
      // 4fd: bipush 4
      // 4fe: if_icmpne 0ce
      // 501: aload 4
      // 503: invokevirtual java/io/DataInputStream.readInt ()I
      // 506: istore 9
      // 508: bipush 0
      // 509: iload 17
      // 50b: ifne 0dc
      // 50e: istore 10
      // 510: iload 10
      // 512: iload 9
      // 514: if_icmpge 8e0
      // 517: aload 4
      // 519: invokevirtual java/io/DataInputStream.readByte ()B
      // 51c: istore 7
      // 51e: aload 4
      // 520: invokevirtual java/io/DataInputStream.readByte ()B
      // 523: istore 0
      // 524: aload 4
      // 526: invokevirtual java/io/DataInputStream.readByte ()B
      // 529: istore 6
      // 52b: aload 4
      // 52d: invokevirtual java/io/DataInputStream.readByte ()B
      // 530: dup
      // 531: istore 11
      // 533: newarray 8
      // 535: astore 13
      // 537: bipush 0
      // 538: iload 17
      // 53a: ifne 0d3
      // 53d: istore 12
      // 53f: iload 12
      // 541: iload 11
      // 543: if_icmpge 561
      // 546: aload 13
      // 548: iload 12
      // 54a: aload 4
      // 54c: invokevirtual java/io/DataInputStream.readByte ()B
      // 54f: bastore
      // 550: iload 12
      // 552: bipush 1
      // 553: iadd
      // 554: i2b
      // 555: istore 12
      // 557: iload 17
      // 559: ifne 6d3
      // 55c: iload 17
      // 55e: ifeq 53f
      // 561: iload 7
      // 563: ifne 6d3
      // 566: aload 13
      // 568: bipush 0
      // 569: baload
      // 56a: bipush 2
      // 56b: if_icmpne 573
      // 56e: aload 13
      // 570: bipush 0
      // 571: bipush 3
      // 572: bastore
      // 573: aload 13
      // 575: bipush 0
      // 576: baload
      // 577: bipush 1
      // 578: if_icmpne 585
      // 57b: bipush 6
      // 57d: invokestatic fb.e (I)V
      // 580: iload 17
      // 582: ifeq 623
      // 585: aload 13
      // 587: bipush 0
      // 588: baload
      // 589: bipush 4
      // 58a: if_icmpne 597
      // 58d: bipush 7
      // 58f: invokestatic fb.e (I)V
      // 592: iload 17
      // 594: ifeq 623
      // 597: aload 13
      // 599: bipush 0
      // 59a: baload
      // 59b: bipush 8
      // 59d: if_icmpne 5aa
      // 5a0: bipush 6
      // 5a2: invokestatic fb.e (I)V
      // 5a5: iload 17
      // 5a7: ifeq 623
      // 5aa: aload 13
      // 5ac: bipush 0
      // 5ad: baload
      // 5ae: bipush 5
      // 5af: if_icmpne 5c1
      // 5b2: bipush 6
      // 5b4: invokestatic fb.e (I)V
      // 5b7: bipush 8
      // 5b9: invokestatic fb.e (I)V
      // 5bc: iload 17
      // 5be: ifeq 623
      // 5c1: aload 13
      // 5c3: bipush 0
      // 5c4: baload
      // 5c5: bipush 7
      // 5c7: if_icmpne 5d9
      // 5ca: bipush 6
      // 5cc: invokestatic fb.e (I)V
      // 5cf: bipush 9
      // 5d1: invokestatic fb.e (I)V
      // 5d4: iload 17
      // 5d6: ifeq 623
      // 5d9: aload 13
      // 5db: bipush 0
      // 5dc: baload
      // 5dd: bipush 6
      // 5df: if_icmpne 5f1
      // 5e2: bipush 6
      // 5e4: invokestatic fb.e (I)V
      // 5e7: bipush 10
      // 5e9: invokestatic fb.e (I)V
      // 5ec: iload 17
      // 5ee: ifeq 623
      // 5f1: aload 13
      // 5f3: bipush 0
      // 5f4: baload
      // 5f5: bipush 2
      // 5f6: if_icmpne 603
      // 5f9: bipush 11
      // 5fb: invokestatic fb.e (I)V
      // 5fe: iload 17
      // 600: ifeq 623
      // 603: aload 13
      // 605: bipush 0
      // 606: baload
      // 607: bipush 3
      // 608: if_icmpne 615
      // 60b: bipush 12
      // 60d: invokestatic fb.e (I)V
      // 610: iload 17
      // 612: ifeq 623
      // 615: aload 13
      // 617: bipush 0
      // 618: baload
      // 619: bipush 9
      // 61b: if_icmpne 623
      // 61e: bipush 18
      // 620: invokestatic fb.e (I)V
      // 623: new sb
      // 626: dup
      // 627: iload 0
      // 628: i2b
      // 629: iload 6
      // 62b: i2b
      // 62c: aload 13
      // 62e: bipush 0
      // 62f: baload
      // 630: aload 13
      // 632: bipush 1
      // 633: baload
      // 634: aload 13
      // 636: bipush 2
      // 637: baload
      // 638: aload 13
      // 63a: bipush 3
      // 63b: baload
      // 63c: aload 13
      // 63e: bipush 4
      // 63f: baload
      // 640: aload 13
      // 642: bipush 5
      // 643: baload
      // 644: aload 13
      // 646: bipush 6
      // 648: baload
      // 649: bipush 1
      // 64a: if_icmpne 651
      // 64d: bipush 1
      // 64e: goto 652
      // 651: bipush 0
      // 652: aload 13
      // 654: bipush 7
      // 656: baload
      // 657: aload 13
      // 659: bipush 8
      // 65b: baload
      // 65c: bipush 1
      // 65d: if_icmpne 664
      // 660: bipush 1
      // 661: goto 665
      // 664: bipush 0
      // 665: aload 13
      // 667: bipush 9
      // 669: baload
      // 66a: bipush 1
      // 66b: if_icmpne 672
      // 66e: bipush 1
      // 66f: goto 673
      // 672: bipush 0
      // 673: aload 13
      // 675: bipush 10
      // 677: baload
      // 678: bipush 1
      // 679: if_icmpne 680
      // 67c: bipush 1
      // 67d: goto 681
      // 680: bipush 0
      // 681: invokespecial sb.<init> (BBBBBBBBZBZZZ)V
      // 684: astore 11
      // 686: aload 13
      // 688: bipush 0
      // 689: baload
      // 68a: bipush 9
      // 68c: if_icmpne 8d8
      // 68f: iload 0
      // 690: iload 6
      // 692: invokestatic j.c (II)Z
      // 695: ifne 8d8
      // 698: getstatic fb.Re [[Llb;
      // 69b: iload 0
      // 69c: aaload
      // 69d: iload 6
      // 69f: aaload
      // 6a0: new j
      // 6a3: dup
      // 6a4: bipush -1
      // 6a5: iload 7
      // 6a7: i2b
      // 6a8: iload 0
      // 6a9: i2b
      // 6aa: iload 6
      // 6ac: i2b
      // 6ad: bipush 0
      // 6ae: invokespecial j.<init> (BBBBB)V
      // 6b1: putfield lb.d Lj;
      // 6b4: aload 11
      // 6b6: new nb
      // 6b9: dup
      // 6ba: getstatic fb.sd Lpb;
      // 6bd: invokespecial nb.<init> (Lpb;)V
      // 6c0: putfield sb.r Lnb;
      // 6c3: aload 11
      // 6c5: iload 0
      // 6c6: putfield sb.s I
      // 6c9: aload 11
      // 6cb: iload 6
      // 6cd: putfield sb.t I
      // 6d0: goto 8d8
      // 6d3: iload 7
      // 6d5: bipush 1
      // 6d6: if_icmpne 6e8
      // 6d9: aload 13
      // 6db: iload 0
      // 6dc: iload 6
      // 6de: iload 1
      // 6df: bipush 1
      // 6e0: invokestatic k.b ([BIIZZ)V
      // 6e3: iload 17
      // 6e5: ifeq 8c1
      // 6e8: iload 7
      // 6ea: bipush 3
      // 6eb: if_icmpne 705
      // 6ee: aload 13
      // 6f0: iload 0
      // 6f1: iload 6
      // 6f3: iload 1
      // 6f4: bipush 1
      // 6f5: invokestatic k.c ([BIIZZ)V
      // 6f8: iload 1
      // 6f9: ifeq 8c1
      // 6fc: getstatic ab.v Z
      // 6ff: ifne 8c1
      // 702: goto 8d8
      // 705: iload 7
      // 707: bipush 2
      // 708: if_icmpne 725
      // 70b: aload 13
      // 70d: bipush 0
      // 70e: baload
      // 70f: bipush 4
      // 710: if_icmpge 8c1
      // 713: new s
      // 716: bipush 1
      // 717: iload 0
      // 718: i2b
      // 719: iload 6
      // 71b: i2b
      // 71c: bipush 0
      // 71d: invokespecial s.<init> (BBBZ)V
      // 720: iload 17
      // 722: ifeq 8c1
      // 725: iload 7
      // 727: bipush 4
      // 728: if_icmpeq 731
      // 72b: iload 7
      // 72d: bipush 5
      // 72e: if_icmpne 73b
      // 731: invokestatic fb.j ()B
      // 734: bipush 2
      // 735: if_icmpeq 8c1
      // 738: goto 8d8
      // 73b: iload 7
      // 73d: bipush 6
      // 73f: if_icmpne 78e
      // 742: aload 13
      // 744: bipush 0
      // 745: baload
      // 746: ifne 75a
      // 749: bipush -1
      // 74a: iload 0
      // 74b: i2b
      // 74c: iload 6
      // 74e: i2b
      // 74f: aconst_null
      // 750: aconst_null
      // 751: invokestatic hb.b (BBBLq;[B)Lhb;
      // 754: pop
      // 755: iload 17
      // 757: ifeq 8c1
      // 75a: aload 13
      // 75c: bipush 0
      // 75d: baload
      // 75e: bipush 1
      // 75f: if_icmpne 774
      // 762: bipush -2
      // 764: iload 0
      // 765: i2b
      // 766: iload 6
      // 768: i2b
      // 769: aconst_null
      // 76a: aconst_null
      // 76b: invokestatic hb.b (BBBLq;[B)Lhb;
      // 76e: pop
      // 76f: iload 17
      // 771: ifeq 8c1
      // 774: aload 13
      // 776: bipush 0
      // 777: baload
      // 778: bipush 2
      // 779: if_icmpne 8c1
      // 77c: bipush -3
      // 77e: iload 0
      // 77f: i2b
      // 780: iload 6
      // 782: i2b
      // 783: aconst_null
      // 784: aconst_null
      // 785: invokestatic hb.b (BBBLq;[B)Lhb;
      // 788: pop
      // 789: iload 17
      // 78b: ifeq 8c1
      // 78e: iload 7
      // 790: bipush 7
      // 792: if_icmpne 831
      // 795: invokestatic fb.i ()Z
      // 798: ifne 7ab
      // 79b: aload 13
      // 79d: bipush 0
      // 79e: baload
      // 79f: bipush 3
      // 7a0: if_icmpeq 8d8
      // 7a3: aload 13
      // 7a5: bipush 0
      // 7a6: baload
      // 7a7: bipush 4
      // 7a8: if_icmpeq 8d8
      // 7ab: aload 13
      // 7ad: bipush 0
      // 7ae: baload
      // 7af: bipush 5
      // 7b0: if_icmpne 7b8
      // 7b3: bipush 17
      // 7b5: invokestatic fb.e (I)V
      // 7b8: new v
      // 7bb: iload 0
      // 7bc: i2b
      // 7bd: iload 6
      // 7bf: i2b
      // 7c0: aload 13
      // 7c2: bipush 0
      // 7c3: baload
      // 7c4: aload 13
      // 7c6: bipush 1
      // 7c7: baload
      // 7c8: aload 13
      // 7ca: bipush 2
      // 7cb: baload
      // 7cc: aload 13
      // 7ce: bipush 3
      // 7cf: baload
      // 7d0: aload 13
      // 7d2: bipush 4
      // 7d3: baload
      // 7d4: aload 13
      // 7d6: bipush 5
      // 7d7: baload
      // 7d8: aload 13
      // 7da: bipush 6
      // 7dc: baload
      // 7dd: aload 13
      // 7df: bipush 7
      // 7e1: baload
      // 7e2: aload 13
      // 7e4: bipush 8
      // 7e6: baload
      // 7e7: bipush 1
      // 7e8: if_icmpne 7ef
      // 7eb: bipush 1
      // 7ec: goto 7f0
      // 7ef: bipush 0
      // 7f0: aload 13
      // 7f2: bipush 9
      // 7f4: baload
      // 7f5: bipush 1
      // 7f6: if_icmpne 7fd
      // 7f9: bipush 1
      // 7fa: goto 7fe
      // 7fd: bipush 0
      // 7fe: aload 13
      // 800: bipush 10
      // 802: baload
      // 803: bipush 1
      // 804: if_icmpne 80b
      // 807: bipush 1
      // 808: goto 80c
      // 80b: bipush 0
      // 80c: aload 13
      // 80e: bipush 11
      // 810: baload
      // 811: aload 13
      // 813: bipush 12
      // 815: baload
      // 816: aload 13
      // 818: bipush 13
      // 81a: baload
      // 81b: bipush 1
      // 81c: if_icmpne 823
      // 81f: bipush 1
      // 820: goto 824
      // 823: bipush 0
      // 824: aload 13
      // 826: bipush 14
      // 828: baload
      // 829: invokespecial v.<init> (BBBBBBBBBBZZZBBZB)V
      // 82c: iload 17
      // 82e: ifeq 8d8
      // 831: iload 7
      // 833: bipush 8
      // 835: if_icmpne 8c1
      // 838: bipush 5
      // 839: istore 11
      // 83b: aconst_null
      // 83c: astore 14
      // 83e: aload 13
      // 840: bipush 0
      // 841: baload
      // 842: ifne 863
      // 845: getstatic fb.Lc Lpb;
      // 848: ifnull 863
      // 84b: new t
      // 84e: dup
      // 84f: bipush 0
      // 850: getstatic fb.Lc Lpb;
      // 853: bipush 10
      // 855: bipush 0
      // 856: bipush 0
      // 857: bipush 0
      // 858: bipush -5
      // 85a: invokespecial t.<init> (BLpb;IIIII)V
      // 85d: astore 14
      // 85f: bipush 10
      // 861: istore 11
      // 863: aload 14
      // 865: ifnull 8d8
      // 868: aload 13
      // 86a: bipush 4
      // 86b: baload
      // 86c: ifle 879
      // 86f: aload 13
      // 871: bipush 4
      // 872: baload
      // 873: bipush 25
      // 875: imul
      // 876: goto 87a
      // 879: bipush -1
      // 87a: istore 7
      // 87c: aload 13
      // 87e: bipush 1
      // 87f: baload
      // 880: istore 15
      // 882: aload 13
      // 884: bipush 2
      // 885: baload
      // 886: istore 16
      // 888: new r
      // 88b: dup
      // 88c: aconst_null
      // 88d: iload 0
      // 88e: bipush 30
      // 890: imul
      // 891: bipush 15
      // 893: iadd
      // 894: iload 6
      // 896: bipush 30
      // 898: imul
      // 899: bipush 15
      // 89b: iadd
      // 89c: iload 15
      // 89e: iload 16
      // 8a0: iload 11
      // 8a2: iload 7
      // 8a4: aload 14
      // 8a6: invokespecial r.<init> (Lo;IIIIIILo;)V
      // 8a9: aload 13
      // 8ab: bipush 3
      // 8ac: baload
      // 8ad: ifne 8b4
      // 8b0: bipush 1
      // 8b1: goto 8b5
      // 8b4: bipush 0
      // 8b5: istore 6
      // 8b7: dup
      // 8b8: astore 0
      // 8b9: iload 6
      // 8bb: putfield r.A Z
      // 8be: goto 8d8
      // 8c1: getstatic fb.Sd Ljava/util/Vector;
      // 8c4: new g
      // 8c7: dup
      // 8c8: iload 7
      // 8ca: i2b
      // 8cb: iload 0
      // 8cc: i2b
      // 8cd: iload 6
      // 8cf: i2b
      // 8d0: aload 13
      // 8d2: invokespecial g.<init> (BBB[B)V
      // 8d5: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 8d8: iinc 10 1
      // 8db: iload 17
      // 8dd: ifeq 510
      // 8e0: iload 17
      // 8e2: ifeq 0ce
      // 8e5: aload 5
      // 8e7: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 8ea: aload 4
      // 8ec: invokevirtual java/io/DataInputStream.close ()V
      // 8ef: invokestatic y.l ()V
      // 8f2: aload 4
      // 8f4: invokevirtual java/io/DataInputStream.close ()V
      // 8f7: aload 5
      // 8f9: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 8fc: aload 3
      // 8fd: invokevirtual java/io/DataInputStream.close ()V
      // 900: aload 2
      // 901: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 904: goto 908
      // 907: pop
      // 908: bipush 1
      // 909: ireturn
      // 90a: aload 3
      // 90b: invokevirtual java/io/DataInputStream.close ()V
      // 90e: aload 2
      // 90f: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 912: goto 970
      // 915: pop
      // 916: goto 970
      // 919: pop
      // 91a: aload 4
      // 91c: ifnull 924
      // 91f: aload 4
      // 921: invokevirtual java/io/DataInputStream.close ()V
      // 924: aload 5
      // 926: ifnull 92e
      // 929: aload 5
      // 92b: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 92e: aload 3
      // 92f: ifnull 936
      // 932: aload 3
      // 933: invokevirtual java/io/DataInputStream.close ()V
      // 936: aload 2
      // 937: ifnull 93e
      // 93a: aload 2
      // 93b: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 93e: goto 970
      // 941: pop
      // 942: goto 970
      // 945: astore 0
      // 946: aload 4
      // 948: ifnull 950
      // 94b: aload 4
      // 94d: invokevirtual java/io/DataInputStream.close ()V
      // 950: aload 5
      // 952: ifnull 95a
      // 955: aload 5
      // 957: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 95a: aload 3
      // 95b: ifnull 962
      // 95e: aload 3
      // 95f: invokevirtual java/io/DataInputStream.close ()V
      // 962: aload 2
      // 963: ifnull 96a
      // 966: aload 2
      // 967: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 96a: goto 96e
      // 96d: pop
      // 96e: aload 0
      // 96f: athrow
      // 970: bipush 0
      // 971: ireturn
      // try (36 -> 40): 41 java/lang/Exception
      // try (110 -> 113): 114 java/lang/Exception
      // try (1193 -> 1201): 1202 java/lang/Exception
      // try (1205 -> 1209): 1210 java/lang/Exception
      // try (13 -> 36): 1212 java/lang/Exception
      // try (44 -> 1193): 1212 java/lang/Exception
      // try (1213 -> 1229): 1230 java/lang/Exception
      // try (13 -> 36): 1232 null
      // try (44 -> 1193): 1232 null
      // try (1233 -> 1249): 1250 java/lang/Exception
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean b(String var0, boolean var1) {
      DataInputStream var2 = null;
      boolean var3 = false;
      boolean var9 = false /* VF: Semaphore variable */;

      label76: {
         try {
            var9 = true;
            byte[] var15 = new byte[(var2 = new DataInputStream((d == null ? (d = b("midlet")) : d).getResourceAsStream(var0))).available()];
            var2.readFully(var15);
            var3 = b(var15, var1);
            var9 = false;
            break label76;
         } catch (Exception var13) {
            var9 = false;
         } finally {
            if (var9) {
               try {
                  if (var2 != null) {
                     var2.close();
                  }
               } catch (Exception var10) {
               }
            }
         }

         try {
            if (var2 != null) {
               var2.close();
               return var3;
            }
         } catch (Exception var11) {
         }

         return var3;
      }

      try {
         var2.close();
      } catch (Exception var12) {
      }

      return var3;
   }

   public static String b(DataInputStream var0) {
      boolean var3 = ab.xc;
      String var1 = "";

      int var2;
      int var10000;
      byte var10001;
      while (true) {
         if ((var2 = var0.read()) != -1) {
            var10000 = var2;
            var10001 = 13;
            if (var3) {
               break;
            }

            if (var2 != 13 && var2 != 59) {
               var1 = var1 + (char)var2;
               continue;
            }
         }

         var10000 = var2;
         var10001 = 13;
         break;
      }

      if (var10000 == var10001) {
         var0.read();
         if (!var3) {
            return var1.trim();
         }
      }

      if (var2 == 59) {
         while ((var2 = var0.read()) != -1 && var2 != 13 && var2 != 59) {
         }
      } else if (var2 == -1 && var1.equals("")) {
         return null;
      }

      return var1.trim();
   }

   private static void b(int var0) {
      if (var0 == 3) {
         fb.e(13);
      } else if (var0 == 4) {
         fb.e(14);
      } else {
         if (var0 == 5) {
            fb.e(15);
         }
      }
   }

   public static void b(byte[] var0, int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = true;
      if (var4 && var0[1] == 0) {
         var5 = false;
      }

      if (!var4 && var0[1] == 1) {
         var5 = false;
      }

      if (var0[0] == 0 && !var3 && var5) {
         hb.b((byte)11, (byte)var1, (byte)var2, null, null);
         y.N[11]++;
      }

      if (var0[0] == 1 && var5) {
         hb.b((byte)10, (byte)var1, (byte)var2, null, null);
         y.N[10]++;
      }

      if (var0[0] == 2 && var5) {
         hb.b((byte)13, (byte)var1, (byte)var2, null, null);
      }

      if ((var0[0] == 3 || var0[0] == 4 || var0[0] == 5 || var0[0] == 6) && var5) {
         hb var6 = hb.b((byte)5, (byte)var1, (byte)var2, null, null);
         if (var0[0] > 3) {
            var6.E = false;
            var6.b((byte)(var0[0] - 3), null);
         }
      }
   }

   public static void c(byte[] var0, int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = true;
      if (var4 && var0[2] == 0) {
         var5 = false;
      }

      if (!var4 && var0[2] == 1) {
         var5 = false;
      }

      if (var0[0] == 0 && !var3 && var5) {
         new s((byte)2, (byte)var1, (byte)var2, var0[1] == 1);
      }

      if (var0[0] == 1 && !var3 && var5) {
         new s((byte)3, (byte)var1, (byte)var2, var0[1] == 1);
      }

      if (var0[0] == 2 && !var3 && var5) {
         new s((byte)4, (byte)var1, (byte)var2, var0[1] == 1);
      }

      if (var0[0] == 3 && !var3 && var5) {
         new s((byte)5, (byte)var1, (byte)var2, var0[1] == 1);
      }

      if (var0[0] == 4) {
         if (!var3 && var5) {
            new s((byte)7, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[2]++;
      }

      if (var0[0] == 5) {
         if (!var3 && var5) {
            new s((byte)8, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[5]++;
      }

      if (var0[0] == 6) {
         if (!var3 && var5) {
            new s((byte)9, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[3]++;
      }

      if (var0[0] == 7 && !var3 && var5) {
         new s((byte)10, (byte)var1, (byte)var2, var0[1] == 1);
      }

      if (var0[0] == 8) {
         if (!var3 && var5) {
            new s((byte)11, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[0]++;
      }

      if (var0[0] == 9 && !var3 && var5) {
         new s((byte)12, (byte)var1, (byte)var2, var0[1] == 1);
      }

      if (var0[0] == 10) {
         if (!var3 && var5) {
            new s((byte)13, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[7]++;
      }

      if (var0[0] == 11) {
         if (!var3 && var5) {
            new s((byte)14, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[12]++;
      }

      if (var0[0] == 12) {
         if (!var3 && var5) {
            new s((byte)15, (byte)var1, (byte)var2, var0[1] == 1);
         }

         y.N[13]++;
      }

      if (var0[0] == 13 && !var3 && var5) {
         new s((byte)17, (byte)var1, (byte)var2, var0[1] == 1);
      }
   }

   private static Class b(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var1) {
         throw new NoClassDefFoundError(var1.getMessage());
      }
   }
}
