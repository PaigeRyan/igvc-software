/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_actarray_actuator_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_actarray_actuator_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_actarray_actuator_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_actarray_actuator_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_actarray_actuator_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_actarray_actuator_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_actarray_actuator_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_actarray_actuator_t[] arrayWrapper = new player_actarray_actuator_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_actarray_actuator_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setPosition(float position) {
    playercore_javaJNI.set_player_actarray_actuator_t_position(swigCPtr, position);
  }

  public float getPosition() {
    return playercore_javaJNI.get_player_actarray_actuator_t_position(swigCPtr);
  }

  public void setSpeed(float speed) {
    playercore_javaJNI.set_player_actarray_actuator_t_speed(swigCPtr, speed);
  }

  public float getSpeed() {
    return playercore_javaJNI.get_player_actarray_actuator_t_speed(swigCPtr);
  }

  public void setState(short state) {
    playercore_javaJNI.set_player_actarray_actuator_t_state(swigCPtr, state);
  }

  public short getState() {
    return playercore_javaJNI.get_player_actarray_actuator_t_state(swigCPtr);
  }

  public player_actarray_actuator_t() {
    this(playercore_javaJNI.new_player_actarray_actuator_t(), true);
  }

}
