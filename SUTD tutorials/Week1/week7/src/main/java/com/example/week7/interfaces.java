package com.example.week7;

public class interfaces {
    interface I {
        void m(int x);
    }

    class K implements I {
        @Override
        public void m(int x) {

        }
    }

}
// I acts as a super class of K.
// so we can do void firstmethod(I i), better than void secondmethod(K k).