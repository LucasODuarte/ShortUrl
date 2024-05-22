package com.projectshorturl.shorturl.service;

import java.util.Random;

import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;

import com.projectshorturl.shorturl.dao.ShorturlDao;
import com.projectshorturl.shorturl.entity.Shorturl;

@Service
public class ShorturlService {
    
    private final ShorturlDao shorturlDao;

    public ShorturlService (Jdbi jdbi){
        this.shorturlDao = jdbi.onDemand(ShorturlDao.class);
    }

    //public Shorturl insert(Shorturl shorturl_entity){
    //    shorturl_entity.setShort_url(createShortUrl());
    //    int idShorturl = shorturlDao.insert(shorturl_entity);
    //    shorturl_entity.setId(idShorturl);
    //    return shorturl_entity;
    //}

    public boolean insert(Shorturl shorturl_entity){
        if(!this.checkExistentOriginalUrl(shorturl_entity.getOriginal_url())){
            shorturl_entity.setShort_url(createShortUrl());
            int idShorturl = shorturlDao.insert(shorturl_entity);
            shorturl_entity.setId(idShorturl);
            return true;
        }
        return false;
    }

    public String getOriginalUrlByShorturl(String short_url){
        return shorturlDao.checkExistentShortUrl(short_url);
    }

    //public String getShortUrlByOriginalUrl(String original_url){
    //    return shorturlDao.getShortUrlByOriginalUrl(original_url);
    //}

    public String createShortUrl(){
        Random r = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int chars_in_shorturl = 7;
        String short_url = "";

        do{
            for (int i = 0; i < chars_in_shorturl; i++) {
                short_url+= characters.charAt((r.nextInt(characters.length())));
            }

            if (!this.checkExistentShortUrl(short_url)){
                short_url = "";
            }else{
                return short_url;
            }
        }while(true);
    }

    public boolean checkExistentShortUrl(String short_url){
        if(shorturlDao.checkExistentShortUrl(short_url) == null){
            return true;
        }
        return false;
    }

    public boolean checkExistentOriginalUrl(String original_url){
        if(shorturlDao.checkExistentOriginalUrl(original_url) == null){
            return false;
        }
        return true;
    }

}
