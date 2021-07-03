package com.projectzeus.springapi.resources;

import com.projectzeus.springapi.models.Caso;
import com.projectzeus.springapi.repository.CasoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*")
public class CasoResource {

    @Autowired
    CasoRepository casos;


    @GetMapping("/caso/{id}")
    public ResponseEntity<Caso> getUser(@PathVariable("id") long id) {
        return new ResponseEntity(casos.findById(id), HttpStatus.OK);
    }

    @PostMapping("/caso/create")
    public ResponseEntity<String> createUser(@RequestBody Caso caso) {
        casos.save(caso);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("caso/update")
    public ResponseEntity<Caso> updateUser(@RequestBody Caso caso) {
        return new ResponseEntity<>(casos.save(caso), HttpStatus.OK);
    }

    @DeleteMapping("caso/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") long id) {
        var casoTemp = casos.findOneById(id);
        casos.delete(casoTemp);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
