/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_point_3d_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_point_3d_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_point_3d_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_point_3d_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_point_3d_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_point_3d_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_point_3d_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_point_3d_t[] arrayWrapper = new player_point_3d_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_point_3d_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setPx(float px) {
    playercore_javaJNI.set_player_point_3d_t_px(swigCPtr, px);
  }

  public float getPx() {
    return playercore_javaJNI.get_player_point_3d_t_px(swigCPtr);
  }

  public void setPy(float py) {
    playercore_javaJNI.set_player_point_3d_t_py(swigCPtr, py);
  }

  public float getPy() {
    return playercore_javaJNI.get_player_point_3d_t_py(swigCPtr);
  }

  public void setPz(float pz) {
    playercore_javaJNI.set_player_point_3d_t_pz(swigCPtr, pz);
  }

  public float getPz() {
    return playercore_javaJNI.get_player_point_3d_t_pz(swigCPtr);
  }

  public player_point_3d_t() {
    this(playercore_javaJNI.new_player_point_3d_t(), true);
  }

}
