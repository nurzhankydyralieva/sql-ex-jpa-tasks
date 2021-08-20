package kg.megacom.sqlexjpatasks.services;

import kg.megacom.sqlexjpatasks.models.dto.PCDto;
import kg.megacom.sqlexjpatasks.models.task.*;

import java.util.List;

public interface PCService {
    List<Task5> findByPriceLess(double price);

    List<PCDto> findAll();

    List<Task2> findByPriceGreaterThan(double price);

    List<Task3> findWhereColorY(String color);

    List<Task4> findDistinctMaker(String maker);

    List<Task1> findAllByCdAndPrice(String cd, String cd2, double price);

    List<Task4> findAllMaker(String maker);

    List<Task3> findAllColor(String color);

    List<Task2> findLaptopWhereRamGreater(int ram);

    List<Task2> findLaptopWhereScreenGreater(int screen);

    List<Task5> findAllByCd(String cd);

}
