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
        this.lists = this.lists.filter(function (list) {
            return list.title !== listTitle;
        });
        this.renderList();
    }

    renderList() {
        let listContainer = document.querySelector('.listContainer');
        listContainer.innerHTML = '';
        for (let i = 0; i < this.lists.length; i++) {
            let list = this.lists[i];
            let listDiv = document.createElement("div");
            listDiv.className = 'list';
            listDiv.innerHTML = `<h2>${list.title}</h2>`;

            listDiv.addEventListener('dblclick', (function () {
                let newListTitle = prompt("Input New List Title: ");
                if (newListTitle) {
                    let confirmList = confirm('Do You Want to Change List Title?');
                    if (confirmList) {
                        if (this.lists.some(function (item) {
                            return item.title === newListTitle;
                        })) {
                            alert('A list with this title already exists!');
                        } else {
                            list.title = newListTitle;
                            this.renderList();
                        }
                    }
                }
            }).bind(this));

            for (let j = 0; j < list.cards.length; j++) {
                let card = list.cards[j];
                let cardDiv = document.createElement("div");
                cardDiv.className = 'card';
                cardDiv.innerHTML = `
                    <h3>${card.title}</h3>
                    <p>${card.description}</p>
                    <button class="viewCards"><img src="img/review.png" alt="View Cards" style="width: 20px"></button>
                    <button class="addComments"><img src="img/add-comment.png" alt="Add Comments" style="width: 20px"></button>
                    <button class="setInfoCard"><img src="img/description.png" alt="Set InFo Card" style="width: 20px"></button>
                    <button class="removeCard"><img src="img/trash-can.png" alt="Remove Card" style="width: 20px"></button>
                `;

                cardDiv.querySelector('.viewCards').addEventListener('click', (function () {
                    this.viewCard(list.title, card.title);
                }).bind(this));

                cardDiv.querySelector('.addComments').addEventListener('click', (function () {
                    let newComments = prompt('Enter a Comment ');
                    if (newComments) {
                        card.addComment(newComments);
                        alert('Comment Added Successfully');
                    }
                }).bind(this));

                cardDiv.querySelector('.setInfoCard').addEventListener('click', (function () {
                    let inputText = prompt('1 to Change Card Title, 2 To Change Description');
                    if (inputText) {
                        while (inputText < 1 || inputText > 2 || isNaN(inputText) || !parseInt(inputText) === inputText) {
                            alert('Wrong Input!!!');
                            inputText = prompt('1 to Change Card Title, 2 To Change Description');
                        }
                        if (inputText == 1) {
                            let newCardTitle = prompt('Enter New Card Title:');
                            card.title = newCardTitle;
                            alert('Title Changed Successfully!');
                        } else {
                            let newDescription = prompt('Enter New Description:');
                            card.setDescription(newDescription);
                            alert('Description Changed Successfully');
                        }
                    }
                    this.renderList();
                }).bind(this));

                cardDiv.querySelector('.removeCard').addEventListener('click', (function () {
                    let confirmText = confirm("Do You Want To Delete Card ?");
                    if (confirmText) {
                        list.removeCard(card.title);
                    }
                    this.renderList();
                }).bind(this));

                listDiv.appendChild(cardDiv);
            }

            let addCardButton = document.createElement('button');
            addCardButton.className = 'addCard';
            addCardButton.textContent = 'Add Card';
            addCardButton.addEventListener('click', (function () {
                this.addCardToList(list);
            }).bind(this));

            listDiv.appendChild(addCardButton);
            listContainer.appendChild(listDiv);
        }
    }

    addCardToList(list) {
        let cardTitle = prompt('Input Title Card: ');
        if (cardTitle) {
            let existingCard = list.cards.find(function (card) {
                return card.title === cardTitle;
            });
            if (existingCard) {
                alert('A card with this title already exists!');
                return;
            }
            let cardDescription = prompt('Input Description Card:  ');
            let newCard = new Card(cardTitle, cardDescription);
            list.addCard(newCard);
            this.renderList();
        }
    }

    newAddList() {
        let titleList = prompt('Add New List Title: ');
        if (titleList) {
            let newList = new List(titleList);
            this.addList(newList);
        }
    }

    removeSelectList() {
        let listTitles = [];
        for (let i = 0; i < this.lists.length; i++) {
            listTitles.push(this.lists[i].title);
        }
        let listTitleToRemove = prompt(`Choose List To Delete:\n${listTitles.join('\n')}`);
        let found = false;
        for (let i = 0; i < listTitles.length; i++) {
            if (listTitles[i] === listTitleToRemove) {
                found = true;
                let confirmText = confirm('Do You Want To Delete ?');
                if (confirmText) {
                    this.removeList(listTitleToRemove);
                    break;
                }
            }
        }
        if (!found) {
            alert('List Not Found');
        }
    }

    viewCard(listTitle, CardTitle) {
        let foundList = this.lists.find(function (item) {
            return item.title === listTitle;
        });
        if (!foundList) {
            alert('List Not Found');
            return;
        }
        let foundCard = foundList.cards.find(function (item) {
            return item.title === CardTitle;
        });
        if (!foundCard) {
            alert('Card Not Found');
            return;
        }
        let modal = document.getElementById('cardModal');
        let modalTitle = document.getElementById('modalTitle');
        let modalDescription = document.getElementById('modalDescription');
        let modalComments = document.getElementById('modalComments');
        modalTitle.textContent = foundCard.title;
        modalDescription.textContent = foundCard.description;
        modalComments.innerHTML = '';
        if (foundCard.comments.length > 0) {
            for (let i = 0; i < foundCard.comments.length; i++) {
                let commentItem = document.createElement('li');
                commentItem.textContent = foundCard.comments[i];
                modalComments.appendChild(commentItem);
            }
        } else {
            let noItem = document.createElement('li');
            noItem.textContent = `No Comments`;
            modalComments.appendChild(noItem);
        }
        modal.style.display = 'block';
        let close = document.querySelector('.close');
        close.addEventListener('click', function () {
            modal.style.display = 'none';
        });
        window.onclick = function (event) {
            if (event.target === modal) {
                modal.style.display = 'none';
            }
        };
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
        this.cards = this.cards.filter(function (card) {
            return card.title !== cardTitle;
        })
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
        this.boards = updateBoard;
    }
}

let board = new Board('Quản Lý Bảng Công Việc');
let removeListButton = document.querySelector('.removeList');
let addListButton = document.querySelector('.addList');
removeListButton.addEventListener('click', function () {
    if (board.lists.length === 0) {
        alert('No Have List To Delete');
    } else {
        board.removeSelectList();
    }
});
addListButton.addEventListener('click', function () {
    board.newAddList();
})
let todoList = new List('To Do');
let inProgressList = new List('In Progress');
let doneList = new List('Done');
board.addList(todoList);
board.addList(inProgressList);
board.addList(doneList);
board.renderList();