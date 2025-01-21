import logo from './logo.svg';
import './App.css';
import './compoments/student.css';
import {students} from './compoments/student';
function App() {
  return (
      <div className="App">
        <h1>Student List</h1>
        <table>
          <thead>
          <tr>
            <th>Company</th>
            <th>Contact</th>
            <th>Country</th>
          </tr>
          </thead>
          <tbody>
          {students.map((student, index) => (
              <tr key={student.id}>
                <td>{student.company}</td>
                <td>{student.contact}</td>
                <td>{student.country}</td>
              </tr>
          ))}
          </tbody>
        </table>
      </div>
  );
}

export default App;
