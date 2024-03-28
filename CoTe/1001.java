package CoTe;

import java.io.IOException;

class minus {
    int min2(int x, int y){
        int s;
        s = x - y;
        return(s);
    }
}

class CoTe_minus{
    public static void main(String[] args) throws IOException{
        int A, B, C;
        minus min;
        A = System.in.read() - '0';
        B = System.in.read() - '0';

        min = new minus();

        C = min.min2(A, B);
        System.out.printf("%d", C);

    }
}