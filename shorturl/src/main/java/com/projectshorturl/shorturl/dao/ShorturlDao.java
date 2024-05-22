package com.projectshorturl.shorturl.dao;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.projectshorturl.shorturl.entity.Shorturl;

@RegisterBeanMapper(Shorturl.class)
public interface ShorturlDao {
    
    @GetGeneratedKeys
    @SqlUpdate("insert into tb_url (original_url, short_url) values (:original_url, :short_url)")
    int insert(@BindBean Shorturl shorturl);

    @SqlQuery("select original_url from tb_url where short_url = :short_url;")
    String checkExistentShortUrl(@Bind("short_url") String short_url);

    @SqlQuery("select original_url from tb_url where original_url LIKE :original_url;")
    String checkExistentOriginalUrl(@Bind("original_url") String original_url);

    //@SqlQuery("select short_url from tb_url where original_url = :original_url;")
    //String getShortUrlByOriginalUrl(@Bind("original_url") String original_url);

}
