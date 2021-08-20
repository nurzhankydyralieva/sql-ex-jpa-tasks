package kg.megacom.sqlexjpatasks.dao;

import kg.megacom.sqlexjpatasks.models.PC;
import kg.megacom.sqlexjpatasks.models.task.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCRepo extends JpaRepository<PC, Long> {
    List<PC> findAllByPriceGreaterThan(double price);

    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task5(u.code, u.product.model, u.speed, u.ram, u.hd, u.cd, u.price) from PC u where u.price < ?1")
    List<Task5> findAllByPriceGreater(double price);

    //SELECT model, ram, screen FROM Laptop where price > 1000
    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task2(u.product.model, u.ram, u.screen) from Laptop u where u.price > ?1")
    List<Task2> findByPriceGreaterThan(double price);

    //SELECT code, model, color, type, price FROM Printer where color = 'y'
    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task3(u.code, u.product.model, u.color, u.type, u.price) from Printer u where color = 'y'")
    List<Task3> findWhereColorY(String color);

    //SELECT DISTINCT maker FROM Product where type = 'Printer'
    @Query("select distinct new kg.megacom.sqlexjpatasks.models.task.Task4(u.maker) from Product u where type = 'Printer'")
    List<Task4> findDistinctMaker(String maker);


    //SELECT PC.model, PC.speed, PC.hd
    //FROM PC
    //WHERE (PC.cd = '12x' OR
    // PC.cd = '24x')
    //AND price < 600
    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task1(u.product.model, u.speed, u.hd) from PC u where u.cd = ?1 or u.cd = ?1 and u.price < ?1")
    List<Task1> findAllByCdAndPrice(String cd, String cd2, double price);

    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task4(u.maker)  from Product u where type = 'Printer'")
    List<Task4> findAllMaker(String maker);

    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task3(u.code, u.product.model, u.color, u.type, u.price) from Printer u where  color = 'n'")
    List<Task3> findAllColor(String color);

    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task2(u.product.model, u.ram, u.screen) from Laptop u where ram < ?1 ")
    List<Task2> findLaptopWhereRamGreater(int ram);

    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task2(u.product.model, u.ram, u.screen) from Laptop u where screen > ?1 ")
    List<Task2> findLaptopWhereScreenGreater(int screen);

    @Query("select new kg.megacom.sqlexjpatasks.models.task.Task5(u.code, u.product.model, u.speed, u.ram, u.hd, u.cd, u.price) from PC u where u.cd = ?1")
    List<Task5> findAllByCd(String cd);

}
