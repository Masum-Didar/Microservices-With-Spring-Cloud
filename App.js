import react from 'react';
import logo from './logo.svg';
import './App.css';
import { Button } from 'reactstrap';
import { ToastContainer, toast } from 'react-toastify';

import Header from './components/Header';
import Home from './components/Home';
import Employee from './components/Employee';
import AllEmployee from './components/AllEmployee';

const btnHandler = () => {
   toast.success("Wow this is working !", {position: "top-center"});
}

function App() {

  return(
    <div className='text-center'>
       <ToastContainer />
       <Header />
       <Home />
          <h1>IBCS PRIMAX Technical Assesment</h1>;
          <Button color="primary" outline onClick={btnHandler}> Frist React button </Button>
          <AllEmployee />
       
    </div>
    
  ) 
}

export default App;
