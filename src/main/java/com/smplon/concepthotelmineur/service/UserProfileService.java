package com.smplon.concepthotelmineur.service;

import com.smplon.concepthotelmineur.entity.UserProfile;
import com.smplon.concepthotelmineur.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public void addUserProfile(UserProfile userProfile){
        userProfileRepository.save(userProfile);
    }

    public UserProfile updateUserProfile(UserProfile userProfile){
        return userProfileRepository.save(userProfile);
    }

    public void deleteUserProfile(Long idUp){
        userProfileRepository.deleteByIdUp(idUp);
    }
}
