import './App.css';
import ListBook from "./components/ListBook";
import AddBook from "./components/AddBook";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import EditBook from "./components/EditBook";

function App() {
  return (
    <div className="App">
        <BrowserRouter>
            <div className="App">
                <Routes>
                    <Route path="/" element={<ListBook />} />
                    <Route path="/create" element={<AddBook />} />
                    <Route path="/edit/:id" element={<EditBook />} />
                </Routes>
            </div>
        </BrowserRouter>
    </div>
  );
}

export default App;
