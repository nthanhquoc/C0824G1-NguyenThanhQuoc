import {useEffect, useState} from "react";

const Selector = () => {
    let [select, setSelected] = useState("0");
    let [valueSelected, setValueSelected] = useState("");

    const choice = e => setSelected(e.target.value);
    useEffect(() => {
        switch (select) {
            case "0":
                setValueSelected("Java");
                break;
            case "1":
                setValueSelected("Angular");
                break;
            case "2":
                setValueSelected("Javascript");
                break;
            case "3":
                setValueSelected("PHP");
                break;
            default:
        }
    }, [select])

    return (
        <div>
            Khoá học :
            <select
                onChange={e => {
                    choice(e);
                }}
            >
                <option value="0">Java</option>
                <option value="1">Angular</option>
                <option value="2">Javascript</option>
                <option value="3">Php</option>
            </select>
            <h2>Your selected: {valueSelected}</h2>
        </div>
    )
}

export {Selector}