import React, { useState, useEffect } from 'react';
import './CSS/HomePage.css';


function HomePage() {
  const [shelters, setShelters] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/shelter')
      .then(response => response.json())
      .then(data => {
        console.log(data); // Debug output
        setShelters(data);
      });
  }, []);
  return (
    <div className='homepage-container'>
      {/* header */}
      <header>
        <h1 className="header-title">Homeless Relief Project</h1>
        <img className="relief-img" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fvectorified.com%2Fimages%2Frelief-icon-33.png&f=1&nofb=1&ipt=5c66ef7aca921c923393178743fa15f370d79bac3902ab0cddb69ea560fea144&ipo=images" alt= 'logo' />
        <nav>
          <ul className="header-tabs">
          <li><button className="tab-button" onClick="openTab('shelters')">Shelters</button></li>
          <li><button className="tab-button" onClick="openTab('resources')">Resources</button></li>
          </ul>
        </nav>
      </header>
      
      {/* main area */}
      <main>
        <h2>Welcome to the Homeless Project</h2>
        <p>
          This is a tool to help connect people experiencing homelessness with resources such as shelters, job training, and mental health services.
        </p>
      </main>
      <div className='shelters'>
      <h3 className='shelters-header'>SHELTERS</h3>
      <table>
  <thead>
    <tr>
      <th>Shelter Name</th>
      <th>Address</th>
      <th>Website</th>
      <th>Phone</th>
    </tr>
  </thead>
  <tbody>
    {shelters.map(shelter => (
      <tr key={shelter.shelterId}>
        <td>{shelter.shelterName}</td>
        <td>{shelter.shelterAddress}</td>
        <td><a href={shelter.shelterWebsite} target="_blank" rel="noreferrer noopener">{shelter.shelterWebsite}</a></td>

        <td>{shelter.shelterPhone}</td>
      </tr>
    ))}
  </tbody>
</table>

        </div>
      
      {/* footer */}
      <footer>
        <p>&copy; 2023 Homeless Relief Project</p>
      </footer>
    </div>
  );
}

export default HomePage;
