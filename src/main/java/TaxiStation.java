import autopark.Car;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 Определить иерархию автомобилей.
 Создать таксопарк.
 Рассчитать стоимость автопарка.
 Провести сортировку автомобилей парка по расходу топлива.
 Найти автомобиль в компании, соответствующий заданному диапазону параметров.
 */
public class TaxiStation {
    List<Car> carPool;

    String arrCars;// string

    public TaxiStation(String[][] arrCars) throws IOException {

        // Парасер автомобилей

//         this.arrCars = arrCars;
         //this.carPool = new CarBuilder().createCars(arrCars);;
    }



    public List<Car> getCarPool() {
        return carPool;
    }
}
