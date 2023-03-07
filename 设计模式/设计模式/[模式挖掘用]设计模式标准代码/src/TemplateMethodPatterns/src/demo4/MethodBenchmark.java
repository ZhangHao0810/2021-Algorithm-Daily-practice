package TemplateMethodPatterns.src.demo4;

public class MethodBenchmark extends Benchmark {

    public MethodBenchmark() {
    }
    public void benchmark(){
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            System.out.print("i="+i);
        }
    }
}
