/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_log_set_filename_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_log_set_filename_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_log_set_filename_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_log_set_filename_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_log_set_filename_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_log_set_filename_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_log_set_filename_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_log_set_filename_t[] arrayWrapper = new player_log_set_filename_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_log_set_filename_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setFilename_count(long filename_count) {
    playercore_javaJNI.set_player_log_set_filename_t_filename_count(swigCPtr, filename_count);
  }

  public long getFilename_count() {
    return playercore_javaJNI.get_player_log_set_filename_t_filename_count(swigCPtr);
  }

  public void setFilename(String filename) {
    playercore_javaJNI.set_player_log_set_filename_t_filename(swigCPtr, filename);
  }

  public String getFilename() {
    return playercore_javaJNI.get_player_log_set_filename_t_filename(swigCPtr);
  }

  public player_log_set_filename_t() {
    this(playercore_javaJNI.new_player_log_set_filename_t(), true);
  }

}
