import React from 'react'
//import {useParams} from "react-router-dom";

//PAGINA TESTE

function Redirect() {
    //const {shorturl} = useParams();

    const handleClick = () => {
        window.location.replace('https://www.google.com');
    };
    
    return (
    <div>
        <button onClick={handleClick}>Click to redirect</button>
    </div>
    )
}

export default Redirect