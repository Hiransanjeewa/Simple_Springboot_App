package com.AudioHub.Music_Services;

import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("api")
public class musicServiceController {

    @GetMapping(path = "/")
    public String Songs(){
        System.out.println("controller started");
        return "All the songs are returned";
    }

    @GetMapping(path = "/songs/getsongs")
    public String GetSongs(@RequestParam Integer songid){
        System.out.println("controller started");
        return "Here is the song with the ID"+ songid;
    }





}
