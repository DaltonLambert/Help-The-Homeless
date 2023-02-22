import React from 'react';
import './HomePage.css';

function HomePage() {
  return (
    <div className='homepage-container'>
      {/* header */}
      <header>
        <img class="logo" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fvectorified.com%2Fimages%2Frelief-icon-33.png&f=1&nofb=1&ipt=5c66ef7aca921c923393178743fa15f370d79bac3902ab0cddb69ea560fea144&ipo=images" alt ="logo" />
        <h1>Homeless Relief</h1>
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
