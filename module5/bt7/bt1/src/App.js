import './App.css';
import {Provider} from "react-redux";
import store from "./store";
import UserList from "./components/UserList";
import {ToastContainer} from "react-toastify";

function App() {
    return (
        <div className="App">
            <Provider store={store}>
                <UserList/>
                <ToastContainer/>
            </Provider>
        </div>
    );
}

export default App;
