package dio.diotestesunitarios.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dio.diotestesunitarios.dto.BeerDTO;
import dio.diotestesunitarios.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
