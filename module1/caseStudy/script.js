class Board {
    title;
    lists;
    constructor(title) {
        this.title = title;
        this.lists = [];
    }

    addList(list) {
        this.lists.push(list);
        this.renderList();
    }

    removeList(listTitle) {
        let updateList = [];
        for (let i = 0; i < this.lists.length; i++) {
            if (this.lists[i].title !== listTitle) {
                updateList.push(this.lists[i]);
            }
        }
        this.lists = updateList;
        this.renderList()
    }

    renderList() {
        let listContainer = document.querySelector('.listContainer');
        listContainer.innerHTML = '';
        for (let i = 0; i < this.lists.length; i++) {
            let list = this.lists[i];
            let listDiv = document.createElement("div");
            listDiv.className = 'list';
            listDiv.innerHTML = `<h2>${list.title}</h2>`;
            for (let j = 0; j < list.cards.length; j++) {
                let card = list.cards[j];
                let cardDiv = document.createElement("div");
                cardDiv.className = 'card';
                cardDiv.innerHTML = `
                    <h3>${card.title}</h3>
                    <p>${card.description}</p>
                    <button class="viewComments"><img src="img/review.png" alt="View Comments" style="width: 20px"></button>
                    <button class="addComments"><img src="img/add-comment.png" alt="Add Comments" style="width: 20px"></button>
                    <button class="setDescription"><img src="img/description.png" alt="Set Description" style="width: 20px"></button>
                    <button class="removeCard"><img src="img/trash-can.png" alt="Remove Card" style="width: 20px"></button>
                `;
                cardDiv.querySelector('.viewComments').addEventListener('click', function () {
                    if(card.comments.length > 0){
                        alert(`Bạn Có Comment là: ${card.comments}`);
                    }else{
                        alert('Bạn Không Có Comment ');
                    }
                });
                cardDiv.querySelector('.addComments').addEventListener('click', function () {
                    let newComments = prompt('Nhập Bình Luận: ');
                    if (newComments) {
                        card.addComment(newComments);
                        alert('Bình Luận Đã Được Thêm');
                    }
                })
                cardDiv.querySelector('.setDescription').addEventListener('click', function () {
                    let newDescription = prompt('Nhập Mô Tả Mới: ');
                    if(newDescription){
                        card.setDescription(newDescription);
                        alert('Đã Thay Đổi');
                    }
                    board.renderList();
                })
                cardDiv.querySelector('.removeCard').addEventListener('click', function () {
                    let conFirmText = confirm("Bạn Có Muốn Xóa Không ?");
                    if (conFirmText) {
                        list.removeCard(card.title);
                    }
                    board.renderList();
                })
                listDiv.appendChild(cardDiv);
            }
            let addCardButton = document.createElement('button');
            addCardButton.className = 'addCard';
            addCardButton.textContent = 'Add Card';
            addCardButton.addEventListener('click', function () {
                board.addCardToList(list);
            })
            listDiv.appendChild(addCardButton);
            listContainer.appendChild(listDiv);
        }

    }

    addCardToList(list) {
        let cardTitle = prompt('Nhập Tiêu Đề Thẻ : ');
        let cardDescription = prompt('Nhập Mô Tả Thẻ:  ');
        if (cardTitle) {
            let newCard = new Card(cardTitle, cardDescription);
            list.addCard(newCard);
            this.renderList();
        }
    }

    newAddList() {
        let titleList=prompt('Nhập Tên Danh Sách Mới');
        if(titleList){
            let newList=new List(titleList);
            this.addList(newList);
        }
    }
    removeSelectList() {
        let listTitles = [];
        for (let i = 0; i < this.lists.length; i++) {
            listTitles.push(this.lists[i].title);
        }
        let listTitleToRemove = prompt(`Chọn Danh Sách Để Xóa:\n${listTitles.join('\n')}`);
        let found = false;
        for (let i = 0; i < listTitles.length; i++) {
            if (listTitles[i] === listTitleToRemove) {
                found = true;
                this.removeList(listTitleToRemove);
                break;
            }
        }
        if (!found) {
            alert('Danh Sách Không Tồn Tại');
        }
    }
    viewCard(listTitle,CardTitle){
        let foundList=this.lists.find(function(item){
            return item.title === listTitle;
        })
        if(!foundList){
            alert('Danh Sách Không Tồn Tại !');
            return;
        }
        let foundCard=foundList.cards.find(function(item){
            return item.title === CardTitle;
        })
        if(!foundCard){
            alert('Card Không Tồn Tại !');
            return;
        }

        alert(`Tiêu Đề: ${foundCard.title}\nMô Tả: ${foundCard.description}\nComments: ${foundCard.comments.join(',')||'Không Có Bình Luận'}`);
    }
}

class List {
    title;
    cards;
    constructor(title) {
        this.title = title;
        this.cards = [];
    }

    addCard(card) {
        this.cards.push(card);
    }

    removeCard(cardTitle) {
        let updateCard = [];
        for (let i = 0; i < this.cards.length; i++) {
            if (this.cards[i].title !== cardTitle) {
                updateCard.push(this.cards[i]);
            }
        }
        this.cards = updateCard;
    }
}

class Card {
    title;
    description;
    comments;
    constructor(title, description = '', comments = []) {
        this.title = title;
        this.description = description;
        this.comments = comments;
    }

    addComment(comment) {
        this.comments.push(comment);
    }

    setDescription(description) {
        this.description = description;
    }

}

class User {
    name;
    boards;
    constructor(name) {
        this.name = name;
        this.boards = [];
    }

    addBoard(board) {
        this.boards.push(board);
    }

    removeBoard(boardTitle) {
        let updateBoard = [];
        for (let i = 0; i < this.boards.length; i++) {
            if (this.boards[i].title !== boardTitle) {
                updateBoard.push(this.boards[i]);
            }
        }
        this.cards = updateBoard;
    }
}

let board = new Board('Quản Lý Bảng Công Việc');
let removeListButton=document.querySelector('.removeList');
let addListButton=document.querySelector('.addList');
removeListButton.addEventListener('click', function(){
    if (board.lists.length === 0) {
        alert('Không có danh sách nào để xóa.');
    } else {
        board.removeSelectList();
    }
})
addListButton.addEventListener('click',function(){
    board.newAddList();
})
let todoList = new List('To Do');
let inProgressList = new List('In Progress');
let doneList = new List('Done');
board.addList(todoList);
board.addList(inProgressList);
board.addList(doneList);
board.renderList();