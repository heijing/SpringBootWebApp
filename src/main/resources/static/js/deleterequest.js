$( document ).ready(function() {

    // SUBMIT FORM
    $("#deleteForm").submit(function(event) {
        event.preventDefault();
        ajaxDelete();
    });


    function ajaxDelete(){

        // PREPARE FORM DATA
        var id = $("#id").val();

        // DO DELETE
        $.ajax({
            type : "DELETE",
            contentType : "application/json",
            data : JSON.stringify(id),
            dataType : 'json',
            url : "api/customer/"+id,
            success : function(result) {
                if(result.status == "Done"){
                    $("#deleteResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                        "Delete Successfully! <br>" +
                        "---> Customer's Info: Id = " +
                        result.data + "</p>");
                }else{
                    $("#deleteResultDiv").html("<strong style='margin:20px 20px 20px 20px'>Error</strong>");
                }
                console.log(result);
            },
            error : function(e) {
                alert("Error!")
                console.log("ERROR: ", e);
            }
        });

        // Reset FormData after Posting

    }

})