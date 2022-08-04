package cvut.fel.service;

import cvut.fel.dto.AuthorsContractsDTO;
import cvut.fel.dto.BookDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.entity.AuthorsContracts;
import cvut.fel.entity.Book;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.repository.AuthorsContractsRepository;
import cvut.fel.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorsContractsServiceImp implements AuthorsContractsService {

    private final AuthorsContractsRepository authorsContractsRepository;
    private final DTOMapper dtoMapper;


    @Override
    public AuthorsContractsDTO create(AuthorsContractsDTO authorsContractsDTO) {
        if (authorsContractsDTO == null)
            throw new FieldMissingException();
        AuthorsContracts authorsContracts = authorsContractsRepository.save(dtoMapper.authorsContractsDTOtoAuthorsContracts(authorsContractsDTO));
        return dtoMapper.authorsContractsToAuthorsContractsDTO(authorsContracts);
    }
}
