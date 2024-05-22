
class BaseApi {

    constructor() {
        this.baseUrl = "http://localhost:8087/api/v1/";
    }

    myFetch(setData, method, url, body) {

        console.log("BaseApi.myFetch(method: " + method + ", url: " +url);

        fetch(url, {
            method: method,
            mode: "cors", // no-cors, *cors, same-origin
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(body)
        })
            .then((resp) => resp.json())
            .then((data) => {
                console.log("checagem");
                console.log(data);
                if (setData){
                    setData(data);
                }
            })
            .catch((err) => console.log(err))
    }

}

export default BaseApi;