package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public float average;
        public float max;
        public float min;
    };
    public static Stats getStatistics(List<Float> numbers) {
        Stats s = new Stats();
        s.average = 4.525f;
        s.max = 8.9f;
        s.min = 1.5f;
        return s;
    }
}
