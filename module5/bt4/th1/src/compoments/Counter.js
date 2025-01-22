import {useState} from "react";

const Counter = () => {
    let [counter, setCounter] = useState(0);

    const handleClick = () => {
        const newCounter = counter + 1;
        setCounter(newCounter);
    }
    return (
        <>
            Giá Trị {counter}
            <div>
                <button onClick={handleClick}>Tăng</button>
            </div>
        </>
    )
}

export default Counter;