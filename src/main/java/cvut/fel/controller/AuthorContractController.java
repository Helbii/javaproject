package cvut.fel.controller;

import cvut.fel.dto.AuthorsContractsDTO;
import cvut.fel.dto.BookDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.entity.AuthorsContracts;
import cvut.fel.service.AuthorService;
import cvut.fel.service.AuthorsContractsService;
import cvut.fel.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorContractController {
    private final AuthorService authorService;
    private final AuthorsContractsService authorsContractsService;
    private final DTOMapper dtoMapper;

    @PostMapping("/authorcontract")
    public ResponseEntity<AuthorsContractsDTO> createNewContract(@RequestBody AuthorsContractsDTO authorsContractsDTO){

        return ResponseEntity.ok(authorsContractsService.create(authorsContractsDTO));
    }

}
