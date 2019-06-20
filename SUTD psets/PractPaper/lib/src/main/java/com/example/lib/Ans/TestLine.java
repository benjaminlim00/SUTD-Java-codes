import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ngaiman_cheung on 28/9/17.
 */

public class TestLine {
    public static void main(String[] args) {
        Line m = new Line(0,0, 2,2);
        System.out.println(m.computeLength());
        System.out.println(m.computeSlope());
        System.out.println(m);


        List<Line> listLine = new ArrayList<Line>();
        listLine.add( new Line(0,0, 1,2));
        listLine.add( new Line(0,0, -1,0));
        listLine.add( new Line(0,0, 3,4));

        Collections.sort(listLine);
        System.out.println(listLine);

        Collections.sort(listLine, new LineSlopeComparator());
        System.out.println(listLine);


        Line y = minLineSlope(
                new Line(0,0, 1,2),
                new Line(0,0, -1,0),
                new Line(0,0, 3,4),
                new LineSlopeComparator());

        System.out.println(y);


    }

    public static Line minLineSlope(Line m1, Line m2, Line m3, LineSlopeComparator c) {
        if ((c.compare(m1, m2) <= 0) && (c.compare(m1, m3) <= 0))
            return m1;
        else if ((c.compare(m2, m1) <= 0) && (c.compare(m2, m3) <= 0))
            return m2;
        else
            return m3;

    }
}

/*
output:

2.8284271247461903
1.0
Line:(0.0,0.0);(2.0,2.0)
[Line:(0.0,0.0);(-1.0,0.0), Line:(0.0,0.0);(1.0,2.0), Line:(0.0,0.0);(3.0,4.0)]
[Line:(0.0,0.0);(-1.0,0.0), Line:(0.0,0.0);(3.0,4.0), Line:(0.0,0.0);(1.0,2.0)]
Line:(0.0,0.0);(-1.0,0.0)
 */
