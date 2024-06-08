package com.muffincrunchy.boothart.controller;

import com.muffincrunchy.boothart.model.dto.request.CreateArtistRequest;
import com.muffincrunchy.boothart.model.dto.request.UpdateArtistRequest;
import com.muffincrunchy.boothart.model.dto.response.CommonResponse;
import com.muffincrunchy.boothart.model.entity.Artist;
import com.muffincrunchy.boothart.model.entity.Customer;
import com.muffincrunchy.boothart.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.muffincrunchy.boothart.model.constant.ApiUrl.ARTIST_URL;
import static com.muffincrunchy.boothart.model.constant.ApiUrl.ID_PATH;

@RequiredArgsConstructor
@RestController
@RequestMapping(ARTIST_URL)
public class ArtistController {

    private final ArtistService artistService;

    @GetMapping
    public ResponseEntity<CommonResponse<List<Artist>>> getMerch() {
        List<Artist> artists = artistService.getAll();
        CommonResponse<List<Artist>> response = CommonResponse.<List<Artist>>builder()
                .statusCode(HttpStatus.OK.value())
                .message("success fetch data")
                .data(artists)
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping(ID_PATH)
    public ResponseEntity<CommonResponse<Artist>> getArtistById(@PathVariable("id") String id) {
        Artist artist = artistService.getById(id);
        CommonResponse<Artist> response = CommonResponse.<Artist>builder()
                .statusCode(HttpStatus.OK.value())
                .message("success fetch data")
                .data(artist)
                .build();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<CommonResponse<Artist>> createArtist(@RequestBody CreateArtistRequest request) {
        Artist artist = artistService.create(request);
        CommonResponse<Artist> response = CommonResponse.<Artist>builder()
                .statusCode(HttpStatus.OK.value())
                .message("success save data")
                .data(artist)
                .build();
        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<CommonResponse<Artist>> updateArtist(@RequestBody UpdateArtistRequest request) {
        Artist artist = artistService.update(request);
        CommonResponse<Artist> response = CommonResponse.<Artist>builder()
                .statusCode(HttpStatus.OK.value())
                .message("success update data")
                .data(artist)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = ID_PATH)
    public ResponseEntity<CommonResponse<String>> deleteArtistById(@PathVariable("id") String id) {
        artistService.delete(id);
        CommonResponse<String> response = CommonResponse.<String>builder()
                .statusCode(HttpStatus.OK.value())
                .message("success delete data")
                .build();
        return ResponseEntity.ok(response);
    }
}
