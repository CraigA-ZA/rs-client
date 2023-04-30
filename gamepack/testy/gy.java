import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class gy {
   Map ar = new HashMap();
   public static final int af = -1;
   static final int an = 0;
   ez ay;
   public static final int au = 100;
   static final int ab = 100;
   static final int al = 102;
   int at = -88536347;
   String aa;
   public static final int ac = 2;
   String ao = null;
   float[] ax = new float[4];
   ArrayList ai = new ArrayList();
   ArrayList ag = new ArrayList();
   ArrayList ah = new ArrayList();
   Map av = new HashMap();
   static final int aw = 1;

   public ArrayList ba() {
      return this.ai;
   }

   public boolean af(String var1, et var2, int var3) {
      try {
         if (var1 != null) {
            if (var3 >= 1232835614) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (var2 == null) {
                  if (var3 >= 1232835614) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               this.ay(1010078609);

               try {
                  this.aa = var1;
                  this.ay = var2.au(new URL(this.aa), -922022252);
                  this.at = 0;
                  return true;
               } catch (MalformedURLException var5) {
                  this.ay(-498090425);
                  this.at = 263700108;
                  return false;
               }
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw db.an(var6, "gy.af(" + ')');
      }
   }

   public void an(et var1, byte var2) {
      try {
         switch (this.at * 371416339) {
            case 0:
               this.ao(var1, -724612758);
               break;
            case 1:
               this.ax(155422894);
               break;
            default:
               return;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "gy.an(" + ')');
      }
   }

   public int aw(byte var1) {
      try {
         return 371416339 * this.at;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.aw(" + ')');
      }
   }

   public ArrayList bo() {
      return this.ag;
   }

   public String au(String var1, byte var2) {
      try {
         Object var10000;
         if (this.ar.containsKey(var1)) {
            if (var2 == 4) {
               throw new IllegalStateException();
            }

            var10000 = this.ar.get(var1);
         } else {
            var10000 = null;
         }

         return (String)((String)var10000);
      } catch (RuntimeException var3) {
         throw db.an(var3, "gy.au(" + ')');
      }
   }

   void ax(int var1) {
      try {
         Iterator var2 = this.ag.iterator();

         gi var3;
         do {
            if (!var2.hasNext()) {
               var2 = this.ag.iterator();

               while(var2.hasNext()) {
                  var3 = (gi)var2.next();
                  if (null != var3.af) {
                     if (var1 == 605569579) {
                        return;
                     }

                     byte[] var4 = var3.af.an((byte)-22);
                     if (null != var4) {
                        if (var1 == 605569579) {
                           return;
                        }

                        if (var4.length > 0) {
                           if (var1 == 605569579) {
                              throw new IllegalStateException();
                           }

                           this.at = 177072694;
                           return;
                        }
                     }
                  }
               }

               this.ay(1258490797);
               this.at = 352236455;
               return;
            }

            if (var1 == 605569579) {
               throw new IllegalStateException();
            }

            var3 = (gi)var2.next();
         } while(var3.af == null || var3.af.af((byte)9));

         if (var1 == 605569579) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "gy.ax(" + ')');
      }
   }

   void ca(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.ax = ea.as(var1, "clickbounds", 1045072731);
         this.ao = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.ai.add(new gk(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.ai.add(new gk(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.ai.add(new gk(this, var2[var3], 0));
                     } else {
                        this.ai.add(new gh(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   public ArrayList ab(int var1) {
      try {
         return this.ag;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.ab(" + ')');
      }
   }

   public float[] at(int var1) {
      try {
         return this.ax;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.at(" + ')');
      }
   }

   public ArrayList aa(int var1) {
      try {
         return this.ai;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.aa(" + ')');
      }
   }

   void ay(int var1) {
      try {
         this.ay = null;
         this.ao = null;
         this.ax[0] = 0.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 1.0F;
         this.ax[3] = 1.0F;
         this.ai.clear();
         this.ag.clear();
         this.ah.clear();
         this.av.clear();
         this.ar.clear();
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.ay(" + ')');
      }
   }

   public ArrayList bq() {
      return this.ai;
   }

   public int ac(String var1, byte var2) {
      try {
         int var10000;
         if (this.av.containsKey(var1)) {
            if (var2 == 7) {
               throw new IllegalStateException();
            }

            var10000 = (Integer)this.av.get(var1);
         } else {
            var10000 = -1;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "gy.ac(" + ')');
      }
   }

   void ai(JSONArray var1, et var2, int var3) throws JSONException {
      try {
         if (var1 == null) {
            if (var3 != 2041464667) {
               throw new IllegalStateException();
            }
         } else {
            for(int var4 = 0; var4 < var1.length(); ++var4) {
               if (var3 != 2041464667) {
                  throw new IllegalStateException();
               }

               try {
                  JSONObject var5 = var1.getJSONObject(var4);
                  gi var6 = new gi(this);
                  var6.af = var2.au(new URL(var5.getString("src")), -1693908057);
                  var6.an = ea.as(var5, "placement", -1286212275);
                  this.ag.add(var6);
               } catch (MalformedURLException var7) {
               }
            }

         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "gy.ai(" + ')');
      }
   }

   void ag(JSONArray var1, byte var2) throws JSONException {
      try {
         if (var1 == null) {
            if (var2 != 3) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < var1.length(); ++var3) {
               if (var2 != 3) {
                  throw new IllegalStateException();
               }

               JSONObject var4 = var1.getJSONObject(var3);
               gq var5 = new gq(this);
               var5.ac = var4.getString("text");
               String var8 = var4.getString("align_x");
               byte var7;
               if (var8.equals("centre")) {
                  if (var2 != 3) {
                     throw new IllegalStateException();
                  }

                  var7 = 1;
               } else {
                  label88: {
                     if (!var8.equals("bottom")) {
                        if (var2 != 3) {
                           throw new IllegalStateException();
                        }

                        if (!var8.equals("right")) {
                           var7 = 0;
                           break label88;
                        }

                        if (var2 != 3) {
                           return;
                        }
                     }

                     var7 = 2;
                  }
               }

               var5.ab = var7 * -663309687;
               String var11 = var4.getString("align_y");
               byte var10;
               if (var11.equals("centre")) {
                  var10 = 1;
               } else {
                  label89: {
                     if (!var11.equals("bottom")) {
                        if (var2 != 3) {
                           throw new IllegalStateException();
                        }

                        if (!var11.equals("right")) {
                           var10 = 0;
                           break label89;
                        }
                     }

                     var10 = 2;
                  }
               }

               var5.aq = 1437150123 * var10;
               var5.al = var4.getInt("font") * -1157447435;
               var5.au = ea.as(var4, "placement", -2112078518);
               this.ah.add(var5);
            }

         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "gy.ag(" + ')');
      }
   }

   void ah(JSONObject var1, int var2) throws JSONException {
      try {
         if (null == var1) {
            if (var2 != -28927295) {
               throw new IllegalStateException();
            }
         } else {
            this.ax = ea.as(var1, "clickbounds", -662115425);
            this.ao = var1.getString("endpoint");
            String[] var3 = JSONObject.getNames(var1);

            for(int var4 = 0; var4 < var1.length(); ++var4) {
               if (var2 != -28927295) {
                  throw new IllegalStateException();
               }

               if (!var3[var4].equals("clickbounds")) {
                  if (var2 != -28927295) {
                     return;
                  }

                  if (!var3[var4].equals("endpoint")) {
                     if (var2 != -28927295) {
                        throw new IllegalStateException();
                     }

                     try {
                        int var5 = var1.getInt(var3[var4]);
                        this.ai.add(new gk(this, var3[var4], var5));
                     } catch (Exception var8) {
                        try {
                           String var6 = var1.getString(var3[var4]);
                           if (var6.equals("true")) {
                              this.ai.add(new gk(this, var3[var4], 1));
                           } else if (var6.equals("false")) {
                              if (var2 != -28927295) {
                                 throw new IllegalStateException();
                              }

                              this.ai.add(new gk(this, var3[var4], 0));
                           } else {
                              this.ai.add(new gh(this, var3[var4], var6));
                           }
                        } catch (Exception var7) {
                        }
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "gy.ah(" + ')');
      }
   }

   public String bj() {
      return this.ao;
   }

   void ar(qv var1, et var2, int var3) {
      try {
         JSONObject var4;
         try {
            var4 = var1.aq(-288365426);
            var4 = var4.getJSONObject("message");
         } catch (Exception var10) {
            this.ay(1386264480);
            this.at = 440772802;
            return;
         }

         try {
            this.ai(var4.getJSONArray("images"), var2, 2041464667);
         } catch (Exception var9) {
            this.ag.clear();
         }

         try {
            this.ag(var4.getJSONArray("labels"), (byte)3);
         } catch (Exception var8) {
            this.ah.clear();
         }

         try {
            this.ah(var4.getJSONObject("behaviour"), -28927295);
         } catch (Exception var7) {
            this.ao = null;
            this.ax[0] = 0.0F;
            this.ax[1] = 0.0F;
            this.ax[2] = 1.0F;
            this.ax[3] = 1.0F;
            this.ai.clear();
         }

         try {
            this.av(var4.getJSONObject("meta"), 891662681);
         } catch (Exception var6) {
            this.av.clear();
            this.ar.clear();
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "gy.ar(" + ')');
      }
   }

   public boolean am(String var1, et var2, int var3) {
      try {
         try {
            this.ar(new qv(var1.getBytes()), var2, 251673402);
            byte var10001;
            if (this.ag.size() > 0) {
               if (var3 >= 791915096) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 2;
            }

            this.at = var10001 * 88536347;
         } catch (UnsupportedEncodingException var5) {
            this.at = 440772802;
         }

         boolean var10000;
         if (371416339 * this.at < 100) {
            if (var3 >= 791915096) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var6) {
         throw db.an(var6, "gy.am(" + ')');
      }
   }

   public boolean aj(String var1, et var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.ay(139483934);

            try {
               this.aa = var1;
               this.ay = var2.au(new URL(this.aa), -360431137);
               this.at = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.ay(479745345);
               this.at = 263700108;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean ak(String var1, et var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.ay(1314277816);

            try {
               this.aa = var1;
               this.ay = var2.au(new URL(this.aa), -1139420171);
               this.at = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.ay(1163195684);
               this.at = 263700108;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public ArrayList bt() {
      return this.ah;
   }

   public void ad(et var1) {
      switch (this.at * 371416339) {
         case 0:
            this.ao(var1, -636482972);
            break;
         case 1:
            this.ax(1483902133);
            break;
         default:
            return;
      }

   }

   void bc() {
      Iterator var1 = this.ag.iterator();

      gi var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.ag.iterator();

            while(var1.hasNext()) {
               var2 = (gi)var1.next();
               if (null != var2.af) {
                  byte[] var3 = var2.af.an((byte)-31);
                  if (null != var3 && var3.length > 0) {
                     this.at = 177072694;
                     return;
                  }
               }
            }

            this.ay(1946758697);
            this.at = 352236455;
            return;
         }

         var2 = (gi)var1.next();
      } while(var2.af == null || var2.af.af((byte)103));

   }

   public void ap(et var1) {
      switch (this.at * 422831862) {
         case 0:
            this.ao(var1, 1570712310);
            break;
         case 1:
            this.ax(-1092159315);
            break;
         default:
            return;
      }

   }

   public int by() {
      return 371416339 * this.at;
   }

   public int bb() {
      return 371416339 * this.at;
   }

   public int bi() {
      return 371416339 * this.at;
   }

   public int be(String var1) {
      return this.av.containsKey(var1) ? (Integer)this.av.get(var1) : -1;
   }

   public int bk(String var1) {
      return this.av.containsKey(var1) ? (Integer)this.av.get(var1) : -1;
   }

   public float[] bg() {
      return this.ax;
   }

   void cm(qv var1, et var2) {
      JSONObject var3;
      try {
         var3 = var1.aq(-288365426);
         var3 = var3.getJSONObject("message");
      } catch (Exception var9) {
         this.ay(1932988150);
         this.at = 440772802;
         return;
      }

      try {
         this.ai(var3.getJSONArray("images"), var2, 2041464667);
      } catch (Exception var8) {
         this.ag.clear();
      }

      try {
         this.ag(var3.getJSONArray("labels"), (byte)3);
      } catch (Exception var7) {
         this.ah.clear();
      }

      try {
         this.ah(var3.getJSONObject("behaviour"), -28927295);
      } catch (Exception var6) {
         this.ao = null;
         this.ax[0] = 0.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 1.0F;
         this.ax[3] = 1.0F;
         this.ai.clear();
      }

      try {
         this.av(var3.getJSONObject("meta"), 891662681);
      } catch (Exception var5) {
         this.av.clear();
         this.ar.clear();
      }

   }

   public ArrayList bz() {
      return this.ag;
   }

   public ArrayList bm() {
      return this.ag;
   }

   public ArrayList bd() {
      return this.ah;
   }

   void cl(qv var1, et var2) {
      JSONObject var3;
      try {
         var3 = var1.aq(-288365426);
         var3 = var3.getJSONObject("message");
      } catch (Exception var9) {
         this.ay(907347917);
         this.at = 1970843374;
         return;
      }

      try {
         this.ai(var3.getJSONArray("images"), var2, 2041464667);
      } catch (Exception var8) {
         this.ag.clear();
      }

      try {
         this.ag(var3.getJSONArray("labels"), (byte)3);
      } catch (Exception var7) {
         this.ah.clear();
      }

      try {
         this.ah(var3.getJSONObject("behaviour"), -28927295);
      } catch (Exception var6) {
         this.ao = null;
         this.ax[0] = 0.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 1.0F;
         this.ax[3] = 1.0F;
         this.ai.clear();
      }

      try {
         this.av(var3.getJSONObject("meta"), 891662681);
      } catch (Exception var5) {
         this.av.clear();
         this.ar.clear();
      }

   }

   void bh(JSONArray var1, et var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               gi var5 = new gi(this);
               var5.af = var2.au(new URL(var4.getString("src")), -560975224);
               var5.an = ea.as(var4, "placement", -1399440588);
               this.ag.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   public String bn() {
      return this.ao;
   }

   public String bs() {
      return this.ao;
   }

   public String br() {
      return this.ao;
   }

   static void kp(byte var0) {
      try {
         if (!client.om) {
            if (var0 > 1) {
               ;
            }
         } else {
            mq var1 = bq.aw(96656415 * jg.ou, 145251849 * client.oa, -1271528922);
            if (var1 != null) {
               if (var0 <= 1) {
                  throw new IllegalStateException();
               }

               if (null != var1.fy) {
                  if (var0 <= 1) {
                     throw new IllegalStateException();
                  }

                  dr var2 = new dr();
                  var2.aw = var1;
                  var2.af = var1.fy;
                  dh.af(var2, (byte)61);
               }
            }

            client.op = -35668549;
            client.om = false;
            fw.ma(var1, -847721052);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "gy.kp(" + ')');
      }
   }

   public float[] bu() {
      return this.ax;
   }

   public ArrayList bf() {
      return this.ai;
   }

   public String al(byte var1) {
      try {
         return this.ao;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.al(" + ')');
      }
   }

   void av(JSONObject var1, int var2) throws JSONException {
      try {
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (var2 != 891662681) {
               throw new IllegalStateException();
            }

            try {
               int var5 = var1.getInt(var3[var4]);
               this.av.put(var3[var4], var5);
            } catch (Exception var8) {
               try {
                  String var6 = var1.getString(var3[var4]);
                  if (var6.equals("true")) {
                     if (var2 != 891662681) {
                        throw new IllegalStateException();
                     }

                     this.av.put(var3[var4], 1);
                  } else if (var6.equals("false")) {
                     if (var2 != 891662681) {
                        throw new IllegalStateException();
                     }

                     this.av.put(var3[var4], 0);
                  } else {
                     this.ar.put(var3[var4], var6);
                  }
               } catch (Exception var7) {
               }
            }
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "gy.av(" + ')');
      }
   }

   void bv() {
      this.ay = null;
      this.ao = null;
      this.ax[0] = 0.0F;
      this.ax[1] = 0.0F;
      this.ax[2] = 1.0F;
      this.ax[3] = 1.0F;
      this.ai.clear();
      this.ag.clear();
      this.ah.clear();
      this.av.clear();
      this.ar.clear();
   }

   void bl() {
      Iterator var1 = this.ag.iterator();

      gi var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.ag.iterator();

            while(var1.hasNext()) {
               var2 = (gi)var1.next();
               if (null != var2.af) {
                  byte[] var3 = var2.af.an((byte)28);
                  if (null != var3 && var3.length > 0) {
                     this.at = 177072694;
                     return;
                  }
               }
            }

            this.ay(422690371);
            this.at = 352236455;
            return;
         }

         var2 = (gi)var1.next();
      } while(var2.af == null || var2.af.af((byte)20));

   }

   void bp() {
      Iterator var1 = this.ag.iterator();

      gi var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.ag.iterator();

            while(var1.hasNext()) {
               var2 = (gi)var1.next();
               if (null != var2.af) {
                  byte[] var3 = var2.af.an((byte)-86);
                  if (null != var3 && var3.length > 0) {
                     this.at = 177072694;
                     return;
                  }
               }
            }

            this.ay(1872103371);
            this.at = 352236455;
            return;
         }

         var2 = (gi)var1.next();
      } while(var2.af == null || var2.af.af((byte)-123));

   }

   public boolean az(String var1, et var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            return false;
         } else {
            this.ay(-212417968);

            try {
               this.aa = var1;
               this.ay = var2.au(new URL(this.aa), -1241961735);
               this.at = 0;
               return true;
            } catch (MalformedURLException var4) {
               this.ay(266440923);
               this.at = 263700108;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   void bw(JSONArray var1, et var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               gi var5 = new gi(this);
               var5.af = var2.au(new URL(var4.getString("src")), -1261220429);
               var5.an = ea.as(var4, "placement", 736241133);
               this.ag.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   void ce(JSONArray var1, et var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               gi var5 = new gi(this);
               var5.af = var2.au(new URL(var4.getString("src")), -780219076);
               var5.an = ea.as(var4, "placement", 237489120);
               this.ag.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   void ci(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            gq var4 = new gq(this);
            var4.ac = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.ab = var6 * -663309687;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.aq = 1437150123 * var9;
            var4.al = var3.getInt("font") * -1157447435;
            var4.au = ea.as(var3, "placement", -1773994363);
            this.ah.add(var4);
         }

      }
   }

   void cs(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            gq var4 = new gq(this);
            var4.ac = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.ab = var6 * -663309687;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.aq = 339252410 * var9;
            var4.al = var3.getInt("font") * -1157447435;
            var4.au = ea.as(var3, "placement", -1698426124);
            this.ah.add(var4);
         }

      }
   }

   public void ae(et var1) {
      switch (this.at * 371416339) {
         case 0:
            this.ao(var1, 397278609);
            break;
         case 1:
            this.ax(-893764048);
            break;
         default:
            return;
      }

   }

   void cn(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.ax = ea.as(var1, "clickbounds", -766282553);
         this.ao = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.ai.add(new gk(this, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.ai.add(new gk(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.ai.add(new gk(this, var2[var3], 0));
                     } else {
                        this.ai.add(new gh(this, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }

      }
   }

   public String bx(String var1) {
      return (String)((String)(this.ar.containsKey(var1) ? this.ar.get(var1) : null));
   }

   void cu(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.av.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.av.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.av.put(var2[var3], 0);
               } else {
                  this.ar.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   void ck(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.av.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.av.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.av.put(var2[var3], 0);
               } else {
                  this.ar.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   void cq(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.getInt(var2[var3]);
            this.av.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.getString(var2[var3]);
               if (var5.equals("true")) {
                  this.av.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.av.put(var2[var3], 0);
               } else {
                  this.ar.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }

   }

   void cc(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            gq var4 = new gq(this);
            var4.ac = var3.getString("text");
            String var7 = var3.getString("align_x");
            byte var6;
            if (var7.equals("centre")) {
               var6 = 1;
            } else if (!var7.equals("bottom") && !var7.equals("right")) {
               var6 = 0;
            } else {
               var6 = 2;
            }

            var4.ab = var6 * 1031801969;
            String var10 = var3.getString("align_y");
            byte var9;
            if (var10.equals("centre")) {
               var9 = 1;
            } else if (!var10.equals("bottom") && !var10.equals("right")) {
               var9 = 0;
            } else {
               var9 = 2;
            }

            var4.aq = -1546372192 * var9;
            var4.al = var3.getInt("font") * 1791031327;
            var4.au = ea.as(var3, "placement", 49783644);
            this.ah.add(var4);
         }

      }
   }

   public ArrayList aq(byte var1) {
      try {
         return this.ah;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gy.aq(" + ')');
      }
   }

   void ao(et var1, int var2) {
      try {
         if (null != this.ay) {
            if (var2 <= -1178895622) {
               throw new IllegalStateException();
            }

            if (this.ay.af((byte)-40)) {
               byte[] var3 = this.ay.an((byte)77);
               if (var3 == null) {
                  if (var2 <= -1178895622) {
                     throw new IllegalStateException();
                  }

                  this.ay(865668444);
                  this.at = 263700108;
                  return;
               }

               try {
                  this.ar(new qv(var3), var1, 1522687051);
               } catch (UnsupportedEncodingException var5) {
                  this.ay(-510587846);
                  this.at = 440772802;
                  return;
               }

               byte var10001;
               if (this.ag.size() > 0) {
                  if (var2 <= -1178895622) {
                     return;
                  }

                  var10001 = 1;
               } else {
                  var10001 = 2;
               }

               this.at = var10001 * 88536347;
               this.ay = null;
               return;
            }

            if (var2 <= -1178895622) {
               return;
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "gy.ao(" + ')');
      }
   }

   static float[] cg(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   static float[] cr(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   void cf(qv var1, et var2) {
      JSONObject var3;
      try {
         var3 = var1.aq(-288365426);
         var3 = var3.getJSONObject("message");
      } catch (Exception var9) {
         this.ay(2078146807);
         this.at = 440772802;
         return;
      }

      try {
         this.ai(var3.getJSONArray("images"), var2, 2041464667);
      } catch (Exception var8) {
         this.ag.clear();
      }

      try {
         this.ag(var3.getJSONArray("labels"), (byte)3);
      } catch (Exception var7) {
         this.ah.clear();
      }

      try {
         this.ah(var3.getJSONObject("behaviour"), -28927295);
      } catch (Exception var6) {
         this.ao = null;
         this.ax[0] = 0.0F;
         this.ax[1] = 0.0F;
         this.ax[2] = 1.0F;
         this.ax[3] = 1.0F;
         this.ai.clear();
      }

      try {
         this.av(var3.getJSONObject("meta"), 891662681);
      } catch (Exception var5) {
         this.av.clear();
         this.ar.clear();
      }

   }

   static final void ll(mq var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (client.ki) {
            if (var7 == 0) {
               return;
            }

            client.ko = 1151731872;
         } else {
            client.ko = 0;
         }

         int var8;
         label161: {
            client.ki = false;
            if (114417019 * bd.aa != 1) {
               if (var7 == 0) {
                  throw new IllegalStateException();
               }

               if (su.ev) {
                  break label161;
               }

               if (var7 == 0) {
                  throw new IllegalStateException();
               }

               if (114417019 * bd.aa != 4) {
                  break label161;
               }

               if (var7 == 0) {
                  throw new IllegalStateException();
               }
            }

            if (var5 >= var1 && var5 < var1 + 16) {
               if (var7 == 0) {
                  throw new IllegalStateException();
               }

               if (var6 >= var2) {
                  if (var7 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var6 < 16 + var2) {
                     if (var7 == 0) {
                        throw new IllegalStateException();
                     }

                     var0.cm -= -510215044;
                     fw.ma(var0, -1249122622);
                     break label161;
                  }
               }
            }

            if (var5 >= var1) {
               if (var7 == 0) {
                  return;
               }

               if (var5 < 16 + var1) {
                  if (var7 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= var3 + var2 - 16) {
                     if (var7 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var6 < var3 + var2) {
                        var0.cm += -510215044;
                        fw.ma(var0, -1623095806);
                        break label161;
                     }
                  }
               }
            }

            if (var5 >= var1 - client.ko * -1434295667) {
               if (var7 == 0) {
                  throw new IllegalStateException();
               }

               if (var5 < -1434295667 * client.ko + 16 + var1) {
                  if (var7 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= var2 + 16) {
                     if (var7 == 0) {
                        return;
                     }

                     if (var6 < var2 + var3 - 16) {
                        if (var7 == 0) {
                           throw new IllegalStateException();
                        }

                        var8 = (var3 - 32) * var3 / var4;
                        if (var8 < 8) {
                           if (var7 == 0) {
                              return;
                           }

                           var8 = 8;
                        }

                        int var9 = var6 - var2 - 16 - var8 / 2;
                        int var10 = var3 - 32 - var8;
                        var0.cm = 946188063 * (var9 * (var4 - var3) / var10);
                        fw.ma(var0, -2101559690);
                        client.ki = true;
                     }
                  }
               }
            }
         }

         if (-121753353 * client.rd != 0) {
            if (var7 == 0) {
               return;
            }

            var8 = var0.cs * -794961409;
            if (var5 >= var1 - var8) {
               if (var7 == 0) {
                  return;
               }

               if (var6 >= var2) {
                  if (var7 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 16 + var1) {
                     if (var7 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= var3 + var2) {
                        if (var7 == 0) {
                           throw new IllegalStateException();
                        }

                        var0.cm += client.rd * -908462347;
                        fw.ma(var0, -1465589258);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "gy.ll(" + ')');
      }
   }
}
