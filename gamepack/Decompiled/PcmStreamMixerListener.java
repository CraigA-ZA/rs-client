public abstract class PcmStreamMixerListener extends Node {
   int af;

   PcmStreamMixerListener() throws Throwable {
      throw new Error();
   }

   abstract int update(PcmStreamMixer var1);

   abstract void remove2();
}
