/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_position1d_position_mode_req_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_position1d_position_mode_req_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_position1d_position_mode_req_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_position1d_position_mode_req_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_position1d_position_mode_req_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_position1d_position_mode_req_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_position1d_position_mode_req_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_position1d_position_mode_req_t[] arrayWrapper = new player_position1d_position_mode_req_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_position1d_position_mode_req_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setState(long state) {
    playercore_javaJNI.set_player_position1d_position_mode_req_t_state(swigCPtr, state);
  }

  public long getState() {
    return playercore_javaJNI.get_player_position1d_position_mode_req_t_state(swigCPtr);
  }

  public player_position1d_position_mode_req_t() {
    this(playercore_javaJNI.new_player_position1d_position_mode_req_t(), true);
  }

}
