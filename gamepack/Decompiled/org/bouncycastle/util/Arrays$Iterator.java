package org.bouncycastle.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Arrays$Iterator implements Iterator {
   int position = 0;
   final Object[] dataArray;

   public boolean al() {
      return this.position < this.dataArray.length;
   }

   public Object au() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public Object next() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public void remove() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public Object ab() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public Arrays$Iterator(Object[] var1) {
      this.dataArray = var1;
   }

   public Object aq() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public boolean hasNext() {
      return this.position < this.dataArray.length;
   }

   public boolean at() {
      return this.position < this.dataArray.length;
   }

   public boolean aa() {
      return this.position < this.dataArray.length;
   }

   public void ay() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }
}
