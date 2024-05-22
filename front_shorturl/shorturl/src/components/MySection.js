import React, { useState } from 'react';
import './MySection.css';
import ShorturlApi from "./api/ShorturlApi";

function MySection() {

    const [original_url, setOriginalUrl] = useState('');
    const [short_url, setShortUrl] = useState('');

    const handleInputChange = (event) => {
        setOriginalUrl(event.target.value);
    };

    /*const handleClick = () => {
        //fazer verificação se já existe
        const shorturlApi = new ShorturlApi();
        var originalurl = {original_url: original_url};
        shorturlApi.insertShorturl(originalurl);
        console.log(original_url);
        console.log(shorturlApi.getShortUrl(original_url));
        //setShortUrl(`localhost:3000/${shorturl}`);
    };*/

    return (
    <section className='pt-32 container '>
        <h1 className='text-6xl font-bold text-center'>Faça os <span className='text-violet-500'>pequenos</span> momentos valerem a pena!</h1>
        <p className='text-[#4B5563] text-center text-2xl pt-2 mb-20'>Crie shorturl's e compartilhe-as. Crie momentos, experiências e emoções. Tudo isso na <strong>ShortUrl</strong>.</p>
        <div className='flex items-center justify-center'>
            <div className='w-2/3 overflow-hidden shadow-lg rounded-2xl'>
                <div className='px-6 py-4 bg-white'>
                    <h1 className='font-bold text-3xl mb-3'>Crie uma ShortUrl</h1>
                    <p className='font-bold text-1xl mb-2'>Cole a Url_Original</p>
                    <input className='inline-block w-3/4  text-gray-700 border border-gray-300 rounded-lg py-3 px-4 mb-3 focus:outline-none mr-8' id="originalurl" type="text" placeholder="Example: www.original-url.com" onChange={handleInputChange}/>  
                    <button type="button" className='text-white bg-violet-500 hover:bg-violet-600 focus:ring-4 focus:ring-purple-300 font-medium rounded-md text-sm px-5 py-2.5 mb-2 w-32' /*onClick={}*/>CRIAR</button>
                    <p className='font-bold text-1xl mb-2'>Copie a Short_Url</p>
                    <input className='block w-full bg-gray-100 text-gray-700 border border-gray-300 rounded-lg py-3 px-4 mb-3 focus:outline-none' id="shorturl" type="text" placeholder="localhost:3000/" value={short_url} disabled/>                  
                </div>
            </div>
        </div>
    </section>
    )
}

export default MySection