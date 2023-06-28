package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.UserProfileRepository;
import com.simplon.concepthotelmineur.entity.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    UserProfile findUserProfileByIdUp(UserProfile userProfile){
        return userProfileRepository.findByIdUp(userProfile);
    }

    public void addUserProfile(UserProfile userProfile) {
        userProfileRepository.save(userProfile);
    }

    public UserProfile updateUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public void deleteUserProfile(Long idUp) {
        userProfileRepository.deleteByIdUp(idUp);
    }
}
