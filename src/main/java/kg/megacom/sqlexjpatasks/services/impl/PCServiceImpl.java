package kg.megacom.sqlexjpatasks.services.impl;

import kg.megacom.sqlexjpatasks.dao.PCRepo;
import kg.megacom.sqlexjpatasks.mappers.PCMapper;
import kg.megacom.sqlexjpatasks.models.PC;
import kg.megacom.sqlexjpatasks.models.dto.PCDto;
import kg.megacom.sqlexjpatasks.models.task.*;
import kg.megacom.sqlexjpatasks.services.PCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCServiceImpl implements PCService {
    @Autowired
    private PCRepo pcRepo;
    @Override
    public List<Task5> findByPriceLess(double price) {
        List<PC> pcs = pcRepo.findAllByPriceGreaterThan(price);

//        List<Task1> list = pcs.stream()
//                .map(x -> {
//                    Task1 task1 = new Task1();
//                    task1.setModel(x.getProduct().getModel());
//                    task1.setHd(x.getHd());
//                    task1.setSpeed(x.getSpeed());
//                    return task1;
//                })
//                .collect(Collectors.toList());

//        List<Map<String, Object>> list = new ArrayList<>();
//        pcs.stream()
//                .forEach(x->{
//                    Map<String, Object> map = new HashMap<>();
//                    map.put("model", x.getProduct().getModel());
//                    map.put("speed", x.getSpeed());
//                    map.put("hd", x.getHd());
//                    list.add(map);
//                });
        return pcRepo.findAllByPriceGreater(price);
    }



    @Override
    public List<PCDto> findAll() {
        List<PC> pcs = pcRepo.findAll();
        return PCMapper.INSTANCE.toPCDtos(pcs);
    }

    @Override
    public List<Task2> findByPriceGreaterThan(double price) {
        return pcRepo.findByPriceGreaterThan(price);
    }

    @Override
    public List<Task3> findWhereColorY(String color) {
        return pcRepo.findWhereColorY(color);
    }

    @Override
    public List<Task4> findDistinctMaker(String maker) {
        return pcRepo.findDistinctMaker(maker);
    }

    @Override
    public List<Task1> findAllByCdAndPrice(String cd, String cd2, double price) {
        return pcRepo.findAllByCdAndPrice(cd, cd2, price);
    }

    @Override
    public List<Task4> findAllMaker(String maker) {
        return pcRepo.findAllMaker(maker);
    }

    @Override
    public List<Task3> findAllColor(String color) {
        return pcRepo.findAllColor(color);
    }

    @Override
    public List<Task2> findLaptopWhereRamGreater(int ram) {
        return pcRepo.findLaptopWhereRamGreater(ram);
    }

    @Override
    public List<Task2> findLaptopWhereScreenGreater(int screen) {
        return pcRepo.findLaptopWhereScreenGreater(screen);
    }

    @Override
    public List<Task5> findAllByCd(String cd) {
        return pcRepo.findAllByCd(cd);
    }


}
