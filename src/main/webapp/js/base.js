$("#birthdayForm").submit(function(event) {
    // Prevent the form from submitting via the browser.
    event.preventDefault();
    ajaxPost();
});

function ajaxPost() {

    // PREPARE FORM DATA
    var formData = {
        name: form.input
        dob: $("#birthdayDate").val(),
        auto_wish: $("#auto_wish").val()
    }

    // DO POST
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "http://localhost:8080" + "/add",
        data: JSON.stringify(formData),
        dataType: 'json',
        success: function (result) {
        }
        ,
        error: function (e) {
            alert("Error!")
            console.log("ERROR: ", e);
        }
    });
}


