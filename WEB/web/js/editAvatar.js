
$(document).ready(function(){
    $(".avatar").hover(function(){
        $(".update").toggle("fast");
    });
    
    $(".update").click(function(){
        $(".avatar-modal").toggle("fast");
    });   
    $(".close1").click(function(){
        $(".avatar-modal").attr("style","display:none");
    }); 
});
/* Password change */
$(document).ready(function(){
    $(".password").click(function(){
        $(".modal-password").addClass(" show");
    });   
    $(".close1").click(function(){
        $(".modal-password").removeClass("show");
    }); 
});

