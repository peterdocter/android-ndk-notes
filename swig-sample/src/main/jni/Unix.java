/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Unix implements UnixConstants {
  public static int getReadOnly() {
    return UnixJNI.readOnly_get();
  }

  public static void setReadWrite(int value) {
    UnixJNI.readWrite_set(value);
  }

  public static int getReadWrite() {
    return UnixJNI.readWrite_get();
  }

  public static long getuid() {
    return UnixJNI.getuid();
  }

  public static int fact(int n) {
    return UnixJNI.fact(n);
  }

}
