import './App.css';
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Home from "./compoments/Home";
import About from "./compoments/About";
import Contact from "./compoments/Contact";

function App() {
    return (
        <BrowserRouter>
            <div className="App">
                {/* Navigation Links */}
                <nav>
                    <ul>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                        <li>
                            <Link to="/about">About</Link>
                        </li>
                        <li>
                            <Link to="/contact">Contact</Link>
                        </li>
                    </ul>
                </nav>

                {/* Routes Configuration */}
                <Routes>
                    <Route path="/" element={<Home/>} />
                    <Route path="/about" element={<About/>} />
                    <Route path="/contact" element={<Contact/>} />
                </Routes>
            </div>
        </BrowserRouter>
    );
}

export default App;
