
$(document).ready(function () {
    var current = null;
    $(".dropbtn").click(function () {
        var id = $(this).attr("id");
        var object = $("#post-" + id + " #myDropdown");
        var check = object.hasClass("show");
        if (current !== null) {
            $("#post-" + current + " #myDropdown").removeClass("show");
            console.log(current);
        }
        if (check) {
            object.removeClass("show");
            console.log(current);
            current = null;

        } else
        {
            object.addClass("show");
            current = id;
        }

    });
});






