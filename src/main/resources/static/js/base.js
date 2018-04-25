function makeCall() {
    var request = new XMLHttpRequest();

    var name = document.getElementById("birthdayBoy").value;
    var dob = document.getElementById("birthdayDate").value;
    var auto_wish = document.getElementById("auto_wish").checked;

    request.open('POST', '/add', true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify({dob: dob, name: name, auto_wish: auto_wish}));
}

function viewAllBirthdays() {
    var request = new XMLHttpRequest();
    request.open('GET', '/getAllBirthdays', true);
    request.setRequestHeader("Content-type", "application/json");
    request.send();
    request.responseType = "json";
    request.onreadystatechange = function () {
        if (request.readyState == XMLHttpRequest.DONE) {
            appendTableData(request.response);
        }
    }
}

function appendTableData(response) {
    var keys;
    var divContainer;
    var table;
    var headers, rows, headerNames=[],column;

    // response = JSON.parse(response);
    debugger
    keys = response[0];
    table = document.getElementById("birthdayTable");
    if (table) {
        table.parentNode.removeChild(table);
    }
    divContainer = document.getElementById("BirthdayList");
    table = document.createElement("TABLE");
    table.id = "birthdayTable";
    divContainer.appendChild(table)

    for (name in keys) {
        headerNames.push(name);
        headers = document.createElement("TH");
        headers.innerHTML = name.toUpperCase().replace("_", "-");
        table.appendChild(headers);
    }
    for (var i in response) {
        rows = document.createElement("TR");
        table.appendChild(rows);
        for (var j in response[i]) {
            column = document.createElement("TD");
            column.innerText = response[i][j];
            rows.appendChild(column);
        }

    }

}

function signUpNewUser() {
    var form = document.getElementById("registration");
    var username = form.elements.namedItem("username").value;
    var password = form.elements.namedItem("password").value;
    var email = form.elements.namedItem("email").value;

    var request = new XMLHttpRequest();
    request.open('POST', '/signUp', true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify({username: username, password: password, email: email}));

}