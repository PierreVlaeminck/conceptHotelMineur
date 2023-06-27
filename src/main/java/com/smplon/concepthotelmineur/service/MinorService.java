package com.smplon.concepthotelmineur.service;

import com.smplon.concepthotelmineur.entity.Minor;
import com.smplon.concepthotelmineur.entity.UserProfile;
import com.smplon.concepthotelmineur.repository.MinorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MinorService {

    private final MinorRepository minorRepository;

   public Minor addMinor(Minor minor){
       return minorRepository.save(minor);
   }

    public List<Minor> getMinorByUserProfile(UserProfile userProfile){
        return minorRepository.findAllByUserProfile(userProfile);
    }

    public void deleteMinor(Long id){
       minorRepository.deleteById(id);
    }

    public Minor updateMinor(Minor minor){
       return minorRepository.save(minor);
    }
}
