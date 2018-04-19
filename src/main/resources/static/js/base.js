function makeCall() {
    var request = new XMLHttpRequest();

    var name = document.getElementById("birthdayBoy").value;
    var dob = document.getElementById("birthdayDate").value;
    var auto_wish = document.getElementById("auto_wish").checked;
    // var request = new XMLHttpRequest();
    request.open('POST', '/add', true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify({dob: dob, name: name, auto_wish: auto_wish}));
}

function viewAllBirthdays() {
    var request = new XMLHttpRequest();
    var response = null;

    request.open('GET', '/getAllBirthdays', true);
    request.setRequestHeader("Content-type", "application/json");
    request.send();
    request.onreadystatechange = function () {
        if (request.readyState == XMLHttpRequest.DONE) {
            alert(request.response);
        }
        response = JSON.parse(request.responseText);
    };
    var keys =response[0];



    var divContainer = document.getElementById("BirthdayList");
    var table = divContainer.createElement("TABLE");
    // var headers = table.appendChild("TH");
    for(name in keys){
        // console.log(name)
        table.appendChild("TH");
    }

    divContainer.innerHTML = "";
    divContainer.appendChild(table);

}