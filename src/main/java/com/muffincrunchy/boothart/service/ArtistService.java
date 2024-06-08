package com.muffincrunchy.boothart.service;

import com.muffincrunchy.boothart.model.dto.request.CreateArtistRequest;
import com.muffincrunchy.boothart.model.dto.request.UpdateArtistRequest;
import com.muffincrunchy.boothart.model.entity.Artist;

import java.util.List;

public interface ArtistService {

    List<Artist> getAll();
    Artist getById(String id);
    Artist create(CreateArtistRequest request);
    Artist update(UpdateArtistRequest request);
    void delete(String id);
}
