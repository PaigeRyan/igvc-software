/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_devaddr_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_devaddr_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_devaddr_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_devaddr_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_devaddr_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_devaddr_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_devaddr_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_devaddr_t[] arrayWrapper = new player_devaddr_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_devaddr_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setHost(long host) {
    playercore_javaJNI.set_player_devaddr_t_host(swigCPtr, host);
  }

  public long getHost() {
    return playercore_javaJNI.get_player_devaddr_t_host(swigCPtr);
  }

  public void setRobot(long robot) {
    playercore_javaJNI.set_player_devaddr_t_robot(swigCPtr, robot);
  }

  public long getRobot() {
    return playercore_javaJNI.get_player_devaddr_t_robot(swigCPtr);
  }

  public void setInterf(int interf) {
    playercore_javaJNI.set_player_devaddr_t_interf(swigCPtr, interf);
  }

  public int getInterf() {
    return playercore_javaJNI.get_player_devaddr_t_interf(swigCPtr);
  }

  public void setIndex(int index) {
    playercore_javaJNI.set_player_devaddr_t_index(swigCPtr, index);
  }

  public int getIndex() {
    return playercore_javaJNI.get_player_devaddr_t_index(swigCPtr);
  }

  public player_devaddr_t() {
    this(playercore_javaJNI.new_player_devaddr_t(), true);
  }

}
