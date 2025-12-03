public class Reactangle {
    public static int length;
    public static int width;

    public Reactangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public static int getArea(){
        int area = length*width;
        return area;
    }
    public static int getPerimeter(){
        int perimeter = 2*(length+width);
        return perimeter;
    }
}
