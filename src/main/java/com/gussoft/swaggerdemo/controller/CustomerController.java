package com.gussoft.swaggerdemo.controller;

//import com.gussoft.swaggerdemo.api.PetApi;
import com.gussoft.swaggerdemo.model.Pet;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController { //implements PetApi {

    Pet pet = new Pet();

    @GetMapping("/customer")
    public ResponseEntity<String> obtenerMascota(@RequestParam(value = "name") String name) throws UnsupportedEncodingException {
        String response = "Valor codificado recibido: ";
        response += URLEncoder.encode(name, StandardCharsets.UTF_8);
        log.info(response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
/*
    @Override
    public ResponseEntity<Void> addPet(Pet pet) {
        return (ResponseEntity<Void>) ResponseEntity.ok();
    }

    @Override
    public ResponseEntity<Void> deletePet(Pet pet) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> getPets() {
        List<Pet> pets = new ArrayList<>();
        Pet pet = new Pet();
        pet.setPetId(1);
        pet.setName("Boby");
        pet.setColor("black");
        pet.setBirthDate(OffsetDateTime.of(2022, 3, 30, 12, 0, 0, 0, ZoneOffset.UTC));
        pets.add(pet);
        return ResponseEntity.ok(pets);
    }

    @Override
    public ResponseEntity<List<Pet>> petSearchGet(String name) {
        Pet pet = new Pet();
        pet.setName("oso");
        List<Pet> pets = new ArrayList<>();
        pets.add(pet);
        return ResponseEntity.ok(pets);
    }

    @Override
    public ResponseEntity<Void> updatePet(Pet pet) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> updatePetByStatus(Long petId, String status) {
        return null;
    }

 */
}
