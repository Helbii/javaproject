package cvut.fel.dto;

import cvut.fel.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DTOMapper {

    BookDTO bookToBookDTO(Book book);
    Book bookDTOToBook(BookDTO book);
    AuthorDTO authorToAuthorDTO(Author author);

    Author authorDTOToAuthor(AuthorDTO authorDTO);

    LibraryDTO libraryToLibraryDTO(Library library);

    Library libraryDTOToLibrary (LibraryDTO libraryDTO);

    PublishingHouse publishingHouseDTOToPublishingHouse (PublishingHouseDTO publishingHouseDTO);

    PublishingHouseDTO PublishingHouseToPublishingHouseDTO (PublishingHouse publishingHouse);

    Adress adressDTOToAdress (AdressDTO adressDTO);

    AdressDTO adressToAdressDTO (Adress adress);

    AuthorsContracts authorsContractsDTOtoAuthorsContracts (AuthorsContractsDTO authorsContractsDTO);

    AuthorsContractsDTO authorsContractsToAuthorsContractsDTO (AuthorsContracts authorsContracts);

}
