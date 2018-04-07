
$(document).ready(function () {
    var current = null;
    $(".myBtn").click(function () {
        var id = $(this).attr("id");
        var object = $("#modal-" + id + " #myModal-" + id);
        var check = object.hasClass("show");
        $(".close").click(function () {
            object.removeClass("show");
        });
        if (check) {
            $("#myModal-" + id).click(function () {
                object.removeClass("show");
            });
        }
        $(window).click(function (event) {
            if (event.target === "modal-content") {
                object.removeClass("show");
            }
        });
        if (current !== null) {
            $("#modal-" + current + " #myModal-" + current).removeClass("show");
            console.log(current);
        }
        if (check) {
            object.removeClass("show");
            console.log(current);
            current = null;
        } else {
            object.addClass("show");
            current = id;
        }
    });

});
$(document).ready(function () {
    $(".drop").click(function () {
        $(".modal-filter").addClass(" show");
    });
    $(".close1").click(function () {
        $(".modal-filter").removeClass(" show");
    });
});

   