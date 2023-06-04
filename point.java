//Question 3
public class point {
    private int x;          //private variable means controlled access .
    private int y;
    public point(){
        x=100;
        y=200;
    }
    point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
}
