package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.HostelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HostelService {

    private final HostelRepository hostelRepository;

    public Hostel getHostelByCity(Hostel hostel) {
        return hostelRepository.findAllByCity(hostel);
    }

}
