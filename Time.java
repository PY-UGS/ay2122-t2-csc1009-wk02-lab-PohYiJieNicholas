

public class Time {
    long totalMilliseconds;
    Time(){
        totalMilliseconds = System.currentTimeMillis();
    }

    long getTotalSeconds(){
        long totalSecond = totalMilliseconds/1000;

        return totalSecond;
    }

    long getcurrentSeconds(){
        
        long currentSecond = getTotalSeconds()% 60;

        return currentSecond;
    }

    long getTotalMinutes(){
        long totalMinutes = getTotalSeconds() / 60;

        return totalMinutes;
    }

    long getcurrentMinutes(){
        
        long currentMinutes = getTotalMinutes() % 60;

        return currentMinutes;
    }

    long getCurrentHour(){
        long totalHours = getTotalMinutes()/60;
        long currentHour = totalHours % 24;

        return currentHour;
    }
}
