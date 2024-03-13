/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
@Validated
@Tag(name = "Default", description = "the Default API")
public interface DefaultApi {

    /**
     * GET /thingy/{date}
     *
     * @param date A date path parameter (required)
     * @param dateTime A date-time query parameter (required)
     * @param xOrderDate A date header parameter (required)
     * @param loginDate A date cookie parameter (optional, default to 1975-01-01)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "get",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/thingy/{date}"
    )
    
    ResponseEntity<Void> get(
        @Parameter(name = "date", description = "A date path parameter", required = true, in = ParameterIn.PATH) @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @NotNull @Parameter(name = "dateTime", description = "A date-time query parameter", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "dateTime", required = true, defaultValue = "1973-12-19T03:39:57-08:00") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dateTime,
        @NotNull @Parameter(name = "X-Order-Date", description = "A date header parameter", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "X-Order-Date", required = true, defaultValue = "1974-01-01") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate xOrderDate,
        @Parameter(name = "loginDate", description = "A date cookie parameter", in = ParameterIn.COOKIE) @CookieValue(name = "loginDate", required = false, defaultValue = "1975-01-01") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate loginDate
    );


    /**
     * POST /thingy/{date}
     * update with form data
     *
     * @param date A date path parameter (required)
     * @param visitDate Updated last visit timestamp (optional, default to 1971-12-19T03:39:57-08:00)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updatePetWithForm",
        description = "update with form data",
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/thingy/{date}",
        consumes = "application/x-www-form-urlencoded"
    )
    
    ResponseEntity<Void> updatePetWithForm(
        @Parameter(name = "date", description = "A date path parameter", required = true, in = ParameterIn.PATH) @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @Parameter(name = "visitDate", description = "Updated last visit timestamp") @Valid @RequestParam(value = "visitDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime visitDate
    );

}
