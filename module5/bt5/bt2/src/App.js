import './App.css';
import MedicalForm from "./compoments/MedicalForm";
import 'bootstrap/dist/css/bootstrap.min.css';
import {ToastContainer} from "react-toastify";

function App() {
    return (
        <div className="App">
            <MedicalForm/>
            <ToastContainer/>
        </div>
    );
}

export default App;
