import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import MySection from './components/MySection';
import Redirect from './components/Redirect';


function App() {
  return (
    <>
      <main>
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<MySection />}  />
          <Route exact path="/:shorturl" element={<Redirect />}  />
        </Routes>
      </BrowserRouter>
        
      </main>
    </>
  );
}

export default App;
