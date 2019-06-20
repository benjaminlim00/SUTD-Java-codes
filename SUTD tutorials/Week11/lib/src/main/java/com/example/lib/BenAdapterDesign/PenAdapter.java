package com.example.lib.BenAdapterDesign;

public class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();



    @Override
    public void write(String str) {
        pp.mark(str);
        // here we made it so that the pilotpen will do mark when it is called to do write

    }
}
