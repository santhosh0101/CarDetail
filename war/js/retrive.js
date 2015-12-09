
 $(document).ready(function(){ 
    $("#myTable").hide();
    $(".resize").hide();
    $("#search").hide();
     $("#advsearch").hide();
  });



$("#properties").change(function(){
     if($("#properties").val().match("all")){
        $(".resize").hide();
         $("#search").hide(); $("#advsearch").hide();
      }
      else if($("#properties").val().match("adv")) {
         $("#advsearch").show();
         $("#search").show();$(".resize").hide();
      }
      else{
         $(".resize").show();
         $("#search").show(); $("#advsearch").hide();
      }
});
 $("#search_all").click(function(){ 
      $.ajax({
        url:"../carsearch",
        data:{'carId':'all',},
        success:function(response,status){
         if(response==null){
            $("#myTable").hide();
             alert("Car Detail Does Not Exist In Database.");
           
            }
         else{

            $(".even").remove();
            $(".odd").remove();
              for (x in response)
              {
                $("#myTable").show();
                 var ctr=0;
                 if(ctr==0){
                  $('#myTable').append('<tr class="odd"><td>'+ response[x]['carId']+'</td> <td>'+response[x]['carName']+'</td><td >'+response[x]['carSpeed']+'</td><td >'+response[x]['carPrice']+'</td><td >'+response[x]['carColor']+'</td><td >'+response[x]['carMileage']+'</td></tr>');
                 ctr=1;
               }
               else if(ctr==1){
                 $('#myTable').append('<tr class="even"><td>'+ response[x]['carId']+'</td> <td>'+response[x]['carName']+'</td><td >'+response[x]['carSpeed']+'</td><td >'+response[x]['carPrice']+'</td><td >'+response[x]['carColor']+'</td><td >'+response[x]['carMileage']+'</td></tr>');
                 ctr=0;
               } 

             }
               alert("Data SuccessFully Retrive From Database...");
        }
        },
        error:function(){
          alert("Error is Occure Try Again later....");
        }
      }); 
    });

 $("#search").click(function(){ 
   var parameter=$("#properties").val();
        var cid="",carName="",carColor="",carSpeed="",carMileage="",carPrice="",carPrice1="",carSpeed1="";
      if(parameter.match("carId")){
          cid=$("#cid").val();
          carColor=carSpeed=carMileage=carPrice=carSpeed1=carPrice1="";
        }
      
      if($("#properties").val().match("adv")) {
         carSpeed=$("#aspeed").val();
         carColor=$("#acolor").val();
         carPrice=$("#aprice").val();
         carName=carSpeed1=$("#aspeedto").val();
         carMileage=carPrice1=$("#apriceto").val();
      }
   /* if($.isNumeric(cid))
      {*/
      $.ajax({
        url:"../carsearch",
        data:{'carId':cid, 'carName':carName, 'carColor':carColor,'carMileage':carMileage,'carSpeed':carSpeed,'carPrice':carPrice,'carPrice1':carPrice1, 'carSpeed1':carSpeed1,},
        success:function(response,status){
         if(response==null){
            $("#myTable").hide();
             alert("Car Id Does Not Exist In Database..!!");
             $("#cid").val("");
            }
         else{
          $("#myTable").show();
          $(".odd").remove();
          $(".even").remove();
        for (x in response)
              {
                $("#myTable").show();
                 var ctr=0;
                 if(ctr==0){
                  $('#myTable').append('<tr class="odd"><td>'+ response[x]['carId']+'</td> <td>'+response[x]['carName']+'</td><td >'+response[x]['carSpeed']+'</td><td >'+response[x]['carPrice']+'</td><td >'+response[x]['carColor']+'</td><td >'+response[x]['carMileage']+'</td></tr>');
                 ctr=1;
               }
               else if(ctr==1){
                 $('#myTable').append('<tr class="even"><td>'+ response[x]['carId']+'</td> <td>'+response[x]['carName']+'</td><td >'+response[x]['carSpeed']+'</td><td >'+response[x]['carPrice']+'</td><td >'+response[x]['carColor']+'</td><td >'+response[x]['carMileage']+'</td></tr>');
                 ctr=0;
               } 

             }
        }
        },
        error:function(){
          alert("Error is Occure Try Again later....");
        }
      }); 
   /* }
    else{
      alert("Please Enter Car Number In Digits !!");
      $("#cid").val("");
    }*/
    });
