package com.projectshorturl.shorturl.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectshorturl.shorturl.entity.Shorturl;
import com.projectshorturl.shorturl.service.ShorturlService;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping({"/api/v1"})
public class ShorturlController {
    private final ShorturlService shorturlService;

    public ShorturlController(ShorturlService shorturlService){
        this.shorturlService = shorturlService;
    }

    //@PostMapping({"","/"})
    //public boolean insert(@RequestBody Shorturl shorturl){
    //    shorturl = shorturlService.insert(shorturl);
    //    return shorturl;
    //}

    @PostMapping({"","/"})
    public boolean insert(@RequestBody Shorturl shorturl){
        return shorturlService.insert(shorturl);
    }

    @GetMapping("/short/{short_url}")
    public String getOriginalUrl(@PathVariable String short_url){
        return shorturlService.getOriginalUrlByShorturl(short_url);
    }

    /*@GetMapping("/original/{original_url}")
    public String getShortUrl(@PathVariable String original_url){
        System.out.println(original_url);
        String a = shorturlService.getShortUrlByOriginalUrl(original_url);
        System.out.println(a);
        return a;
    }*/

}
