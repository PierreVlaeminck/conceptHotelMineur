package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.MinorRepository;
import com.simplon.concepthotelmineur.entity.Minor;
import com.simplon.concepthotelmineur.entity.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MinorService {

    private final MinorRepository minorRepository;

    public Minor addMinor(Minor minor) {
        return minorRepository.save(minor);
    }

    public List<Minor> getMinorByUserProfile(UserProfile userProfile) {
        return minorRepository.findAllByUserProfile(userProfile);
    }

    public void deleteMinor(Long id) {
        minorRepository.deleteById(id);
    }

    public Minor updateMinor(Minor minor) {
        return minorRepository.save(minor);
    }
}
