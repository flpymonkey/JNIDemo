package jnidemo;
/**
 * Created by nuplavikar on 6/28/2016.
 */
public class NativeImplementation {

    static {
        System.loadLibrary("DLL_JNI_Demo");
    }

    public native int add(int a, int b);
    public native int multiply(int a, int b);
}
