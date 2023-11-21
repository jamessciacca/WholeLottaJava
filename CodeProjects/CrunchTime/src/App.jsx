import { useState, useEffect } from 'react'
import './App.css'

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("http://localhost:3000/message")
      .then((res) => res.json())
      .then((data) => setMessage(data.message));
  }, []);

  return (
    <div className="App">
      {message !== "" ? <h1>{message}</h1> : <p>Loading...</p>}
    </div>
  );
}

export default App
