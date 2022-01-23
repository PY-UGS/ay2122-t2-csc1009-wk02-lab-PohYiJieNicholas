
public class Zodiac {
    int year;
    Zodiac(int inputYear){
        year = inputYear;
    }

    String getZodiac(int year){
       String[] animals = {"monkey", "rooster", "dog", "pig", "rat","ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        return animals[year % 12];

    }
}
