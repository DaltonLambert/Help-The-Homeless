import React from 'react';
import './HomePage.css';

function HomePage() {
  return (
    <div className='homepage-container'>
      {/* header */}
      <header>
        <h1>HomePage</h1>
        <nav>
          <ul>
            <li><a href="#shelters">Shelters</a></li>
            <li><a href="#resources">Resources</a></li>
          </ul>
        </nav>
      </header>
      
      {/* main area */}
      <main>
        <h2>Welcome to the Homeless Project</h2>
        <p>
          This is a tool to help connect people experiencing homelessness with resources such as shelter, job training, and mental health services.
        </p>
      </main>
      
      {/* footer */}
      <footer>
        <p>&copy; 2023 Homeless Relief Project</p>
      </footer>
    </div>
  );
}

export default HomePage;
