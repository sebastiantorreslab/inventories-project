package com.epico_software.appepico.converters;
import com.epico_software.appepico.dto.ItemDTO;
import com.epico_software.appepico.entity.Item;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ItemToItemDTOConverter implements Converter<Item, ItemDTO> {

    @Override
    public ItemDTO convert(Item source) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(source.getId());
        itemDTO.setName(source.getName());
        itemDTO.setCategory_id(source.getCategory().getId());
        itemDTO.setSku(source.getSku());
        itemDTO.setPicFilename(source.getPicFilename());
        itemDTO.setCostPrice(source.getCostPrice());
        itemDTO.setUnitPrice(source.getUnitPrice());
        itemDTO.setAvailable(source.getAvailable());
        return itemDTO;
    }
}
