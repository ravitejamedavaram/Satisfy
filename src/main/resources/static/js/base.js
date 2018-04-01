
var request = new XMLHttpRequest();


function makeCall() {
    var name = document.getElementById("birthdayBoy").value;
    var dob = document.getElementById("birthdayDate").value;
    var auto_wish = document.getElementById("auto_wish").checked;
    // var request = new XMLHttpRequest();
    request.open('POST', '/add', true);
    request.setRequestHeader("Content-type","application/json");
    request.send(JSON.stringify({dob:dob,name:name,auto_wish:auto_wish}));
}

function viewAllBirthdays() {

    request.open('GET','/viewAll',true);
    request.setRequestHeader("Content-type","application/json");
    request.send();
    for (var row in this.response){

    }
}