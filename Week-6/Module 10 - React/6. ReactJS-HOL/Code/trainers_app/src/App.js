import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './components/Home';
import TrainersList from './components/TrainersList';
import trainersMock from './TrainersMock';
import TrainerDetail from './components/TrainerDetail';


function App() {
  return (
    <BrowserRouter>
      <div style={{ border: "1px solid black", padding: "16px", width: "fit-content" }}>
        <h1>My Academy Trainers App</h1>
        <nav>
          <Link to="/" style={{ marginRight: '10px' }}>Home</Link> 
          <Link to="/trainers" style={{ marginLeft: '10px' }}>Show Trainers</Link>
        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainersList trainers={trainersMock} />} />
            <Route path="/trainers/:id" element={<TrainerDetail />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
