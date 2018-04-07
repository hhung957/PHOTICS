function checkPasswordMatch() {
    var password = $("#newpassword").val();
    var confirmPassword = $("#newconfirmpassword").val();

    if (password !== confirmPassword) {
        $("#noti").html("Passwords do not match  &#x2718");
        $("#noti").attr("style", "color:red");
    } else {
        $("#noti").html("Passwords match  &#x2714");
        $("#noti").attr("style", "color:green");
    }
   
}
$(document).ready(function () {

    $("#register").submit(function (event) {
        var fname = $("#fname").val();
        var lname = $("#lname").val();
        var email = $("#email").val();
        var password = $("#newpassword").val();
        var confirmPassword = $("#newconfirmpassword").val();
        if (fname !== null && lname !== null && email !== null && newpassword !== null && newconfirmpassword !== null && $('#accept').is(":checked")
                && (password === confirmPassword))
        {
//            alert("Congratulations. You have successfully created your Photics account. Welcome " + fname + " " + lname + "!");
        } else
        {
            event.preventDefault();
            alert("Please input again !! There is something wrong");
        }
    });
});
