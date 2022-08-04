package cvut.fel.controller;


import cvut.fel.dto.AuthorsContractsDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.dto.PublishingHouseDTO;
import cvut.fel.entity.PublishingHouse;
import cvut.fel.service.AuthorService;
import cvut.fel.service.AuthorsContractsService;
import cvut.fel.service.PublishingHouseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PublishingHouseController {

    private final PublishingHouseService publishingHouseService;
    private final DTOMapper dtoMapper;

    @PostMapping("/publishinghouse")
    @Operation(summary = "Adds a new publishing house")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = PublishingHouseDTO.class)) })
    )
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<PublishingHouseDTO> addNewPublishingHouse(@RequestBody  PublishingHouseDTO publishingHouseDTO){

        return ResponseEntity.ok(publishingHouseService.addNewPublishingHouse(publishingHouseDTO));
    }
}
