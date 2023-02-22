import React from 'react';
import './CSS/Resources.css';

function Resources() {
  return (
    <div className='shelters-container'>
      {/* header */}
      <header>
        <h1 class="header-title">Shelters</h1>
        <img class="relief-img" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fvectorified.com%2Fimages%2Frelief-icon-33.png&f=1&nofb=1&ipt=5c66ef7aca921c923393178743fa15f370d79bac3902ab0cddb69ea560fea144&ipo=images" alt= 'logo' />
        <nav>
          <ul class="header-tabs">
          <li><button class="tab-button" onclick="openTab('shelters')">Home</button></li>
          <li><button class="tab-button" onclick="openTab('resources')">Resources</button></li>
          </ul>
        </nav>
      </header>
      
      {/* main area */}
      <main>
        <h2>Welcome to Shelters page</h2>
        <p>
          Find mental health resources here
        </p>
      </main>
      
      {/* footer */}
      <footer>
        <p>&copy; 2023 Homeless Relief Project</p>
      </footer>
    </div>
  );
}

export default Resources;