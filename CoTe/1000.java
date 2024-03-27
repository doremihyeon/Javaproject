package CoTe;

import java.io.IOException;

class Add_3 {
    int add2i(int x, int y) {
        int s;
        s = x + y;
        return(s);
    }
}
    
class CoTe_Add_3{
    public static void main(String[] args) throws IOException{
        int A ,B, C;
        Add_3 add;
        A = System.in.read() - '0';
        B = System.in.read() - '0';

        add = new Add_3();

        C = add.add2i(A, B);
       System.out.printf("%d+%d=%d", A, B, C);

    }
}