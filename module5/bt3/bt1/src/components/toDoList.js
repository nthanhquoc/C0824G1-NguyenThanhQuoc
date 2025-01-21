import {Component} from "react";

class DoToList extends Component {
    constructor(props) {
        super(props);
        this.state = {
            list:[],
            items:''
        };
        this.counter=1;
    }

    handleChange = (e) => {
        this.setState({items: e.target.value});
    }

    handeAddItem = () => {
        const { items,list } = this.state;
        if (items !== '') {
            const newTask = {
                id: this.counter++,
                name: items
            };

            this.setState({
                list: [...list, newTask],
                item: ''
            });
        }
    }

    render() {
        const {list,items} = this.state;
        return (
            <div style={{textAlign: 'center', marginTop: '50px'}}>
                <h1>Todo List</h1>
                <input
                    type="text"
                    placeholder="Enter a task"
                    value={items}
                    onChange={this.handleChange}
                />
                <button onClick={this.handeAddItem}>Add</button>
                <ul>
                    {list.map((todo) => (
                        <li key={todo.id}>{todo.name}</li>
                    ))}
                </ul>
            </div>
        );
    }
}

export default DoToList;