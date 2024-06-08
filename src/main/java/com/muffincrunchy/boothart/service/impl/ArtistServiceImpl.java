package com.muffincrunchy.boothart.service.impl;

import com.muffincrunchy.boothart.model.dto.request.CreateArtistRequest;
import com.muffincrunchy.boothart.model.dto.request.UpdateArtistRequest;
import com.muffincrunchy.boothart.model.entity.Artist;
import com.muffincrunchy.boothart.repository.ArtistRepository;
import com.muffincrunchy.boothart.service.ArtistService;
import com.muffincrunchy.boothart.utils.Validation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;
    private final Validation validation;

    @Override
    public List<Artist> getAll() {
        return artistRepository.getAllArtists();
    }

    @Override
    public Artist getById(String id) {
        Optional<Artist> artist = artistRepository.getArtistById(id);
        return artist.orElse(null);
    }

    @Override
    public Artist create(CreateArtistRequest request) {
        validation.validate(request);
        Artist artist = Artist.builder()
                .id(UUID.randomUUID().toString())
                .name(request.getName())
                .birthDate(Date.valueOf(request.getBirthDate()))
                .phoneNo(request.getPhoneNo())
                .email(request.getEmail())
                .build();
        int res = artistRepository.createArtist(
                artist.getId(),
                artist.getName(),
                artist.getBirthDate(),
                artist.getPhoneNo(),
                artist.getEmail()
        );
        if (res == 1) {
            return artist;
        }
        return null;
    }

    @Override
    public Artist update(UpdateArtistRequest request) {
        validation.validate(request);
        int res = artistRepository.updateArtistById(
                request.getId(),
                request.getName(),
                Date.valueOf(request.getBirthDate()),
                request.getPhoneNo(),
                request.getEmail()
        );
        if (res == 1) {
            return getById(request.getId());
        }
        return null;
    }

    @Override
    public void delete(String id) {
        artistRepository.deleteArtistById(id);
    }
}
