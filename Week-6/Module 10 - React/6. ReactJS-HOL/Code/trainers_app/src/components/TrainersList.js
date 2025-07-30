import React from 'react';
import { Link } from 'react-router-dom';

function TrainersList({ trainers }) {
  return (
    <div style={{ border: "1px solid black", padding: "12px", width: "fit-content" }}>
      <h3>Trainers List</h3>
      <ul>
        {trainers.map(trainer => (
          <li key={trainer.trainerId}>
            <Link to={`/trainers/${trainer.trainerId}`}>{trainer.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainersList;
