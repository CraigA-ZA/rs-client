public class SpotType extends DualNode {
   public static EvictingDualNodeHashTable ac = new EvictingDualNodeHashTable(30);
   public static EvictingDualNodeHashTable SpotType_cached = new EvictingDualNodeHashTable(64);
   static AbstractArchive SpotType_archive;
   static AbstractArchive an;
   int model;
   int ambient = 0;
   int contrast = 0;
   int orientation = 0;
   int ao = 122094464;
   int id;
   int ax = -370064768;
   short[] aa;
   short[] al;
   short[] at;
   short[] ay;
   public int sequence = -1861808927;

   static PacketBitNode af_renamed() {
      return PacketBitNode.ab * 380401923 == 0 ? new PacketBitNode() : PacketBitNode.packetBitNodes[(PacketBitNode.ab -= -1882670677) * 380401923];
   }

   SpotType() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (1 == var2) {
         this.model = var1.cl() * -1354453963;
      } else if (var2 == 2) {
         this.sequence = var1.cl() * 1861808927;
      } else if (var2 == 4) {
         this.ao = var1.cl() * -636580345;
      } else if (5 == var2) {
         this.ax = var1.cl() * -1110187387;
      } else if (var2 == 6) {
         this.orientation = var1.cl() * -1376904751;
      } else if (7 == var2) {
         this.ambient = var1.g1() * 399649223;
      } else if (var2 == 8) {
         this.contrast = var1.g1() * 1837096875;
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.g1();
            this.al = new short[var4];
            this.at = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.al[var5] = (short)var1.cl();
               this.at[var5] = (short)var1.cl();
            }
         } else if (var2 == 41) {
            var4 = var1.g1();
            this.aa = new short[var4];
            this.ay = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aa[var5] = (short)var1.cl();
               this.ay[var5] = (short)var1.cl();
            }
         }
      }

   }

   public final Model getModel(int var1) {
      Model var3 = this.getSharedModel();
      Model var4;
      if (this.sequence * 374130911 != -1 && var1 != -1) {
         var4 = Inventory.getSeqType(this.sequence * 374130911).animateSpotAnimation(var3, var1);
      } else {
         var4 = var3.toSharedSpotAnimationModel(true);
      }

      if (128 != -1761247305 * this.ao || 128 != this.ax * -1083521459) {
         var4.resize(-1761247305 * this.ao, this.ax * -1083521459, this.ao * -1761247305);
      }

      if (-906961103 * this.orientation != 0) {
         if (this.orientation * -906961103 == 90) {
            var4.rotateY90Ccw();
         }

         if (this.orientation * -906961103 == 180) {
            var4.rotateY90Ccw();
            var4.rotateY90Ccw();
         }

         if (this.orientation * -906961103 == 270) {
            var4.rotateY90Ccw();
            var4.rotateY90Ccw();
            var4.rotateY90Ccw();
         }
      }

      return var4;
   }

   public final Model getSharedModel() {
      Model var2 = (Model)ac.get((long)(this.id * -190570391));
      if (var2 == null) {
         UnlitModel var3 = UnlitModel.af_renamed(an, this.model * -170244579, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (null != this.al) {
            for(var4 = 0; var4 < this.al.length; ++var4) {
               var3.recolor(this.al[var4], this.at[var4]);
            }
         }

         if (this.aa != null) {
            for(var4 = 0; var4 < this.aa.length; ++var4) {
               var3.retexture(this.aa[var4], this.ay[var4]);
            }
         }

         var2 = var3.light(this.ambient * 742442999 + 64, 850 + this.contrast * -138140925, -30, -50, -30);
         ac.put(var2, (long)(-190570391 * this.id));
      }

      return var2;
   }
}
