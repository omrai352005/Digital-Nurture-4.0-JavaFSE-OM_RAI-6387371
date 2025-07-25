import React from 'react';
import { useParams } from 'react-router-dom';
import trainersMock from '../TrainersMock';

function TrainerDetail() {
  const { id } = useParams();

  // Find the trainer using trainerId (note: id from URL will be string)
  const trainer = trainersMock.find(t => t.trainerId === id);

  if (!trainer) return <p>Trainer not found</p>;

  return (
    <div style={{ border: "1px solid black", padding: "16px", width: "fit-content" }}>
      <h3>Trainers Details</h3>
      <strong>{trainer.name} ({trainer.technology})</strong>
      <p>{trainer.email}</p>
      <p>{trainer.phone}</p>
      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}


export default TrainerDetail;
