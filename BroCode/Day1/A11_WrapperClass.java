public class A11_WrapperClass {
    public static void main(String[] args) {
         // Wrapping (Boxing)
        int a = 10;
        Integer obj = Integer.valueOf(a);  // manual boxing

        // Auto-boxing
        Integer obj2 = a;

        // Unwrapping
        int b = obj.intValue();  // manual unboxing

        // Auto-unboxing
        int c = obj2;

        System.out.println("Wrapped: " + obj);
        System.out.println("Unwrapped: " + c);


    }
}
