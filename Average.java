

public class Average {
    private float num, num2, num3;

    Average(float var, float var2, float var3){
        num = var;
        num2 = var2;
        num3 = var3;
    }

    float getAverage(){
        float total = num + num2 + num3;
        return total/3;
    }
}
