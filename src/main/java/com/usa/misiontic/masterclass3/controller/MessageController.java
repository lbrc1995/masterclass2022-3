package com.usa.misiontic.masterclass3.controller;

import com.usa.misiontic.masterclass3.entities.Message;
import com.usa.misiontic.masterclass3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List <Message> getAll(){return messageService.getAll();}
    @PostMapping("/save")
    public Message save(@RequestBody Message p){ return messageService.save(p);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return messageService.delete(id);}
}
