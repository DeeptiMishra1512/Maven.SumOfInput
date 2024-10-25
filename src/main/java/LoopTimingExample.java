public class LoopTimingExample {
    public static void main(String[] args) {
        long startTime1, endTime1, startTime2, endTime2, elapsedTime1, elapsedTime2;

        // Loop 1
        String foo = "!";
        startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            // do something
            foo = "foo" + foo + "bar";
        }
        endTime1 = System.currentTimeMillis();
        elapsedTime1 = endTime1 - startTime1;
        System.out.println("Loop 1 elapsed time: " + elapsedTime1 + " ms");

        // Loop 2
        String bar = "^";
        startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            // do something else
            bar = bar + "bar ";
        }
        endTime2 = System.currentTimeMillis();
        elapsedTime2 = endTime2 - startTime2;
        System.out.println("Loop 2 elapsed time: " + elapsedTime2 + " ms");

        if(elapsedTime1 < elapsedTime2)
        {
            System.out.println("Loop1 is faster than loop2");
        }
        else
        {
            System.out.println("Loop2 is faster than loop1");
        }

    }
}

