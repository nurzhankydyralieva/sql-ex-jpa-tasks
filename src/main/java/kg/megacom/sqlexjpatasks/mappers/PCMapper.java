package kg.megacom.sqlexjpatasks.mappers;

import kg.megacom.sqlexjpatasks.models.PC;
import kg.megacom.sqlexjpatasks.models.dto.PCDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PCMapper {

    PCMapper INSTANCE = Mappers.getMapper(PCMapper.class);

    PC toPC(PCDto pcDto);
    PCDto toPCDto(PC pc);

    List<PC> toPC(List<PCDto> pcDtos);
    List<PCDto> toPCDtos(List<PC> pcs);
}
