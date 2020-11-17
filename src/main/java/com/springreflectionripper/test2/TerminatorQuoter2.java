package com.springreflectionripper.test2;
@Profiling
public class TerminatorQuoter2 implements Quoter2 {
    @InjectRandomInt2(min = 2, max = 7)
    private int repeat;

    private String message;

    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);

    }

    public TerminatorQuoter2() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote2() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message " + message);
        }

    }
}
