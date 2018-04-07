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