package kg.megacom.sqlexjpatasks.services.impl;

import kg.megacom.sqlexjpatasks.services.PCService;
import kg.megacom.sqlexjpatasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private PCService pcService;

    @Override
    public Object execute(String taskNum) {
        switch (taskNum) {
            case "1":
                return pcService.findByPriceLess(600);
            case "2":
                return pcService.findByPriceGreaterThan(1000);
            case "3":
                return pcService.findWhereColorY("Y");
            case "4":
                return pcService.findDistinctMaker("Printer");
            case "5":
                return pcService.findAllByCdAndPrice("12x", "24x", 600);
            case "6":
                return pcService.findAllMaker("Printer");
            case "7":
                return pcService.findAllColor("N");
            case "8":
                return pcService.findLaptopWhereRamGreater(100);
            case "9":
                return pcService.findLaptopWhereScreenGreater(11);
            case "10":
                return pcService.findAllByCd("12x");
        }
        return null;
    }
}
