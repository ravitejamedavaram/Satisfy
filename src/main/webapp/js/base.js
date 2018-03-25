// function ajaxPost(form) {
//
//     // PREPARE FORM DATA
//     var formData = {
//         name: form.birthdayBoy,
//         dob: form.birthdayDate,
//         auto_wish: form.auto_wish
//     }
//
//     // DO POST
//     $.ajax({
//         type: "POST",
//         contentType: "application/json",
//         url: "http://localhost:8080" + "/add",
//         data: JSON.stringify(formData),
//         dataType: 'json',
//         success: function (result) {
//         }
//         ,
//         error: function (e) {
//             alert("Error!")
//             console.log("ERROR: ", e);
//         }
//     });
// }
//
//

function makeCall() {
    var name = document.getElementById("birthdayBoy").value;
    var dob = document.getElementById("birthdayDate").value;
    var auto_wish = document.getElementById("auto_wish").checked    ;
    var request = new XMLHttpRequest();
    request.open('POST', '/add', false);
    request.setRequestHeader("Content-type","application/json");
    request.send(JSON.stringify({dob:dob,name:name,auto_wish:auto_wish}));

     if (request.status === 200) {
        console.log(request.responseText);
    }

    console.log(request.responseText);
}