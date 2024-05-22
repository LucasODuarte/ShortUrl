import BaseApi from './BaseApi';

class ShorturlApi extends BaseApi{

    /*getOriginalUrl(setData, searchText){
        const method = "GET";
        const url = `${this.baseUrl}original/${searchText}`;
        console.log(url);
        super.myFetch(setData, method, url);
    }

    getShortUrl(setData, original){
        const method = "GET";
        const url = `${this.baseUrl}short/${original}`;
        console.log(url);
        super.myFetch(setData, method, url);
    }

    insertShorturl(short_url){
        const method = "POST";
        const url = `${this.baseUrl}`;
        //console.log(url);
        super.myFetch({}, method, url, short_url);
    }*/
    

}

export default ShorturlApi;