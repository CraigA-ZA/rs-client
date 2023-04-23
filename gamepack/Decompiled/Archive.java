import java.util.zip.CRC32;

public class Archive extends AbstractArchive {
   static int up;
   static int[] jn;
   static CRC32 Archive_crc = new CRC32();
   boolean aa = false;
   boolean ah = false;
   int index = -631230867;
   int indexVersion;
   int al;
   int indexCrc;
   ArchiveDisk archiveDisk;
   ArchiveDisk masterDisk;
   volatile boolean[] validGroups;
   volatile int at = 0;

   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.al = 957229219 * var3;
      this.aa = var6;
      this.ah = var7;
      int var9 = this.al * -1596339445;
      if (this.ah) {
         if (var9 <= 1097614811 * NetCache.ak) {
            throw new RuntimeException("");
         }

         if (var9 < 1745465359 * NetCache.az) {
            NetCache.az = var9 * 60767983;
         }
      } else {
         if (var9 >= 1745465359 * NetCache.az) {
            throw new RuntimeException("");
         }

         if (var9 > 1097614811 * NetCache.ak) {
            NetCache.ak = 2072522323 * var9;
         }
      }

      if (null != cz.NetCache_reference) {
         cz.NetCache_reference.index = 754054312 * var9 + 1008154857;
         if (-1633313603 * cz.NetCache_reference.index >= cz.NetCache_reference.array.length) {
            if (!this.ah) {
               throw new RuntimeException("");
            }

            this.au();
         } else {
            int var10 = cz.NetCache_reference.g4s();
            int var11 = cz.NetCache_reference.g4s();
            this.loadIndex(var10, var11);
         }
      } else {
         Message.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
         NetCache.NetCache_archives[var9] = this;
      }

   }

   public boolean af() {
      return 1 == 2103956439 * this.at;
   }

   public int an() {
      if (this.at * 2103956439 == 1 || this.ah && 2103956439 * this.at == 2) {
         return 100;
      } else if (this.groups != null) {
         return 99;
      } else {
         int var2 = aj.ac_renamed(255, this.al * -1596339445);
         if (var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   void aw(int var1) {
      int var3 = -1596339445 * this.al;
      long var4 = (long)(var1 + (var3 << 16));
      NetFileRequest var6 = (NetFileRequest)NetCache.at.get(var4);
      if (null != var6) {
         NetCache.al.addLast(var6);
      }

   }

   void ac(int var1) {
      if (null != this.archiveDisk && null != this.validGroups && this.validGroups[var1]) {
         ArchiveDisk var3 = this.archiveDisk;
         byte[] var5 = null;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var7 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); null != var7; var7 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if (var7.key == (long)var1 && var7.archiveDisk == var3 && 0 == -1329235479 * var7.type) {
                  var5 = var7.data;
                  break;
               }
            }
         }

         if (null != var5) {
            this.load(var3, var1, var5, true);
         } else {
            byte[] var6 = var3.read(var1);
            this.load(var3, var1, var6, true);
         }
      } else {
         Message.requestNetFile(this, -1596339445 * this.al, var1, this.groupIds[var1], (byte)2, true);
      }

   }

   void au() {
      this.at = -922247218;
      this.groupCrcs = new int[0];
      this.groupIds = new int[0];
      this.groupVersions = new int[0];
      this.fileCounts = new int[0];
      this.fileNameHashes = new int[0][];
      this.groups = new Object[0];
      this.files = new Object[0][];
   }

   void loadIndex(int var1, int var2) {
      this.indexCrc = var1 * 215951563;
      this.indexVersion = 1459300717 * var2;
      if (this.masterDisk != null) {
         int var4 = this.al * -1596339445;
         ArchiveDisk var5 = this.masterDisk;
         byte[] var7 = null;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var9 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var9 != null; var9 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if (var9.key == (long)var4 && var9.archiveDisk == var5 && 0 == -1329235479 * var9.type) {
                  var7 = var9.data;
                  break;
               }
            }
         }

         if (null != var7) {
            this.load(var5, var4, var7, true);
         } else {
            byte[] var8 = var5.read(var4);
            this.load(var5, var4, var8, true);
         }
      } else {
         Message.requestNetFile(this, 255, -1596339445 * this.al, this.indexCrc * -1710883613, (byte)0, true);
      }

   }

   static int aw_renamed(char var0, Language var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.ab) {
         var3 = 1762;
      }

      return var3;
   }

   void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.at * 2103956439 == 1) {
            throw new RuntimeException();
         }

         if (this.masterDisk != null) {
            MiniMenuEntry.af_renamed(this.al * -1596339445, var2, this.masterDisk);
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(this.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)this.groupVersions[var1];
         if (this.archiveDisk != null) {
            MiniMenuEntry.af_renamed(var1, var2, this.archiveDisk);
            this.validGroups[var1] = true;
         }

         if (var4) {
            this.groups[var1] = ef.byteArrayToObject(var2, false);
         }
      }

   }

   public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if (this.masterDisk == var1) {
         if (this.at * 2103956439 == 1) {
            throw new RuntimeException();
         }

         if (null == var3) {
            Message.requestNetFile(this, 255, -1596339445 * this.al, -1710883613 * this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var6 = (int)Archive_crc.getValue();
         if (var6 != -1710883613 * this.indexCrc) {
            Message.requestNetFile(this, 255, this.al * -1596339445, -1710883613 * this.indexCrc, (byte)0, true);
            return;
         }

         Packet var7 = new Packet(ai.ch_renamed(var3));
         int var8 = var7.g1();
         if (var8 != 5 && 6 != var8) {
            throw new RuntimeException(var8 + "," + -1596339445 * this.al + "," + var2);
         }

         int var9 = 0;
         if (var8 >= 6) {
            var9 = var7.g4s();
         }

         if (var9 != 17451109 * this.indexVersion) {
            Message.requestNetFile(this, 255, this.al * -1596339445, -1710883613 * this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && -2028669797 * this.index == var2) {
            this.at = -461123609;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.aa || var4) {
               Message.requestNetFile(this, -1596339445 * this.al, var2, this.groupIds[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var6 = (int)Archive_crc.getValue();
         int var10 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (this.groupIds[var2] != var6 || var10 != this.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.aa || var4) {
               Message.requestNetFile(this, -1596339445 * this.al, var2, this.groupIds[var2], (byte)2, var4);
            }

            return;
         }

         this.validGroups[var2] = true;
         if (var4) {
            this.groups[var2] = ef.byteArrayToObject(var3, false);
         }
      }

   }

   void loadAllLocal() {
      this.validGroups = new boolean[this.groups.length];

      int var2;
      for(var2 = 0; var2 < this.validGroups.length; ++var2) {
         this.validGroups[var2] = false;
      }

      if (null == this.archiveDisk) {
         this.at = -461123609;
      } else {
         this.index = -631230867;

         for(var2 = 0; var2 < this.validGroups.length; ++var2) {
            if (this.fileCounts[var2] > 0) {
               jg.an_renamed(var2, this.archiveDisk, this);
               this.index = 631230867 * var2;
            }
         }

         if (this.index * -2028669797 == -1) {
            this.at = -461123609;
         }

      }
   }

   int groupLoadPercent(int var1) {
      if (this.groups[var1] != null) {
         return 100;
      } else {
         return this.validGroups[var1] ? 100 : aj.ac_renamed(-1596339445 * this.al, var1);
      }
   }

   public boolean ay(int var1) {
      return this.validGroups[var1];
   }

   public boolean ao(int var1) {
      return this.ck(var1) != null;
   }

   public int loadPercent() {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < this.groups.length; ++var4) {
         if (this.fileCounts[var4] > 0) {
            var2 += 100;
            var3 += this.groupLoadPercent(var4);
         }
      }

      if (var2 == 0) {
         return 100;
      } else {
         var4 = 100 * var3 / var2;
         return var4;
      }
   }
}
