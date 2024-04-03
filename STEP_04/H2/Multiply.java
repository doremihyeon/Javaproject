package STEP_04.H2;

public class Multiply {
    int total;
    int mul2c(int x, int y){
        int s;
        s = x * y;
        total += s;
        return(s);
    }

    float mul2c(float a, float b){
        float s;
        s = a * b;
        total += s;
        return(s);
    }

}
