package com.user.app.service;

import com.user.app.model.DonarDto;

import java.util.List;

public interface DonarService {
    DonarDto createDonar(DonarDto donarDto);

    List<DonarDto> getAllDonars();

    DonarDto getDonarById(long id);

    DonarDto updateDonar(DonarDto donarDto, long id);

    void deleteDonarById(long id);
}
