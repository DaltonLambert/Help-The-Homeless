import React from 'react';
import './HomePage.css';

function HomePage() {
  return (
    <div className='homepage-container'>
      {/* header */}
      <header>
        <h1 class="header-title">Homeless Relief Project</h1>
        <nav>
          <ul class="header-tabs">
          <li><button class="tab-button" onclick="openTab('shelters')">Shelters</button></li>
          <li><button class="tab-button" onclick="openTab('resources')">Resources</button></li>
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
      
      {/* footer */}
      <footer>
        <p>&copy; 2023 Homeless Relief Project</p>
      </footer>
    </div>
  );
}

export default HomePage;
