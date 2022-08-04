package cvut.fel.service;

import cvut.fel.dto.DTOMapper;
import cvut.fel.dto.PublishingHouseDTO;
import cvut.fel.entity.AuthorsContracts;
import cvut.fel.entity.PublishingHouse;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.repository.PublishingHouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PublishingHouseServiceImp implements PublishingHouseService{

    private final PublishingHouseRepository publishingHouseRepository;
    private final DTOMapper dtoMapper;



    @Override
    public PublishingHouseDTO addNewPublishingHouse(PublishingHouseDTO publishingHouseDTO) {
        if (publishingHouseDTO == null)
            throw new FieldMissingException();
        PublishingHouse publishingHouse = publishingHouseRepository.save(dtoMapper.publishingHouseDTOToPublishingHouse(publishingHouseDTO));
        return dtoMapper.PublishingHouseToPublishingHouseDTO(publishingHouse);
    }



}

