import {applyMiddleware, combineReducers, createStore} from "redux";
import createSagaMiddleware from "redux-saga";
import userReducer from "./reducer/UserReducer";
import userSaga from "./saga/UserSaga";

const rootReducer = combineReducers({
    user: userReducer
})

const sagaMiddleware = createSagaMiddleware();

const store = createStore(rootReducer, applyMiddleware(sagaMiddleware));

sagaMiddleware.run(userSaga);

export default store;