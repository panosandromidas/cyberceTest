package multiply;

public class MultiplyNumbers {

    public boolean isOdd(int x){
        boolean isodd=false;
        if(x%2 ==0){
            isodd=true;
        }
        return isodd;
    }

    public int multiply(int x,int y){
        int ginomeno=0;
        while(y>0){
            if(isOdd(y)){
               ginomeno += x;
            }
            x *=2;
            y /=2;
        }
        return ginomeno;
    }
}
