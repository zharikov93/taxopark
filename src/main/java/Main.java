import autopark.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String[][] cars = {
                {"Daewoo", "Sens", "AA1030LD", "7", "150", "500", "5", "4"},
                {"Citroen", "Picasso", "AA1078LD", "7.5", "180", "650", "5", "5"},
                {"Mercedes", "Vito", "AC1086SF", "9", "215", "900", "9", "5"}
        };
        //brand, model, carID, fuelConsumption, velocity, maxCarryingWeight, maxPassengers, doors
        TaxiStation station = new TaxiStation(cars);

        List<Car> carPool = station.getCarPool();


        //        Посчитать стоимость автопарка.
        double poolPrice = 0.0;
        for (Car car : carPool) {
            poolPrice += car.getPrice();
        }
        System.out.println("Cost of taxistation's cars: " + Math.round(poolPrice * 100) / 100.0);

//
    }
}
