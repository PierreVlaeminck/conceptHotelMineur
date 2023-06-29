package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.HostelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HostelService {

    private final HostelRepository hostelRepository;

    public List<Hostel> findAllHostel() { return hostelRepository.findAll(); }

    public Hostel findHostelByIdH(Long id){
        return hostelRepository.findByIdH(id);
    }

    public List<Hostel> findHostelByCity(Hostel hostel) {
        return hostelRepository.findAllByCity(hostel);
    }
}
