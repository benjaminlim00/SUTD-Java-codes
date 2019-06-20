/**
 * Created by ngaiman_cheung on 28/9/17.
 */

public class Line implements Comparable<Line>{
    private double x1, y1;
    private double x2, y2;

    public Line(){
        this(0,0, 1,1);


    }

    public Line(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public double computeSlope() {
        return (y2 - y1) / (x2 - x1);
    }

    public double computeLength() {
        double a = ( x1 - x2) * (x1 - x2) + ( y1 - y2) * (y1 - y2);
        return Math.sqrt(a);
    }

    @Override
    public int compareTo(Line n){
        double thisLen = computeLength();
        double otherLen = n.computeLength();

        if (thisLen > otherLen)
            return 1;
        else if (thisLen < otherLen)
            return -1;
        else
            return 0;

    }


    @Override
    public String toString() {
        return "Line:(" + x1 + "," + y1+ ");("+x2+","+y2+")";

    }

}
