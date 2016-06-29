package jnidemo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 231;
        int b = 123;
        NativeImplementation nativeImplementation = new NativeImplementation();
        System.out.println(a+" + "+b+" = "+nativeImplementation.add(a, b));
        System.out.println(a+" * "+b+" = "+nativeImplementation.multiply(a, b));

    }
}
