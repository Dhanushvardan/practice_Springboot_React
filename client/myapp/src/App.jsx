import logo from "./logo.svg";
import "./App.scss";
import { useState } from "react";
import axios from "axios";
import cors from "cors";

function App() {
  const [i, setI] = useState();
  const [n, setN] = useState();
  const pushBackend = async () => {
    try {
      const res = await axios.post("http://localhost:8080/api/addEntity", {
        id: i,
        name: n,
      });

      console.log(res);
    } catch (err) {
      console.log(err);
    }
  };

  const findByName = async () => {
    try {
      const r = await axios.get(`http://localhost:8080/api/getNameById/${i}`);
      console.log(r);
    } catch (err) {
      console.log(err);
    }
  };
  return (
    <div className="App">
      <input
        placeholder="Enter id"
        onChange={(e) => {
          setI(e.target.value);
        }}
      />
      <input
        placeholder="Enter name"
        onChange={(e) => {
          setN(e.target.value);
        }}
      />

      <button onClick={pushBackend}> push to backend</button>

      <button onClick={findByName}>find by id</button>
    </div>
  );
}

export default App;
