package com.com.advanced.workshop.lesson3;

import java.util.function.Function;
import java.util.stream.Stream;

public class ParallelStreams {
    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i-> i+1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

//    public static long parallelRangedSum(long n) {
//        return LongStream.rangeClosed(1, n)
//                .parallel()
//                .reduce(0L, Long::sum);
//    }

    public static void main(String...args) {
        System.out.println("Iterative sum done in: " +
                measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + " msecs");
        System.out.println("Parallel sum done in: " +
                measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + " msecs" );

//        System.out.println("Parallel sum using appropriate stream done in: " +
//                measureSumPerf(ParallelStreams::parallelRangedSum, 10_000_000) + " msecs" );
    }
}
