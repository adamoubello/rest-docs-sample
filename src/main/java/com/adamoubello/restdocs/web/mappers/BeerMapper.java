package com.adamoubello.restdocs.web.mappers;

import com.adamoubello.restdocs.domain.Beer;
import com.adamoubello.restdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
