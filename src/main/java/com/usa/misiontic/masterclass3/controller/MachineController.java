package com.usa.misiontic.masterclass3.controller;

import com.usa.misiontic.masterclass3.entities.Machine;
import com.usa.misiontic.masterclass3.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Machine")
public class MachineController {

    @Autowired
    private MachineService machineService;

    @GetMapping("/all")
    public List<Machine> getAll(){
        return machineService.getAll();
    }
    @PostMapping("/save")
    public Machine save(@RequestBody Machine m){
        return machineService.save(m);
    }
}
