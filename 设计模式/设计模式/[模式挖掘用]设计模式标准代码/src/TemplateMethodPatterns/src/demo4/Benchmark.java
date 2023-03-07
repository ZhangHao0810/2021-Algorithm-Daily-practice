package TemplateMethodPatterns.src.demo4;

public abstract class Benchmark {

    public Benchmark() {
    }
    public abstract void benchmark();
    
    
    public final long repeat (int count) {
        if (count <= 0)
            return 0;
        else{
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < count; i++)
                benchmark();
            long stopTime = System.currentTimeMillis();
            return stopTime - startTime;
        }
    }
}

