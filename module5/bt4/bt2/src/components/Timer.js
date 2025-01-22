import {useEffect, useState} from "react";

const Timer = () => {
    const [timer, setTimer] = useState(10);
    useEffect(() => {
        const interval = setInterval(() => {
            setTimer((prevTime) =>
                prevTime > 0 ? prevTime-1 : 0
            );
        },1000)

        return () => {
            clearInterval(interval);
        }
    },[])
    useEffect(() => {
        if(timer === 0){
            alert("Time Up!");
        }
    },[timer])
    return (
        <div style={{textAlign: "center", marginTop: "50px"}}>
            <h1>Timer Countdown</h1>
            <p style={{fontSize: "24px", fontWeight: "bold"}}>{timer} seconds left</p>
        </div>
    )
}

export default Timer;