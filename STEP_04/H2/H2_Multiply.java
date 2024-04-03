package STEP_04.H2;

import java.io.*;

class H2_Multiply {
    public static void main(String[] args) throws IOException {
        Multiply mul;
        int   x, y, z;
        float a, b, c;

        x = System.in.read() - '0'; a = x;
        y = System.in.read() - '0'; b = y;

        mul = new Multiply();

        z = mul.mul2c(x, y);
        c = mul.mul2c(a, b);
        System.out.printf("%d * %d = %d\n", x, y, z, c);
    }
    
}
