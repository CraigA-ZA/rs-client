import accessors.RSClientProt;

public class lv implements km, RSClientProt {
   final int dq;
   static final lv an = new lv(1, -1);
   public static final lv bp = new lv(48, 7);
   public static final lv ac = new lv(3, 0);
   public static final lv au = new lv(4, 13);
   public static final lv ab = new lv(5, -2);
   public static final lv dp = new lv(92, 8);
   public static final lv af = new lv(0, -1);
   public static final lv at = new lv(8, 3);
   public static final lv cv = new lv(68, 2);
   public static final lv ay = new lv(10, 7);
   public static final lv ao = new lv(11, 4);
   public static final lv ax = new lv(12, -1);
   public static final lv ai = new lv(13, 6);
   public static final lv ag = new lv(14, -1);
   public static final lv ah = new lv(15, 15);
   public static final lv av = new lv(16, 5);
   static final lv ar = new lv(17, 2);
   public static final lv al = new lv(7, 3);
   public static final lv as = new lv(19, 7);
   public static final lv ad = new lv(23, 16);
   public static final lv ak = new lv(21, -1);
   public static final lv az = new lv(22, 3);
   public static final lv db = new lv(94, 7);
   public static final lv ae = new lv(24, 15);
   public static final lv ap = new lv(25, 15);
   public static final lv bm = new lv(34, 8);
   static final lv bb = new lv(27, -1);
   public static final lv bi = new lv(28, 7);
   public static final lv de = new lv(90, 3);
   static final lv bk = new lv(30, 7);
   public static final lv bx = new lv(31, 11);
   public static final lv bo = new lv(32, 3);
   public static final lv ci = new lv(53, 4);
   public static final lv bz = new lv(33, 7);
   public static final lv bd = new lv(35, 3);
   public static final lv bt = new lv(36, 4);
   static final lv bj = new lv(37, -1);
   public static final lv cs = new lv(54, 3);
   public static final lv ct = new lv(75, 22);
   static final lv br = new lv(40, 2);
   static final lv bg = new lv(41, -1);
   public static final lv bu = new lv(42, -2);
   public static final lv bf = new lv(43, 15);
   public static final lv aa = new lv(9, -1);
   public static final lv bq = new lv(44, 7);
   public static final lv bv = new lv(46, 4);
   public static final lv bl = new lv(47, 11);
   public static final lv aj = new lv(20, 8);
   public static final lv bs = new lv(39, 7);
   public static final lv bh = new lv(50, -1);
   public static final lv bw = new lv(51, 16);
   public static final lv ce = new lv(52, 11);
   public static final lv ba = new lv(45, -1);
   public static final lv cr = new lv(65, -1);
   public static final lv dl = new lv(84, -1);
   public static final lv cy = new lv(66, 1);
   public static final lv ca = new lv(57, 3);
   public static final lv aq = new lv(6, -2);
   public static final lv ck = new lv(59, -1);
   public static final lv cc = new lv(55, 2);
   public static final lv cm = new lv(61, 2);
   public static final lv cf = new lv(62, 3);
   public static final lv cl = new lv(63, 8);
   public static final lv be = new lv(29, 3);
   public static final lv cu = new lv(58, -1);
   public static final lv dr = new lv(83, 3);
   public static final lv cx = new lv(67, 10);
   public static final lv cn = new lv(56, 0);
   public static final lv cb = new lv(69, 8);
   public static final lv co = new lv(70, 8);
   public static final lv cz = new lv(71, 8);
   public static final lv cw = new lv(72, 7);
   public static final lv cj = new lv(73, -1);
   public static final lv ch = new lv(74, 0);
   public static final lv cp = new lv(76, 6);
   public static final lv dw = new lv(79, 8);
   public static final lv cd = new lv(77, 4);
   public static final lv dm = new lv(78, 6);
   public static final lv dg = new lv(89, -1);
   public static final lv dc = new lv(80, 3);
   public static final lv cq = new lv(60, 9);
   public static final lv di = new lv(82, -1);
   public static final lv aw = new lv(2, 0);
   public static final lv do = new lv(81, 7);
   public static final lv dk = new lv(85, -1);
   public static final lv dt = new lv(86, -1);
   public static final lv dv = new lv(87, -1);
   public static final lv dz = new lv(88, -1);
   public static final lv bc = new lv(49, 3);
   public static final lv by = new lv(26, 0);
   public static final lv dh = new lv(91, 3);
   public static final lv cg = new lv(64, 8);
   public static final lv du = new lv(93, 11);
   public static final lv bn = new lv(38, 8);
   public static final lv df = new lv(95, -1);
   public static final lv am = new lv(18, -1);
   final int dd;

   static void mp(byte var0) {
      try {
         for(di var1 = (di)client.oc.aw(); null != var1; var1 = (di)client.oc.ac()) {
            if (var0 != 2) {
               throw new IllegalStateException();
            }

            int var2 = var1.af * 944864121;
            if (bq.ac(var2, 1376777516)) {
               boolean var3 = true;
               mq[] var4 = hn.ap[var2];

               int var5;
               for(var5 = 0; var5 < var4.length; ++var5) {
                  if (var4[var5] != null) {
                     var3 = var4[var5].bn;
                     break;
                  }
               }

               if (!var3) {
                  if (var0 != 2) {
                     throw new IllegalStateException();
                  }

                  var5 = (int)var1.hr;
                  mq var6 = gh.an(var5, (byte)5);
                  if (var6 != null) {
                     if (var0 != 2) {
                        return;
                     }

                     fw.ma(var6, -1912771452);
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "lv.mp(" + ')');
      }
   }

   lv(int var1, int var2) {
      try {
         super();
         this.dq = 784733707 * var1;
         this.dd = var2 * 797159357;
      } catch (RuntimeException var3) {
         throw db.an(var3, "lv.<init>(" + ')');
      }
   }
}
