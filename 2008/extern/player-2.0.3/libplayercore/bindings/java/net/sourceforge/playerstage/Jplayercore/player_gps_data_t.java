/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_gps_data_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_gps_data_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_gps_data_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_gps_data_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_gps_data_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_gps_data_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_gps_data_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_gps_data_t[] arrayWrapper = new player_gps_data_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_gps_data_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setTime_sec(long time_sec) {
    playercore_javaJNI.set_player_gps_data_t_time_sec(swigCPtr, time_sec);
  }

  public long getTime_sec() {
    return playercore_javaJNI.get_player_gps_data_t_time_sec(swigCPtr);
  }

  public void setTime_usec(long time_usec) {
    playercore_javaJNI.set_player_gps_data_t_time_usec(swigCPtr, time_usec);
  }

  public long getTime_usec() {
    return playercore_javaJNI.get_player_gps_data_t_time_usec(swigCPtr);
  }

  public void setLatitude(int latitude) {
    playercore_javaJNI.set_player_gps_data_t_latitude(swigCPtr, latitude);
  }

  public int getLatitude() {
    return playercore_javaJNI.get_player_gps_data_t_latitude(swigCPtr);
  }

  public void setLongitude(int longitude) {
    playercore_javaJNI.set_player_gps_data_t_longitude(swigCPtr, longitude);
  }

  public int getLongitude() {
    return playercore_javaJNI.get_player_gps_data_t_longitude(swigCPtr);
  }

  public void setAltitude(int altitude) {
    playercore_javaJNI.set_player_gps_data_t_altitude(swigCPtr, altitude);
  }

  public int getAltitude() {
    return playercore_javaJNI.get_player_gps_data_t_altitude(swigCPtr);
  }

  public void setUtm_e(double utm_e) {
    playercore_javaJNI.set_player_gps_data_t_utm_e(swigCPtr, utm_e);
  }

  public double getUtm_e() {
    return playercore_javaJNI.get_player_gps_data_t_utm_e(swigCPtr);
  }

  public void setUtm_n(double utm_n) {
    playercore_javaJNI.set_player_gps_data_t_utm_n(swigCPtr, utm_n);
  }

  public double getUtm_n() {
    return playercore_javaJNI.get_player_gps_data_t_utm_n(swigCPtr);
  }

  public void setQuality(long quality) {
    playercore_javaJNI.set_player_gps_data_t_quality(swigCPtr, quality);
  }

  public long getQuality() {
    return playercore_javaJNI.get_player_gps_data_t_quality(swigCPtr);
  }

  public void setNum_sats(long num_sats) {
    playercore_javaJNI.set_player_gps_data_t_num_sats(swigCPtr, num_sats);
  }

  public long getNum_sats() {
    return playercore_javaJNI.get_player_gps_data_t_num_sats(swigCPtr);
  }

  public void setHdop(long hdop) {
    playercore_javaJNI.set_player_gps_data_t_hdop(swigCPtr, hdop);
  }

  public long getHdop() {
    return playercore_javaJNI.get_player_gps_data_t_hdop(swigCPtr);
  }

  public void setVdop(long vdop) {
    playercore_javaJNI.set_player_gps_data_t_vdop(swigCPtr, vdop);
  }

  public long getVdop() {
    return playercore_javaJNI.get_player_gps_data_t_vdop(swigCPtr);
  }

  public void setErr_horz(double err_horz) {
    playercore_javaJNI.set_player_gps_data_t_err_horz(swigCPtr, err_horz);
  }

  public double getErr_horz() {
    return playercore_javaJNI.get_player_gps_data_t_err_horz(swigCPtr);
  }

  public void setErr_vert(double err_vert) {
    playercore_javaJNI.set_player_gps_data_t_err_vert(swigCPtr, err_vert);
  }

  public double getErr_vert() {
    return playercore_javaJNI.get_player_gps_data_t_err_vert(swigCPtr);
  }

  public player_gps_data_t() {
    this(playercore_javaJNI.new_player_gps_data_t(), true);
  }

}
