package com.aneesh.springbootjpa.controller;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aneesh.springbootjpa.dao.AlienRepo;
import com.aneesh.springbootjpa.model.Alien;




@RestController
public class AlienController 
{
    @Autowired
    AlienRepo repo;

    // @RequestMapping("/")     
    // public String home(){
    //     return "home.jsp";
    // }


    // @RequestMapping("/addAlien")
    // public String addAlien(Alien alien){
    //     repo.save(alien);
    //     return "home.jsp";
    // }

    // @RequestMapping("/getAlien")
    // public ModelAndView getAlien(@RequestParam int aid){
        
    //     ModelAndView mv = new ModelAndView("showAlien.jsp");

    //     Alien alien = repo.findById(aid).orElse(new Alien());


    //     // System.out.println(repo.findByTech("Java"));
    //     // System.out.println(repo.findByAidGreaterThan(102));
    // //     // System.out.println(repo.findByTechSorted("Java"));

    // //     mv.addObject(alien);

    // //     return mv;
    // // }
    
    // @RequestMapping("/popAlien")
    // public String popAlien(@RequestParam int aid){
        
    //     repo.deleteById(aid);

    //     return "home.jsp";
    // }
    // REST Integration
    
    @GetMapping(path = "/aliens", produces = {"application/xml","application/json"})
    public List<Alien> getAliens(){
        
        
        
        return repo.findAll();
    }



    @GetMapping("/alien/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
        
        

        return repo.findById(aid);
    }



    @PostMapping(path = "/alien", consumes = {"application/json"})
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }


    @DeleteMapping(path = "/alien/{aid}")
    public String deleteAlien(@PathVariable int aid){

        Alien a = repo.getReferenceById(aid);

        repo.delete(a);

        return "deleted";
    }

    
    @PutMapping(path = "/alien", consumes = {"application/json"} )
    public Alien saveOrUpdateAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }

}