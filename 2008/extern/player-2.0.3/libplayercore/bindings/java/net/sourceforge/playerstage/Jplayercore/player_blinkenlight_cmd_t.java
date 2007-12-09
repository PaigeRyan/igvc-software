/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_blinkenlight_cmd_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_blinkenlight_cmd_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_blinkenlight_cmd_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_blinkenlight_cmd_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_blinkenlight_cmd_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_blinkenlight_cmd_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_blinkenlight_cmd_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_blinkenlight_cmd_t[] arrayWrapper = new player_blinkenlight_cmd_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_blinkenlight_cmd_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setEnable(short enable) {
    playercore_javaJNI.set_player_blinkenlight_cmd_t_enable(swigCPtr, enable);
  }

  public short getEnable() {
    return playercore_javaJNI.get_player_blinkenlight_cmd_t_enable(swigCPtr);
  }

  public void setPeriod(float period) {
    playercore_javaJNI.set_player_blinkenlight_cmd_t_period(swigCPtr, period);
  }

  public float getPeriod() {
    return playercore_javaJNI.get_player_blinkenlight_cmd_t_period(swigCPtr);
  }

  public void setDutycycle(float dutycycle) {
    playercore_javaJNI.set_player_blinkenlight_cmd_t_dutycycle(swigCPtr, dutycycle);
  }

  public float getDutycycle() {
    return playercore_javaJNI.get_player_blinkenlight_cmd_t_dutycycle(swigCPtr);
  }

  public void setColor(player_color_t color) {
    playercore_javaJNI.set_player_blinkenlight_cmd_t_color(swigCPtr, player_color_t.getCPtr(color));
  }

  public player_color_t getColor() {
    long cPtr = playercore_javaJNI.get_player_blinkenlight_cmd_t_color(swigCPtr);
    return (cPtr == 0) ? null : new player_color_t(cPtr, false);
  }

  public player_blinkenlight_cmd_t() {
    this(playercore_javaJNI.new_player_blinkenlight_cmd_t(), true);
  }

}
