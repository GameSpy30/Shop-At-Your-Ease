package io.javabrains.profileserviceapp.controller;

import io.javabrains.profileserviceapp.model.Profile;
import io.javabrains.profileserviceapp.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public ResponseEntity<Profile> saveOrUpdate(@RequestBody Profile profile) {
        return new ResponseEntity<Profile>(profileService.saveOrUpdate(profile), HttpStatus.ACCEPTED);
    }
    @GetMapping
    public ResponseEntity<List<Profile>> findAll() {
        return new ResponseEntity<List<Profile>>(profileService.findAll(), HttpStatus.ACCEPTED);
    }
    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Profile profile) {
        profileService.delete(profile);
        return new ResponseEntity<String>("Profile Deleted", HttpStatus.ACCEPTED);
    }
}
