/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public final class player_graphics3d_draw_mode_t {
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_POINTS = new player_graphics3d_draw_mode_t("PLAYER_DRAW_POINTS");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_LINES = new player_graphics3d_draw_mode_t("PLAYER_DRAW_LINES");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_LINE_STRIP = new player_graphics3d_draw_mode_t("PLAYER_DRAW_LINE_STRIP");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_LINE_LOOP = new player_graphics3d_draw_mode_t("PLAYER_DRAW_LINE_LOOP");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_TRIANGLES = new player_graphics3d_draw_mode_t("PLAYER_DRAW_TRIANGLES");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_TRIANGLE_STRIP = new player_graphics3d_draw_mode_t("PLAYER_DRAW_TRIANGLE_STRIP");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_TRIANGLE_FAN = new player_graphics3d_draw_mode_t("PLAYER_DRAW_TRIANGLE_FAN");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_QUADS = new player_graphics3d_draw_mode_t("PLAYER_DRAW_QUADS");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_QUAD_STRIP = new player_graphics3d_draw_mode_t("PLAYER_DRAW_QUAD_STRIP");
  public final static player_graphics3d_draw_mode_t PLAYER_DRAW_POLYGON = new player_graphics3d_draw_mode_t("PLAYER_DRAW_POLYGON");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static player_graphics3d_draw_mode_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + player_graphics3d_draw_mode_t.class + " with value " + swigValue);
  }

  private player_graphics3d_draw_mode_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private player_graphics3d_draw_mode_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private static player_graphics3d_draw_mode_t[] swigValues = { PLAYER_DRAW_POINTS, PLAYER_DRAW_LINES, PLAYER_DRAW_LINE_STRIP, PLAYER_DRAW_LINE_LOOP, PLAYER_DRAW_TRIANGLES, PLAYER_DRAW_TRIANGLE_STRIP, PLAYER_DRAW_TRIANGLE_FAN, PLAYER_DRAW_QUADS, PLAYER_DRAW_QUAD_STRIP, PLAYER_DRAW_POLYGON };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


